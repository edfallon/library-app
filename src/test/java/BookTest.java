import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class BookTest {

    Book book1;

    @Before
    public void setUp() throws Exception {
        book1 = new Book("Mr Men", true);
    }

    @Test
    public void canGetBookTile() {
        assertEquals("Mr Men", book1.getTitle());
    }

    @Test
    public void canCheckIfBookIsAvailable() {
        assertEquals(true, book1.isAvailable());
    }
}
