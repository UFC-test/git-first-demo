import java.util.Scanner;

import java.util.Random;


public class LearnJava {
    public static void main(String[] args) {

       // 1. Приветствовать любого пользователя при вводе его имени через командную строку
        Scanner userInputScanner = new Scanner(System.in);
        System.out.print("What's your name? ");
        String userInputName = userInputScanner.nextLine();
        System.out.println("Hello " + userInputName);

       // 2.Отобразить в окне консоли аргументы командной строки в обратном порядке.
        for (int i = args.length - 1; i >= 0; i--)
            System.out.println("args["+i+"] = "+args[i]);

        // 3. Вывести заданное количество случайных чисел с переходом и без перехода на новую строку
        Random rand = new Random();
        int i = rand.nextInt();
        System.out.println ("Случайное число: " + i);
        double d = rand. nextDouble();
        System.out.print("Случайное число: " + d);
        float f = rand.nextFloat();
        System.out.print("Случайное число: " + f);

        //4. Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.
        Scanner k = new Scanner(System.in);
        System.out.println ("Введите 2 любых целых числа: ");
        int number1 = k.nextInt();//считывает первое число и присваивает значение в number1
        int number2 = k.nextInt();//считывает второе число и присваивает значение в number2
        System.out.println(number1 + number2);
        System.out.println(number1 * number2);


        }
    }


