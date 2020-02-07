package Test1;

import java.util.ArrayList;

//Данный класс используется для разбиения введенной строки на список символов-потенциальных чисел и операнда
public class Breaker {
    private ArrayList<String> pieces = new ArrayList<>();
    private String operand;

    public Breaker (String str) {
        str=str.replace(" ","");
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '+' || str.charAt(i) == '-' || str.charAt(i) == '*' || str.charAt(i) == '/') {
                this.pieces.add(str.substring(0, i));
                this.pieces.add(str.substring(i + 1, str.length()));
                this.operand = str.substring(i,i+1);
            }
        }
    }

    public ArrayList<String> getPieces(){
        return pieces;
    }

    public String getOperand(){
        return operand;
    }

}
