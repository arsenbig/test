// src/test/java/com/example/AppTest.java
package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    @Test
    public void testApp() {
        assertEquals("Hello, Docker!", App.getMessage());
    }
}
