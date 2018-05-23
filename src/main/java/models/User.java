package models;

import models.Book;

import java.util.ArrayList;

public class User {

    private int Id;
    private String name;
    private ArrayList<Book> booksOnLoan;

    public User(String name) {
        this.name = name;
        this.booksOnLoan = new ArrayList<Book>();
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Book> getBooksOnLoan() {
        return booksOnLoan;
    }

    public void setBooksOnLoan(ArrayList<Book> booksOnLoan) {
        this.booksOnLoan = booksOnLoan;
    }
}
