package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenFirst5Second1Then5() {
        int first = 5;
        int second = 1;
        int expected = 5;
        int out = Max.max(first, second);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenFirst5Second10Then10() {
        int first = 5;
        int second = 10;
        int expected = 10;
        int out = Max.max(first, second);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenFirst10Second10Then10() {
        int first = 10;
        int second = 10;
        int expected = 10;
        int out = Max.max(first, second);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenFirst10Second100Third1000Then1000() {
        int first = 10;
        int second = 100;
        int third = 1000;
        int expected = 1000;
        int out = Max.max(first, second, third);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void whenFirst10Second100Third1000ForthThen10000() {
        int first = 10;
        int second = 100;
        int third = 10000;
        int expected = 10000;
        int out = Max.max(first, second, third);
        Assert.assertEquals(expected, out);
    }
}