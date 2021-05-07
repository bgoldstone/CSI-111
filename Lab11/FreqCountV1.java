import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

/*
    Author: Ben Goldstone
    Date: 5/7/2021
    Instructor: Professor Joseph Helsing
    Description: Counts frequency of a word count in a file.
 */
public class FreqCountV1 {
    public static void main(String[] args) {
        //Initializes Hashmap
        HashMap<String, Integer> map = new HashMap();
        try {
            //Reads Text File
            readTextFile(map);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //outputs frequencies
        outputFreq(map);
    }

    /**
     * Reads text file and puts into a hash map.
     *
     * @param map an object of a hash map using string and integers
     * @throws FileNotFoundException Scanner exception
     */
    private static void readTextFile(HashMap<String, Integer> map) throws FileNotFoundException {
        //Initializes/Declares variables and object instances.
        Scanner scan = new Scanner(System.in);
        Scanner fileReader;
        String word;
        File file;

        //Gets file name.
        System.out.print("What is the name of the file? ");
        file = new File(scan.nextLine());
        System.out.println();

        //if incorrect file name
        while (!file.exists()) {
            System.out.print("Incorrect Name!\n What is the name of the file? ");
            file = new File(scan.nextLine());
            System.out.println();
        }
        fileReader = new Scanner(file);

        //Reads all words in file.
        while (fileReader.hasNext()) {
            word = fileReader.next().toLowerCase();
            //If already exists, add one.
            if (map.containsKey(word)) {
                map.put(word, map.get(word) + 1);

                //Else create new key,value pair.
            } else {
                map.put(word, 1);
            }
        }
    }

    /**
     * Outputs formatted hash map.
     *
     * @param map an object of a hash map using strings and integers
     */
    private static void outputFreq(HashMap<String, Integer> map) {
        //For each key output it.
        for (Object key : map.keySet()) {
            System.out.printf("%-15s :%d%n", key, map.get(key));
        }
    }
}
