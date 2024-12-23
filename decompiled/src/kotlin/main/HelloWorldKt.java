import kotlin.Metadata;

@Metadata(
    mv = {2, 1, 0},
    k = 2,
    xi = 48,
    d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u001a\u0006\u0010\u0000\u001a\u00020\u0001¨\u0006\u0002"},
    d2 = {"main", "", "original"}
)
public final class HelloWorldKt {
    public static final void main() {
        System.out.println("Hello World!");
    }

    // $FF: synthetic method
    public static void main(String[] args) {
        main();
    }
}
