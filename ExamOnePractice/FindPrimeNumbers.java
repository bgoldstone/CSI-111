/**
 * Finds Prime Numbers
 */
public class FindPrimeNumbers {
    public static void main(String[] args) {
        String[] primeArray = isPrime(2, 100).split(" ");
        System.out.println();
        for (int i = 0; i < primeArray.length; i++) {
            System.out.printf("%s ", primeArray[i]);
            if (i == 0) continue;
            if (i % 10 == 0) System.out.println();
        }
    }


    /**
     * Finds Integers in a given range that are prime
     *
     * @return integer arrays of prime number in given range
     */
    public static String isPrime(int min, int max) {
        StringBuilder sb = new StringBuilder();
        for (int i = min; i < max; i++) {
            boolean isPrimeNumber = true;
            for (int j = min; j <= i; j++) {

                if (j == i) continue;
                if (j == 1) continue;
                if (i % j == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }
            if (isPrimeNumber) {
                sb.append(i).append(" ");
            }
        }
        return sb.toString();
    }
}
