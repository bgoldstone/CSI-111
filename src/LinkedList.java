/*
 * Name: Benjamin Goldstone (bgoldstone@muhlenberg.edu)
 * Date: 04/01/2021
 * Instructor: Professor Helsing
 */

/**
 * A Doubly Linked List object
 */
public class LinkedList {
    private Node head;

    /**
     * Constructor for a LinkedList
     */
    public LinkedList() {
        head = null;
    }

    /**
     * Insets a book title at the end of the list
     *
     * @param bookTitle Title of the book
     */
    public void insertBookTitle(String bookTitle) {
        Node current; //index variable
        if (head == null) {
            head = new Node(bookTitle, null,null);
        } else {
            current = head;
            while (current.getNextNode() != null) {
                current = current.getNextNode();
            }
            Node nextNode = new Node(bookTitle, current,null);
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
        if (head == null) return false;
        Node current = head;
        while (!current.getBookTitle().equalsIgnoreCase(bookTitle)) {
            if (current.getBookTitle().equalsIgnoreCase(bookTitle)) return true;
            if (current.getNextNode() == null) return false;
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
        if (head == null) return false;
        if (head.getBookTitle().equalsIgnoreCase(bookTitle)) {
            head = head.getNextNode();
            return true;
        }
        Node current = head;
        while (!current.getBookTitle().equalsIgnoreCase(bookTitle)) {
            if (current.getNextNode() == null) return false;
            current = current.getNextNode();
            if (current == null) return false;
        }
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
        if (current == null) {
            System.out.println("\nNo Books in Library!");
            return;
        }
        System.out.println("\n*****Book List*****");
        while (current.getBookTitle() != null) {
            System.out.println(current.getBookTitle());
            if (current.getNextNode() == null) break;
            current = current.getNextNode();
        }
        System.out.println();
    }
}