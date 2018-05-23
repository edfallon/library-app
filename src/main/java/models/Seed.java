package models;

import db.DBHelper;

public class Seed {

    public void seedData(){

        DBHelper.deleteAll(Book.class);

        Book book1 = new Book("The Lord of the Rings");
        Book book2 = new Book("The Romance of the Three Kingdoms");
        Book book3 = new Book("Hyperion");

        DBHelper.save(book1);
        DBHelper.save(book2);
        DBHelper.save(book3);

    }

}
