package pl.paczka.zadania1;

public class Prostokat {
    private int długosc;
    private int szerokosc;

    public Prostokat(int długosc, int szerokosc) {
        this.długosc = długosc;
        this.szerokosc = szerokosc;
    }

    public int getDługosc() {
        return długosc;
    }

    public int getSzerokosc() {
        return szerokosc;
    }

    public void setDługosc(int długosc) {
        this.długosc = długosc;
    }

    public void setSzerokosc(int szerokosc) {
        this.szerokosc = szerokosc;
    }

    public int pole() {
        return długosc*szerokosc;
    }

    public int obwod() {
        return (2*długosc + 2*szerokosc);
    }

    public double przekatne() {
        double d = długosc*długosc + szerokosc*szerokosc;
        return Math.sqrt(d);
    }
}
