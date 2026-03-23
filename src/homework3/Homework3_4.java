package homework3;

import java.util.Random;
import java.util.Scanner;

public class Homework3_4 {
    /* Задача 4: Найти и вывести количество нулевых элементов. Если нулевых элементов нет -
вывести сообщение, что их нет.*/
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
        int count = 0;
        for (int i = 0; i < massif.length; i++) {
            if (massif[i] == 0) {
                count++;
            }
        }
        if (count > 0) {
            System.out.println("Количество нулевых элементов=" + count);
        } else {
            System.out.println("НЕТ нулевых элементов");
        }
    }
}
