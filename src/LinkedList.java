/*
 * Name: Benjamin Goldstone (bgoldstone@muhlenberg.edu)
 * Date: 04/01/2021
 * Instructor: Professor Helsing
 */

/**
 * Creates a new LinkedList object
 */
public class LinkedList {
    private Node head, tail;

    /**
     * Constructor for a LinkedList
     */
    public LinkedList() {
        head = null;
        tail = null;
    }

    /**
     * Insets a book title at the end of the list
     *
     * @param bookTitle Title of the book
     */
    public void insertBookTitle(String bookTitle) {
        Node current; //index variable
        if (!isBookTitle(bookTitle)) {
            if (head == null) {
                Node nextNode = new Node(bookTitle, null, tail);
            } else {
                current = head;

                while (current.getNextNode() != null) {
                    current = current.getNextNode();
                }
                Node nextNode = new Node(bookTitle, current, tail);
                current.setNextNode(nextNode);
            }
        }
    }

    /**
     * Finds out if book title is in the catalog
     *
     * @param bookTitle Title of the book
     * @return true if book is in the catalog, false if not
     */
    public boolean isBookTitle(String bookTitle) {
        Node current = head;
        while (current.getNextNode() != null) {
            current = current.getNextNode();
            if (current.getBookTitle() == bookTitle)
                return true;
        }
        return false;
    }

    /**
     * Deletes book from the catalog
     *
     * @param bookTitle Title of the book
     */
    public void deleteBookTitle(String bookTitle) {
        Node current = head;
        while (current.getNextNode() != null) {
            current = current.getNextNode();
            if (current.getBookTitle() == bookTitle) {
                current.getPreviousNode().setPreviousNode(current.getNextNode());
                current.getNextNode().setNextNode(current.getPreviousNode());
            }
        }

    }

}