package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class CheckPrimeNumberTest {

    @Test
    public void when181ThenTrue() {
        int num = 181;
        boolean result = CheckPrimeNumber.check(num);
        Assert.assertTrue(result);
    }

    @Test
    public void when1ThenFalse() {
        int num = 1;
        boolean result = CheckPrimeNumber.check(num);
        Assert.assertTrue(result);
    }

    @Test
    public void when2ThenFalse() {
        int num = 4;
        boolean result = CheckPrimeNumber.check(num);
        Assert.assertFalse(result);
    }
}