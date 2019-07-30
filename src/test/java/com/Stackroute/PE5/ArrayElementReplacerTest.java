package com.Stackroute.PE5;
import org.junit.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ArrayElementReplacerTest {
    private ArrayElementReplacer arrayElementReplacer;

    @Before
    public void setup(){
        arrayElementReplacer=new ArrayElementReplacer();
    }


    @After
    public void destroy(){
        arrayElementReplacer=null;
    }

    @Test
    public void givenArrayListShouldReturnReplacedList(){
        String[] expectedString = {"Kiwi","Grape","Mango","Berry"};

        String[] inputString={"Apple","Grape","Melon","Berry"};
        String[] toReplace={"Kiwi","Mango"};
        String[] toBeReplaced={"Apple","Melon"};
        assertEquals(expectedString,arrayElementReplacer.replacingElement(inputString,toReplace,toBeReplaced));
    }

    @Test
    public void givenArrayListWithUnEqualReplaceArraysShouldReturnReplacedList(){
        String[] expectedString = {"Kiwi","Grape","Melon","Berry"};

        String[] inputString={"Apple","Grape","Melon","Berry"};
        String[] toReplace={"Kiwi","Mango"};
        String[] toBeReplaced={"Apple"};
        assertEquals(expectedString,arrayElementReplacer.replacingElement(inputString,toReplace,toBeReplaced));
    }


    @Test(expected = NullPointerException.class)
    public void givenEmptyArrayListShouldReturn(){

        String[] inputString=null;
        String[] toReplace={"Kiwi","Mango"};
        String[] toBeReplaced={"Apple","Melon"};

        arrayElementReplacer.replacingElement(inputString,toReplace,toBeReplaced);
    }

}