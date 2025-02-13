package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SortSelectedTest {

    @Test
    public void whenSort5SizeArray() {
        int[] data = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {1, 2, 3, 4, 5};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenSort3SizeArray() {
        int[] data = new int[] {10, 1098, -13};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[] {-13, 10, 1098};
        Assert.assertArrayEquals(expected, result);
    }
}