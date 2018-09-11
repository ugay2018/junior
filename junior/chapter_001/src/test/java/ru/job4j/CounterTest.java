package ru.job4j;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class CounterTest {

    @Test
    public void add() {
        Counter counter = new Counter();
        int result = counter.add(2, 5);
        assertThat(result, is(6));
    }
}