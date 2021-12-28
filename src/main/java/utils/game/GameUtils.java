package utils.game;

import java.util.Scanner;

public class GameUtils {
    public static boolean newGame(Scanner scanner) {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        String getUserInputGame = scanner.next();
        if(getUserInputGame.equals("1")){
            return true;
        }
        if(getUserInputGame.equals("2")){
            return false;
        }
        throw new IllegalStateException("[ERROR] 1 또는 2만 입력하세요.");
    }
}
