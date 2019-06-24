package pl.paczka.zadania1;

public class MyNumber {
    private int x;

    public MyNumber(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public boolean isOdd() {
        if (x % 2 != 0) {
            return true;
        }
        else return false;
    }

    public boolean isEven() {
        if (x % 2 == 0) {
            return true;
        }
        else return false;
    }

    public double sqrt() {
        return Math.sqrt(x);
    }

    public double pow(MyNumber mn) {
        return Math.pow(x, mn.x);
    }

    public int add(MyNumber mn) {
        return x + mn.x;
    }

    public int subtract(MyNumber mn) {
        return x - mn.x;
    }
}
