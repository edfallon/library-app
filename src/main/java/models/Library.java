package models;

import models.Book;

import java.util.ArrayList;

public class Library {

    private int id;
    private ArrayList<Book> catalogue;

    public Library(ArrayList<Book> catalogue) {
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
}
