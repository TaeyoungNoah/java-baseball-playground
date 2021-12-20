package Repository;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import repository.UserNumRepository;

public class UserNumRepositoryTest {

    @Test
    void 싱글톤_테스트() {
        // given&when
        UserNumRepository test1 = UserNumRepository.getInstanceUserRepository();
        UserNumRepository test2 = UserNumRepository.getInstanceUserRepository();

        // then
        Assertions.assertThat(test1).isEqualTo(test2);
    }

    @Test
    void 유저숫자() {
        // given
        UserNumRepository test = UserNumRepository.getInstanceUserRepository();
        int[] userNum = {1,2,3};

        // when
        test.setUserNum(userNum);

        //then
        Assertions.assertThat(userNum).isEqualTo(test.getUserNum());
    }
}
