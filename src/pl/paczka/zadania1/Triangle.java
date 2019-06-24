package pl.paczka.zadania1;

public class Triangle implements Figure {
    Integer bok1;
    Integer bok2;

    public Triangle(Integer bok1, Integer bok2) {
        this.bok1 = bok1;
        this.bok2 = bok2;
    }

    @Override
    public double getPerimeter() {
        double bok3 = Math.sqrt(Math.pow(bok1, 2) + Math.pow(bok2, 2));
        return bok1 + bok2 + bok3;
    }

    @Override
    public double getArea() {
        return 0.5 * bok1 * bok2;
    }
}
