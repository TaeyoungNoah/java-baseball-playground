package process;

import repository.ComputerNumRepository;
import repository.UserNumRepository;
import utils.computer.ComputerNumCreateUtils;
import utils.game.CountUtils;
import utils.game.GameUtils;
import utils.user.UserNumCreateUtils;

import java.util.Scanner;

public class Process {
    private Scanner scanner = new Scanner(System.in);
    private ComputerNumRepository computerNumRepository = ComputerNumRepository.getInstanceComputerRepository();
    private UserNumRepository userNumRepository = UserNumRepository.getInstanceUserRepository();


    public void initialize() {
        ComputerNumCreateUtils computerNumCreateUtils = new ComputerNumCreateUtils();
        int[] computerNum = computerNumCreateUtils.createComputerNum();
        computerNumRepository.setComputerNum(computerNum);
        getUserInput();
    }

    public void getUserInput() {
        UserNumCreateUtils userNumCreateUtils = new UserNumCreateUtils(scanner);
        try{
            userNumRepository.setUserNum(userNumCreateUtils.createUserNum());
        } catch (IllegalStateException e){
            System.out.println(e.getMessage());
            getUserInput();
        }
        countStrikeAndBall();
    }

    public void countStrikeAndBall() {
        CountUtils countUtils = new CountUtils();
        int strike = countUtils.countStrike(computerNumRepository.getComputerNum(), userNumRepository.getUserNum());
        int ball = countUtils.countBall(computerNumRepository.getComputerNum(), userNumRepository.getUserNum());
        printResult(strike,ball);
    }

    public void printResult(int strike, int ball) {
        if(strike==3){
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
            resultGame();
            return;
        }
        if(strike==0 && ball==0){
            System.out.println("낫싱");
            getUserInput();
            return;
        }
        if(strike==0){
            System.out.println(ball+"볼");
            getUserInput();
            return;
        }
        if(ball==0){
            System.out.println(strike+"스트라이크");
            getUserInput();
            return;
        }
        System.out.println(ball+"볼 "+strike+"스트라이크");
        getUserInput();
    }

    public void resultGame() {
        try {
            if (GameUtils.newGame(scanner)) {
                initialize();
            }
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
            resultGame();
        }
    }
}
