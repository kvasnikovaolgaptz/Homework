package homework7;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Main5 {
    /*
    Задача 5:
Вывести на консоль новую строку, которой задублирована каждая буква из
начальной строки. Например, "Hello" -> "HHeelllloo"
     */
    public static void main(String[] args) {
        String line;
        String resalt = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку ");
        line = scanner.nextLine(); //  nextLine
        scanner.close();
        for (int i = 0; i < line.length(); i++){
            char value = line.charAt(i);// преобразует строку в массив символов
            resalt = resalt + value +value;
        }
        System.out.println(resalt);
    }
}
