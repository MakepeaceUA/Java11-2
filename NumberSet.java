import java.util.Collections;
import java.util.List;

public class NumberSet
{

    private final List<Integer> numbers;

    public NumberSet(List<Integer> numbers)
    {
        this.numbers = numbers;
    }

    public int getSum()
    {
        int sum = 0;
        for (Integer number : numbers)
        {
            sum += number;
        }
        return sum;
    }

    public double getMean()
    {
        if (numbers.isEmpty())
        {
            return 0.0;
        }
        return (double) getSum() / numbers.size();
    }

    public int getMax()
    {
        if (numbers.isEmpty())
        {
            throw new IllegalStateException("Набор пуст");
        }
        return Collections.max(numbers);
    }

    public int getMin()
    {
        if (numbers.isEmpty())
        {
            throw new IllegalStateException("Набор пуст");
        }
        return Collections.min(numbers);
    }
}
