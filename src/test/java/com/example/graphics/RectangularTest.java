package com.example.graphics;

import com.example.graphics.Rectangular;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RectangularTest {

    private Rectangular c = null;

    public RectangularTest() {
    }

    @BeforeEach
    public void before() {
        this.c = new Rectangular();
    }

    @Test
    public void computeAreaTest() {
        Assertions.assertEquals(this.c.Area(2.0, 3.0), 6.0, 0.01);
    }

    @Test
    public void ComputeCircumfurenceTest() {
        Assertions.assertEquals(this.c.Circumference(2.0, 3.0), 10.0, 0.01);
    }
}
