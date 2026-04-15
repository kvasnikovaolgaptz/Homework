package homework5;

abstract class Triangle extends Figure {
    double a1;
    double a2;
    double a3;

    @Override
    public double perimeter() {
        return (a1 + a2 + a3);
    }
    @Override
    public double square() {
        double p2 = (a1 + a2 + a3) / 2; // вызывать метод не как периметр (скобки)
        return Math.sqrt(p2 * (p2 - a1) * (p2 - a2) * (p2 - a3));
    }
}


