import models.User;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTest {

    User user1;

    @Before
    public void setUp() throws Exception {
        user1 = new User("Scott");
    }

    @Test
    public void hasName() {
        assertEquals("Scott", user1.getName());
    }

    @Test
    public void hasEmptyListOfLoanedBooks() {
        System.out.println(user1.getBooksOnLoan());
        assertEquals(0, user1.getBooksOnLoan().size());
    }
}
