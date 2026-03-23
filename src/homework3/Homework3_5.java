package homework3;

import java.util.Random;
import java.util.Scanner;

public class Homework3_5 {
    /* Задача 5: Пройти по массиву и поменять местами элементы первый и последний, второй
и предпоследний и т.д.*/
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
        int indexLeft = 0;
        int indexRight = massif.length - 1;
        while (indexLeft < indexRight) {
            int b = massif[indexLeft];
            massif[indexLeft] = massif[indexRight];
            massif[indexRight] = b;
            indexLeft++;
            indexRight--;
        }
        System.out.println("Массив наоборот");
        for (int i = 0; i < massif.length; i++) {
            System.out.println("massif[" + i + "]=" + massif[i]);
        }
    }
}
