/**
 * @author Benjamin Goldstone (bgoldstone@muhlenberg.edu)
 * @version 4/9/2021
 */
/*
    Instructor: Professor Joseph Helsing
    Description:
 */

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Poem {
    public static void main(String[] args) throws IOException {
        //Initializes Variables
        String poemTitle; //Stores Poem Title
        String poemAuthor; //Stores Poem Author
        Scanner scan = new Scanner(System.in); //Scanner object for taking user input
        Scanner fileReader; //Scanner object for File Reading
        ArrayList<String> linesOfPoem = new ArrayList<>(); //Keeps track of all the lines in the poem
        //Prompts user for input file
        System.out.print("What is the name of the file you would like to read? ");
        File fileName = new File(scan.nextLine());
        fileReader = new Scanner(fileName);

        //Takes title and author from first two lines
        poemTitle = fileReader.nextLine();
        poemAuthor = fileReader.nextLine();

        //Iterates through file to get rest of the poem
        while (fileReader.hasNextLine()) {
            linesOfPoem.add(fileReader.nextLine());
        }
        //Closes file
        fileReader.close();

        //Declares output file and starts to output file
        PrintWriter writer = new PrintWriter("Output.txt");
        writer.println("The title of the poem is " + poemTitle);
        writer.println("The author of the poem is " + poemAuthor);
        writer.println("The number of lines in the poem is " + linesOfPoem.size());
        writer.println("A preview of the poem is");
        for (int i = 0; i < 3; i++) {
            writer.println(linesOfPoem.get(i));
        }

        //Closes writer
        writer.close();
    }
}
