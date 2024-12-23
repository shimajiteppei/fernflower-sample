import java.io.ByteArrayOutputStream
import kotlin.text.replace

group = "example"
version = "1.0-SNAPSHOT"

plugins {
    id("org.jetbrains.kotlin.jvm") version "latest.release"
    id("io.freefair.lombok") version "latest.release"
}

repositories {
    mavenCentral()
    maven {
        setUrl("https://www.jetbrains.com/intellij-repository/releases")
    }
}
dependencies {
    testImplementation("com.jetbrains.intellij.java:java-decompiler-engine:latest.release")
}

subprojects {
    apply(plugin = "org.jetbrains.kotlin.jvm")
    apply(plugin = "io.freefair.lombok")

    repositories {
        mavenCentral()
    }

    kotlin {
        jvmToolchain {
            languageVersion = JavaLanguageVersion.of(23)
            vendor = JvmVendorSpec.ORACLE
        }
    }
}

tasks.register("decompile") {
    val outputDir = "${project(":decompiled").projectDir}/src"
    delete(outputDir)
    mkdir(outputDir)

    javaexec {
        classpath = configurations.testRuntimeClasspath.get()
        mainClass = "org.jetbrains.java.decompiler.main.decompiler.ConsoleDecompiler"
        args = listOf(
            "-rbr=0",
            "-hes=0",
            "-hdc=0",
            "-dgs=1",
            "-crp=1",
            "-cps=1",
            "-ind=    ",
            "${project(":original").buildDir}/classes",
            outputDir,
        )
    }
}

tasks.register("disassemble") {
    val outputDir = "$projectDir/disassembled"
    delete(outputDir)
    mkdir(outputDir)

    val javaPath = org.gradle.internal.jvm.Jvm.current().javaHome.absolutePath
    val javapExec = "$javaPath/bin/javap"

    project(":original").sourceSets.main.get().output.classesDirs.asFileTree.forEach {
        val relativePath = it.relativeTo(project(":original").buildDir).path
        val absolutePath = it.absolutePath

        if (absolutePath.endsWith(".class")) {
            val outputRelativePath = relativePath.replace(".class", ".javap.txt")
            val outputFile = File("$outputDir/$outputRelativePath")
            outputFile.parentFile.mkdirs()

            val javapOutput = ByteArrayOutputStream()
            exec {
                executable = javapExec
                args = listOf(
                    "-v",
                    "-l",
                    "-p",
                    "-c",
                    "-s",
//                    "-constants",
//                    "-XDdetails",
//                    "-XDinner",
                    absolutePath,
                )
                standardOutput = javapOutput
            }
            outputFile.writeText(javapOutput.toString().replace(rootDir.absolutePath, "."))
        }

    }
}


