package guru.qa;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FirstClass {
    @Test
    void firstTest() {
        Assertions.assertTrue(3 >= 3);
    }

    @Test
    void second_firstTest() {
        Assertions.assertTrue(4 >= 4);
    }
}