package utils;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.computer.ComputerNumCreateUtils;


class ComputerNumCreateUtilsTest {
    ComputerNumCreateUtils computerNumCreateUtils = new ComputerNumCreateUtils();
    @Test
    void 컴퓨터숫자생성(){
        int[] computerNum = computerNumCreateUtils.createComputerNum();
        for(int num : computerNum){
            System.out.println(num);
        }
    }

    @Test
    void 컴퓨터숫자생성_중복처리(){
        int randomNum=1;
        Assertions.assertThat(checkDuplicate(randomNum)).isFalse();
    }

    private boolean checkDuplicate(int randomNum){
        int [] computerNum = {1,2,0};
        for(int num : computerNum){
            if(num==randomNum){
                return false;
            }
        }
        return true;
    }
}