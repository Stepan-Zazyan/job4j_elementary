package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TurnTest {

    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        int[] input = new int[] {4, 1, 6, 2};
        int[] result = Turn.back(input);
        int[] expected = new int[] {2, 6, 1, 4};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenTurnMyArrayWithEvenAmountOfElementsThenTurnedArray() {
        int[] input = new int[] {4, 1, 6, 2, 8, 12};
        int[] result = Turn.back(input);
        int[] expected = new int[] {12, 8, 2, 6, 1, 4};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenTurnArrayWithNotEvenAmountOfElementsThenTurnedArray() {
        int[] input = new int[] {4, 1, 5, 6, 2};
        int[] result = Turn.back(input);
        int[] expected = new int[] {2, 6, 5, 1, 4};
        Assert.assertArrayEquals(expected, result);
    }

}