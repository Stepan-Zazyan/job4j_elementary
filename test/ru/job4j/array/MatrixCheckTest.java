package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixCheckTest {

    @Test
    public void monoCheck() {
        int row = 1;
        char[][] array = {
                {'1', 's', '3'},
                {'X', 'X', 'X'},
                {'1', 's', '3'}
        };
        boolean out = MatrixCheck.monoHorizontal(array, 1);
        Assert.assertTrue(out);
    }
}