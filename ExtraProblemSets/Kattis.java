package ExtraProblemSets;
import java.util.Scanner;

public class Kattis {
    public static void main(String[] args) {
        String str;
        String[] splitString;
        StringBuilder output = new StringBuilder();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter " + "String: ");
        str = scan.nextLine();
        splitString = str.split("-");
        for(String i: splitString) {
            output.append(i.charAt(0));
        }
        System.out.println(output);
        scan.close();
    }
}