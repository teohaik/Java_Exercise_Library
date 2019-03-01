package gr.teohaik.library;

public class Book {

    private int isbn;
    private String title;
    private Writer writer;
    private int timesRented;
    private boolean borrowed;

    public Book(int isbn, String title, Writer writer) {
        this.isbn = isbn;
        this.title = title;
        this.writer = writer;
        this.timesRented = 0;
        this.borrowed = false;
    }

    public Book() {
    }

    public void increaseTimesRented(){
        timesRented++;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Writer getWriter() {
        return writer;
    }

    public void setWriter(Writer writer) {
        this.writer = writer;
    }

    public int getTimesRented() {
        return timesRented;
    }

    public void setTimesRented(int timesRented) {
        this.timesRented = timesRented;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void setBorrowed(boolean borrowed) {
        this.borrowed = borrowed;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbn=" + isbn +
                ", title='" + title + '\'' +
                ", writer=" + writer +
                ", timesRented=" + timesRented +
                ", borrowed=" + borrowed +
                '}';
    }
}
