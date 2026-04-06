package homework7;

import java.util.Arrays;

/**
 * Задача 1:
 * Ввести 3 строки с консоли, найти самую короткую и самую длинную строки.
 * Вывести найденные строки и их длину.
 */

public class Task1 extends ScannerClass {
    public static void main(String[] args) {
        String[] myMassive = scannerVoid();
        System.out.println(Arrays.toString(myMassive));

        String index = myMassive[0];
        int little = index.length();
        int lengthy = index.length();
        String littleString = myMassive[0];
        String lengthyString = myMassive[0];
        
        for (String number : myMassive) {
            int integer = number.length();
            if (integer > lengthy) {
                lengthy = integer;
                lengthyString = number;
            }
            
            if (integer < little) {
                little = integer;
                littleString = number;
            }
            System.out.printf("Строка 1: %s; Длина: %d%n", number, number.length());
        }

        System.out.println("-----------");
        System.out.printf("Длинная строка: %s%n", lengthyString);
        System.out.printf("Короткая строка: %s", littleString);
    }
}
