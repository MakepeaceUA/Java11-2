import org.junit.jupiter.api.Assertions; // Импорт для JUnit 5
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;

public class NumberSetTest {

    @Test
    public void testSum()
    {
        List<Integer> data = Arrays.asList(1, 2, 3, 4, 5);
        NumberSet numberSet = new NumberSet(data);

        Assertions.assertEquals(15, numberSet.getSum());
    }

    @Test
    public void testMean()
    {
        List<Integer> data = Arrays.asList(2, 4, 6, 8);
        NumberSet numberSet = new NumberSet(data);

        Assertions.assertEquals(5.0, numberSet.getMean(), 0.0001);
    }

    @Test
    public void testMeanWithFraction()
    {
        List<Integer> data = Arrays.asList(1, 2);
        NumberSet numberSet = new NumberSet(data);
        Assertions.assertEquals(1.5, numberSet.getMean(), 0.0001);
    }

    @Test
    public void testMax()
    {
        List<Integer> data = Arrays.asList(10, 50, -5, 20);
        NumberSet numberSet = new NumberSet(data);
        Assertions.assertEquals(50, numberSet.getMax());
    }

    @Test
    public void testMin()
    {
        List<Integer> data = Arrays.asList(10, 50, -5, 20);
        NumberSet numberSet = new NumberSet(data);
        Assertions.assertEquals(-5, numberSet.getMin());
    }
}
