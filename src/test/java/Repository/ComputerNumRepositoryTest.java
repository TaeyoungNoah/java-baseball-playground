package Repository;


import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import repository.ComputerNumRepository;

public class ComputerNumRepositoryTest {

    @Test
    void 싱글톤_테스트() {
        // given&when
        ComputerNumRepository test1 = ComputerNumRepository.getInstanceComputerRepository();
        ComputerNumRepository test2 = ComputerNumRepository.getInstanceComputerRepository();
        // then
        Assertions.assertThat(test1).isEqualTo(test2);
    }

    @Test
    void 컴퓨터숫자(){
        //given
        ComputerNumRepository test = ComputerNumRepository.getInstanceComputerRepository();
        int[] computerNumTest = {1,2,3};
        // when
        test.setComputerNum(computerNumTest);
        // then
        Assertions.assertThat(computerNumTest).isEqualTo(test.getComputerNum());
    }

    @Test
    void 초기화(){
        // given
        ComputerNumRepository test = ComputerNumRepository.getInstanceComputerRepository();
        int[] computerNumTest = {1,2,3};
        // when
        test.setComputerNum(computerNumTest);
        test.clearComputerRepository();
        //then
        Assertions.assertThat(test.getComputerNum()).isEqualTo(null);
    }
}
