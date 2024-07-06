package calculator;
import org.junit.Test;


import static junit.framework.TestCase.assertEquals;

public class CalculatorTestPoprawiony {
    public Calculator calculator = new Calculator();

    @Test
    public void powerTwoNumbersTest()  {
        assertEquals(calculator.powerTwoNumbers(2.0,3.0), 8.0);
    }

    @Test
    public void sqrtTest()  {
        assertEquals(calculator.sqrt(4.0), 2.0);
    }

    @Test
    public void CalculateSquareAreaTest()  {
        assertEquals(calculator.CalculateSquareArea(2), 4.0);
    }

    @Test
    public void CalculateRectAreaTest()  {
        assertEquals(calculator.CalculateRectArea(2,3), 6.0);
    }

    @Test
    public void CalculateSquareCircTest()  {
        assertEquals(calculator.CalculateSquareCirc(2), 8);
    }

    @Test
    public void CalculateRectCircTest()  {
        assertEquals(calculator.CalculateRectCirc(2,3), 10);
    }

    @Test
    public void CalculateTriangleAreaTest()  {
        assertEquals(calculator.CalculateTriangleArea(2,3), 3.0);
    }

    @Test
    public void CalculateTriangleCircTest()  {
        assertEquals(calculator.CalculateTriangleCirc(2,3, 4), 9.0);
    }

    @Test
    public void convertCelsiusToFarenheitTest()  {
        assertEquals(calculator.convertCelsiusToFarenheit(2), 35.6);
    }

    @Test
    public void convertFarenheitToCelsiusTest()  {
        assertEquals(calculator.convertFarenheitToCelsius(30), -1.0);
    }

    @Test
    public void convertFromMphToKphTest()  {
        assertEquals(calculator.convertFromMphToKph(100), 161.0);
    }

    @Test
    public void factorialTest()  {
        assertEquals(calculator.factorial(3), 6);
    }

    @Test
    public void fibbonacciTest()  {
        assertEquals(calculator.fibbonacci(0), 0);
        assertEquals(calculator.fibbonacci(1), 1);
        assertEquals(calculator.fibbonacci(3), 2);
    }

    @Test
    public void findGCDTest()  {
        assertEquals(calculator.findGCD(1,0), 1);
        assertEquals(calculator.findGCD(1, 2), 1);
    }

    @Test
    public void findLCMTest()  {
        assertEquals(calculator.findLCM(3,6), 6);
    }

    @Test
    public void isPrimeTest()  {
        assertEquals(calculator.isPrime(0), false);
        assertEquals(calculator.isPrime(12), false);
        assertEquals(calculator.isPrime(13), true);
    }

}
