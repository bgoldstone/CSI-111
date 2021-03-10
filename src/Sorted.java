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
        char[] arrayToBeSorted = {'b', 'f', 'a', 'z', 'm', 'g'};
        String[] sortedArrayReturnValues = sortCharArray(Arrays.copyOf(arrayToBeSorted, arrayToBeSorted.length));
        System.out.println("Original Array:" + Arrays.toString(arrayToBeSorted));
        System.out.println("Sorted Array: " + sortedArrayReturnValues[0]);
        System.out.println("Number of iterations " + sortedArrayReturnValues[1]);
    }

    public static String[] sortCharArray(char[] array) {
        int count = 0;
        boolean flag;
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
            int j = array.length - 1;
            while (j > 0) {
                if (array[j] < array[j - 1]) {
                    flag = true;
                    break;
                }
                j--;
            }
        } while (flag);
        String[] returnValues = {Arrays.toString(array), String.valueOf(count)};
        return returnValues;
    }
}