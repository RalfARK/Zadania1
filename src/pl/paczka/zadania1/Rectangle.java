package pl.paczka.zadania1;

public class Rectangle implements Figure{
    Integer bok1;
    Integer bok2;

    public Rectangle(Integer bok1, Integer bok2) {
        this.bok1 = bok1;
        this.bok2 = bok2;
    }

    @Override
    public double getPerimeter() {
        return 2 * bok1 + 2 * bok2;
    }

    @Override
    public double getArea() {
        return bok1 * bok2;
    }
}
