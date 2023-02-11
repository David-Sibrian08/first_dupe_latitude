import org.example.Main;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MainTest {

    @Test
    public void testFirstDuplicate_WithDuplicates() {
        int[] numbers = {1, 9, 2, 8, 9};
        int expected = 9;
        int actual = Main.findFirstDuplicate(numbers);
        assertEquals(expected, actual);
    }

    @Test
    public void testFirstDuplicate_WithoutDuplicates() {
        int[] numbers = {1, 9, 2, 8, 7};
        int expected = -1;
        int actual = Main.findFirstDuplicate(numbers);
        assertEquals(expected, actual);
    }

    @Test
    public void testFirstDuplicate_EmptyInput() {
        int[] numbers = {};
        int expected = -1;
        int actual = Main.findFirstDuplicate(numbers);
        assertEquals(expected, actual);
    }

}