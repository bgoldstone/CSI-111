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
        String poemTitle;
        String poemAuthor;
        Scanner scan = new Scanner(System.in);
        Scanner fileReader;
        ArrayList<String> linesOfPoem = new ArrayList<>();
        System.out.print("What is the name of the File you would like to use? ");
        File file = new File(scan.nextLine());
        fileReader = new Scanner(file);
        poemTitle = fileReader.nextLine();
        poemAuthor = fileReader.nextLine();
        while (fileReader.hasNextLine()) {
            linesOfPoem.add(fileReader.nextLine());
        }
        fileReader.close();
        PrintWriter writer = new PrintWriter("Output.txt");
        writer.println("Title: " + poemTitle);
        writer.println("Author: " + poemAuthor);
        for (String line: linesOfPoem){
            writer.println(line);
        }
        writer.close();
    }
}
