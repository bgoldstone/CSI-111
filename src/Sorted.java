//imports libraries

import java.util.Arrays;

/**
 * @author Ben Goldstone
 * @version 3/12/2021
 * Instructor: Professor Joseph Helsing
 * A class to sort java files
 */
public class Sorted {
    public static void main(String[] args) {
        //declare array to be sorted
        char[] arrayToBeSorted = {'b', 'f', 'a', 'z', 'm', 'g'};

        //sends to sorting function and returns a String with the sorted string and number of iterations
        String[] sortedArrayReturnValues = sortCharArray(Arrays.copyOf(arrayToBeSorted, arrayToBeSorted.length));

        //prints results
        System.out.println("Original Array: " + Arrays.toString(arrayToBeSorted));
        System.out.println("Sorted Array: " + sortedArrayReturnValues[0]);
        System.out.println("Number of iterations: " + sortedArrayReturnValues[1]);
    }

    /**
     * @param array takes array to be sorted
     * @return String array containing: {sorted array, number of times swapped}
     */
    public static String[] sortCharArray(char[] array) {
        //counts iterations
        int count = 0;

        //while loop variable
        boolean flag;

        //sort variables
        do {
            flag = false;
            int i = array.length - 1;
            while (i > 0) {
                if (array[i] < array[i - 1]) {
                    char temp = array[i];
                    array[i] = array[i - 1];
                    array[i - 1] = temp;
                    count++;
                }
                i--;
            }
            //if any two characters are not in sorted order go through loop again
            int j = array.length - 1;
            while (j > 0) {
                if (array[j] < array[j - 1]) {
                    flag = true;
                    break;
                }
                j--;
            }
        } while (flag);
        return new String[]{Arrays.toString(array), String.valueOf(count)};
    }
}