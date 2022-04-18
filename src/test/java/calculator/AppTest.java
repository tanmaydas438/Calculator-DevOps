// package calculator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class AppTest {
	@Test
	    public void test_squareRoot() {
	        double a = 16.0;
	        double expectedResult = 4.0;
	        double result = App.getRoot(a);
	        Assert.assertEquals(expectedResult, result, 0.0f);
	    }
	
	@Test
	    public void test_factorial() {
	        int a = 6;
	        int expectedResult = 720;
	        int result = App.getFactorial(a);
	        Assert.assertEquals(expectedResult, result);
	    }
		
	@Test
	    public void test_naturalLog() {
	        double a = 2.718;
	        double expectedResult = 1.0;
	        double result = App.getNaturalLog(a);
	        Assert.assertEquals(expectedResult, result, 0.2f);
	    }
	
	@Test
	    public void test_power() {
	        double a = 3.0;
			double b = 2.0;
	        double expectedResult = 9.0;
	        double result = App.getPower(a,b);
	        Assert.assertEquals(expectedResult, result, 0.0f);
	    }
	
}

