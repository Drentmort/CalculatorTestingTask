package Test1;

public class NumPrinter {
     private int num;
     private Checker checker;

     public NumPrinter(int num, Checker checker){
         this.checker=checker;
         this.num =num;
         if(checker.isRoman()){
             System.out.println(new RomeNum(num).toRoman());
         }
         else System.out.println(num);

     }

}
