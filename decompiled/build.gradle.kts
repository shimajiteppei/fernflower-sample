val javaMainDir = "src/java/main"
val kotlinMainDir = "src/kotlin/main"

sourceSets {
    main {
        java {
            srcDirs(javaMainDir, kotlinMainDir)
        }
    }
}
