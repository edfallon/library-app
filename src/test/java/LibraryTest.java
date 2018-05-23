import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library1;

    @Before
    public void setUp() throws Exception {
        library1 = new Library();
    }

    @Test
    public void hasEmptyCatalogue() {
        assertEquals(0, library1.getCatalogue().size());
    }
}
