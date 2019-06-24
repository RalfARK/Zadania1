package pl.paczka.zadania1;

public class Circle implements Figure {
    Integer promien;

    public Circle(Integer promien) {
        this.promien = promien;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * promien;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(promien, 2);
    }
}
