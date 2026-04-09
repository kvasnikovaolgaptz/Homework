package homework7;

import java.util.Scanner;

public class Main4 {
    /*
        Задача 4:
    Ввести 3 строки с консоли. Найти слово, состоящее только из различных
    символов. Если таких слов несколько, найти первое из них.

     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] massifLine = new String[3];
        for (int i = 0; i < massifLine.length; i++) {
            System.out.println("Введите строку " + (i + 1));
            massifLine[i] = scanner.nextLine();
        }
        // Поиск первого слова с уникальными символами
        String firstWord = null;
        for (String line : massifLine) {
            if (hasDuplicate(line)) {
                firstWord = line; // Сохраняем первое слово с уникальными символами
                break; // Выходим из цикла после нахождения первого слова
            }
        }
        // Вывод результата
        if (firstWord != null) {
            System.out.println("Первое слово с уникальными символами: " + firstWord);
        } else {
            System.out.println("Нет слов с уникальными символами.");
        }
        scanner.close();
    }
      static boolean hasDuplicate(String word) {
        for (int i = 0; i < word.length(); i++) {
            char value = word.charAt(i);
            for (int j = i + 1; j < word.length(); j++) {
                if (value == word.charAt(j)) {
                    return false; // Если символ повторяется, вернуть false
                }
            }
        }
        return true; // Все символы уникальны
    }
}
