package firstjunit;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
    @Test
    public void multiply3by4() {
        Calculator calc = new Calculator();
        int expected = 12;
        int actual = calc.multiply(3, 4);
        assertThat(actual, is(expected));
    }

    @Test
    public void multiply5by7() {
        Calculator calc = new Calculator();
        int expected = 35;
        int actual = calc.multiply(5, 7);
        assertThat(actual, is(expected));
    }

    @Test
    public void divide3by2() {
        Calculator calc = new Calculator();
        float expected = 1.5f;
        float actual = calc.divide(3, 2);
        assertThat(actual, is(expected));
    }

    @Test(expected = IllegalArgumentException.class)
    public void divideBy0CauseIllegalArgumentException() {
        Calculator calc = new Calculator();
        calc.divide(5, 0);
    }

}
