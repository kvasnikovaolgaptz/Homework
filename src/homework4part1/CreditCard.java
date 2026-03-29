package homework4part1;

import java.util.Scanner;

public class CreditCard {
    /*
    Создать класс CreditCard c полями номер счета, текущая сумма на счету.
    Добавьте метод, который позволяет начислять сумму на кредитную карточку.
    Добавьте метод, который позволяет снимать с карточки некоторую сумму.
    Добавьте метод, который выводит текущую информацию о карточке.
    Напишите программу, которая создает три объекта класса CreditCard у которых заданы
    номер счета и начальная сумма.
    Тестовый сценарий для проверки: Положите деньги на первые две карточки и
снимите с третьей. Выведите на экран текущее состояние всех трех карточек.
     */
    int accountNumber; // номер счета
    int currentAmount; // текущая сумма на счете

    public void addAnAmount() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму (рубли) для перечисления на кредитную карту № " + accountNumber);
        int add = scanner.nextInt();
        currentAmount = currentAmount + add;
    }
    public void minusTheAmount() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сумму (рубли) для снятия наличных с кредитной карты №" + accountNumber);
        int minus = scanner.nextInt();
        while (minus > currentAmount) {
            System.out.println("На счете не хватает денег, введите сумму (рубли) еще раз");
            minus = scanner.nextInt();
        }
        currentAmount -= minus;
    }
    public void setCurrentAmount() {
        System.out.println("Номер счета " + accountNumber);
        System.out.println("Текущее состояние счета (рубли) " + currentAmount);

    }

    public CreditCard(int accountNumber, int currentAmount) {
        this.accountNumber = accountNumber;
        this.currentAmount = currentAmount;
    }

}
