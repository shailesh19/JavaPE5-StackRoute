package com.Stackroute.PE5;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ArrayElementRepeatCounterTest {
    ArrayElementRepeatCounter arrayElementRepeatCounter;

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Before
    public void setUp() throws Exception {
        arrayElementRepeatCounter = new ArrayElementRepeatCounter();
    }

    @After
    public void tearDown() throws Exception {
        arrayElementRepeatCounter = null;
    }

    /**
     * Test - checkOccurrences()
     * Should throw NullPointerException when null is passed.
     */
    @Test
    public void givenNullShouldThrowNullPointerExceptionWithMessage() {
        expectedException.expect(NullPointerException.class);
        arrayElementRepeatCounter.checkingOccurrences(null);
    }

    /**
     * Test - checkOccurrences()
     * Should throw NullPointerException when empty array is passed.
     */
    @Test
    public void givenArrayOfSizeZeroShouldThrowNullPointerExceptionWithMessage() {
        expectedException.expect(NullPointerException.class);
        expectedException.expectMessage("Empty array given.");
        arrayElementRepeatCounter.checkingOccurrences(new String[]{});
    }

    /**
     * Test - checkOccurrences()
     * Given input array should return a HashMap.
     */
    @Test
    public void givenStringArrayShouldReturnHashMap() {
        Map<String, Boolean> expectedResult = new HashMap<>();
        expectedResult.put("a", true);
        expectedResult.put("b", false);
        expectedResult.put("c", true);
        expectedResult.put("d", false);
        String[] inputArray = {"a", "b", "c", "d", "a", "c", "c"};
        assertEquals("givenStringArrayShouldReturnHashMap: check checkOccurrences(). Should return a hashmap.",
                expectedResult, arrayElementRepeatCounter.checkingOccurrences(inputArray));
    }

    /**
     * Test - checkOccurrences()
     * Given input array of size 1, Method should not return null.
     */
    @Test
    public void givenArrayWithOneStringShouldNotReturnNull() {
        String[] inputArray = {"a", "b", "c", "d", "a", "c", "c"};
        assertNotNull("givenArrayWithOneStringShouldNotReturnNull: check checkOccurrences(). Should return a hashmap.",
                arrayElementRepeatCounter.checkingOccurrences(inputArray));
    }

}