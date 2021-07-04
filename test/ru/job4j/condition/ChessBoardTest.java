package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class ChessBoardTest {

    @Test
    public void wayBackIs2() {
        int x1 = 7;
        int x2 = 3;
        int y1 = 5;
        int y2 = 1;
        int out = ChessBoard.way(x1, y1, x2, y2);
        int expected = 4;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void wayForwardIs2() {
        int x1 = 3;
        int x2 = 7;
        int y1 = 1;
        int y2 = 5;
        int out = ChessBoard.way(x1, y1, x2, y2);
        int expected = 4;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void wayX2minusX1NotEqualsY2minusY1() {
        int x1 = 1;
        int x2 = 2;
        int y1 = 3;
        int y2 = 7;
        int out = ChessBoard.way(x1, y1, x2, y2);
        int expected = 0;
        Assert.assertEquals(expected, out);
    }

    @Test
    public void when8ThenFalse() {
        int num = 8;
        boolean result = ChessBoard.isPositiveAndLessSeven(num);
        Assert.assertFalse(result);
    }

    @Test
    public void whenMinus1ThenFalse() {
        int num = -1;
        boolean result = ChessBoard.isPositiveAndLessSeven(num);
        Assert.assertFalse(result);
    }
}