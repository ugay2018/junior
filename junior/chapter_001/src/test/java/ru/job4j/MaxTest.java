package ru.job4j;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void sum() {
        Max maxim = new Max();
      int result = maxim.max(1, 2);
      assertThat(result, is(2));
    }

    @Test
    public void max1() {
        Max maxim = new Max();
        int result = maxim.max1(1, 2, 3);
        assertThat(result, is(3));
    }
}