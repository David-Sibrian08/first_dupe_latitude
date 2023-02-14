import org.example.Main;
import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void testFindFirstDuplicateWithDuplicates() {
        Integer[] input = {1, 3, 4, 2, 2, 3};
        Object[] expected = {2, 3};
        assertArrayEquals(expected, Main.findFirstDuplicateWithIndex(input));
    }

    @Test
    public void testFindFirstDuplicateWithoutDuplicates() {
        Integer[] input = {1, 2, 3, 4, 5};
        Object[] expected = {-1, -1};
        assertArrayEquals(expected, Main.findFirstDuplicateWithIndex(input));
    }

    @Test
    public void testFindFirstDuplicateWithEmptyInput() {
        Integer[] input = {};
        Object[] expected = {-1, -1};
        assertArrayEquals(expected, Main.findFirstDuplicateWithIndex(input));
    }

    @Test
    public void testFindFirstDuplicateWithStrings() {
        String[] input = {"a", "lonely", "cat", "is", "lonely"};
        Object[] expected = {"lonely", 4};
        assertArrayEquals(expected, Main.findFirstDuplicateWithIndex(input));
    }

    @Test
    public void testFindFirstDuplicateWithNumbers() {
        Double[] input = {1.1, 2.2, 3.3, 4.4, 2.2};
        Object[] expected = {2.2, 4};
        assertArrayEquals(expected, Main.findFirstDuplicateWithIndex(input));
    }
}