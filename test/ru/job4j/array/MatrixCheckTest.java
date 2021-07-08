package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class MatrixCheckTest {

    @Test
    public void monoCheckHorizontalTrue() {
        int row = 1;
        char[][] array = {
                {'1', 's', '3'},
                {'X', 'X', 'X'},
                {'1', 's', '3'}
        };
        boolean out = MatrixCheck.monoHorizontal(array, row);
        Assert.assertTrue(out);
    }

    @Test
    public void monoCheckHorizontalFalse() {
        int row = 1;
        char[][] array = {
                {'1', 's', '3'},
                {'X', ' ', 'X'},
                {'1', 's', '3'}
        };
        boolean out = MatrixCheck.monoHorizontal(array, row);
        Assert.assertFalse(out);
    }

    @Test
    public void monoCheckVerticalTrue() {
        int column = 0;
        char[][] array = {
                {'X', 's', '3'},
                {'X', ' ', 'X'},
                {'X', 's', '3'}
        };
        boolean out = MatrixCheck.monoVertical(array, column);
        Assert.assertTrue(out);
    }

    @Test
    public void monoCheckVerticalFalse() {
        int column = 1;
        char[][] array = {
                {'X', 's', '3'},
                {'X', ' ', 'X'},
                {'X', 's', '3'}
        };
        boolean out = MatrixCheck.monoVertical(array, column);
        Assert.assertFalse(out);
    }

    @Test
    public void extractDiagonalX() {
        char[][] array = {
                {'X', ' ', ' '},
                {' ', 'X', ' '},
                {' ', ' ', 'X'},
        };
        char[] expected = {'X', 'X', 'X'};
        char[] out = MatrixCheck.extractDiagonal(array);
        Assert.assertArrayEquals(out, expected);
    }

    @Test
    public void whenDiagonalFullOne() {
        char[][] input = {
                {'1', ' ', ' '},
                {' ', '1', ' '},
                {' ', ' ', '1'},
        };
        char[] result = MatrixCheck.extractDiagonal(input);
        char[] expected = {'1', '1', '1'};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenDiagonalMix() {
        char[][] input = {
                {'X', ' ', ' '},
                {' ', 'Y', ' '},
                {' ', ' ', 'Z'},
        };
        char[] result = MatrixCheck.extractDiagonal(input);
        char[] expected = {'X', 'Y', 'Z'};
        Assert.assertArrayEquals(expected, result);
    }

    @Test
    public void whenHorizontalIsWin() {
        char[][] array = {
                {'X', 's', '3'},
                {'X', ' ', 'X'},
                {'X', 's', '3'}
        };
        boolean result = MatrixCheck.isWin(array);
        Assert.assertTrue(result);
    }

    @Test
    public void whenDataMonoByTrueThenTrue() {
        char[][] input = {
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
        };
        boolean result = MatrixCheck.isWin(input);
        Assert.assertTrue(result);
    }

    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        char[][] input = {
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', 'X', ' ', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
        };
        boolean result = MatrixCheck.isWin(input);
        Assert.assertFalse(result);
    }

    @Test
    public void whenDataHMonoByTrueThenTrue() {
        char[][] input = {
                {' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' '},
                {'X', 'X', 'X', 'X', 'X'},
                {' ', ' ', 'X', ' ', ' '},
                {' ', ' ', 'X', ' ', ' '},
        };
        boolean result = MatrixCheck.isWin(input);
        Assert.assertTrue(result);
    }
}