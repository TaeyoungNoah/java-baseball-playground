package utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class CheckValidUserNumTest {
    CheckValidUserNum checkValidUserNum = new CheckValidUserNum();

    @Test
    @DisplayName("숫자 아님")
    void checkValidUserInputIsInteger() {
        String userInput = "a12";
        assertThatThrownBy(() -> {
            checkValidUserNum.checkValidUserInputIsInteger(userInput);
        }).isInstanceOf(IllegalStateException.class)
                .hasMessageContaining("[ERROR] 숫자만 입력하세요.");
    }

    @Test
    @DisplayName("0입력")
    void checkValidUserInputHasZero() {
        String userInput = "012";
        assertThatThrownBy(() -> {
            checkValidUserNum.checkValidUserInputIsInteger(userInput);
        }).isInstanceOf(IllegalStateException.class)
                .hasMessageContaining("[ERROR] 0은 입력할 수 없습니다.");
    }

    @ParameterizedTest
    @ValueSource(strings = {"12","1234"})
    @DisplayName("3자리인지")
    void checkValidUserInputSize(String userInput) {
        assertThatThrownBy(() -> {
            checkValidUserNum.checkValidUserInputIsInteger(userInput);
        }).isInstanceOf(IllegalStateException.class)
                .hasMessageContaining("[ERROR] 3자리로 입력하세요.");
    }

    @Test
    @DisplayName("중복")
    void checkValidUserInputDuplicate() {
        String userInput = "112";
        assertThatThrownBy(() -> {
            checkValidUserNum.checkValidUserInputIsInteger(userInput);
        }).isInstanceOf(IllegalStateException.class)
                .hasMessageContaining("[ERROR] 증복 없이 입력해주세요.");
    }
}