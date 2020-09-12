package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class SwitchArray2Test {

    @Test
    public void whenSwap0to3() {
        int[] input = {1, 2, 3, 4};
        int[] expect = {4, 2, 3, 1};
        int[] rsl = SwitchArray2.swap(input, 0, input.length - 1);
        assertThat(rsl, is(expect));
    }
    @Test
    public void whenSwap2to5() {
        int[] input = {7, 8, 10, 87, 35, 82};
        int[] expect = {7, 8, 82, 87, 35, 10};
        int[] rsl = SwitchArray2.swap(input, 2, input.length - 1);
        assertThat(rsl, is(expect));
    }
    @Test
    public void whenSwap1to4() {
        int[] input = {20, 30, 214, 90, 52};
        int[] expect = {20, 52, 214, 90, 30};
        int[] rsl = SwitchArray2.swap(input, 1, input.length - 1);
        assertThat(rsl, is(expect));
    }
}