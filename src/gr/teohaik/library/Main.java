package gr.teohaik.library;

public class Main {

    public static void main(String[] args) {
        
        Writer w1 = new Writer("Simon Singh",857485,1);
        Writer w2 = new Writer("Doxiadis Apostolos",635241,0.04);
        Book b1 = new Book(1234,"The code book",w1);
        Book b2 = new Book(4321,"Big Bang",w1);
        Book b3 = new Book(5678,"The Science Book",w1);
        Book b4 = new Book(4152,"Fermat's Enigma",w1);
        Book b5 = new Book(8463,"Logicomix",w2);
        Book b6 = new Book(2254,"Uncle Petros & Goldbach's Conjecture ",w2);
        Book b7 = new Book(3321,"Circles Disturbed",w2);
        
        Library lib = new Library();
        lib.addBook(b1);
        lib.addBook(b2);
        lib.addBook(b3);
        lib.addBook(b4);
        lib.addBook(b5);
        lib.addBook(b6);
        lib.addBook(b7);

        lib.borrowBook(b1);
        lib.borrowBook(b2);
        lib.borrowBook(b2);
        lib.borrowBook(b3);
        lib.borrowBook(b3);
        lib.borrowBook(b3);
        lib.borrowBook(b4);
        lib.borrowBook(b4);
        lib.borrowBook(b4);
        lib.borrowBook(b4);
        lib.borrowBook(b5);
        lib.borrowBook(b6);
        lib.borrowBook(b7);

        lib.printBorrowedBooks();
        lib.printWriterProfits(w1);

    }

}
