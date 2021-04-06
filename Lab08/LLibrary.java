import java.util.Scanner;
import java.util.LinkedList;
import java.io.*;
/*
    Name: Benjamin Goldstone (bgoldstone@muhlenberg.edu)
    Date: 4/9/2021
    Instructor: Professor Joseph Helsing
    Description: Takes in a poem text file, counts number of lines, and puts title and author into a readable format
 */

/**
 * Uses a LinkedList to setup a Library Catalog
 */
public class LLibrary {
    //Global Variables
    static boolean isBookTitle;
    static String bookTitle;
    static int bookNumber;
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //Initializes Scanner Objects
        LinkedList myLibrary = new LinkedList();
        char choice = ' ';

        //Welcome Message
        System.out.println("Welcome to the Library!\n");
        while (choice != 'Q') {

            //Prompts users for choice
            System.out.println("What would you like to do? ");
            System.out.println("(A)dd a book");
            System.out.println("(S)earch for a book");
            System.out.println("(R)emove a book");
            System.out.println("(O)utput all book titles");
            System.out.println("(Q)uit Library catalog");
            System.out.println("(L)oad an existing file");
            System.out.println("(W)rite/Save a library to a file");
            System.out.print("Please enter A, S, R, O, L, W, or Q: ");
            //Takes users Input
            choice = scan.nextLine().toUpperCase().charAt(0);

            //Takes action given the choice
            switch (choice) {
                //Adding a book
                case 'A':

                    add(myLibrary);
                    break;

                //Searching for a book
                case 'S':

                    search(myLibrary);
                    break;

                //Removing a book
                case 'R':

                    delete(myLibrary);
                    break;

                //Listing all the books
                case 'O':
                    //Lists all book titles in linked list
                    outputAll(myLibrary);
                    break;

                case 'L':
                    load(myLibrary);
                    break;

                case 'W':
                    save(myLibrary);
                    break;
                //if quit, break and then the "while" condition will not be met.
                case 'Q':
                    break;
                default:
                    //If no other selection is selected
                    System.out.println("\nInvalid Option!");
                    break;
            }
            System.out.println();
        }
    }

    /**
     * Prompts for an item, checks if item is in list, and adds an item to the library
     *
     * @param myLibrary a LinkedList object
     */
    public static void add(LinkedList myLibrary) {
        //Prompts user for book title to add
        Book tempBook = null;
        System.out.print("What is the title of the book you wish to add? ");
        bookTitle = scan.nextLine();
        System.out.printf("\nWhat is the number of %s you wish to add? ", bookTitle);
        bookTitle = scan.nextLine();
        isBookTitle = false;
        for (Book book : myLibrary) {
            if (book.getBookTitle().equals(bookTitle)) {
                isBookTitle = true;
                tempBook = book;
                break;
            }
        }
        //Checks if book title is already in linked list
        if (isBookTitle) {
            myLibrary.add(bookTitle + ":1");
            System.out.printf("\nBook title %s added!\n", bookTitle);
        } else {
            tempBook.setNumberOfBooks(tempBook.getNumberOfBooks() + 1);
        }
    }

    /**
     * Searches if item is in LinkedList
     *
     * @param myLibrary a LinkedList object
     */
    public static void search(LinkedList myLibrary) {
        //Prompts user for book title to search for
        System.out.print("What is the title of the book you want to search for? ");
        bookTitle = scan.nextLine();
        isBookTitle = false;
        for (Object book : myLibrary) {
            if (book.equals(bookTitle)) {
                isBookTitle = true;
                break;
            }
        }
        //Checks if book title is in linked list
        if (isBookTitle) {
            System.out.printf("\nBook, %s, is in the library catalog!\n", bookTitle);
        } else {
            System.out.printf("\nBook %s, is not in the library catalog!\n", bookTitle);
        }
    }

    public static void delete(LinkedList myLibrary) {
        //prompts user for book title
        System.out.print("What is the title of the book you want to remove? ");
        bookTitle = scan.nextLine();

        //Attempts to delete book title
        if (myLibrary.remove(bookTitle)) {
            System.out.printf("\nBook %s has been removed!\n", bookTitle);
            //if no book title matches
        } else {
            System.out.printf("\nBook %s, is not in the library catalog!\n", bookTitle);
        }
    }

    public static void outputAll(LinkedList myLibrary) {
        System.out.println("\n*****Book List*****");
        for (Object book : myLibrary) {
            System.out.println(book);
        }
    }

    public static void load(LinkedList myLibrary) throws IOException {
        System.out.print("What is the name of the file you want to load? ");
        Scanner fileReader = new Scanner(scan.nextLine());
        while (fileReader.hasNextLine()) {
            myLibrary.add(scan.nextLine());
        }
        fileReader.close();
        System.out.println();
    }

    public static void save(LinkedList myLibrary) throws IOException {
        System.out.print("What is the name of the file you want to save? ");
        PrintWriter writer = new PrintWriter(scan.nextLine());
        for (Object book : myLibrary) {
            writer.println(book);
        }
    }
}
