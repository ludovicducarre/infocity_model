import fr.univtln.lducarre365.infoCity.business.Town;
import fr.univtln.lducarre365.infoCity.business.User;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.fail;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @BeforeAll
    static void initAll() {
    }

    @BeforeEach
    void init() {
    }

    @Test
    void succeedingTest() {
        Assertions.assertTrue(true);
    }


    /*@Test
    void failingTest() {
        fail("a failing test");
    }*/

    @Test
    @Disabled("for demonstration purposes")
    void skippedTest() {
        // not executed
    }

    @AfterEach
    void tearDown() {
    }

    @AfterAll
    static void tearDownAll() {
    }

    /*public static void main(String[] args) {
        Town town = new Town();
        town.setName("toulon");
        town.setCountry("france");

        User user = new User(456,"paul","martin","paulmartin@mail.fr","pass");



        System.out.println(user.toString());
    }
*/
}