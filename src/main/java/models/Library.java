package models;

import java.util.ArrayList;
import java.util.HashMap;

public class Library {

    private int id;
    private ArrayList<Book> catalogue;
    private HashMap<Book, User> booksOnLoan;

    public Library() {
        this.catalogue = new ArrayList<Book>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ArrayList<Book> getCatalogue() {
        return catalogue;
    }

    public void setCatalogue(ArrayList<Book> catalogue) {
        this.catalogue = catalogue;
    }

    public HashMap<Book, User> getBooksOnLoan() {
        return booksOnLoan;
    }

    public void setBooksOnLoan(HashMap<Book, User> booksOnLoan) {
        this.booksOnLoan = booksOnLoan;
    }

    public void loanBookToUser(Book book1, User user1) {

    }
}
