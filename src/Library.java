import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedList myLibrary = new LinkedList();
        char choice =' ';
        String bookTitle;


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
            choice = scan.nextLine().toUpperCase().charAt(0);

            //Takes action given the choice
            switch (choice) {
                case 'A':
                    System.out.print("What is the title of the book you wish to add? ");
                    bookTitle = scan.nextLine();
                    if(myLibrary.isBookTitle(bookTitle)){
                        myLibrary.insertBookTitle(bookTitle);
                        System.out.printf("\nBook title %s added!\n", bookTitle);
                    } else{
                        System.out.printf("\nBook %s already in the catalog!\n", bookTitle);
                    }
                    break;
                case 'S':
                    System.out.print("What is the title of the book you want to search for? ");
                    bookTitle = scan.nextLine();
                    if(myLibrary.isBookTitle(bookTitle)){
                        System.out.printf("\nBook %s, is already in the library catalog!\n", bookTitle);
                    }else{
                        System.out.printf("\nBook %s, is not in the library catalog!\n" , bookTitle);
                    }
                    break;
                case 'R':
                    System.out.print("What is the title of the book you want to remove? ");
                    bookTitle = scan.nextLine();
                    if(myLibrary.isBookTitle(bookTitle)){
                        myLibrary.deleteBookTitle(bookTitle);
                        System.out.printf("\nBook %s has been removed!\n", bookTitle);
                    }else{
                        System.out.printf("\nBook %s, is not in the library catalog!\n" , bookTitle);
                    }
                    break;
                case 'L':
                    break;
                case 'Q':
                    break;
                default:
                    System.out.println("Invalid Option!");
                    break;
            }
            System.out.println();
        }
    }
}
