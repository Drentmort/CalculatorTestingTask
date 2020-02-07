package Test1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.UnsupportedCharsetException;

public class Main {

    public static void main(String[] args) throws IOException {

        System.out.println("\nНеобходимо ввести два числа\n\nЧисла должны быть целыми и арабскими или римскими\nв диапазоне от 1 до 10 включительно\n\nДля завершения работы введите пустую строку");
        //Цикл, который работает пока не введена пустая строка
        while (true) {
            //Читаем строку
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String a = reader.readLine();
            //условие выхода из цикла
            if(a.isEmpty()){
                System.exit(0);
            }

            //разбиваем строку на список потенциальных чисел и операнд
            Breaker Break = new Breaker(a);

            //проверка числа операндов (должен быть один)
            Checker Check = new Checker(Break.getPieces());
            if (!Check.operatorCheck()) {
                throw new UnsupportedCharsetException ("Задано более одного знака");
            }

            //Проверка, являются ли введенные символы арабсики или римскими числами

            if (!Check.isInteger() && !Check.isRoman()) {
                throw new NumberFormatException("Введены некорректные символы");
            }

            //проверка, лежат ли числа в диапазоне от 1 до 10
            if (!Check.inRange()) {
                throw new NumberFormatException("Введены значения вне диапазона");
            }

            //Создаем объект конвектора в int
            Convertor convertor = new Convertor(Break.getPieces());
            //Производим расчет
            Calculator result = new Calculator(convertor.getNums(), Break.getOperand());

            new NumPrinter(result.getValue(),Check);

        }

    }
}

