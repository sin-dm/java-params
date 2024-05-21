import org.junit.*;

import static org.junit.Assert.assertTrue;

public class StudentTest {

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before class");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After class");
    }

    @Before
    public void beforeEach() {
        System.out.println("Before each");
    }

    @After
    public void afterEach() {
        System.out.println("After each");
    }

    @Test
    public void testScore() {
        System.out.println("First test");
        StudentService service = new StudentService();
        boolean result = service.checkAverageScore(50);
        assertTrue(result);
    }

    @Test
    public void testSecond() {
        System.out.println("second test");
    }

    @Test
    public void testThird() {

    }

}
