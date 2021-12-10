package com.example.graphics;

import com.example.graphics.Rectangular;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class RectangularTest {

    private Rectangular Area = null;
    private Rectangular Circomference = null;

    public RectangularTest() {
    }

    @BeforeEach
    public void before() {
        this.Area = new Rectangular();
        this.Circomference = new Rectangular(3.0,2.0,3.0,2.0);
    }

    @Test
    public void computeAreaTest() {
        Assertions.assertEquals(this.Area.computeArea(), 6.0, 0.01);
    }

    @Test
    public void ComputeCircumfurenceTest() {
        Assertions.assertEquals(this.Circomference.comupteCircumference(), 10.0, 0.01);
    }
}
