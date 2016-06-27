import org.assertj.core.util.CheckReturnValue;

import static org.assertj.core.api.Assertions.assertThat;

public class Main {

    @CheckReturnValue
    public static int test() {
        return 0;
    }

    public static void main(Object[] args) {
        assertThat(true);
    }
}
