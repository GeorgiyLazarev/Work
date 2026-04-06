package homework7;

import java.util.Scanner;

public class ScannerClass {
    //Метод создания 3 массивов через ввод с консоли
    public static String[] scannerVoid() {
        Scanner scanner = new Scanner(System.in);
        String[] massive = new String[3];

        int number = 1;
        for (int i = 0; i < 3; i++) {
            System.out.printf("Введите строку %d: ", number);
            String input = scanner.nextLine();
            massive[i] = input;
            number++;
        }
        scanner.close();
        System.out.println("----------");

        return massive;
    }

    //Метод сравнения символов
    public static boolean hasUniqueChars(String word) {
        boolean thereNoMatch = false;
        boolean coincidence = true;

        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j < word.length(); j++) {
                if (word.charAt(i) == word.charAt(j)) {
                    return thereNoMatch;
                }
            }
        }
        return coincidence;
    }

    //Метод создания дубликатов каждой буквы строки
    public static String duplicate(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char j = str.charAt(i);
            result.append(j).append(j);
        }

        return result.toString();
    }
}
