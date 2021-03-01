package Lab04;

import java.util.Scanner;

public class DNA2RNA {
    public static void main(String[] args) {
        String DNA = getDNA();
        String RNA = toRNA(DNA);
        System.out.println("The DNA sequence " + DNA + " is " + RNA + " in RNA");
    }

    /**
     * A method to get user DNA input and validates it.
     *
     * @return DNA in a String
     */
    public static String getDNA() {
        Scanner input = new Scanner(System.in);
        String dna;
        boolean flag;
        do {
            flag = false;
            System.out.println("Please enter a series of DNA to be converted to RNA");
            dna = input.nextLine().toUpperCase().strip();
            for (char c : dna.toCharArray()) {
                if (c != 'A' && c != 'C' && c != 'G' && c != 'T') {
                    flag = true;
                }
            }
        } while (flag);
        return dna;
    }

    /**
     *
     * @param dna the String of DNA to be converted to RNA
     * @return String of DNA converted to RNA
     */
    public static String toRNA(String dna){
        StringBuilder rna = new StringBuilder(dna);
        for (int i = 0; i < rna.length(); i++) {
            if(rna.charAt(i) == 'T'){
                rna.setCharAt(i,'U');
            }

        }
        return rna.toString();

    }

}
