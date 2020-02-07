package Test1;

import java.util.ArrayList;

//Данный класс отвечает за сам расчет

public class Calculator {

    private ArrayList<Integer> nums = new ArrayList<>();
    private String operand;

    public Calculator(ArrayList<Integer> nums, String operand){
        this.nums=nums;
        this.operand=operand;
    }

    public int getValue(){
        int result = nums.get(0);
        switch (operand){

            case "+":
                result = result + nums.get(1);
                break;

            case "-":
                result = result - nums.get(1);
                break;

            case "*":
                result = result * nums.get(1);
                break;

            case "/":
                result = result / nums.get(1);
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + operand);
        }

        return result;
    }

}
