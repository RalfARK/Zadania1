package pl.paczka.zadania1;

import java.util.Arrays;
import java.util.Scanner;

public class Start {

    public static void wypiszWLini(int liczba) {
        String liczba1 = Integer.toString(liczba);
        char[] tab = liczba1.toCharArray();
        for (int i = tab.length-1; i >= 0; i--) {
            System.out.println(tab[i]);
        }

    }

    public static void wypiszOdwrotnie(String slowo) {
        String odw = "";
        char[] tab = slowo.toCharArray();
        for (int i = tab.length-1; i >= 0; i--) {
            odw += tab[i];
        }
        System.out.println(odw);
    }

    public static void toBinary(int liczba) {
        String wynik = "";
        StringBuilder s = new StringBuilder();
        while (liczba > 0) {
            s.append(liczba % 2);
            liczba = liczba / 2;
        }
        s.reverse();
        System.out.println(s);
    }

    public static boolean isPalindrom(String slowo) {
        StringBuilder sb1 = new StringBuilder();
        sb1.append(slowo);

        return sb1.toString().equals(sb1.reverse().toString());

    }

    public static void tablicaString(int[] tab) {
        System.out.print("[" + tab[0]);
        for (int i = 1; i < tab.length; i++) {
            System.out.print(", " + tab[i]);
        }
        System.out.print("]");
    }

    public static int[][] macierzJednostkowa(int x) {
        int[][] mj = new int[x][x];
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                if (i == j) {
                    mj[i][j] = 1;
                }
                else {
                    mj[i][j] = 0;
                }
            }
        }
        return mj;
    }

    public static int[] sortowanieBabelkowe(int[] tab) {
        int temp;
        boolean zmiana = true;

        while (zmiana) {
            zmiana = false;
            for (int i = 0; i < tab.length-1; i++) {
                if (tab[i] > tab[i+1]) {
                    temp = tab[i+1];
                    tab[i+1] = tab[i];
                    tab[i] = temp;
                    zmiana = true;
                }
            }
        }

        return tab;
    }

    public static void tablicaUzyt() {
        int iloscliczb;
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj ilość liczb całkowitych: ");
        iloscliczb = in.nextInt();
        int[] tab = new int[iloscliczb];

        for (int i = 0; i < iloscliczb; i++) {
            System.out.println("Podaj liczbe nr:" + (i+1));
            tab[i] = in.nextInt();
        }

        int[] tabPosortowana = sortowanieBabelkowe(tab);
        for (int x : tabPosortowana) {
            System.out.println(x);
        }
    }

    public static void main(String[] args) {
        wypiszWLini(123325254);
        wypiszOdwrotnie("seiwegerghe54p");
        toBinary(1234);
        System.out.println(isPalindrom("kajak"));
        int[] tab = new int[] {3, 4, 8, 1, 9, 5, 3, 2, 0};
        tablicaString(tab);

        System.out.println("\n sortowanie");
        int[] tabPosortowana = sortowanieBabelkowe(tab);
        for (int x : tabPosortowana) {
            System.out.println(x);
        }

        tablicaUzyt();

        Scanner in = new Scanner(System.in);
        Integer promienKola;
        Integer bokTrojkata1;
        Integer bokTrojkata2;
        Integer bokProstokata1;
        Integer bokProstokata2;

        System.out.println("Podaj promien kola: ");
        promienKola = in.nextInt();

        System.out.println("Podaj bok1 trojkata: ");
        bokTrojkata1 = in.nextInt();
        System.out.println("Podaj bok2 trojkata: ");
        bokTrojkata2 = in.nextInt();

        System.out.println("Podaj bok1 prostokata: ");
        bokProstokata1 = in.nextInt();
        System.out.println("Podaj bok2 prostokata: ");
        bokProstokata2 = in.nextInt();

        Figure[] figury = new Figure[] {new Circle(promienKola), new Triangle(bokTrojkata1, bokTrojkata2), new Rectangle(bokProstokata1, bokProstokata2)};

        for (int i = 0; i < figury.length; i++) {
            System.out.println("Obwód figury "+  (i+1) + ": " + figury[i].getPerimeter());
            System.out.println("Pole figury " + (i+1) + ": " + figury[i].getArea());
        }
    }
}
