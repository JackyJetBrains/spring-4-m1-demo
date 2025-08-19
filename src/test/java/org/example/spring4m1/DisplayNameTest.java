package org.example.spring4m1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test class showing the @DisplayName annotation.")
class DisplayNameTest {

    @Test
    @DisplayName("Our system under test says hello.")
    void testHello() {}

    @Test
    @DisplayName("🥺")
    void testTalking() {}

    @Test
    void testBye() {}
}