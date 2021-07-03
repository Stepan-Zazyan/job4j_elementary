package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void whenAB3BC4AC5ThenTrue() {
        double ab = 3;
        double bc = 4;
        double ac = 5;
        boolean result = Triangle.exist(ab, bc, ac);
        Assert.assertTrue(result);
    }

    @Test
    public void whenAB1BC6AC0ThenTrue(){
        double ab = 1;
        double bc = 6;
        double ac = 0;
        boolean result = Triangle.exist(ab, bc, ac);
        Assert.assertFalse(result);
    }
}