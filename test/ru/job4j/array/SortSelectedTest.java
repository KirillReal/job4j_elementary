package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class SortSelectedTest {
    @Test
    public void whenSort() {
        int[] input = new int[] {3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {1, 2, 3, 4, 5};
        assertThat(result, is(expect));
    }

    @Test
    public void whenSort2() {
        int[] input = new int[] {5, 8, 7, 9, 6};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {5, 6, 7, 8, 9};
        assertThat(result, is(expect));
    }
    @SuppressWarnings("checkstyle:EmptyLineSeparator")
    @Test
    public void whenSort3() {
        int[] input = new int[] {11, 12, 10};
        int[] result = SortSelected.sort(input);
        int[] expect = new int[] {10, 11, 12};
        assertThat(result, is(expect));
    }
}