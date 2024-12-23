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
