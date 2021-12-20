package study;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class SimpleTest {
    @Test
    void test() {
        // given
        String test = "abc";
        // when & then
        Assertions.assertThatThrownBy(() -> {
            test.charAt(3);
        }).isInstanceOf(IndexOutOfBoundsException.class)
                .hasMessageContaining("index out of range: 3");
    }
}
