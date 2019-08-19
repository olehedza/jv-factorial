package core.basesyntax;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigInteger;

public class FactorialTest {
    private static int ZERO = 0;
    private static int ONE = 1;
    private static int SEVEN = 7;

    @Test
    public void getFactorialFromZero() {
        Factorial factorial = new Factorial();
        int actualResult = factorial.getFactorial(ZERO);
        int expectedResult = getFactorial(ZERO);

        Assert.assertEquals("Test failed with actual result " + actualResult,
                expectedResult,
                actualResult);
    }

    @Test
    public void getFactorialFromOne() {
        Factorial factorial = new Factorial();
        int actualResult = factorial.getFactorial(ONE);
        int expectedResult = getFactorial(ONE);

        Assert.assertEquals("Test failed with actual result " + actualResult,
                expectedResult,
                actualResult);
    }

    @Test
    public void getFactorialFromSeven() {
        Factorial factorial = new Factorial();
        int actualResult = factorial.getFactorial(SEVEN);
        int expectedResult = getFactorial(SEVEN);

        Assert.assertEquals("Test failed with actual result " + actualResult,
                expectedResult,
                actualResult);
    }

    private static int getFactorial(int number) {
        BigInteger result = BigInteger.valueOf(1);
        for (int i = 2; i <= number; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result.intValue();
    }
}
