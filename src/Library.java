import java.util.Scanner;
/*
 * Name: Benjamin Goldstone (bgoldstone@muhlenberg.edu)
 * Date: 04/01/2021
 * Instructor: Professor Helsing
 */

/**
 * Uses a LinkedList to setup a Library Catalog
 */
public class Library {
    public static void main(String[] args) {
        //Initializes Scanner Objects
        Scanner scan = new Scanner(System.in);
        LinkedList myLibrary = new LinkedList();
        char choice = ' ';
        String bookTitle;

        //Welcome Message
        System.out.println("Welcome to the Library!\n");
        while (choice != 'Q') {

            //Prompts users for choice
            System.out.println("What would you like to do? ");
            System.out.println("(A)dd a book");
            System.out.println("(S)earch for a book");
            System.out.println("(R)emove a book");
            System.out.println("(L)ist all book titles");
            System.out.println("(Q)uit Library catalog");
            System.out.print("Please enter A, S, R, L, or Q: ");
            //Takes users Input
            choice = scan.nextLine().toUpperCase().charAt(0);

            //Takes action given the choice
            switch (choice) {
                //Adding a book
                case 'A':

                    //Prompts user for book title to add
                    System.out.print("What is the title of the book you wish to add? ");
                    bookTitle = scan.nextLine();

                    //Checks if book title is already in linked list
                    if (!myLibrary.isBookTitle(bookTitle)) {
                        myLibrary.insertBookTitle(bookTitle);
                        System.out.printf("\nBook title %s added!\n", bookTitle);
                    } else {
                        System.out.printf("\nBook %s already in the catalog!\n", bookTitle);
                    }
                    break;
                //Searching for a book
                case 'S':

                    //Prompts user for book title to search for
                    System.out.print("What is the title of the book you want to search for? ");
                    bookTitle = scan.nextLine();

                    //Checks if book title is in linked list
                    if (myLibrary.isBookTitle(bookTitle)) {
                        System.out.printf("\nBook, %s, is in the library catalog!\n", bookTitle);
                    } else {
                        System.out.printf("\nBook %s, is not in the library catalog!\n", bookTitle);
                    }
                    break;
                //Removing a book
                case 'R':

                    //Prompts user for book title to remove
                    System.out.print("What is the title of the book you want to remove? ");
                    bookTitle = scan.nextLine();

                    //Attempts to delete book title
                    if (myLibrary.deleteBookTitle(bookTitle)) {
                        System.out.printf("\nBook %s has been removed!\n", bookTitle);
                        //if no book title matches
                    } else {
                        System.out.printf("\nBook %s, is not in the library catalog!\n", bookTitle);
                    }
                    break;
                //Listing all the books
                case 'L':
                    //Lists all book titles in linked list
                    myLibrary.getBookList();
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
}
