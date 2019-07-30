package com.Stackroute.PE5;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OccurenceMapper {
    public Map<String,Integer> findingAndMappingOccurencesOfString(String inputString){

//        Checking if given String is empty or null
    if (inputString==null || inputString=="" || inputString.isBlank())
        throw new NullPointerException("Empty or Blank string given.");
//        Creating a Map<String,Integer> for storing ouptut
        Map<String,Integer> outputMap = new HashMap<String, Integer>();

//        Regular Expression as Single group -> () Stored in a String
        final String regex="([^\\W_]+)";

//        Assign Regex to Pattern object
        final Pattern pattern=Pattern.compile(regex);

//        Match the inputString with Pattern
        Matcher match=pattern.matcher(inputString);

//        When match finds pattern, Stores in a Group and It goes into the loop
        while (match.find()){

//            Check if group element is present as Key or Not, If Yes, Increase value by 1
            outputMap.computeIfPresent(match.group(1),(k,v)->v+1);

//            If not, Set Ket and Value
            outputMap.putIfAbsent(match.group(1),1);
        }
        return outputMap;
    }
}
