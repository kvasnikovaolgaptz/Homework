package homework5;

class Circle extends Figure {
    final double PI = 3.14;
    double r = 6;

    @Override
    public double perimeter() {
        return (2 * r * PI);
    }
    @Override
    public double square() {
        return (PI * r * r);
    }
}
