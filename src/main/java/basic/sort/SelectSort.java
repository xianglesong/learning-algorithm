package basic.sort;

public class SelectSort {

    @org.junit.Test
    public void test() {

        // selectSort
        int[] x = {1, 2, 3, 34, 22, -23, 0};

        if (x != null && x.length > 0) {
            int len = x.length;
            int[] y = new int[x.length];

            for (int i = 0; i < len; i++) {
                // tmp
                y[i] = selectMin(x);

                // remove num
                x = remove(x, y[i]);
                // print(x);
            }

            System.out.println("最后结果:");
            // print result
            for (int m : y) {
                System.out.print(m + " ");
            }
            System.out.println("");
        }

    }

    private void print(int[] x) {
        System.out.println("x: begin");
        for (int xx : x) {
            System.out.print(xx + " ");
        }

        System.out.println("x: end");
    }

    public int selectMin(int[] y) {
        if (y == null || y.length < 0) {

        }

        int min = y[0];
        for (int i = 0; i < y.length; i++) {
            if (min > y[i]) {
                min = y[i];
            }
        }
        System.out.println("min: " + min);
        return min;
    }

    public int[] remove(int[] x, int num) {
        if (x == null)
            throw new RuntimeException("should not be null");

        int[] result = new int[x.length - 1];

        for (int i = 0; i < x.length; i++) {

            if (x[i] != num) {
                result[i] = x[i];
            } else if (x[i] == num && i == x.length - 1) {
                // nothing to do
            } else if (x[i] == num && i != x.length - 1) {
                //
                for (int j = i; j < x.length - 1; j++) {
                    int mm = j + 1;
                    result[j] = x[mm];
                }
                break;
            }

        }

        return result;
    }

}
