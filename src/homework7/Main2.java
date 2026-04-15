package homework7;

import java.util.Scanner;

public class Main2 {
    /*
    Ввести 3 строки с консоли. Упорядочить и вывести строки в порядке
возрастания значений их длины.
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] massifLine = new String[3];
        for (int i = 0; i < massifLine.length; i++) {
            System.out.println("Введите строку " + (i + 1));
            massifLine[i] = scanner.nextLine(); //  nextLine
        }
        scanner.close();
        for (int i = 0; i < massifLine.length - 1; i++) {
            for (int j = 0; j < massifLine.length - 1 - i; j++) {
                if (massifLine[j].length() > massifLine[j + 1].length()) {
                    String temp = massifLine[j];
                    massifLine[j] = massifLine[j + 1];
                    massifLine[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < massifLine.length; i++) {
            System.out.println(massifLine[i]);
        }
    }
}






