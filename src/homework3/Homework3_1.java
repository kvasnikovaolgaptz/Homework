package homework3;

import java.util.Random;
import java.util.Scanner;

public class Homework3_1 {
    /* Задача 1: Пройти по массиву, вывести все элементы в прямом и в обратном порядке.*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Введите размер массива");
        System.out.println();
        int a = scanner.nextInt();
        int[] massif = new int[a];
        System.out.println("Элементы масссива в прямом порядке");
        for (int i = 0; i < massif.length; i++) {
            massif[i] = random.nextInt(11);
            System.out.println("massif[" + i + "]=" + massif[i]);
        }
        System.out.println("Элементы масссива в обратном порядке");
        for (int i = massif.length - 1; i >= 0; i = i - 1) {
            System.out.println("massif[" + i + "]=" + massif[i]);
        }
    }
}
