package homework8;

public class Main2 {
    /*
    Задача 2:
Создать класс, который будет хранить в себе коллекцию с названиями
животных. Реализовать методы удаления и добавления животных по
следующим правилам: добавляется всегда в начало коллекции, а удаляется
всегда из конца. Показать работу объекта этого класса в main методе другого
класса.
     */
    public static void main(String[] args) {
        Animals animals = new Animals();
        animals.addFirstAnimals();
        animals.showAnimals();
        animals.deleteLastAnimals();
        animals.showAnimals();
    }
}

