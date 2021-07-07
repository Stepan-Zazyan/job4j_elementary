package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] data = {5, 4, 3, 2};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas6Then0() {
        int[] data = {3, 6, 3, 2};
        int el = 6;
        int result = FindLoop.indexOf(data, el);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas9ThenMinus1() {
        int[] data = {5, 4, 3, 2};
        int el = 9;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenSearch6Then5() {
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8};
        int el = 6;
        int start = 3;
        int finish = 6;
        int out = FindLoop.indexOf(data, 6, 3, 6);
        int expected = 5;
        Assert.assertEquals(out, expected);
    }

    @Test
    public void whenSearch9ThenMinus1() {
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8};
        int el = 6;
        int start = 3;
        int finish = 6;
        int out = FindLoop.indexOf(data, 9, 3, 6);
        int expected = -1;
        Assert.assertEquals(expected, out);
    }
}