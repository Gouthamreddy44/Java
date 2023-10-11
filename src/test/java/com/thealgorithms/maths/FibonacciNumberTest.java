import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class FibonacciNumberTest {

    @ParameterizedTest
    @ValueSource(ints = {0, 1, 2, 5, 10, 20, 30, 92}) // Include 92 as the upper limit
    public void testNthFibonacci(int n) {
        long result = FibonacciNumber.nthFibonacci(n);
        long expectedResult = FibCalc.calculateFibonacciUsingLoop(n); // Call the static method directly
        assertEquals(expectedResult, result);
    }
}
