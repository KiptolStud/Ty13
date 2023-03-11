package Lesson2;

import java.io.File;
import java.nio.file.Files;
import java.io.*;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.out;

public class Main {

    /*
     * Напишите метод, который составит строку, состоящую из 100 повторений слова
     * TEST и метод,
     * который запишет эту строку в простой текстовый файл, обработайте исключения.
     */
     /*public static void main(String[] args) {
        FourthTask fourthTask = new FourthTask();
        fourthTask.writer();

        class FourthTask {

            public StringBuilder generateString() {
                StringBuilder stringBuilder = new StringBuilder();
                for (int i = 0; i < 100; i++) {
                    stringBuilder.append("TEST ");
                }
                return stringBuilder;
            }

            public void writer() {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream("test.txt");

                    fileOutputStream.write(generateString().toString().getBytes());

                    fileOutputStream.close();
                } catch (IOException e) {
                    System.out.println("Проблема вывода!");
                    e.printStackTrace();
                }
            }
        }
    }*/

    //Напишите метод, который принимает на вход строку (String) и определяет является ли строка палиндромом (возвращает boolean значение).

   /* public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String string = in.next();
        System.out.println(isPalindrom(string));
        in.close();
    }

    public static boolean isPalindrom(String string) {
        return string.equals((new StringBuilder(string)).reverse().toString());
    }*/




        public static void main(String[] args) {
            File file = new File("F:/Учеба/Java_Home_Work/Java_Hw1/untitled/src/main/java/Lesson2/test.txt");
            System.out.println("Расширение файла: " + getFileExtension(file));

            //проверяем метод на файле без расширения
            file = new File("F:/Учеба/Java_Home_Work/Java_Hw1/untitled/src/main/java/Lesson2/zip");
            System.out.println("Расширение файла: " + getFileExtension(file));

            //проверяем метод на файле с точкой в имени
            file = new File("F:/Учеба/Java_Home_Work/Java_Hw1/untitled/src/main/java/Lesson2/test.1.xlsx");
            System.out.println("Расширение файла: " + getFileExtension(file));

            //проверяем метод на файле без имени
            file = new File("F:/Учеба/Java_Home_Work/Java_Hw1/untitled/src/main/java/Lesson2/.doc");
            System.out.println("Расширение файла: " + getFileExtension(file));
        }

        //метод определения расширения файла
        private static String getFileExtension(File file) {
            String fileName = file.getName();
            // если в имени файла есть точка и она не является первым символом в названии файла
            if(fileName.lastIndexOf(".") != -1 && fileName.lastIndexOf(".") != 0)
                // то вырезаем все знаки после последней точки в названии файла
                return fileName.substring(fileName.lastIndexOf(".")+1);
                // в противном случае возвращаем заглушку, то есть расширение не найдено
            else return "";
        }
    }
//}
