package ru.job4j.condition;
import static org.hamcrest.Matchers.closeTo;
import static org.junit.Assert.assertThat;
import static ru.job4j.condition.Point.*;
import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void whenx15y14x23y22Then2point83() {
        int x1 = 5;
        int x2 = 3;
        int y1 = 4;
        int y2 = 2;
        double expected = 2.83;
        double out = distance(x1,y1,x2,y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenx10y10x20y11Then1(){
        int x1 = 0;
        int x2 = 0;
        int y1 = 0;
        int y2 = 1;
        double expected = 1.0;
        double out = distance(x1,y1,x2,y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenx11y10x20y10Then1(){
        int x1 = 1;
        int x2 = 0;
        int y1 = 0;
        int y2 = 0;
        double expected = 1.0;
        double out = distance(x1,y1,x2,y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenx1yx1z5Andx1y2z3Then4point58(){
        Point c = new Point(5, 1, 5);
        Point d = new Point(1, 2, 3);
        double expected = 4.58;
        double out = c.distance3d(d);
        assertThat(expected, closeTo(out, 0.01));
    }


}