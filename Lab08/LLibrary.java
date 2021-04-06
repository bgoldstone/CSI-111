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
    static Book tempBook;
    static Scanner scan = new Scanner(System.in);
    static File fileName;

    public static void main(String[] args) throws IOException {
        //Initializes Scanner Objects
        LinkedList<Book> myLibrary = new LinkedList<>();
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
    public static void add(LinkedList<Book> myLibrary) {
        //Prompts user for book title to add
        System.out.print("What is the title of the book you wish to add? ");
        bookTitle = scan.nextLine();
        isBookTitle = false;
        for (Book book : myLibrary) {
            if (book.getBookTitle().equalsIgnoreCase(bookTitle)) {
                isBookTitle = true;
                tempBook = book;
                break;
            }
        }
        //Checks if book title is already in linked list
        if (isBookTitle) {
            System.out.printf("How many %s would you like to add? ", bookTitle);
            bookNumber = scan.nextInt();
            scan.nextLine();
            if (bookNumber < 0) {
                System.out.println("Invalid Number!!");
                return;
            }
            tempBook.setNumberOfBooks(tempBook.getNumberOfBooks() + bookNumber);
        } else {
            System.out.printf("How many %s would you like to add? ", bookTitle);
            bookNumber = scan.nextInt();
            scan.nextLine();
            if (bookNumber < 0) {
                System.out.println("Invalid Number!!");
                return;
            }
            myLibrary.add(new Book(bookTitle, bookNumber));
        }
        System.out.println();
    }

    /**
     * Searches if item is in LinkedList
     *
     * @param myLibrary a LinkedList object
     */
    public static void search(LinkedList<Book> myLibrary) {
        //Prompts user for book title to search for
        System.out.print("What is the title of the book you want to search for? ");
        bookTitle = scan.nextLine();
        isBookTitle = false;
        for (Book book : myLibrary) {
            if (book.getBookTitle().equalsIgnoreCase(bookTitle)) {
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

    public static void delete(LinkedList<Book> myLibrary) {
        //prompts user for book title
        System.out.print("What is the title of the book you want to remove? ");
        bookTitle = scan.nextLine();
        for (Book book : myLibrary) {
            if (book.getBookTitle().equalsIgnoreCase(bookTitle)) {
                isBookTitle = true;
                tempBook = book;
                break;
            }
        }
        //Attempts to delete book title
        if (isBookTitle) {
            if (tempBook.getNumberOfBooks() == 1) {
                if (myLibrary.remove(tempBook)) {
                    System.out.printf("\nBook %s has been removed!\n", bookTitle);
                    //if no book title matches
                } else {
                    System.out.printf("\nBook %s, is not in the library catalog!\n", bookTitle);
                }
            } else if (tempBook.getNumberOfBooks() > 1) {
                System.out.printf("\nHow many %s would you like to remove: ", bookTitle);
                bookNumber = scan.nextInt();
                scan.nextLine();
                if (bookNumber < 0) {
                    System.out.println("Invalid Number!!");
                    return;
                }
                tempBook.setNumberOfBooks(tempBook.getNumberOfBooks() - bookNumber);
                System.out.printf("\nBook %s has been removed!\n", bookTitle);
            }
        } else {
            System.out.printf("\nBook, %s, is not in the library catalog!\n", bookTitle);
        }
    }

    public static void outputAll(LinkedList<Book> myLibrary) {
        System.out.println("\n*****Book List*****");
        for (Book book : myLibrary) {
            System.out.printf("%s: %d copies\n", book.getBookTitle(), book.getNumberOfBooks());
        }
    }

    public static void load(LinkedList<Book> myLibrary) throws IOException {
        System.out.print("What is the name of the file you want to load? ");
        fileName = new File(scan.nextLine());
        while(!fileName.exists()){
            System.out.print("\nSorry, Invalid File!\nWhat is the name of the file you want to load? ");
            fileName = new File(scan.nextLine());
        }
        Scanner fileReader = new Scanner(fileName);
        String[] input;
        isBookTitle = false;
        while (fileReader.hasNextLine()) {
            input = fileReader.nextLine().split(":");
            bookTitle = input[0];
            bookNumber = Integer.parseInt(input[1]);
            for (Book book : myLibrary) {
                if (book.getBookTitle().equalsIgnoreCase(bookTitle)) {
                    isBookTitle = true;
                    tempBook = book;
                    break;
                }
            }
            if (isBookTitle) {
                tempBook.setNumberOfBooks(tempBook.getNumberOfBooks() + bookNumber);
            } else {
                myLibrary.add(new Book(bookTitle, bookNumber));
            }
        }
        fileReader.close();
        System.out.println();
    }

    public static void save(LinkedList<Book> myLibrary) throws IOException {
        System.out.print("What is the name of the file you want to save? ");
        if(fileName == null){
            System.out.println("You must load a file before writing to one!!");
            return;
        }
        PrintWriter writer = new PrintWriter(fileName);
        for (Book book : myLibrary) {
            writer.printf("%s:%d\n", book.getBookTitle(), book.getNumberOfBooks());
        }
        writer.close();
    }
}
