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
        assertNull(deciduous.produceOxygen(new Object(), new Object()));
        assertNull(coniferous.produceOxygen(new Object(), new Object()));
        assertEquals("Needle", deciduous.leafType());
        assertEquals("leaf", coniferous.leafType());
        coniferous.TakingNutrientsFromTheSoil((Integer) 1);
        deciduous.TakingNutrientsFromTheSoil((Integer) 1);
        assertEquals(1, coniferous.getNutrient());
        assertEquals(1, deciduous.getNutrient());
    }
}