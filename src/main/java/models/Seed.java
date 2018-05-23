package models;

import db.DBHelper;

public class Seed {

    public static void seedData(){

//        DBHelper.deleteAll(Book.class);

        Book book1 = new Book("The Lord of the Rings");
        Book book2 = new Book("The Romance of the Three Kingdoms");
        Book book3 = new Book("Hyperion");

        User user1 = new User("George Martin");
        User user2 = new User("Mary Beard");
        User user3 = new User("Christopher Hitchens");

        Library library = new Library();
        library.getCatalogue().add(book1);
        library.getCatalogue().add(book2);
        library.getCatalogue().add(book3);


        DBHelper.save(book1);
        DBHelper.save(book2);
        DBHelper.save(book3);

        DBHelper.save(user1);
        DBHelper.save(user2);
        DBHelper.save(user3);

        DBHelper.save(library);


    }

}
