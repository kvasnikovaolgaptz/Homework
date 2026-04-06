package homework5;

class Rectangle extends Figure {
    final double b1 = 5;
    final double b2 = 6;

    @Override
    public double perimeter() {
        return ((b1 + b2) * 2);
    }
    @Override
    public double square() {
        return (b1 * b2);
    }
}



