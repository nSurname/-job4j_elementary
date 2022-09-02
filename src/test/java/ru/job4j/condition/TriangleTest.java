package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class TriangleTest {
     @Test
     public void whenExist() {
        double ab = 2.0;
        double ac = 2.0;
        double bc = 2.0;
        boolean result = Triangle.exist(ab, ac, bc);
        assertThat(result).isTrue();
    }

     @Test
     public void whenNotExist() {
        double ab = 2.0;
        double ac = 4.0;
        double bc = 2.0;
        boolean result = Triangle.exist(ab, ac, bc);
        assertFalse(result).isTrue();
    }

}