import lombok.Builder;
import lombok.Data;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

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
