package homework7;

import java.util.Scanner;

public class Main3 {
    /*
    Задача 3:
Ввести 3 строки с консоли. Вывести на консоль те строки, длина которых
меньше средней, а также их длину
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] massifLine = new String[3];
        int sum = 0;
        double avgSum;
        boolean found = false; // Флаг
        for (int i = 0; i < massifLine.length; i++) {
            System.out.println("Введите строку " + (i + 1));
            massifLine[i] = scanner.nextLine(); //  nextLine
            sum += massifLine[i].length();
        }
        avgSum = (double) sum / (massifLine.length);
        scanner.close();
        for (int i = 0; i < massifLine.length; i++) {
            if (massifLine[i].length() < avgSum) {
                System.out.println("Строка с длиной меньше средней: " + massifLine[i] + "; ее длина: " + massifLine[i].length() + " символа");
                found = true;
            }
        }
        if (!found) {
            System.out.println("Строк длиной меньше средней нет");
        }
    }
}