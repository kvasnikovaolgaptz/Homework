package homework4part2;

import java.util.Scanner;

public class AtmMachine {
    /*Создать класс, описывающий банкомат. Набор купюр, находящихся в
банкомате, должен задаваться тремя свойствами: количеством купюр
номиналом 20, 50 и 100. Сделать метод для добавления денег в банкомат.
Сделать функцию, снимающую деньги, которая принимает сумму денег, а
возвращает булевое значение - успешность выполнения операции. При
снятии денег, функция должна распечатывать каким количеством купюр
какого номинала выдаётся сумма. Создать конструктор с тремя параметрами
-количеством купюр каждого номинала
        */
    int quantity20;
    int quantity50;
    int quantity100;

    public void addAmountAtm () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму (рубли) для пополнения счета, принимаются купюры номиналом 20,50,100");
        int add1 = scanner.nextInt();
        while (add1 >= 100) {
            quantity100++;
            add1 -= 100;
        }
        while (add1 >= 50) {
            quantity50 ++;
            add1 -= 50;
        }
        while (add1 >= 20) {
            quantity20++;
            add1 -= 20;
        }
        // если остаток не 20,50 100
            if (add1 > 0) {
                System.out.println("Неверная сумма, принимаются купюры номиналом 20,50,100");
            }
    }
    public boolean minusTheAmountAtm2() {
        int balanse = (100 * quantity100) + (50 * quantity50) + (20 * quantity20);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму (рубли) для снятия наличных");
        int minus1 = scanner.nextInt();

        // Проверка, является ли сумма допустимой
        if (minus1 <= 0) {
            System.out.println("Сумма должна быть больше нуля.");
            return false;
        }
        if (minus1 > balanse) {
            System.out.println("Недостаточно средств для снятия данной суммы.");
            return false;
        }

        // Снятие наличных
        int originalRequest = minus1; // сохраняем изначальную запрашиваемую сумму
        int count100 = 0, count50 = 0, count20 = 0; // Счетчики купюр

        while (minus1 >= 100 && quantity100 > 0) {
            quantity100--;
            minus1 -= 100;
            count100++;
        }
        while (minus1 >= 50 && quantity50 > 0) {
            quantity50--;
            minus1 -= 50;
            count50++;
        }
        while (minus1 >= 20 && quantity20 > 0) {
            quantity20--;
            minus1 -= 20;
            count20++;
        }

        // Если осталась сумма, которую нельзя снять
        if (minus1 > 0) {
            // Вернуть купюры, если часть не была выдана
            if (originalRequest - minus1 > 0) {
                // Здесь можно вернуть обратно в банкомат уже выданное
                // Но про передачу это в качестве логики может быть спорно
            }
            System.out.println("Возможно снять наличные ТОЛЬКО купюрами 20, 50, 100");
            return false;
        } else {
            // Вывод информации о выданных купюрах
            if (count100 > 0) {
                System.out.println("Выдано " + count100 + " купюр(ы) по 100 рублей");
            }
            if (count50 > 0) {
                System.out.println("Выдано " + count50 + " купюр(ы) по 50 рублей");
            }
            if (count20 > 0) {
                System.out.println("Выдано " + count20 + " купюр(ы) по 20 рублей");
            }
            return true;
        }
    }



    public void balanse () {
        System.out.println("В банкомате имеются купюры ");
        System.out.println("Купюр номиналом 20 "+ quantity20);
        System.out.println("Купюр номиналом 50 "+quantity50);
        System.out.println("Купюр номиналом 100 "+quantity100);

    }

    public AtmMachine(int quantity20, int quantity50, int quantity100) {
        this.quantity20 = quantity20;
        this.quantity50 = quantity50;
        this.quantity100 = quantity100;
    }
}




