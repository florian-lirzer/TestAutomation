import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest
{
    Calculator calculator;

    @BeforeEach
    void setUp()
    {
        calculator = new Calculator();
    }

    @Test
    void add()
    {
        double a = 1;
        double b = 2;
        double result = calculator.add(a, b);
        Assertions.assertEquals(3, result);
    }

    @Test
    void subtract()
    {
        double a = 5;
        double b = 4;
        double result = calculator.subtract(a, b);
        Assertions.assertEquals(1, result);
    }

    @Test
    void multiply()
    {
        Assertions.assertEquals(20, calculator.multiply(5, 4));
    }

    @Test
    void divide()
    {
    }

    @Test
    void modulo()
    {
    }

    @Test
    void sum()
    {
    }
}