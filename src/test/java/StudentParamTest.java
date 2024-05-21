import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(Parameterized.class)
public class StudentParamTest {

    public int score;

    public int expectedResult;

    public StudentParamTest(int score, int expectedResult) {
        this.score = score;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Object[][] testData() {
        return new Object[][] {
                {50, true},
                {49, false},
                {51, true}
        };
    }

    @Test
    public void testScoreService() {
        StudentService service = new StudentService();
        boolean result = service.checkAverageScore(score);
        assertNotNull(expectedResult);
    }

}
