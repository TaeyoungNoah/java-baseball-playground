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
        String userInputRaw = scanner.nextLine();
        return checkValidUserNum.checkValidUserInputIsInteger(userInputRaw);
    }


}
