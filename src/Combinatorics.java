public class Combinatorics {

    /** Precondition: n is between 1 and 12, inclusive.
     * Returns the factorial of n, as described in part (a). */
    public static int factorial(int n)
    { /* to be implemented in part (a) */
        if(n != 1)
            return n * factorial(n - 1);
        else
            return 1;
    }


    /** Precondition: n and r are between 1 and 12, inclusive. * Determines the number of ways r items can be selected
     * from n choices and prints the result, as described in part
     (b). */
    public static void numCombinations(int n, int r) {
        if(r < n){
    int combinations = factorial(n)/(factorial(r) * factorial(n-r));
    System.out.println("There are " + combinations + " ways of choosing " + r + " items from " + n + " choices.");
        }
    else{
        System.out.println("There are 0 ways of choosing " + r + " items from " + n + " choices.");
    }
    }
}
