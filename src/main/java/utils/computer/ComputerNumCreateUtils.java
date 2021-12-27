package utils.computer;

import utils.game.RandomUtils;

public class ComputerNumCreateUtils {
    final int START_INCLUSIVE = 1;
    final int END_INCLUSIVE=9;
    final int MAX_DIGIT=3;
    private int[] computerNum= new int[3];

    public int[] createComputerNum() {
        int count=0;
        while(count<MAX_DIGIT){
            int randomNum = RandomUtils.nextInt(START_INCLUSIVE, END_INCLUSIVE);
            if(checkDuplicate(randomNum)) {
                computerNum[count] = randomNum;
                count++;
            }
        }
        return computerNum;
    }

    private boolean checkDuplicate(int randomNum) {
        for(int num : computerNum){
            if(num==randomNum){
                return false;
            }
        }
        return true;
    }
}