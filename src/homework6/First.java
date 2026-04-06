package homework6;

abstract class First {
    void first() {}
}

class Second extends First {
    void second() throws ArithmeticException {
        int result = 1 / 0; // Исключение деления на ноль
        int [] test = {0,1};
        System.out.println(test[2]);
    }
}
