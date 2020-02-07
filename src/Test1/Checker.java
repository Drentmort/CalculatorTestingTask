package Test1;

import java.util.ArrayList;


//Класс является наборов инструментов проверки условий из ТЗ
public class Checker {

    private ArrayList<String> pieces = new ArrayList<>();

    public Checker(ArrayList<String> pieces){
        this.pieces=pieces;
    }

    //Проверка числа операндов
    public boolean operatorCheck(){
        if (pieces.size()!=2) return false;
        return true;
    }
    //Проверка, на содержание в списке только лишь арабский чисел
    public boolean isInteger(){
        for(String s : pieces){
            try {int i = Integer.parseInt(s);}
            catch (NumberFormatException pe) {
                return false;
            }
        }
        return true;
    }

    //Проверка, на содержание в списке только лишь римских чисел
    public boolean isRoman(){
        for(String s : pieces){
            s=s.toUpperCase();
            for(int i=0; i<s.length(); i++){
                if (s.charAt(i)!='I' && s.charAt(i)!='V' && s.charAt(i)!='X' ) return false;
            }
        }
        return true;
    }

    //Проверка, входят ли числа в диапазон
    public boolean inRange(){
        for(int i : new Convertor(pieces).getNums()){
            if(i>10 || i<1) return false;
        }
        return true;
    }

}
