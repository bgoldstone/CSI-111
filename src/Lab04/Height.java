package Lab04;

import java.util.Arrays;
import java.util.Scanner;

public class Height {
    public static void main(String[] args) {
        int[] avg = Arrays.copyOf(getArray(), 8);
        System.out.printf("The average of the set %s is %.3f", Arrays.toString(avg), getAvg(avg));
    }

    /**
     * Gets array of heights
     * @return array of height
     */
    public static int[] getArray() {
        Scanner scan = new Scanner(System.in);
        int[] height = new int[8];
        for (int i = 0; i < height.length; i++) {
            System.out.printf("Enter your height #%d: ", i + 1);
            System.out.println();
            height[i] = scan.nextInt();
            scan.nextLine();
        }
        return height;
    }

    /**
     * Calculate average of the heights
     * @param height inputs array of heights
     * @return average of heights
     */
    public static double getAvg(int[] height) {
        int total = 0;
        for (int j : height) {
            total += j;
        }
        return (double) total / height.length;
    }
}
