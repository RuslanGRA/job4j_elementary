package ru.job4j.calculator;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FitTest {

    @Test
    public void whenManHeight187ThenWeight100() {
        short height = 187;
        double expected = (187 - 100) * 1.15;
        double actual = Fit.idealWeight(height, true);
        double delta = 0.01;
        assertEquals(expected, actual, delta);
    }

    @Test
    public void whenWomanHeight170ThenWeight69() {
        short height = 170;
        double expected = (170 - 110) * 1.15;
        double actual = Fit.idealWeight(height, false);
        double delta = 0.01;
        assertEquals(expected, actual, delta);
    }

    @Test
    public void whenManHeight170ThenWeight80() {
        short height = 170;
        double expected = (170 - 100) * 1.15;
        double actual = Fit.idealWeight(height, true);
        double delta = 0.01;
        assertEquals(expected, actual, delta);
    }

    @Test
    public void whenWomanHeight160ThenWeight57() {
        short height = 160;
        double expected = (160 - 110) * 1.15;
        double actual = Fit.idealWeight(height, false);
        double delta = 0.01;
        assertEquals(expected, actual, delta);
    }
}