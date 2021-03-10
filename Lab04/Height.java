/*
 * Author: Ben Goldstone
 * Date: 3/5/2021
 * Instructor: Professor Joseph Helsing
 * Description: A program that takes an input of 8 heights and puts it into
 * an integer array to get the average of heights
 */


//imports Libraries
import java.util.Arrays;
import java.util.Scanner;

public class Height {
    public static void main(String[] args) {

        //gets array of heights and puts it into a local array
        int[] heights = getArray();
        //prints and calculates average
        System.out.printf("The average of the set %s is %.3f", Arrays.toString(heights), getAvg(heights));
    }

    /**
     * Gets array of heights
     *
     * @return integer array of heights
     */
    public static int[] getArray() {

        //initializes scanner and local integer array
        Scanner scan = new Scanner(System.in);
        int[] height = new int[8];

        //gets heights from user and populates array
        for (int i = 0; i < height.length; i++) {
            System.out.printf("Enter your height #%d: ", i + 1);
            System.out.println();
            height[i] = scan.nextInt();
            scan.nextLine();
        }
        return Arrays.copyOf(height,height.length);
    }

    /**
     * Calculate average of the heights
     *
     * @param height inputs array of heights
     * @return average of heights
     */
    public static double getAvg(int[] height) {
        int total = 0;

        //adds all heights in local variable total
        for (int j : height) total += j;

        //calculates and returns average
        return (double) total / height.length;
    }
}
