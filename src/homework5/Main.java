package homework5;

/*
Написать иерархию классов Фигура, Треугольник, Прямоугольник, Круг.
Реализовать функцию подсчета площади для каждого типа фигуры и подсчет
периметра(используя абстрактный класс/методы). Создать массив из 5 разных
фигур. Вывести на экран сумму периметра всех фигур в массиве

 */
public class Main {
    public static void main(String[] args) {
        Triangle1 triangle = new Triangle1();
        double perim1 = triangle.perimeter();
        double square1 = triangle.square();
        System.out.println("Периметр треугольника 1: " + perim1);
        System.out.println("Площадь треугольника 1: " + square1);
        System.out.println();
        Triangle2 triangle2 = new Triangle2();
        double perim2 = triangle2.perimeter();
        double square2 = triangle2.square();
        System.out.println("Периметр треугольника 2: " + perim2);
        System.out.println("Площадь треугольника 2: " + square2);
        System.out.println();
        Triangle3 triangle3 = new Triangle3();
        double perim3 = triangle3.perimeter();
        double square3 = triangle3.square();
        System.out.println("Периметр треугольника 3: " + perim3);
        System.out.println("Площадь треугольника 3: " + square3);
        System.out.println();
        Rectangle rectangle = new Rectangle();
        double perim4 = rectangle.perimeter();
        double square4 = rectangle.square();
        System.out.println("Периметр четырехугольника: " + perim4);
        System.out.println("Площадь четырехугольника: " + square4);
        System.out.println();
        Circle circle = new Circle();
        double perim5 = circle.perimeter();
        double square5 = circle.square();
        System.out.println("Длина окружности: " + perim5);
        System.out.println("Площадь круга: " + square5);
        double[][] array = {
                {perim1, square1},
                {perim2, square2},
                {perim3, square3},
                {perim4, square4},
                {perim5, square5},
        };
        double sumPerim = 0.0;
        for (int i = 0; i < array.length; i++) {
            sumPerim += array[i][0];
        }
        System.out.println();
        System.out.println("Сумма периметров: " + sumPerim);
    }
}












