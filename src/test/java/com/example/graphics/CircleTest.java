package com.example.graphics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CircleTest {

    public class CircleTest {

        private Rectangular c = null;

        public CircleTest() {
        }

        @BeforeEach
        public void before() {
            this.c = new Rectangular();
        }

        @Test
        public void computeAreaTest() {
            Assertions.assertEquals(this.c.Area(3.0), 28.27, 0.01);
        }

        @Test
        public void ComputeCircumfurenceTest() {
            Assertions.assertEquals(this.c.Circumference(3.0), 18.84, 0.01);
        }
    }
}
