package homework6;
/*
Задача 1:
Создать класс с как минимум 4 разными методами, в каждом методе добавить
проверку на исключительные ситуации, используя:
1. try- catch
2. try-catch, где catch будет несколько
3. try -catch, с использованием multi - catch
4. try-catch-finally
Продемонстрировать обработку исключительных ситуаций на примерах
 */
public class Main {
    public static void main (String[] args) {
        new Main().tryCatch();
        new Main().tryCatchCatch();
        new Main().tryCatchMultiCatch();
        new Main().tryCatchFinally();
    }
    public void tryCatch() {
        System.out.println("1. try-catch");
        try {
            First first = new Second();
            ((Second) first).second(); // Вызов метода с исключением
        } catch (ArithmeticException e) {
            System.out.println("Произошло исключение: " + e.getMessage());
        }
        System.out.println("Программа работает дальше после try-catch");
    }
    public void tryCatchCatch() {
        System.out.println("2. try-catch с несколькими catch");
        try {
            First first = new Second();
            ((Second) first).second(); // Вызов метода с исключением
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Произошло исключение" + e.getMessage());
        } catch ( ArithmeticException e) {
            System.out.println("Произошло исключение: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Произошло исключение: " + e.getMessage());
        }
        System.out.println("Программа работает дальше после try-catch с несколькими catch");
    }
    public void tryCatchMultiCatch() {
        System.out.println("3. try-catch с использованием multi-catch");
        try {
            First first = new Second();
            ((Second) first).second(); // Вызов метода с исключением
        } catch (ArrayIndexOutOfBoundsException | ArithmeticException e) {
            System.out.println("Произошло исключение: " + e.getMessage());
        }
        System.out.println("Программа работает дальше после multi-catch");
    }
    public void tryCatchFinally() {
        System.out.println("4. try-catch-finally");
        try {
            First first = new Second();
            ((Second) first).second(); // Вызов метода с исключением
        } catch (ArithmeticException e) {
            System.out.println("Произошло исключение: " + e.getMessage());
        } finally {
            System.out.println("Выполняется код в блоке finally");
        }
        System.out.println("Программа работает дальше после try-catch-finally");
    }
}