import java.util.Random;

public class RandomNum {
    public static void main(String[] args) {
        //Constants

        //range of numbers
        final int RANGE = 10;

        //minimum for random integer set
        final int MIN = 1;

        //maximum for random integer set
        final int MAX = 20;

        //generates random integers and finds sum of even numbers and prints results
        System.out.println("\n\nRandom Number Set Sum: " + evenRandIntSum(RANGE, MIN, MAX));
    }

    /**
     * Generates a list of random integers between a given range and adds all the even numbers in that range up
     *
     * @param range   determines range of numbers.
     * @param minimum determines starting value.
     * @param maximum determines ending value.
     * @return returns sum of the values between the maximum and the maximum.
     */
    public static int evenRandIntSum(int range, int minimum, int maximum) {
        Random rand = new Random();
        int randomMinimum = (rand.nextInt(range) + minimum);
        int randomMaximum = (maximum - rand.nextInt(range));
        int sum = 0;
        System.out.println("\nRandom Minimum: " + randomMinimum);
        System.out.println("Random Maximum: " + randomMaximum);
        System.out.print("\nNum Set \n[");
        if (randomMinimum % 2 != 0) {
            randomMinimum++;
        }
        for (int i = randomMinimum; i <= randomMaximum; i += 2) {
            if(i == randomMaximum || i == randomMaximum-1) {
                System.out.print(i);
            }else {
                System.out.print(i + ", ");
            }
            sum += i;
        }
        System.out.println("]");
        return sum;
    }
}