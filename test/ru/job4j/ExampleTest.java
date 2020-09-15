package ru.job4j;

import org.junit.Test;
import ru.job4j.array.SortSelected;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ExampleTest {

    @Test
    public void whenSort() {
        int[] input = new int[]{3, 4, 1, 2, 5};
        int[] result = Example.sort(input);
        int[] expect = new int[]{1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }
}