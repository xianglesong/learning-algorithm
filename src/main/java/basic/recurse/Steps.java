package basic.recurse;

/**
 * Created by rollin on 17/12/22.
 */
public class Steps {

    /**
     * 1, 2 step
     */
    public static int steps(int n) {
        // recurse
        if (n < 0) return 0;
        if (n == 1) return 1;
        if (n == 2) return 2;

        return steps(n - 1) + steps(n - 2) ;
    }

    public static void main(String[] args) {
        System.out.println(steps(1));
        System.out.println(steps(2));
        System.out.println(steps(3));
        System.out.println(steps(10));
    }
}
