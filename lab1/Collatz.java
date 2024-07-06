/** Class that prints the Collatz sequence starting from a given number.
 *  @author Berg Pss
 */
public class Collatz {

    /**
     * Return the nextNumber of n with the rule of Collatz sequence.
     * if n is even, return n / 2
     * if n is odd, return n * 3 + 1
     * @param n
     * @source <a href="https://en.wikipedia.org/wiki/Collatz_conjecture">...</a>
     */
    public static int nextNumber(int n) {
        if (n == 0) {
            return 1;
        } else if (n % 2 == 0) {
            return n / 2;
        } else {
            return n * 3 + 1;
        }
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.print(n + " ");
        while (n != 1) {
            n = nextNumber(n);
            System.out.print(n + " ");
        }
        System.out.println();
    }
}

