package models;


import javax.persistence.*;

@Entity
@Table(name="books")
public class Book {

    private int id;
    private String title;
    private boolean available;

    public Book(String title) {
        this.title = title;
        this.available = true;
    }

    @Id
    @GeneratedValue
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    @Column(name = "title")
    public void setTitle(String title) {
        this.title = title;
    }

    @Column(name = "available")
    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
