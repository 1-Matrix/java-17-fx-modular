package com.example.graphics;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CircleTest {

    public class CircleTest {

        private Circle rad = null;

        public CircleTest() {
        }

        @BeforeEach
        public void before() {
            this.rad = new Circle(3.0 , 3.0 , 3.0);
        }

        @Test
        public void computeAreaTest() {
            Assertions.assertEquals(this.rad.computeArea(), 28.27, 0.01);
        }

        @Test
        public void ComputeCircumfurenceTest() {
            Assertions.assertEquals(this.rad.comupteCircumference(), 18.84, 0.01);
        }
    }
}
