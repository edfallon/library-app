import models.Book;
import models.Library;
import models.User;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library1;
    Book book1;
    User user1;

    @Before
    public void setUp() throws Exception {
        library1 = new Library();
        book1 = new Book("The Silmarilion");
    }

    @Test
    public void hasEmptyCatalogue() {
        assertEquals(0, library1.getCatalogue().size());
    }

    @Test
    public void canAddBookToLibrary() {
        library1.getCatalogue().add(book1);
        assertEquals(1, library1.getCatalogue().size());
    }

    @Test
    public void canLoanBook() {
        library1.loanBookToUser(book1, user1);
        assertEquals(1, library1.getBooksOnLoan().size());
    }
}
