import java.util.Scanner;

/**
 * Name: Ben Goldstone
 * Date: 3/19/2021
 * Instructor: Professor Helsing
 */
public class PartA {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a phrase: ");
        String userPhrase = scan.nextLine();
        System.out.println();
        boolean result = shoutWhisper(userPhrase);
        if (result) {
            System.out.println(userPhrase.toUpperCase());
            System.out.println("It appears you were shouting!");
        } else {
            System.out.println(userPhrase.toLowerCase());
            System.out.println("It appears you were whispering!");
        }
    }

    public static boolean shoutWhisper(String phrase) {
        String[] words = phrase.split(" ");
        for (String word : words) {
            if(word.length() == 1) continue;
            if (word.equals(word.toUpperCase())) {
                return true;
            }
        }
        return false;
    }
}
