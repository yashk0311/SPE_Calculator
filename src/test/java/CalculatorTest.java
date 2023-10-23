import org.example.Main;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
    private Main calculator;

    @Before
    public void setUp(){
        calculator = new Main();
    }

    @Test
    public void test_add_positive(){
        int a = 1;
        int b = 2;
        int expectedResult = 3;
        Assert.assertEquals(expectedResult, calculator.add(a,
                b));
    }
    @Test
    public void test_add_negative(){
        int a = 1;
        int b = 2;
        int expectedResult = 0;
        Assert.assertNotEquals(expectedResult, calculator.add(a,
                b));
    }

    @Test
    public void test_sub_positive(){
        int a = 4;
        int b = 2;
        int expectedResult = 2;
        Assert.assertEquals(expectedResult, calculator.subtract(a,
                b));
    }
    @Test
    public void test_sub_negative(){
        int a = 3;
        int b = 2;
        int expectedResult = 0;
        Assert.assertNotEquals(expectedResult, calculator.subtract(a,
                b));
    }

    @Test
    public void test_multiply_positive(){
        int a = 1;
        int b = 2;
        int expectedResult = 2;
        Assert.assertEquals(expectedResult, calculator.multiply(a,
                b));
    }
    @Test
    public void test_multiply_negative(){
        int a = 1;
        int b = 2;
        int expectedResult = 10;
        Assert.assertNotEquals(expectedResult, calculator.multiply(a,
                b));
    }

    @Test
    public void test_division_positive(){
        int a = 4;
        int b = 2;
        float expectedResult = 2.0F;
        Assert.assertEquals(expectedResult, calculator.divide(a,
                b), 0.0F);
    }
    @Test
    public void test_division_negative(){
        int a = 4;
        int b = 2;
        float expectedResult = 0.0F;
        Assert.assertNotEquals(expectedResult, calculator.divide(a,
                b), 0.0F);
    }
}
