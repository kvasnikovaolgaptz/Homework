package homework2;

import java.util.Scanner;

public class Homework2_5 {
    /*Задача *:
Напишите программу, где пользователь вводит любое целое положительное
число.
А программа суммирует все числа от 1 до введенного пользователем числа. Для
ввода числа воспользуйтесь классом Scanner. Сделать проверку, чтобы
пользователь не мог ввести некорректные данные */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое положительное число");
        double a = scanner.nextDouble();
        int sum = 0;
        if (a <= 0) {
            System.out.println("Введенное число не корректное");
        } else if (a%2>0) {
            System.out.println("Введенное число не корректное");
        } else {
            for (int i = 1; i <= n; i++) {
                sum += i;
            };
        }

    }
}
