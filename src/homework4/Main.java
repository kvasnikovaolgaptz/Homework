package homework4;

public class Main {
    public static void main(String[] args) {
//способ, создания объекта после вызова конструктора
        CreditCard creditCard1 = new CreditCard(111,100);
        creditCard1.setCurrentAmount();
        creditCard1.addAnAmount();
        creditCard1.setCurrentAmount();
        System.out.println();

       CreditCard creditCard2 = new CreditCard(222,200);
        creditCard2.setCurrentAmount();
        creditCard2.addAnAmount();
        creditCard2.setCurrentAmount();
        System.out.println();

        CreditCard creditCard3 = new CreditCard(333,300);
        creditCard3.setCurrentAmount();
        creditCard3.minusTheAmount();
        creditCard3.setCurrentAmount();
        System.out.println();
        System.out.println("Текущая сумма всех трех карточек = " + (creditCard1.currentAmount + creditCard2.currentAmount + creditCard3.currentAmount));

    }
}


