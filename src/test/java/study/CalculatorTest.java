package study;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;



public class CalculatorTest {
    @Test
    void calculator(){
        String userInput = "2 + 3 * 4 / 2";
        String[] userInputArr = userInput.split(" ");
        Assertions.assertThat(calculate(userInputArr)).isEqualTo(10);
    }

    private int calculate(String[] values) {
        int result=0;
        result+=Integer.parseInt(values[0]);
        for(int i=1; i<values.length; i+=2){
            result=add(result,Integer.parseInt(values[i+1]),values[i]);
        }
        return result;
    }

    private int add(int firstNum, int lastNum, String operator) {
        if(operator.equals("+")) {
            return firstNum + lastNum;
        }
        return subtract(firstNum, lastNum, operator);
    }

    private int subtract(int firstNum, int lastNum, String operator){
        if(operator.equals("-")) {
            return firstNum - lastNum;
        }
        return multiply(firstNum, lastNum, operator);
    }

    private int multiply(int firstNum, int lastNum, String operator){
        if(operator.equals("*")) {
            return firstNum * lastNum;
        }
        return divide(firstNum, lastNum, operator);
    }

    private int divide(int firstNum, int lastNum, String operator){
        return firstNum / lastNum;
    }
}
