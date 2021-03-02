package Lab04;

/*
 * Author: Ben Goldstone
 * Date: 3/5/2021
 * Instructor: Professor Joseph Helsing
 * Description: A program that takes a String of DNA from the user
 * and converts it into RNA
 */


//imports Libraries

import java.util.Scanner;

public class DNA2RNA {
    public static void main(String[] args) {

        //Gets DNA from User and checks input
        String DNA = getDNA();

        //Converts DNA to RNA
        String RNA = toRNA(DNA);
        System.out.println("The DNA sequence " + DNA + " is " + RNA + " in RNA");
    }

    /**
     * A method to get user DNA input and validates it.
     *
     * @return DNA in a String
     */
    public static String getDNA() {
        Scanner scan = new Scanner(System.in);
        String dna;
        boolean flag;
        do {
            flag = false;
            System.out.println("Please enter a series of DNA to be converted to RNA:");

            //takes DNA as input, converts to upper case and removes whitespaces
            dna = scan.nextLine().toUpperCase().strip();

            //checks to see if there are any characters besides "A", "C", "G", or "T"
            for (char c : dna.toCharArray()) {
                if (c != 'A' && c != 'C' && c != 'G' && c != 'T') {
                    flag = true;
                    System.out.print("Invalid Characters, ");
                    break;
                }
            }
        } while (flag);
        return dna;
    }

    /**
     * @param dna the String of DNA to be converted to RNA
     * @return String of RNA
     */
    public static String toRNA(String dna) {
        StringBuilder rna = new StringBuilder(dna);
        for (int i = 0; i < rna.length(); i++) {
            if (rna.charAt(i) == 'T') {
                rna.setCharAt(i, 'U');
            }

        }
        return rna.toString();

    }

}
