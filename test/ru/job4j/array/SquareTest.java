package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SquareTest {

    @Test
    public void whenBound5() {
        int bound = 5;
        int[] out = Square.calc(bound);
        int[] expected = new int[]{0, 1, 4, 9, 16};
        Assert.assertArrayEquals(out, expected);
    }

    @Test
    public void whenBound3Then014() {
        int bound = 3;
        int[] result = Square.calc(bound);
        int[] expected = new int[] {0, 1, 4};
        Assert.assertArrayEquals(expected, result);
    }
}