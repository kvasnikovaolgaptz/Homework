package homework8;

import java.util.HashSet;

public class Main1 {
    /*
    Задача 1:
Пользователь вводит набор чисел в виде одной строки с клавиатуры.
Например: "1, 2, 3, 4, 4, 5". Избавиться от повторяющихся элементов в строке.
Вывести результат на экран.
При решении использовать коллекции.
     */
public static void main (String[] args) {
    String line = "1, 2, 3, 4, 4, 5";
    HashSet<Integer> resalt = new HashSet<>();
    String[] numbers = line.split(","); // вводимая строка разбивается на массив строк с числами
    for (String number : numbers) {
        resalt.add(Integer.parseInt(number.trim()));
        //Метод trim() удаляет пробелы и возвращает строку "4".
        //Integer.parseInt("4") преобразует эту строку в целое число 4
    }
      System.out.println(resalt);
}
}