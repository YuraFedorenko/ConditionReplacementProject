package com.lollion.training.workSpace;

import org.junit.Test;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class ConditionReplacemntTest 
{


    @Test
    public void testPlus()
    {
    	Pluss plus = new Pluss();
    	assertThat(plus.calculate(6, 4),equalTo(10) );
    }
    
    @Test
    public void testPlusStrings()
    {
    	Pluss plus = new Pluss();
    	assertThat(plus.calculate("6", "4"),equalTo(64) );
    }
    
    @Test
    public void testMinus()
    {
    	Minus plus = new Minus();
    	assertThat(plus.calculate(6, 4),equalTo(2) );
    }
    
    @Test
    public void testDivide()
    {
    	Divide plus = new Divide();
    	assertThat(plus.calculate(6, 4),equalTo(1) );
    }
    
    @Test
    public void testMultiply()
    {
    	Multiply plus = new Multiply();
    	assertThat(plus.calculate(6, 4),equalTo(24) );
    }
}
