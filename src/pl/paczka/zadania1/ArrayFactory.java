package pl.paczka.zadania1;

public class ArrayFactory {

    private int x;

    public ArrayFactory(int x) {
        this.x = x;
    }

    public int[] OneDimension() {
        int[] od = new int[x];
        return od;
    }

    public int[][] TwoDimension() {
        int[][] td = new int[x][x];
        return td;
    }

    public int[][] macierzJednostkowa() {
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

}
