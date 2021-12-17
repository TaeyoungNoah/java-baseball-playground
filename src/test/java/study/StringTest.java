package study;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class StringTest {
    @Test
    @DisplayName("원래 있던 테스트")
    void replace() {
        String actual = "abc".replace("b", "d");
        assertThat(actual).isEqualTo("adc");
    }

    @Test
    @DisplayName("요구사항 1-1")
    void 요구사항1_1() {
        // given
        String test = "1,2";
        // when
        String[] testArr = test.split(",");
        // then
        assertThat(testArr).contains("1","2");
    }

    @Test
    @DisplayName("요구사항 1-2")
    void 요구사항1_2() {
        // given
        String test = "1";
        // when
        String[] testArr = test.split(",");
        // then
        assertThat(testArr).containsExactly("1");
    }

    @Test
    @DisplayName("요구사항 2")
    void 요구사항2() {
        // given
        String test = "(a,b)";
        // when
        String result = test.substring(1,4);
        // then
        assertThat(result).isEqualTo("a,b");
    }

    @Test
    @DisplayName("요구사항 3-1")
    void 요구사항3_1() {
        // given
        String test = "abc";
        // when
        char result1 = test.charAt(0);
        char result2 = test.charAt(1);
        char result3 = test.charAt(2);
        // then
        assertThat(result1).isEqualTo('a');
        assertThat(result2).isEqualTo('b');
        assertThat(result3).isEqualTo('c');
    }

    @Test
    @DisplayName("요구사항 3-2")
    void 요구사항3_2() {
        // given
        String test = "abc";
        // when & then
        assertThatThrownBy(() -> {
            test.charAt(3);
        }).isInstanceOf(IndexOutOfBoundsException.class)
                .hasMessageContaining("index out of range: 3");
    }


}
