package Lab03;
import java.util.Random;

public class RandomNum {
    public static void main(String[] args) {
        //Constants

        //range of numbers
        final int RANGE = 10;

        //minimum for random integer set #1
        final int MIN = 1;

        //minimum for random integer set #2
        final int MAX = 20;

        //generates random integer minimum for set #1

        int randIntSum = randInt(RANGE,MIN, MAX);

        //print results
        System.out.println("\n\nRandom Number SetSum: " + randIntSum);
    }

    /**
     * Generates a list of random integers and adds them all together
     * @param range determines range of numbers.
     * @param minimum determines starting value
     * @return sum returns sum of minimum value plus the even numbers up to the range.
     */
    public static int randInt(int range, int minimum, int maximum){
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
            System.out.print(i + ", ");
            sum += i;
        }
            System.out.println("]");
        return sum;
    }
}