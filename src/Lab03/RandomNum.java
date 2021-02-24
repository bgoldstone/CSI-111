package Lab03;
import java.util.Random;

public class RandomNum {
    public static void main(String[] args) {
        //Constants

        //range of numbers
        final int RANGE = 10;

        //minimum for random integer set #1
        final int RANDINT1MIN = 1;

        //minimum for random integer set #2
        final int RANDINT2MIN = 11;

        //generates random integer minimum for set #1

        int randInt1Sum = randInt(RANGE,RANDINT1MIN);
        int randInt2Sum = randInt(RANGE,RANDINT2MIN);

        //print results
        System.out.println("\n\nRandom Number Set #1 Sum: " + randInt1Sum + "\nRandom Number Set #2 Sum: " + randInt2Sum);
    }

    /**
     * Generates a list of random integers and adds them all together
     * @param range determines range of numbers.
     * @param minimum determines starting value
     * @return sum returns sum of minimum value plus the even numbers up to the range.
     */
    public static int randInt(int range, int minimum){
        Random rand = new Random();
        int randomInteger = (rand.nextInt(range) + minimum);
        int sum = 0;
        System.out.println("\nrandInt: " + randomInteger);
        System.out.print("\nNum Set \n[");
        if (randomInteger % 2 != 0) {
            randomInteger++;
        }
        for (int i = randomInteger; i <= (minimum + range); i += 2) {
            System.out.print(i + ", ");
            sum += i;
        }
            System.out.println("]");
        return sum;
    }
}