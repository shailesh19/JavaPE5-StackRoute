package com.Stackroute.PE5;

import java.util.*;

public class SetSorter {
    public List<String> sortingElements(String inputString){
//        Checking whether inputString is empty
        if (inputString=="" || inputString.isBlank())
            throw new NullPointerException();
        List<String> outputList=new ArrayList<>();

//        Tree Set is sorted ordered Set in which Elements inserted are auotomatically Sorted
        Set<String> inputSet=new TreeSet<>();

//      Extracting Names in the String to TreeSet
            inputSet.addAll(Arrays.asList(inputString.split(" ")));

//      Assigning Elements to Output List From Set
        for (String s:inputSet) {
            outputList.add(s);
        }

        return outputList;




    }
}
