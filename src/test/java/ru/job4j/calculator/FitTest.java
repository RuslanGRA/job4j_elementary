package ru.job4j.calculator;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class FitTest {

    @Test
    public void whenManHeight187ThenWeight100() {
        short height = 187;
        double expected = 100.05;
        double actual = Fit.idealWeight(height, true);
        double delta = 0.01;
        assertEquals(expected, actual, delta);
    }

    @Test
    public void whenWomanHeight170ThenWeight69() {
        short height = 170;
        double expected = 69.00;
        double actual = Fit.idealWeight(height, false);
        double delta = 0.01;
        assertEquals(expected, actual, delta);
    }

    @Test
    public void whenManHeight170ThenWeight80() {
        short height = 170;
        double expected = 80.50;
        double actual = Fit.idealWeight(height, true);
        double delta = 0.01;
        assertEquals(expected, actual, delta);
    }

    @Test
    public void whenWomanHeight160ThenWeight57() {
        short height = 160;
        double expected = 57.50;
        double actual = Fit.idealWeight(height, false);
        double delta = 0.01;
        assertEquals(expected, actual, delta);
    }
}
