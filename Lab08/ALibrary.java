import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
/*
    Name: Benjamin Goldstone (bgoldstone@muhlenberg.edu)
    Date: 4/9/2021
    Instructor: Professor Joseph Helsing
    Description: Stores a book collection, plus a count in an ArrayList
 */

/**
 * Uses a LinkedList to setup a Library Catalog
 */
public class ALibrary {
    //Global Variables
    static boolean isBookTitle;
    static String bookTitle;
    static int bookNumber;
    static Book tempBook;
    static Scanner scan = new Scanner(System.in);
    static File fileName;

    public static void main(String[] args) throws IOException {
        //Initializes Scanner Objects
        ArrayList<Book> myLibrary = new ArrayList<>();
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
    public static void add(ArrayList<Book> myLibrary) {
        //Prompts user for book title to add
        System.out.print("What is the title of the book you wish to add? ");
        bookTitle = scan.nextLine();
        isBookTitle = false;
        //Checks if book title is in Library
        for (Book book : myLibrary) {
            if (book.getBookTitle().equalsIgnoreCase(bookTitle)) {
                isBookTitle = true;
                tempBook = book;
                break;
            }
        }
        //if already is in LinkedList, add a number of books
        if (isBookTitle) {
            System.out.printf("How many %s would you like to add? ", bookTitle);
            bookNumber = scan.nextInt();
            scan.nextLine();
            //Doesn't allow user to add negative number
            if (bookNumber < 0) {
                System.out.println("Invalid Number!!");
                return;
            }
            tempBook.setNumberOfBooks(tempBook.getNumberOfBooks() + bookNumber);
            //Adds new book to LinkedList
        } else {
            System.out.printf("How many %s would you like to add? ", bookTitle);
            bookNumber = scan.nextInt();
            scan.nextLine();

            //Again makes sure user does not add negative number
            if (bookNumber < 0) {
                System.out.println("Invalid Number!!");
                return;
            }
            //Adds to List
            myLibrary.add(new Book(bookTitle, bookNumber));
        }
        System.out.println();
    }

    /**
     * Searches if item is in LinkedList
     *
     * @param myLibrary a LinkedList object
     */
    public static void search(ArrayList<Book> myLibrary) {
        //Prompts user for book title to search for
        System.out.print("What is the title of the book you want to search for? ");
        bookTitle = scan.nextLine();
        isBookTitle = false;

        //Checks if book title already in list
        for (Book book : myLibrary) {
            if (book.getBookTitle().equalsIgnoreCase(bookTitle)) {
                isBookTitle = true;
                break;
            }
        }
        //If is in list
        if (isBookTitle) {
            System.out.printf("\nBook, %s, is in the library catalog!\n", bookTitle);

            //If not
        } else {
            System.out.printf("\nBook %s, is not in the library catalog!\n", bookTitle);
        }
    }
    /**
     * Removes a number of books or book object from the LinkedList
     * @param myLibrary a LinkedList
     */
    public static void delete(ArrayList<Book> myLibrary) {
        //prompts user for book title
        System.out.print("What is the title of the book you want to remove? ");
        bookTitle = scan.nextLine();

        //Checks if book is in list
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
                //Attempts to delete book
                if (myLibrary.remove(tempBook)) {
                    System.out.printf("\nBook %s has been removed!\n", bookTitle);

                    //If cannot delete book
                } else {
                    System.out.printf("\nBook %s, is not in the library catalog!\n", bookTitle);
                }
                //If book is more than one, prompt for how many books to delete
            } else if (tempBook.getNumberOfBooks() > 1) {
                System.out.printf("\nHow many %s would you like to remove: ", bookTitle);
                bookNumber = scan.nextInt();
                scan.nextLine();

                //Book number to delete cannot be below zero or more than number of books in library
                if (bookNumber < 0 || tempBook.getNumberOfBooks() < bookNumber) {
                    System.out.println("Invalid Number!!");
                    return;
                }
                //else, remove that number of books
                tempBook.setNumberOfBooks(tempBook.getNumberOfBooks() - bookNumber);
                System.out.printf("\nBook %s has been removed!\n", bookTitle);
            }
        } else {
            System.out.printf("\nBook, %s, is not in the library catalog!\n", bookTitle);
        }
        //If number of books is zero, remove the book
        if (tempBook.getNumberOfBooks() == 0)
            myLibrary.remove(tempBook);
    }

    /**
     * Prints all the books in the LinkedList
     *
     * @param myLibrary a LinkedList
     */
    public static void outputAll(ArrayList<Book> myLibrary) {
        if (myLibrary.isEmpty()) {
            System.out.println("There are no books found");
            return;
        }
        System.out.println("\n*****Book List*****");
        for (Book book : myLibrary) {
            System.out.printf("%s: %d copies\n", book.getBookTitle(), book.getNumberOfBooks());
        }
    }

    /**
     * Imports the books from a text file.
     *
     * @param myLibrary a LinkedList
     */
    public static void load(ArrayList<Book> myLibrary) throws IOException {
        //Asks for file name
        System.out.print("What is the name of the file you want to load? ");
        fileName = new File(scan.nextLine());

        //If file does not exist
        while (!fileName.exists()) {
            System.out.print("\nSorry, Invalid File!\nWhat is the name of the file you want to load? ");
            fileName = new File(scan.nextLine());
        }
        //Initializes file reader via a Scanner
        Scanner fileReader = new Scanner(fileName);

        //Holds input of line
        String[] input;
        isBookTitle = false;

        //Iterates through whole file and assigns to LinkedList
        while (fileReader.hasNextLine()) {
            input = fileReader.nextLine().split(":");
            bookTitle = input[0];
            bookNumber = Integer.parseInt(input[1]);

            //Checks if book is in library
            for (Book book : myLibrary) {
                if (book.getBookTitle().equalsIgnoreCase(bookTitle)) {
                    isBookTitle = true;
                    tempBook = book;
                    break;
                }
            }
            //If in library, append to current number of books
            if (isBookTitle) {
                tempBook.setNumberOfBooks(tempBook.getNumberOfBooks() + bookNumber);
                //Else, create new book object
            } else {
                myLibrary.add(new Book(bookTitle, bookNumber));
            }
        }

        //Closes File
        fileReader.close();
        System.out.println();
    }

    /**
     * Saves all the books to a file.
     *
     * @param myLibrary a LinkedList
     */
    public static void save(ArrayList<Book> myLibrary) throws IOException {
        System.out.print("What is the name of the file you want to save? ");

        //Checks if file has been loaded
        if (fileName == null) {
            System.out.println("You must load a file before writing to one!!");
            return;
        }
        PrintWriter writer = new PrintWriter(fileName);
        //Iterates through list and saves to file
        for (Book book : myLibrary) {
            writer.printf("%s:%d\n", book.getBookTitle(), book.getNumberOfBooks());
        }

        //Closes File
        writer.close();
    }
}
