package homework8;

import java.util.*;

public class Main3 {
    /*
    На вход поступает массив строк, верните Map<String, Boolean>, где каждая
отдельная строка является ключом, и ее значение равно true, если эта строка
встречается в массиве 2 или более раз.

Пример:
wordMultiple(["a", "b", "a", "c", "b"])→{"a": true, "b": true, "c": false}
wordMultiple(["c", "b", "a"])→{"a": false, "b": false, "c": false}
wordMultiple(["c", "c", "c", "c"])→{"c": true}
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите буквы, разделенные запятой:");
        String word = scanner.nextLine();
        String[] massifWord = word.split(","); // вводимая строка разбивается на массив строк с буквами
        Map<String, Boolean> wordMultiple = new HashMap<>();
        // Перебираем массив и считаем вхождения
        for (String w : massifWord) {
            w = w.trim();// Удаляем лишние пробелы вокруг каждой строки
            wordMultiple.put(w, wordMultiple.getOrDefault(w, false) || (Collections.frequency(Arrays.asList(massifWord), w) > 1));
        }
        System.out.println(wordMultiple);
        scanner.close();
    }
}