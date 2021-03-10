//imports libraries
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * @author Ben Goldstone
 * @version 3/12/2021
 * Instructor: Professor Joseph Helsing
 * A class to find the mode (how frequently numbers occur in the array). The size is provided by the user.
 */
public class Mode {
    //declares global variables/objects
    public static int[] modeArray = new int[11];
    public static Scanner scan = new Scanner(System.in);
    public static Random rand = new Random();

    /**
     * The main method of the function
     *
     * @param args any runtime arguments
     */
    public static void main(String[] args) {
        //initializes Scanner
        //Gets the array size from the user
        int[] arraySize = getArraySize();
        //initializes array of random numbers
        int[][] randArray = fillArrays(new int[arraySize[0]][arraySize[1]]);
        printResults(randArray);
    }

    /**
     * Gets array Size from user
     *
     * @return integer array of two items: {row length, column length}
     */
    public static int[] getArraySize() {
        int[] arraySize = new int[2];
        System.out.print("How many rows do you want? ");
        arraySize[0] = scan.nextInt();
        scan.nextLine();
        System.out.print("\nHow many Columns do you want? ");
        arraySize[1] = scan.nextInt();
        return arraySize;
    }

    /**
     * Method to populate randArray with random numbers between 0 and 10 inclusively
     * Also fills modeArray with zeroes
     *
     * @param randArray array to fill with random numbers
     * @return filled array with random numbers
     */
    public static int[][] fillArrays(int[][] randArray) {
        //fills modeArray
        Arrays.fill(modeArray, 0);
        //fills randArray and modeArray
        for (int row = 0; row < randArray.length; row++) {
            for (int col = 0; col < randArray[row].length; col++) {
                //generates number between 0 and 10 and assigns it to Array
                randArray[row][col] = rand.nextInt(11);
                //counts number in mode array
                modeArray[randArray[row][col]] += 1;
            }
        }
        return randArray;
    }

    /**
     * Prints out random array and mode array
     *
     * @param randArray array of random numbers
     */
    public static void printResults(int[][] randArray) {
        //prints out random number array
        System.out.println();
        for (int row = 0; row < randArray.length; row++) {
            for (int col = 0; col < randArray[row].length; col++) {
                System.out.print(randArray[row][col] + " ");
            }
            System.out.println();
        }

        //creates output string
        String[] modes = new String[11];

        //Puts modes in printable format
        for (int row = 0; row < modeArray.length; row++) {
            if (modeArray[row] != 0) {
                modes[row] = "The number " + row + " occurred " + modeArray[row] + " times";
            }
        }
        //Sorts Arrays
        int index = modes[0].indexOf(" times")-1;
        for (int i = 0; i < modes.length; i++) {
        /*
        code goes here...
         */
        }
        for (String mode: modes){
            if(mode != null){
                System.out.println(mode);
            }
        }
    }
}