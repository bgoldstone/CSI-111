/*
 * Name: Benjamin Goldstone (bgoldstone@muhlenberg.edu)
 * Date: 04/01/2021
 * Instructor: Professor Helsing
 */

/**
 * A Node to be used in a LinkedList
 */
public class Node {
    private String bookTitle;
    private Node nextNode;
    private Node previousNode;

    /**
     * Constructor for a Node
     *
     * @param bookTitle    Title of the Book
     * @param previousNode Location of previous node
     * @param nextNode     Location of next node
     */
    public Node(String bookTitle, Node previousNode, Node nextNode) {
        this.bookTitle = bookTitle;
        this.previousNode = previousNode;
        this.nextNode = nextNode;
    }

    /**
     * Gets the book title of the node
     *
     * @return Title of the book
     */
    public String getBookTitle() {
        return bookTitle;
    }

    /**
     * Sets the book title of the node
     *
     * @param bookTitle Title of the book
     */
    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    /**
     * Gets location of next node
     *
     * @return location of next node
     */
    public Node getNextNode() {
        return nextNode;
    }

    /**
     * Sets location of next node
     *
     * @param nextNode location of next node
     */
    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    /**
     * Gets location of previous node
     *
     * @return location of previous node
     */
    public Node getPreviousNode() {
        return previousNode;
    }

    /**
     * Sets location of previous node
     *
     * @param previousNode location of previous node
     */
    public void setPreviousNode(Node previousNode) {
        this.previousNode = previousNode;
    }

}
