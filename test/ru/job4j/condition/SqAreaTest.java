package ru.job4j.condition;
import static ru.job4j.condition.SqArea.*;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void WhenP6K2Then2() {
        int p = 6;
        int k = 2;
        double expected = 2.0;
        double out = square(p,k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void WhenP4K1Then2() {
        int p = 4;
        int k = 1;
        double expected = 1.0;
        double out = square(p,k);
        Assert.assertEquals(expected, out, 0.01);

    }
}