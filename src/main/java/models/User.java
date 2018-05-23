package models;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name="users")
public class User {

    private int Id;
    private String name;
    private ArrayList<Book> booksOnLoan;

    public User(String name) {
        this.name = name;
        this.booksOnLoan = new ArrayList<Book>();
    }

    @Id
    @GeneratedValue
    @Column(name = "id")
    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    OneToMany()
    public ArrayList<Book> getBooksOnLoan() {
        return booksOnLoan;
    }

    public void setBooksOnLoan(ArrayList<Book> booksOnLoan) {
        this.booksOnLoan = booksOnLoan;
    }
}
