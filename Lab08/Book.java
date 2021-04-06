public class Book {
    private String bookTitle;
    private int numberOfBooks;
    public Book(String bookTitle, int numberOfBooks){
        this.setBookTitle(bookTitle);
        this.setNumberOfBooks(numberOfBooks);
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public int getNumberOfBooks() {
        return numberOfBooks;
    }

    public void setNumberOfBooks(int numberOfBooks) {
        this.numberOfBooks = numberOfBooks;
    }
}
