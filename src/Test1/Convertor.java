package Test1;

import java.util.ArrayList;

//Данный класс конвертирует элементы списка, которые содержат арабские и римские числа, в int
public class Convertor {
    private ArrayList<Integer> nums = new ArrayList<>();

    public Convertor(ArrayList<String> pieces){
        Checker check = new Checker(pieces);
        if(check.isInteger()){
            for(String s: pieces){
                this.nums.add(Integer.parseInt(s));
            }
        }
        if(check.isRoman()){
            for(String s: pieces){
                this.nums.add(new RomeNum(s).toInt());
            }
        }
    }

    public ArrayList<Integer> getNums(){
        return nums;
    }
}
