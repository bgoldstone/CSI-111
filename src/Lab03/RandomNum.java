package Lab03;

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
        int randInt1 = (int) (Math.random() * RANGE + RANDINT1MIN);
        System.out.println("\nrandInt1: " + randInt1);

        //generates random integer minimum for set #2
        int randInt2 = (int) (Math.random() * RANGE + RANDINT2MIN);
        System.out.println("randInt2: " + randInt2);

        //initializes sum variables
        int randInt1Sum = 0, randInt2Sum = 0;

        //number set #1
        System.out.print("\nNum Set #1: \n[");
        for (int i = randInt1; i <= (RANDINT1MIN + RANGE); i += 2) {
            if (i % 2 != 0) {
                i++;
            }
            System.out.print(i + ", ");
            randInt1Sum += i;

        }
        System.out.println("]");
        //number set #2
        System.out.print("\nNum Set #2:\n[");
        for (int i = randInt2; i <= (RANDINT2MIN + RANGE); i += 2) {
            if (i % 2 != 0) {
                i++;
            }
            System.out.print(i + ", ");
            randInt2Sum += i;

        }
        System.out.println("]");

        //print results
        System.out.println("\n\nRandom Number Set #1 Sum: " + randInt1Sum + "\nRandom Number Set #2 Sum: " + randInt2Sum);
    }
}