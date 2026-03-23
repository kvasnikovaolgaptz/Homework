package homework3;

import java.util.Scanner;

public class Homework3_2 {
    /* Задача 2: Найти минимальный - максимальный элементы и вывести в консоль.*/
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

        int max = massif[0];
        for (int i = 0; i < massif.length; i++) {
            if (massif[i] > max) {
                max = massif[i];
            }
        }
        System.out.println("Максимальный элемент массива=" + max);

        int min = massif[0];
        for (int i = 0; i < massif.length; i++) {
            if (massif[i] < min) {
                min = massif[i];
            }
        }
        System.out.println("Минимальный элемент массива=" + min);
    }

}
