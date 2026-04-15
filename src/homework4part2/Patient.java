package homework4part2;

import java.util.Scanner;

public class Patient {
    public String doctorsSpecialization;
    public String treatmentPlan;
    Scanner scanner = new Scanner(System.in);
    public void treatmentPlan() {
        System.out.println("Введите код плана лечения из списка (РУС): К1, К2... К4");
        String input;
        while (true) {
            input = scanner.next();
            if (input.equals("К1") || input.equals("К2") || input.equals("К3") || input.equals("К4")) {
                this.treatmentPlan = input; // Здесь вы присваиваете значение атрибуту класса
                break; // Ввод корректен, выходим из цикла
            } else {
                System.out.println("Введен некорректный код, введите заново");
            }
        }
    }
}
