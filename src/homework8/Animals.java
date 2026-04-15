package homework8;

import java.util.LinkedList;
import java.util.Scanner;

public class Animals {
    Scanner scanner = new Scanner(System.in);
    LinkedList<String> animals = new LinkedList<>();
    public void showAnimals() {
        System.out.println("Элементы списка животные: " + animals);
    }
    public void addFirstAnimals() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Введите животное для добавления в начало списка:");
            animals.addFirst(scanner.next());
        }
    }
    public void deleteLastAnimals() {
        System.out.println("Хотите ли вы удалить животное из конца списка? Введите 'да' или 'нет':");
        String flag = scanner.next();
        if (flag.equals("да")) {
            if (!animals.isEmpty()) { // проверяем, что список животных не пуст
                animals.removeLast();
                System.out.println("Вы удалили последний элемент в списке с животными.");
            } else {
                System.out.println("Список пуст, нечего удалять.");
            }
        } else {
            System.out.println("Удаление отменено.");
        }
    }
    }

