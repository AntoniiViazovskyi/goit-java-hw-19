package org.goit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SumCalculatorTest {
    SumCalculator sumCalculator;
    @BeforeEach
    void prepare() {
        sumCalculator = new SumCalculator();
    }

    @Test
    void testIfNumberIsOne() {
        Assertions.assertEquals(1, sumCalculator.sum(1));
    }

    @Test
    void testIfNumberIsThree() {
        Assertions.assertEquals(6, sumCalculator.sum(3));
    }

    @Test
    void throwingExceptionIfNumberIsZero() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> sumCalculator.sum(0));
    }
}
