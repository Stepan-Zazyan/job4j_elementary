package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class CounterTest {
    @Test
    public void whenSumEvenNumbersFromOneToTenThenThirty() {
        int start = 1;
        int finish = 10;
        int result = Counter.sumEven(start, finish);
        int expected = 30;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSumEvenNumbersFrom10To16Then52() {
        int start = 10;
        int finish = 16;
        int result = Counter.sumEven(start,finish);
        int expected = 52;
        Assert.assertEquals(expected, result);
    }
}