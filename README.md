# fernflower-sample

This is a sample project for using IntelliJ IDEA's Java decompiler "FernFlower".

## Directories

- `original`: Contains the original Java/Kotlin code.
- `decompiled`: Contains the decompiled Java code by fernflower.
- `disassembled`: Contains the disassembled bytecode by javap.

## How to use

```shell
# compile
./gradlew :original:compileJava

# decompile
./gradlew decompile

# disassemble
./gradlew disassemble
```

## Sample

Here is a sample of the decompiled/disassembled outputs:

<details><summary>Original Java Code</summary>

```java
@Data
@Builder
public class LombokDataClass {
    final int a;
    @NotNull
    final String b;
    int c;
    @Nullable
    String d;
}
```
</details>

<details><summary>Decompiled Java Code</summary>
 
```java
import lombok.Generated;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class LombokDataClass {
    final int a;
    @NotNull
    final String b;
    int c;
    @Nullable
    String d;

    @Generated
    LombokDataClass(int a, @NotNull String b, int c, @Nullable String d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    @Generated
    public static LombokDataClassBuilder builder() {
        return new LombokDataClassBuilder();
    }

    @Generated
    public int getA() {
        return this.a;
    }

    @NotNull
    @Generated
    public String getB() {
        return this.b;
    }

    @Generated
    public int getC() {
        return this.c;
    }

    @Nullable
    @Generated
    public String getD() {
        return this.d;
    }

    @Generated
    public void setC(int c) {
        this.c = c;
    }

    @Generated
    public void setD(@Nullable String d) {
        this.d = d;
    }

    @Generated
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof LombokDataClass)) {
            return false;
        } else {
            LombokDataClass other = (LombokDataClass)o;
            if (!other.canEqual(this)) {
                return false;
            } else if (this.getA() != other.getA()) {
                return false;
            } else if (this.getC() != other.getC()) {
                return false;
            } else {
                Object this$b = this.getB();
                Object other$b = other.getB();
                if (this$b == null) {
                    if (other$b != null) {
                        return false;
                    }
                } else if (!this$b.equals(other$b)) {
                    return false;
                }

                Object this$d = this.getD();
                Object other$d = other.getD();
                if (this$d == null) {
                    if (other$d != null) {
                        return false;
                    }
                } else if (!this$d.equals(other$d)) {
                    return false;
                }

                return true;
            }
        }
    }

    @Generated
    protected boolean canEqual(Object other) {
        return other instanceof LombokDataClass;
    }

    @Generated
    public int hashCode() {
        int PRIME = 59;
        int result = 1;
        result = result * 59 + this.getA();
        result = result * 59 + this.getC();
        Object $b = this.getB();
        result = result * 59 + ($b == null ? 43 : $b.hashCode());
        Object $d = this.getD();
        result = result * 59 + ($d == null ? 43 : $d.hashCode());
        return result;
    }

    @Generated
    public String toString() {
        int var10000 = this.getA();
        return "LombokDataClass(a=" + var10000 + ", b=" + this.getB() + ", c=" + this.getC() + ", d=" + this.getD() + ")";
    }

    @Generated
    public static class LombokDataClassBuilder {
        @Generated
        private int a;
        @Generated
        private String b;
        @Generated
        private int c;
        @Generated
        private String d;

        @Generated
        LombokDataClassBuilder() {
            super();
        }

        @Generated
        public LombokDataClassBuilder a(int a) {
            this.a = a;
            return this;
        }

        @Generated
        public LombokDataClassBuilder b(@NotNull String b) {
            this.b = b;
            return this;
        }

        @Generated
        public LombokDataClassBuilder c(int c) {
            this.c = c;
            return this;
        }

        @Generated
        public LombokDataClassBuilder d(@Nullable String d) {
            this.d = d;
            return this;
        }

        @Generated
        public LombokDataClass build() {
            return new LombokDataClass(this.a, this.b, this.c, this.d);
        }

        @Generated
        public String toString() {
            return "LombokDataClass.LombokDataClassBuilder(a=" + this.a + ", b=" + this.b + ", c=" + this.c + ", d=" + this.d + ")";
        }
    }
}
```
</details>

<details><summary>Disassembled Java Bytecode</summary>

```txt
Classfile ./original/build/classes/java/main/LombokDataClass.class
  Last modified Dec 24, 2024; size 3150 bytes
  SHA-256 checksum 6ea080eea202178481f9bfb98bb6b2381a1babe5205eb833b8cca3cf2b9f0e32
  Compiled from "LombokDataClass.java"
public class LombokDataClass
  minor version: 0
  major version: 67
  flags: (0x0021) ACC_PUBLIC, ACC_SUPER
  this_class: #15                         // LombokDataClass
  super_class: #2                         // java/lang/Object
  interfaces: 0, fields: 4, methods: 12, attributes: 4
Constant pool:
    #1 = Methodref          #2.#3         // java/lang/Object."<init>":()V
    #2 = Class              #4            // java/lang/Object
    #3 = NameAndType        #5:#6         // "<init>":()V
    #4 = Utf8               java/lang/Object
    #5 = Utf8               <init>
    #6 = Utf8               ()V
    #7 = Class              #8            // java/lang/NullPointerException
    #8 = Utf8               java/lang/NullPointerException
    #9 = String             #10           // b is marked non-null but is null
   #10 = Utf8               b is marked non-null but is null
   #11 = Methodref          #7.#12        // java/lang/NullPointerException."<init>":(Ljava/lang/String;)V
   #12 = NameAndType        #5:#13        // "<init>":(Ljava/lang/String;)V
   #13 = Utf8               (Ljava/lang/String;)V
   #14 = Fieldref           #15.#16       // LombokDataClass.a:I
   #15 = Class              #17           // LombokDataClass
   #16 = NameAndType        #18:#19       // a:I
   #17 = Utf8               LombokDataClass
   #18 = Utf8               a
   #19 = Utf8               I
   #20 = Fieldref           #15.#21       // LombokDataClass.b:Ljava/lang/String;
   #21 = NameAndType        #22:#23       // b:Ljava/lang/String;
   #22 = Utf8               b
   #23 = Utf8               Ljava/lang/String;
   #24 = Fieldref           #15.#25       // LombokDataClass.c:I
   #25 = NameAndType        #26:#19       // c:I
   #26 = Utf8               c
   #27 = Fieldref           #15.#28       // LombokDataClass.d:Ljava/lang/String;
   #28 = NameAndType        #29:#23       // d:Ljava/lang/String;
   #29 = Utf8               d
   #30 = Class              #31           // LombokDataClass$LombokDataClassBuilder
   #31 = Utf8               LombokDataClass$LombokDataClassBuilder
   #32 = Methodref          #30.#3        // LombokDataClass$LombokDataClassBuilder."<init>":()V
   #33 = Methodref          #15.#34       // LombokDataClass.canEqual:(Ljava/lang/Object;)Z
   #34 = NameAndType        #35:#36       // canEqual:(Ljava/lang/Object;)Z
   #35 = Utf8               canEqual
   #36 = Utf8               (Ljava/lang/Object;)Z
   #37 = Methodref          #15.#38       // LombokDataClass.getA:()I
   #38 = NameAndType        #39:#40       // getA:()I
   #39 = Utf8               getA
   #40 = Utf8               ()I
   #41 = Methodref          #15.#42       // LombokDataClass.getC:()I
   #42 = NameAndType        #43:#40       // getC:()I
   #43 = Utf8               getC
   #44 = Methodref          #15.#45       // LombokDataClass.getB:()Ljava/lang/String;
   #45 = NameAndType        #46:#47       // getB:()Ljava/lang/String;
   #46 = Utf8               getB
   #47 = Utf8               ()Ljava/lang/String;
   #48 = Methodref          #2.#49        // java/lang/Object.equals:(Ljava/lang/Object;)Z
   #49 = NameAndType        #50:#36       // equals:(Ljava/lang/Object;)Z
   #50 = Utf8               equals
   #51 = Methodref          #15.#52       // LombokDataClass.getD:()Ljava/lang/String;
   #52 = NameAndType        #53:#47       // getD:()Ljava/lang/String;
   #53 = Utf8               getD
   #54 = Methodref          #2.#55        // java/lang/Object.hashCode:()I
   #55 = NameAndType        #56:#40       // hashCode:()I
   #56 = Utf8               hashCode
   #57 = InvokeDynamic      #0:#58        // #0:makeConcatWithConstants:(ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;
   #58 = NameAndType        #59:#60       // makeConcatWithConstants:(ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;
   #59 = Utf8               makeConcatWithConstants
   #60 = Utf8               (ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;
   #61 = Utf8               RuntimeInvisibleAnnotations
   #62 = Utf8               Lorg/jetbrains/annotations/NotNull;
   #63 = Utf8               Lorg/jetbrains/annotations/Nullable;
   #64 = Utf8               (ILjava/lang/String;ILjava/lang/String;)V
   #65 = Utf8               Code
   #66 = Utf8               LineNumberTable
   #67 = Utf8               LocalVariableTable
   #68 = Utf8               this
   #69 = Utf8               LLombokDataClass;
   #70 = Utf8               StackMapTable
   #71 = Class              #72           // java/lang/String
   #72 = Utf8               java/lang/String
   #73 = Utf8               Llombok/Generated;
   #74 = Utf8               RuntimeInvisibleParameterAnnotations
   #75 = Utf8               builder
   #76 = Utf8               ()LLombokDataClass$LombokDataClassBuilder;
   #77 = Utf8               setC
   #78 = Utf8               (I)V
   #79 = Utf8               setD
   #80 = Utf8               o
   #81 = Utf8               Ljava/lang/Object;
   #82 = Utf8               other
   #83 = Utf8               this$b
   #84 = Utf8               other$b
   #85 = Utf8               this$d
   #86 = Utf8               other$d
   #87 = Utf8               PRIME
   #88 = Utf8               result
   #89 = Utf8               $b
   #90 = Utf8               $d
   #91 = Utf8               toString
   #92 = Utf8               SourceFile
   #93 = Utf8               LombokDataClass.java
   #94 = Utf8               NestMembers
   #95 = Utf8               BootstrapMethods
   #96 = String             #97           // LombokDataClass(a=\u0001, b=\u0001, c=\u0001, d=\u0001)
   #97 = Utf8               LombokDataClass(a=\u0001, b=\u0001, c=\u0001, d=\u0001)
   #98 = MethodHandle       6:#99         // REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
   #99 = Methodref          #100.#101     // java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #100 = Class              #102          // java/lang/invoke/StringConcatFactory
  #101 = NameAndType        #59:#103      // makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #102 = Utf8               java/lang/invoke/StringConcatFactory
  #103 = Utf8               (Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
  #104 = Utf8               InnerClasses
  #105 = Utf8               LombokDataClassBuilder
  #106 = Class              #107          // java/lang/invoke/MethodHandles$Lookup
  #107 = Utf8               java/lang/invoke/MethodHandles$Lookup
  #108 = Class              #109          // java/lang/invoke/MethodHandles
  #109 = Utf8               java/lang/invoke/MethodHandles
  #110 = Utf8               Lookup
{
  final int a;
    descriptor: I
    flags: (0x0010) ACC_FINAL

  final java.lang.String b;
    descriptor: Ljava/lang/String;
    flags: (0x0010) ACC_FINAL
    RuntimeInvisibleAnnotations:
      0: #62()
        org.jetbrains.annotations.NotNull

  int c;
    descriptor: I
    flags: (0x0000)

  java.lang.String d;
    descriptor: Ljava/lang/String;
    flags: (0x0000)
    RuntimeInvisibleAnnotations:
      0: #63()
        org.jetbrains.annotations.Nullable

  LombokDataClass(int, java.lang.String, int, java.lang.String);
    descriptor: (ILjava/lang/String;ILjava/lang/String;)V
    flags: (0x0000)
    Code:
      stack=3, locals=5, args_size=5
         0: aload_0
         1: invokespecial #1                  // Method java/lang/Object."<init>":()V
         4: aload_2
         5: ifnonnull     18
         8: new           #7                  // class java/lang/NullPointerException
        11: dup
        12: ldc           #9                  // String b is marked non-null but is null
        14: invokespecial #11                 // Method java/lang/NullPointerException."<init>":(Ljava/lang/String;)V
        17: athrow
        18: aload_0
        19: iload_1
        20: putfield      #14                 // Field a:I
        23: aload_0
        24: aload_2
        25: putfield      #20                 // Field b:Ljava/lang/String;
        28: aload_0
        29: iload_3
        30: putfield      #24                 // Field c:I
        33: aload_0
        34: aload         4
        36: putfield      #27                 // Field d:Ljava/lang/String;
        39: return
      LineNumberTable:
        line 7: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      40     0  this   LLombokDataClass;
            0      40     1     a   I
            0      40     2     b   Ljava/lang/String;
            0      40     3     c   I
            0      40     4     d   Ljava/lang/String;
      StackMapTable: number_of_entries = 1
        frame_type = 255 /* full_frame */
          offset_delta = 18
          locals = [ class LombokDataClass, int, class java/lang/String, int, class java/lang/String ]
          stack = []
    RuntimeInvisibleAnnotations:
      0: #73()
        lombok.Generated
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
      parameter 1:
        0: #62()
          org.jetbrains.annotations.NotNull
      parameter 2:
      parameter 3:
        0: #63()
          org.jetbrains.annotations.Nullable

  public static LombokDataClass$LombokDataClassBuilder builder();
    descriptor: ()LLombokDataClass$LombokDataClassBuilder;
    flags: (0x0009) ACC_PUBLIC, ACC_STATIC
    Code:
      stack=2, locals=0, args_size=0
         0: new           #30                 // class LombokDataClass$LombokDataClassBuilder
         3: dup
         4: invokespecial #32                 // Method LombokDataClass$LombokDataClassBuilder."<init>":()V
         7: areturn
      LineNumberTable:
        line 7: 0
    RuntimeInvisibleAnnotations:
      0: #73()
        lombok.Generated

  public int getA();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #14                 // Field a:I
         4: ireturn
      LineNumberTable:
        line 9: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   LLombokDataClass;
    RuntimeInvisibleAnnotations:
      0: #73()
        lombok.Generated

  public java.lang.String getB();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #20                 // Field b:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 11: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   LLombokDataClass;
    RuntimeInvisibleAnnotations:
      0: #62()
        org.jetbrains.annotations.NotNull
      1: #73()
        lombok.Generated

  public int getC();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #24                 // Field c:I
         4: ireturn
      LineNumberTable:
        line 12: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   LLombokDataClass;
    RuntimeInvisibleAnnotations:
      0: #73()
        lombok.Generated

  public java.lang.String getD();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=1, locals=1, args_size=1
         0: aload_0
         1: getfield      #27                 // Field d:Ljava/lang/String;
         4: areturn
      LineNumberTable:
        line 14: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   LLombokDataClass;
    RuntimeInvisibleAnnotations:
      0: #63()
        org.jetbrains.annotations.Nullable
      1: #73()
        lombok.Generated

  public void setC(int);
    descriptor: (I)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: iload_1
         2: putfield      #24                 // Field c:I
         5: return
      LineNumberTable:
        line 6: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   LLombokDataClass;
            0       6     1     c   I
    RuntimeInvisibleAnnotations:
      0: #73()
        lombok.Generated

  public void setD(java.lang.String);
    descriptor: (Ljava/lang/String;)V
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=2, args_size=2
         0: aload_0
         1: aload_1
         2: putfield      #27                 // Field d:Ljava/lang/String;
         5: return
      LineNumberTable:
        line 6: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       6     0  this   LLombokDataClass;
            0       6     1     d   Ljava/lang/String;
    RuntimeInvisibleAnnotations:
      0: #73()
        lombok.Generated
    RuntimeInvisibleParameterAnnotations:
      parameter 0:
        0: #63()
          org.jetbrains.annotations.Nullable

  public boolean equals(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Z
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=7, args_size=2
         0: aload_1
         1: aload_0
         2: if_acmpne     7
         5: iconst_1
         6: ireturn
         7: aload_1
         8: instanceof    #15                 // class LombokDataClass
        11: ifne          16
        14: iconst_0
        15: ireturn
        16: aload_1
        17: checkcast     #15                 // class LombokDataClass
        20: astore_2
        21: aload_2
        22: aload_0
        23: invokevirtual #33                 // Method canEqual:(Ljava/lang/Object;)Z
        26: ifne          31
        29: iconst_0
        30: ireturn
        31: aload_0
        32: invokevirtual #37                 // Method getA:()I
        35: aload_2
        36: invokevirtual #37                 // Method getA:()I
        39: if_icmpeq     44
        42: iconst_0
        43: ireturn
        44: aload_0
        45: invokevirtual #41                 // Method getC:()I
        48: aload_2
        49: invokevirtual #41                 // Method getC:()I
        52: if_icmpeq     57
        55: iconst_0
        56: ireturn
        57: aload_0
        58: invokevirtual #44                 // Method getB:()Ljava/lang/String;
        61: astore_3
        62: aload_2
        63: invokevirtual #44                 // Method getB:()Ljava/lang/String;
        66: astore        4
        68: aload_3
        69: ifnonnull     80
        72: aload         4
        74: ifnull        91
        77: goto          89
        80: aload_3
        81: aload         4
        83: invokevirtual #48                 // Method java/lang/Object.equals:(Ljava/lang/Object;)Z
        86: ifne          91
        89: iconst_0
        90: ireturn
        91: aload_0
        92: invokevirtual #51                 // Method getD:()Ljava/lang/String;
        95: astore        5
        97: aload_2
        98: invokevirtual #51                 // Method getD:()Ljava/lang/String;
       101: astore        6
       103: aload         5
       105: ifnonnull     116
       108: aload         6
       110: ifnull        128
       113: goto          126
       116: aload         5
       118: aload         6
       120: invokevirtual #48                 // Method java/lang/Object.equals:(Ljava/lang/Object;)Z
       123: ifne          128
       126: iconst_0
       127: ireturn
       128: iconst_1
       129: ireturn
      LineNumberTable:
        line 6: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0     130     0  this   LLombokDataClass;
            0     130     1     o   Ljava/lang/Object;
           21     109     2 other   LLombokDataClass;
           62      68     3 this$b   Ljava/lang/Object;
           68      62     4 other$b   Ljava/lang/Object;
           97      33     5 this$d   Ljava/lang/Object;
          103      27     6 other$d   Ljava/lang/Object;
      StackMapTable: number_of_entries = 11
        frame_type = 7 /* same */
        frame_type = 8 /* same */
        frame_type = 252 /* append */
          offset_delta = 14
          locals = [ class LombokDataClass ]
        frame_type = 12 /* same */
        frame_type = 12 /* same */
        frame_type = 253 /* append */
          offset_delta = 22
          locals = [ class java/lang/Object, class java/lang/Object ]
        frame_type = 8 /* same */
        frame_type = 1 /* same */
        frame_type = 253 /* append */
          offset_delta = 24
          locals = [ class java/lang/Object, class java/lang/Object ]
        frame_type = 9 /* same */
        frame_type = 1 /* same */
    RuntimeInvisibleAnnotations:
      0: #73()
        lombok.Generated

  protected boolean canEqual(java.lang.Object);
    descriptor: (Ljava/lang/Object;)Z
    flags: (0x0004) ACC_PROTECTED
    Code:
      stack=1, locals=2, args_size=2
         0: aload_1
         1: instanceof    #15                 // class LombokDataClass
         4: ireturn
      LineNumberTable:
        line 6: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0       5     0  this   LLombokDataClass;
            0       5     1 other   Ljava/lang/Object;
    RuntimeInvisibleAnnotations:
      0: #73()
        lombok.Generated

  public int hashCode();
    descriptor: ()I
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=2, locals=5, args_size=1
         0: bipush        59
         2: istore_1
         3: iconst_1
         4: istore_2
         5: iload_2
         6: bipush        59
         8: imul
         9: aload_0
        10: invokevirtual #37                 // Method getA:()I
        13: iadd
        14: istore_2
        15: iload_2
        16: bipush        59
        18: imul
        19: aload_0
        20: invokevirtual #41                 // Method getC:()I
        23: iadd
        24: istore_2
        25: aload_0
        26: invokevirtual #44                 // Method getB:()Ljava/lang/String;
        29: astore_3
        30: iload_2
        31: bipush        59
        33: imul
        34: aload_3
        35: ifnonnull     43
        38: bipush        43
        40: goto          47
        43: aload_3
        44: invokevirtual #54                 // Method java/lang/Object.hashCode:()I
        47: iadd
        48: istore_2
        49: aload_0
        50: invokevirtual #51                 // Method getD:()Ljava/lang/String;
        53: astore        4
        55: iload_2
        56: bipush        59
        58: imul
        59: aload         4
        61: ifnonnull     69
        64: bipush        43
        66: goto          74
        69: aload         4
        71: invokevirtual #54                 // Method java/lang/Object.hashCode:()I
        74: iadd
        75: istore_2
        76: iload_2
        77: ireturn
      LineNumberTable:
        line 6: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      78     0  this   LLombokDataClass;
            3      75     1 PRIME   I
            5      73     2 result   I
           30      48     3    $b   Ljava/lang/Object;
           55      23     4    $d   Ljava/lang/Object;
      StackMapTable: number_of_entries = 4
        frame_type = 255 /* full_frame */
          offset_delta = 43
          locals = [ class LombokDataClass, int, int, class java/lang/Object ]
          stack = [ int ]
        frame_type = 255 /* full_frame */
          offset_delta = 3
          locals = [ class LombokDataClass, int, int, class java/lang/Object ]
          stack = [ int, int ]
        frame_type = 255 /* full_frame */
          offset_delta = 21
          locals = [ class LombokDataClass, int, int, class java/lang/Object, class java/lang/Object ]
          stack = [ int ]
        frame_type = 255 /* full_frame */
          offset_delta = 4
          locals = [ class LombokDataClass, int, int, class java/lang/Object, class java/lang/Object ]
          stack = [ int, int ]
    RuntimeInvisibleAnnotations:
      0: #73()
        lombok.Generated

  public java.lang.String toString();
    descriptor: ()Ljava/lang/String;
    flags: (0x0001) ACC_PUBLIC
    Code:
      stack=4, locals=1, args_size=1
         0: aload_0
         1: invokevirtual #37                 // Method getA:()I
         4: aload_0
         5: invokevirtual #44                 // Method getB:()Ljava/lang/String;
         8: aload_0
         9: invokevirtual #41                 // Method getC:()I
        12: aload_0
        13: invokevirtual #51                 // Method getD:()Ljava/lang/String;
        16: invokedynamic #57,  0             // InvokeDynamic #0:makeConcatWithConstants:(ILjava/lang/String;ILjava/lang/String;)Ljava/lang/String;
        21: areturn
      LineNumberTable:
        line 6: 0
      LocalVariableTable:
        Start  Length  Slot  Name   Signature
            0      22     0  this   LLombokDataClass;
    RuntimeInvisibleAnnotations:
      0: #73()
        lombok.Generated
}
SourceFile: "LombokDataClass.java"
NestMembers:
  LombokDataClass$LombokDataClassBuilder
BootstrapMethods:
  0: #98 REF_invokeStatic java/lang/invoke/StringConcatFactory.makeConcatWithConstants:(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite;
    Method arguments:
      #96 LombokDataClass(a=\u0001, b=\u0001, c=\u0001, d=\u0001)
InnerClasses:
  public static #105= #30 of #15;         // LombokDataClassBuilder=class LombokDataClass$LombokDataClassBuilder of class LombokDataClass
  public static final #110= #106 of #108; // Lookup=class java/lang/invoke/MethodHandles$Lookup of class java/lang/invoke/MethodHandles
```
</details>
