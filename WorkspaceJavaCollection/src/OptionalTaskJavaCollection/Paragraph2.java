package OptionalTaskJavaCollection;

// 2.   Ввести число, занести его цифры в стек. Вывести число, у которого цифры идут в обратном порядке.

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Stack;

public class Paragraph2 {
    public static void main(String[] args) {
        Stack СТЭК = new Stack ();
        int i = 0;
        System.out.println ("Введите число");
        Scanner СКАНЕР = new Scanner (System.in);
        try {
            i = СКАНЕР.nextInt ();
        } catch (InputMismatchException e) {
            System.out.println ("Введено некорректное значение");
        }
        char[] numbers = String.valueOf (i).toCharArray ();
        for (char num : numbers) {
            СТЭК.push (num);
        }
        while (!СТЭК.empty ())
        {
            char stackNum;
            stackNum = (Character) СТЭК.pop ();
            System.out.print (stackNum);
        }
    }

}
