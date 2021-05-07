import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/*
    Author: Ben Goldstone
    Date: 5/7/2021
    Instructor: Professor Joseph Helsing
    Description: Counts frequency of a word count in a file and uses a list of words to not count.
 */
public class FreqCountV2 {
    private static Scanner scan = new Scanner(System.in);
    private static Scanner fileReader;
    private static File file;

    public static void main(String[] args) {
        HashSet<String> wordCounts = new HashSet();
        HashMap<String, Integer> stopWordsList = new HashMap();
        try {
            //Reads stop words file and text file
            readStopWordsFile(wordCounts);
            readTextFile(stopWordsList, wordCounts);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //outputs frequencies
        outputFreq(stopWordsList);
    }

    /**
     * Reads in stop words file into hash set of strings.
     *
     * @param stopWordsList Hash set of type string
     * @throws FileNotFoundException Scanner exception
     */
    private static void readStopWordsFile(HashSet<String> stopWordsList) throws FileNotFoundException {
        //Gets file name.
        System.out.print("What is the name of the word list file? ");
        file = new File(scan.nextLine());
        System.out.println();

        //if incorrect file name
        while (!file.exists()) {
            System.out.print("Incorrect Name!\n What is the name of the word list file? ");
            file = new File(scan.nextLine());
            System.out.println();
        }
        fileReader = new Scanner(file);

        //appends all elements to hash set.
        while (fileReader.hasNext()) {
            stopWordsList.add(fileReader.next());
        }
    }

    /**
     * Reads text file and puts into a hash map.
     *
     * @param wordCount an object of a hash map using string and integers
     * @throws FileNotFoundException Scanner exception
     */
    private static void readTextFile(HashMap<String, Integer> wordCount, HashSet<String> stopWordsList) throws FileNotFoundException {
        //Initializes/Declares variables and object instances.
        Scanner fileReader;
        String word;

        //Gets file name.
        System.out.print("What is the name of the file to read? ");
        file = new File(scan.nextLine());
        System.out.println();

        //if incorrect file name
        while (!file.exists()) {
            System.out.print("Incorrect Name!\n What is the name of the file to read? ");
            file = new File(scan.nextLine());
            System.out.println();
        }
        fileReader = new Scanner(file);

        //Reads all words in file.
        while (fileReader.hasNext()) {
            word = fileReader.next().toLowerCase();
            //if not hash set, continue.
            if (!stopWordsList.contains(word)) {
                //If already exists, add one.
                if (wordCount.containsKey(word)) {
                    wordCount.put(word, wordCount.get(word) + 1);

                    //Else create new key,value pair.
                } else {
                    wordCount.put(word, 1);
                }
            }
        }
    }

    /**
     * Outputs formatted hash map.
     *
     * @param wordCounts an object of a hash map using strings and integers
     */
    private static void outputFreq(HashMap<String, Integer> wordCounts) {
        //For each key output it.
        for (Object key : wordCounts.keySet()) {
            System.out.printf("%-14s:%d%n", key, wordCounts.get(key));
        }
    }
}
