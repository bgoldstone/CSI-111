import java.util.Random;

/**
 * Name: Ben Goldstone
 * Date: 3/19/2021
 * Instructor: Professor Helsing
 */
public class PartB {
    public static void main(String[] args) {
        Random random = new Random();
        int rightmostDistanceTraveled = 0;
        int leftmostDistanceTraveled = 0;
        int currentPosition = 0;
        int numberOfMoves = random.nextInt(11) + 5;
        int averagePosition = 0;
        for (int i = 0; i < numberOfMoves; i++) {
            int rand = random.nextInt(2);
            if (rand == 0) {
                currentPosition--;
            } else if (rand == 1) {
                currentPosition++;
            }
            if (leftmostDistanceTraveled > currentPosition) {
                leftmostDistanceTraveled = currentPosition;
            } else if (rightmostDistanceTraveled < currentPosition) {
                rightmostDistanceTraveled = currentPosition;
            }
            //System.out.println(currentPosition);
        }
        averagePosition = (leftmostDistanceTraveled + rightmostDistanceTraveled) / 2;
        System.out.printf("I moved a total of %d times.\n", numberOfMoves);
        System.out.printf("I sopped at position %d.\n", currentPosition);
        System.out.printf("My farthest left position was %d.\n", leftmostDistanceTraveled);
        System.out.printf("My farthest right position was %d.\n", rightmostDistanceTraveled);
        System.out.printf("My average position was %d.", averagePosition);
    }
}
