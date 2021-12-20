package utils;

public class CheckValidUserNum {
    private final int VALID_SIZE=3;

    public int[] checkValidUserInputIsInteger(String userInputRaw) {
        try{
            Integer.parseInt(userInputRaw);
        }catch (NumberFormatException e){
            throw new IllegalStateException("[ERROR] 숫자만 입력하세요.");
        }
        return checkValidUserInputHasZero(userInputRaw);
    }

    private int[] checkValidUserInputHasZero(String userInputRaw) {
        if(userInputRaw.contains("0")){
            throw new IllegalStateException("[ERROR] 0은 입력할 수 없습니다.");
        }
        return checkValidUserInputSize(userInputRaw);
    }

    private int[] checkValidUserInputSize(String userInputRaw) {
        if(userInputRaw.length()!=VALID_SIZE){
            throw new IllegalStateException("[ERROR] 3자리로 입력하세요.");
        }
        return checkValidUserInputDuplicate(userInputRaw);
    }

    private int[] checkValidUserInputDuplicate(String userInputRaw) {
        if(userInputRaw.charAt(0) == userInputRaw.charAt(1)
                || userInputRaw.charAt(1) == userInputRaw.charAt(2)
                || userInputRaw.charAt(0) == userInputRaw.charAt(2)) {
            throw new IllegalStateException("[ERROR] 증복 없이 입력해주세요.");
        }
        return changeForm(userInputRaw);
    }

    private int[] changeForm(String userInputRaw) {
        int[] userNum = new int[VALID_SIZE];
        String[] userInputString = userInputRaw.split("");
        for(int i=0; i<VALID_SIZE; i++){
            userNum[i]=Integer.parseInt(userInputString[i]);
        }
        return userNum;
    }

}
