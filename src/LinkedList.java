/*
 * Name: Benjamin Goldstone (bgoldstone@muhlenberg.edu)
 * Date: 04/01/2021
 * Instructor: Professor Helsing
 */

/**
 * A Doubly Linked List object
 */
public class LinkedList {
    //Head holds the list so we know where it starts
    private Node head;
    private Node tail;

    /**
     * Constructor for a LinkedList
     */
    public LinkedList() {
        head = null; //sets head to null.
        tail = null;
    }

    /**
     * Insets a book title at the end of the list
     *
     * @param bookTitle Title of the book
     */
    public void insertBookTitle(String bookTitle) {
        Node current; //index variable
        if (head == null) {
            head = new Node(bookTitle, null, null);
        } else {
            current = head;
            while (current.getNextNode() != null) {
                current = current.getNextNode();
            }
            Node nextNode = new Node(bookTitle, current, null);
            tail = nextNode;
            current.setNextNode(nextNode);
        }
    }

    /**
     * Finds out if book title is in the catalog
     *
     * @param bookTitle Title of the book
     * @return true if book is in the catalog, false if not
     */
    public boolean isBookTitle(String bookTitle) {
        //if list is empty return false
        if (head == null) return false;
        Node current = head;
        //cycles through nodes to find book title
        while (!current.getBookTitle().equalsIgnoreCase(bookTitle)) {
            //if book title is found
            if (current.getBookTitle().equalsIgnoreCase(bookTitle)) return true;
            //if next node is empty
            if (current.getNextNode() == null) return false;
            //"increment" to next node
            current = current.getNextNode();
        }
        return true;
    }

    /**
     * Attempts to deletes book title from the catalog
     *
     * @param bookTitle Title of the book
     */
    public boolean deleteBookTitle(String bookTitle) {
        //If list empty
        if (head == null) return false;
        //if book title is at the head
        if (head.getBookTitle().equalsIgnoreCase(bookTitle)) {
            /*
            sets head to next node so we don't loose the head
            and the linked list to garbage collection
             */
            head = head.getNextNode();
            return true;
        }
        Node current = head;
        //cycles through list until book title is found
        while (!current.getBookTitle().equalsIgnoreCase(bookTitle)) {
            //"increments" current to next item
            current = current.getNextNode();
            //if item is empty
            if (current == null) return false;
        }
        //if title is found change next and previous node to link chain again
        //garbage collection then takes care of that node
        if (current.getBookTitle().equalsIgnoreCase(bookTitle)) {
            current.getPreviousNode().setNextNode(current.getNextNode());
            current.getNextNode().setPreviousNode(current.getPreviousNode());
            return true;
        }
        return false;
    }

    /**
     * Gets list of all of the book titles in the linked list
     */
    public void getBookList() {
        Node current = head;
        //if list empty
        if (current == null) {
            System.out.println("\nNo Books in Library!");
            return;
        }
        System.out.println("\n*****Book List*****");
        //goes through whole list for book titles
        while (current.getBookTitle() != null) {
            System.out.println(current.getBookTitle());
            if (current.getNextNode() == null) break;
            current = current.getNextNode();
        }
        System.out.println("*******************");
    }
}
