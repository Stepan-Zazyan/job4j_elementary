package ru.job4j.calculator;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void WhenMan187Then100point05() {
        short in = 187;
        double out = 100.05;
        double expected = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void WhenWoman170Then69() {
        short in = 170;
        double out = 69;
        double expected = Fit.womanWeight(in);
        Assert.assertEquals(out, expected, 0.01);
    }
}