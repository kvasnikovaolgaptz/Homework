package homework3;

import java.util.Random;
import java.util.Scanner;

public class Homework3_3 {
    /* Задача 3: Найти индексы минимального и максимального элементов и вывести в консоль.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите размер массива");
        System.out.println();
        int a = scanner.nextInt();
        int[] massif = new int[a];
        System.out.println("Элементы масссива");
        for (int i = 0; i < massif.length; i++) {
            massif[i] = random.nextInt(11);
            System.out.println("massif[" + i + "]=" + massif[i]);
        }
        int max = massif[0];
        int indexMax = 0;
        for (int i = 0; i < massif.length; i++) {
            if (massif[i] > max) {
                max = massif[i];
                indexMax = i;
            }
        }
        System.out.println("Индекс максимального элемента=" + indexMax);

        int min = massif[0];
        int indexMin = 0;
        for (int i = 0; i < massif.length; i++) {
            if (massif[i] < min) {
                min = massif[i];
                indexMin = i;
            }
        }
        System.out.println("Индекс минимального элемента=" + indexMin);
    }
}
