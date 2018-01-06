<<<<<<< HEAD:src/test/java/fr/univtln/lducarre365/infoCity/AppTest.java
package fr.univtln.lducarre365.infoCity;

=======
>>>>>>> master:src/test/java/AppTest.java
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

    /*@BeforeEach
    void init() {
        User user = new User.Builder().setEmail("monmail@mail.com").setFirstName("Jean")
                .setLastName("Strauss").setId(952).setPassword("azerty").build();
    }*/

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

<<<<<<< HEAD:src/test/java/fr/univtln/lducarre365/infoCity/AppTest.java

=======
    /*public static void main(String[] args) {
        Town town = new Town();
        town.setName("toulon");
        town.setCountry("france");

        User user = new User(456,"paul","martin","paulmartin@mail.fr","pass");



        System.out.println(user.toString());
    }
*/
>>>>>>> master:src/test/java/AppTest.java
}