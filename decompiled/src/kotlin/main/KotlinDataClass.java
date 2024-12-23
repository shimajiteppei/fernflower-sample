import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
    mv = {2, 1, 0},
    k = 1,
    xi = 48,
    d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003J3\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u0013¨\u0006\u001e"},
    d2 = {"LKotlinDataClass;", "", "a", "", "b", "", "c", "d", "<init>", "(ILjava/lang/String;ILjava/lang/String;)V", "getA", "()I", "getB", "()Ljava/lang/String;", "getC", "setC", "(I)V", "getD", "setD", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "original"}
)
public final class KotlinDataClass {
    private final int a;
    @NotNull
    private final String b;
    private int c;
    @Nullable
    private String d;

    public KotlinDataClass(int a, @NotNull String b, int c, @Nullable String d) {
        Intrinsics.checkNotNullParameter(b, "b");
        super();
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    public final int getA() {
        return this.a;
    }

    @NotNull
    public final String getB() {
        return this.b;
    }

    public final int getC() {
        return this.c;
    }

    public final void setC(int var1) {
        this.c = var1;
    }

    @Nullable
    public final String getD() {
        return this.d;
    }

    public final void setD(@Nullable String var1) {
        this.d = var1;
    }

    public final int component1() {
        return this.a;
    }

    @NotNull
    public final String component2() {
        return this.b;
    }

    public final int component3() {
        return this.c;
    }

    @Nullable
    public final String component4() {
        return this.d;
    }

    @NotNull
    public final KotlinDataClass copy(int a, @NotNull String b, int c, @Nullable String d) {
        Intrinsics.checkNotNullParameter(b, "b");
        return new KotlinDataClass(a, b, c, d);
    }

    // $FF: synthetic method
    public static KotlinDataClass copy$default(KotlinDataClass var0, int var1, String var2, int var3, String var4, int var5, Object var6) {
        if ((var5 & 1) != 0) {
            var1 = var0.a;
        }

        if ((var5 & 2) != 0) {
            var2 = var0.b;
        }

        if ((var5 & 4) != 0) {
            var3 = var0.c;
        }

        if ((var5 & 8) != 0) {
            var4 = var0.d;
        }

        return var0.copy(var1, var2, var3, var4);
    }

    @NotNull
    public String toString() {
        return "KotlinDataClass(a=" + this.a + ", b=" + this.b + ", c=" + this.c + ", d=" + this.d + ")";
    }

    public int hashCode() {
        int result = Integer.hashCode(this.a);
        result = result * 31 + this.b.hashCode();
        result = result * 31 + Integer.hashCode(this.c);
        result = result * 31 + (this.d == null ? 0 : this.d.hashCode());
        return result;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        } else if (!(other instanceof KotlinDataClass)) {
            return false;
        } else {
            KotlinDataClass var2 = (KotlinDataClass)other;
            if (this.a != var2.a) {
                return false;
            } else if (!Intrinsics.areEqual(this.b, var2.b)) {
                return false;
            } else if (this.c != var2.c) {
                return false;
            } else {
                return Intrinsics.areEqual(this.d, var2.d);
            }
        }
    }
}
