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

    @Test
    public void Division(){
        int result = calculator.division(12,6);
        Assert.assertEquals(2,result);
        System.out.println(result);
    }
    @Test
    public void Addition(){
        int result = calculator.addition(12,6);
        Assert.assertEquals(18,result);
        System.out.println(result);
    }
    @Test
    public  void Substractsion(){
        int result = calculator.substraction(12,6);
        Assert.assertEquals(6,result);
        System.out.println(result);
    }
}
