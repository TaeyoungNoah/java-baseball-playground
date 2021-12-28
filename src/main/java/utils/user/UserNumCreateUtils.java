package utils.user;

import utils.user.CheckValidUserNum;

import java.util.Scanner;

public class UserNumCreateUtils {
    private static Scanner scanner;
    private CheckValidUserNum checkValidUserNum = new CheckValidUserNum();

    public UserNumCreateUtils(Scanner scanner) {
        this.scanner=scanner;
    }

    public int[] createUserNum() {
        System.out.print("숫자를 입력하세요: ");
        String userInputRaw = scanner.next();
        return checkValidUserNum.checkValidUserInputIsInteger(userInputRaw);
    }
}
