package homework7;

import java.util.Scanner;

public class Main1 {
    /*
    Задача 1:
Ввести 3 строки с консоли, найти самую короткую и самую длинную строки.
Вывести найденные строки и их длину.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первую строку");
        String a1 = scanner.next();
        System.out.println("Введите вторую строку");
        String a2 = scanner.next();
        System.out.println("Введите третью строку");
        String a3 = scanner.next();
        String shortest = a1;
        String longest = a1;
        if (a2.length() < shortest.length()) {
            shortest = a2;
        }
        if (a2.length() > longest.length()) {
            longest = a2;
        }
        if (a3.length() < shortest.length()) {
            shortest = a3;
        }
        if (a3.length() > longest.length()) {
            longest = a3;
        }
        System.out.println("Самая короткая строка: " + shortest + " ее длина" + shortest.length());
        System.out.println("Самая длинная строка: " + longest + "ее длина" + longest.length());
        scanner.close();
    }
}
