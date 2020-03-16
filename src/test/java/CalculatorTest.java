import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    Calculator calculator = new Calculator();
    @Test
    public void multiplicationTest(){
        int result = calculator.multiplication(5,6);
        Assert.assertEquals(30,result);
        System.out.println(result);
    }
}
