

package com.Stackroute.PE5;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class KeyValueModifierTest {

    KeyValueModifier keyValueModifier;

    @Before
    public void setUp() throws Exception {
        keyValueModifier = new KeyValueModifier();
    }

    @After
    public void tearDown() throws Exception {
        keyValueModifier = null;
    }

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    /**
     * Test - changeValues()
     * Check if the method returns NullPointerException with a message
     * when null is passed.
     */
    @Test
    public void givenNullShouldReturnNulPointerException() {
        expectedException.expect(NullPointerException.class);
        keyValueModifier.modifyingkeyValues(null);
    }

    /**
     * Test - changeValues()
     * Given input with keys as val1 and val2 return Map with updated values.
     */
    @Test
    public void givenMapShouldReturnNewMapWithChangedValues() {
        Map<String, String> inputMap = new HashMap<>();
        inputMap.put("val1", "java");
        inputMap.put("val2", "c++");
        Map<String, String> expectedResult = new HashMap<>();
        expectedResult.put("val1", " ");
        expectedResult.put("val2", "java");
        assertEquals("givenMapShouldReturnNewMapWithChangedValues: check changeValues().",
                expectedResult, keyValueModifier.modifyingkeyValues(inputMap));
    }

    /**
     * Test - changeValues()
     * Given input with keys as val01 and val02 return same map as input map.
     */
    @Test
    public void givenMapWithDifferentKeysShouldReturnSameMap() {
        Map<String, String> inputMap = new HashMap<>();
        inputMap.put("val01", "java");
        inputMap.put("val02", "c++");
        assertEquals("givenMapWithDifferentKeysShouldReturnSameMap: check changeValues().",
                inputMap, keyValueModifier.modifyingkeyValues(inputMap));
    }
}