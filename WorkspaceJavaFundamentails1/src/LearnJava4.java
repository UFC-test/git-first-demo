import java.util.Scanner;

public class LearnJava4 {
    public static void main(String[] args) {

        Scanner k = new Scanner(System.in);
        System.out.println ("Введите 2 любых целых числа: ");
        int number1 = k.nextInt();//считывает первое число и присваивает значение в number1
        int number2 = k.nextInt();//считывает второе число и присваивает значение в number2
        System.out.println(number1 + number2);
        System.out.println(number1 * number2);



    }
}
