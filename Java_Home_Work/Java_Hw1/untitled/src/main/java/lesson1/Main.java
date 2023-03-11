package lesson1;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class Main {
    //Задача 1
       /* public static void main(String[] args) {
        Integer[] numbers = { 8, 2, 7, 1, 4, 9, 5};
        int min = (int) Collections.min(Arrays.asList(numbers));
        int max = (int) Collections.max(Arrays.asList(numbers));

        System.out.println("Минимальное число: " + min);
        System.out.println("Максимальное число: " + max);
    }*/
    //Задача 2

      /*  static int[] moveElementToEnd(int []array,
                                      int toMove)
        {
            int i = 0;
            int j = array.length - 1;
            while (i < j)
            {
                while (i < j && array[j] == toMove)
                    j--;
                if (array[i] == toMove)
                    swap(array, i, j);
                i++;
            }
            return array;
        }

        static int[] swap(int []arr, int i, int j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            return arr;
        }
        public static void main(String[] args)
        {
            int []arr = { 3, 2, 2, 3};
            int K = 3;
            int []ans = moveElementToEnd(arr, K);

            for(int i = 0; i < arr.length; i++)
                System.out.print(ans[i] + " ");
        }*/

   //Задача 3.
    /* LocalDateTime now = LocalDateTime.now();
     Calendar = new GregorianCalendar();
     System.out.println (calendar);
     System.out.println (now);
     System.out.println ("Введите имя!");
     Scanner in = new Scanner(System.in);
     String name = in.nextLine();
     in.close();
     System.out.println("Привет, " + name);
     if (Calendar.getInstance().get(Calendar.HOUR_OF_DAY) >= 5
             && Calendar.getInstance().get(Calendar.HOUR_OF_DAY) < 12) {
         System.out.println("Доброе утро, " + name + "!");
     } else if (Calendar.getInstance().get(Calendar.HOUR_OF_DAY) >= 12
             && Calendar.getInstance().get(Calendar.HOUR_OF_DAY) < 18) {
         System.out.println("Добрый день, " + name + "!");
     } else if (Calendar.getInstance().get(Calendar.HOUR_OF_DAY) >= 18
             && Calendar.getInstance().get(Calendar.HOUR_OF_DAY) < 23) {
         System.out.println("Добрый вечер, " + name + "!");
    } else if (Calendar.getInstance().get(Calendar.HOUR_OF_DAY) >= 23
           && Calendar.getInstance().get(Calendar.HOUR_OF_DAY) < 5) {
        System.out.println("Доброй ночи, " + name + "!");
     }*/
}




