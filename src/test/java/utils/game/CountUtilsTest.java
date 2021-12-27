package utils.game;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountUtilsTest {
    CountUtils countUtils = new CountUtils();
    int[] computerNum={1,2,3};
    int[] userNum={1,3,2};

    @Test
    void countStrike() {
        int strike = countUtils.countStrike(computerNum, userNum);
        Assertions.assertThat(strike).isEqualTo(1);
    }

    @Test
    void countBall() {
        int ball = countUtils.countBall(computerNum, userNum);
        Assertions.assertThat(ball).isEqualTo(2);
    }
}