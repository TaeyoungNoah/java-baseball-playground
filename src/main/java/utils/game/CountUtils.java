package utils.game;

public class CountUtils {
    // ------------------- count strike -------------------
    public int countStrike(int[] computerNum, int[] userNum) {
        int strike = 0;
        for (int i = 0; i < computerNum.length; i++) {
            if(computerNum[i]==userNum[i]){
                strike++;
            }
        }
        return strike;
    }

    // ------------------- count ball -------------------
    public int countBall(int[] computerNum, int[] userNum) {
        int ball=0;
        for (int i = 0; i < computerNum.length; i++) {
            ball+=assistCountBall(computerNum,userNum,i);
        }
        return ball;
    }

    private int assistCountBall(int[] computerNum, int[] userNum, int i) {
        int count = 0;
        for (int j = 0; j < userNum.length; j++) {
            if(i!=j && computerNum[i]==userNum[j]){
                count++;
            }

        }
        return count;
    }
}
