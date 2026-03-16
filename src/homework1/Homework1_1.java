package homework1;

public class Homework1_1 {
    public static void main(String[] args) {
        System.out.println("Квасникова Ольга Николаевна");

        System.out.println("Задание 1");
        int b = 10;
        int c = 11;
        int a = 4 * (b+c-1)/2;
        System.out.println("4*(b+c-1)/2="+a);

        System.out.println("Задание 2");
        int n = 77;
        int n1 = n/10; // 1-ая цифра
        int n2 = n%10; // 2-ая цифра
        System.out.println(n1+"+"+n2+"="+(n1+n2));

        System.out.println("Задание 3");
        int d = 789;
        int d1 = d/100; // 1-ая цифра
        int d2 = (d/10)%10; // 2-ая цифра
        int d3 = d%10; // 3-ая цифра
        System.out.println(d1+"+"+d2+"+"+d3+"="+(d1+d2+d3));

        System.out.println("Задание 4");
        double h = 77.4;
        int h_rounder = (int) (h+0.5);
        System.out.println("округление до ближайшего целого "+h_rounder);

        System.out.println("Задание 5");
        int q = 789;
        int w = 7;
        System.out.println("Результат деления 789/7="+q/w+" остаток "+q%w);

        System.out.println("Задание *");
        int f = 1;
        int j = 2;
        int k = j;
        j = f;
        f = k;

        System.out.println("Значение f="+f);
        System.out.println("Значение j="+j);

    }
}
