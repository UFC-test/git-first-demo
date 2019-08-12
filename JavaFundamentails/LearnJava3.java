import java.util.Random;

public class LearnJava3 {
         public static void main(String[] args) {

            // 3. Вывести заданное количество случайных чисел с переходом и без перехода на новую строку
            Random rand = new Random();
            int i = rand.nextInt();
             System.out.println ("Случайное число: " + i);
            double d = rand. nextDouble();
            System.out.print("Случайное число: " + d);
            float f = rand.nextFloat();
            System.out.print("Случайное число: " + f);
        }
    }


