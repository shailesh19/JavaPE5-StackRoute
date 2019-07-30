
package com.Stackroute.PE5;

import com.Stackroute.PE5.OccurenceMapper;
import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class OccurenceMapperTest {

    OccurenceMapper occurenceMapper;

    @Before
    public void setUp() throws Exception {
        occurenceMapper = new OccurenceMapper();
    }

    @After
    public void tearDown() throws Exception {
        occurenceMapper = null;
    }

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    /**
     * Test - countWords()
     * When null is given method should throw NullPointerException
     */
    @Test
    public void givenNullStringShouldThrowNullPointerException() {
        expectedException.expect(NullPointerException.class);
        occurenceMapper.findingAndMappingOccurencesOfString(null);
    }

    /**
     * Test - countWords()
     * Should throw NullPointerException with an error message when a empty string is given
     */
    @Test
    public void givenEmptyStringShouldReturnNullPointerExceptionWithErrorMessage() {
        expectedException.expect(NullPointerException.class);
        expectedException.expectMessage("Empty or Blank string given.");
        occurenceMapper.findingAndMappingOccurencesOfString("");
    }

    /**
     * Test - countWords()
     * Should throw NullPointerException with an error message when a blank string is given
     */
    @Test
    public void givenBlankStringShouldReturnNullPointerExceptionWithErrorMessage() {
        expectedException.expect(NullPointerException.class);
        expectedException.expectMessage("Empty or Blank string given.");
        occurenceMapper.findingAndMappingOccurencesOfString("  ");
    }

    /**
     * Test - countWords()
     * Given string should return Map containing word and it's count.
     */
    @Test
    public void givenStringShouldReturnMapWithWordCount() {
        Map<String, Integer> expectedWordCount = new HashMap<>();
        expectedWordCount.put("one", 5);
        expectedWordCount.put("two", 2);
        expectedWordCount.put("three", 2);
        assertEquals("givenStringShouldReturnMapWithWordCount: check countWords(). Should return word count as map.",
                expectedWordCount, occurenceMapper.findingAndMappingOccurencesOfString("one one -one___two,,three,one @three*one?two"));
    }

    @Test
    public void givenStringShouldReturnMapFailure() {
        Map<String, Integer> expectedWordCount = new HashMap<>();
        expectedWordCount.put("one", 5);
        expectedWordCount.put("two", 5);
        expectedWordCount.put("three", 5);
        assertNotEquals("givenStringShouldReturnMapFailure: check countWords(). Should return word count as map.",
                expectedWordCount, occurenceMapper.findingAndMappingOccurencesOfString("one one -one___two,,three,one @three*one?two"));
    }
}