package org.lab8;

import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest {
    Calculator calc = new Calculator();
    @Test
    public void testSum() {
        Assert.assertEquals(calc.sum(3, 4), 7);
    }
    @Test
    public void testSubtract() {
        Assert.assertEquals(calc.sub(2,2),0);
    }
}
