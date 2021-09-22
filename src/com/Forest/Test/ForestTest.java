package com.Forest.Test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ForestTest {

    Deciduous deciduous;
    Coniferous coniferous;

    @BeforeEach
    void setUp() {
        deciduous = new Deciduous();
        coniferous = new Coniferous();
    }

    @Test
    @DisplayName("Testing")
    void test() {
        assertEquals(1, coniferous.getNutrient());
        assertEquals(1, deciduous.getNutrient());
    }
}