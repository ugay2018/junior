package ru.job4j;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void calc() {
        Factorial factorial = new Factorial();
        int res = factorial.calc(3);
        assertThat(res, is(6));
    }
}