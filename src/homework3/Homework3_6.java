package homework3;

import java.util.Scanner;

public class Homework3_6 {
    /* Задача 6: Проверить, является ли массив возрастающей последовательностью (каждое
следующее число больше предыдущего).*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива");
        System.out.println();
        int a = scanner.nextInt();
        int[] massif = new int[a];
        for (int i = 0; i < massif.length; i++) {
            System.out.println("Введите элемент massif[" + i + "]");
            massif[i] = scanner.nextInt();
        }
        int count = 0;
        for (int i = 0; i < massif.length - 1; i++) {
            if (massif[i] < massif[i + 1]) {
                count = count;
            } else {
                count++;
            }
        }
        if (count == 0) {
            System.out.println("Массив является возрастающей последовательностью");
        } else {
            System.out.println("Массив НЕ является возрастающей последовательностью");
        }
    }
}
