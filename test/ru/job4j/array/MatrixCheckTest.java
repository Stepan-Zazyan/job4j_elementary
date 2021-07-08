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
}