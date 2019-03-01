package gr.teohaik.library;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> bookList;

    public Library() {
        bookList = new ArrayList<>();
    }

    public void addBook(Book aBook){
        bookList.add(aBook);
    }

    public Book checkIfBookExists(int isbn){
        //return bookList.stream().filter(b->b.getIsbn()==isbn).findAny().orElse(null);
        for(Book aBook : bookList){
            if(aBook.getIsbn() == isbn){
                return aBook;
            }
        }
        return null;
    }

    public void borrowBook(){
        String isbnString = JOptionPane.showInputDialog(null, "Give ISBN");
        int isbn = Integer.parseInt(isbnString);
        Book book = checkIfBookExists(isbn);
        borrowBook(book);
    }

    public void borrowBook(Book book){
        if(book != null){
            if(!book.isBorrowed()) {
                book.increaseTimesRented();
                book.setBorrowed(true);
                System.out.println("Successfully borrowed book " + book.getTitle());
            }
            else{
                System.out.println("The book is rented!");
            }
        }
        else{
            System.out.println("Book not found!");
        }
    }

    public void returnBook(Book book){
        if(book != null) {
            book.setBorrowed(false);
        }
    }

    public void printBorrowedBooks(){
        System.out.println("--------------Borrowed Books---------------------");
        for(Book aBook : bookList){
            if(aBook.isBorrowed()){
                System.out.println(aBook.getTitle());
            }
        }
        System.out.println("--------------------------------------------------");
    }

    public double getWriterProfits(int afm){
        double amount = 0;
        for(Book book : bookList){
            Writer writer = book.getWriter();
            if(writer.getAfm() == afm){
                int timesRented = book.getTimesRented();
                double costPerRent = writer.getCostPerRent();
                amount += timesRented * costPerRent;
            }
        }
        return amount;
    }


    public void printWriterProfits(Writer writer){
        double profits = getWriterProfits(writer.getAfm());
        System.out.println("Profits of writer " + writer.getName()+ " = " + profits);
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    @Override
    public String toString() {
        return "Library{" +
                "bookList=" + bookList +
                '}';
    }
}
