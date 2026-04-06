package homework5;

class Triangle3 extends Triangle {
    final double a1 = 7;
    final double a2 = 8;
    final double a3 = 9;

    @Override
    public double perimeter() {
        return (a1 + a2 + a3);
    }
    @Override
    public double square() {
        double p2 = (a1 + a2 + a3) / 2;
        return Math.sqrt(p2 * (p2 - a1) * (p2 - a2) * (p2 - a3));
    }
}

