package com.Stackroute.PE5;

import java.util.HashMap;
import java.util.Map;

public class ArrayElementRepeatCounter {
    public Map<String,Boolean> checkingOccurrences(String[] inputArray){
//        Checking whether Input is null or empty
        if (inputArray==null || inputArray.length <= 0)
            throw new NullPointerException("Empty array given.");


        //        Creating a Map<String,Integer> for storing ouptut
        Map<String,Boolean> outputMap=new HashMap<>();
//
//       Assigning each Array element into map based on presence in the Map
        for(String s:inputArray){
            outputMap.computeIfPresent(s,(k,v)->v=true);
            outputMap.putIfAbsent(s,false);

        }

//        Returning Output in Map
        return outputMap;


    }
}
