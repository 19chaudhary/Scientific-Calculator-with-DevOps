package com.iiitb.miniproject;

import com.iiitb.miniproject.CalcController;
import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class CalTest {
    private static final double DELTA = 1e-15;

    CalcController calculator = new CalcController();

    @Test
    public void squareRootTruePositive(){
        Map<String,Object> body1 = new HashMap();
        body1.put("input1", "100");

        Map<String,Object> body2 = new HashMap();
        body2.put("input1","25");

        Assert.assertEquals("Square root of number for True Positive", 10, calculator.getSqrt(body1), DELTA);
        Assert.assertEquals("Square root of number for True Positive", 5, calculator.getSqrt(body2), DELTA);

    }
    @Test
    public void squareRootFalsePositive(){
        Map<String,Object> body1 = new HashMap();
        body1.put("input1","100");

        Map<String,Object> body2 = new HashMap();
        body2.put("input1","25");

        Assert.assertNotEquals("Square root of number for False Positive", 6, calculator.getSqrt(body1), DELTA);
        Assert.assertNotEquals("Square root of number for False Positive", 2.5, calculator.getSqrt(body2), DELTA);
    }

    @Test
    public void factorialTruePositive(){
        Map<String,Object> body1 = new HashMap();
        body1.put("input1", "5");

        Map<String,Object> body2 = new HashMap();
        body2.put("input1","3");

        Assert.assertEquals("Factorial of number for True Positive", 120, calculator.getFact(body1), DELTA);
        Assert.assertEquals("Factorial of number for True Positive", 6, calculator.getFact(body2), DELTA);

    }

    @Test
    public void factorialFalsePositive(){
        Map<String,Object> body1 = new HashMap();
        body1.put("input1","5");

        Map<String,Object> body2 = new HashMap();
        body2.put("input1","3");

        Assert.assertNotEquals("Factorial of number for False Positive", 100, calculator.getFact(body1), DELTA);
        Assert.assertNotEquals("Factorial of number for False Positive", 25, calculator.getFact(body2), DELTA);
    }
    @Test
    public void logTruePositive(){
        Map<String,Object> body1 = new HashMap();
        body1.put("input1", "1");

        Map<String,Object> body2 = new HashMap();
        body2.put("input1","50");

        Assert.assertEquals("Natural Log of number for True Positive", 0, calculator.getLog(body1), DELTA);
        Assert.assertEquals("Natural Log of number for True Positive", 3.912023005428146, calculator.getLog(body2), DELTA);

    }

    @Test
    public void logFalsePositive(){
        Map<String,Object> body1 = new HashMap();
        body1.put("input1","1");

        Map<String,Object> body2 = new HashMap();
        body2.put("input1","50");

        Assert.assertNotEquals("Natural Log of number for False Positive", 6, calculator.getLog(body1), DELTA);
        Assert.assertNotEquals("Natural Log of number for False Positive", 2.5, calculator.getLog(body2), DELTA);
    }
    @Test
    public void powerTruePositive(){
        Map<String,Object> body1 = new HashMap();
        body1.put("input1", "10");
        body1.put("input2", "2");

        Map<String,Object> body2 = new HashMap();
        body2.put("input1","5");
        body2.put("input2","3");

        Assert.assertEquals("Power of number for True Positive", 100, calculator.getPower(body1), DELTA);
        Assert.assertEquals("Power of number for True Positive", 125, calculator.getPower(body2), DELTA);

    }

    @Test
    public void powerFalsePositive(){
        Map<String,Object> body1 = new HashMap();
        body1.put("input1", "10");
        body1.put("input2", "2");

        Map<String,Object> body2 = new HashMap();
        body2.put("input1","5");
        body2.put("input2","3");

        Assert.assertNotEquals("Power of number for False Positive", 10, calculator.getPower(body1), DELTA);
        Assert.assertNotEquals("Power of number for False Positive", 25, calculator.getPower(body2), DELTA);
    }
}
