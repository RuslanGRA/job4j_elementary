package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class SqAreaTest {

    @Test
    public void whenP6K2Square2() {
        int expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP8K3Square3() {
        int expected = 3;
        int p = 8;
        int k = 3;
        double out = SqArea.square(p, k);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenP8K1Square4() {
        double out = SqArea.square(8, 1);
        Assert.assertEquals(4, out, 0.01);
    }

    @Test
    public void whenP4K1Square1() {
        double out = SqArea.square(4, 1);
        Assert.assertEquals(1, out, 0.01);
    }
}