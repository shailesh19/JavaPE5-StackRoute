package com.Stackroute.PE5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayElementReplacer {
    public String[] replacingElement(String[] inputString, String[] toReplace, String[] toBeReplaced){
        List<String> list=new ArrayList<>();
//        Adding Elements in List from InputString Array
        for (String s:inputString) {
            list.add(s);
        }

//        Replace elements in list with desired elements Using Collections method
        for (int i=0;i<toBeReplaced.length;i++)
            Collections.replaceAll(list,toBeReplaced[i],toReplace[i]);

//        Assigning Repalced List to String Array
        String[] ouptutString= list.toArray(new String[list.size()]);


        return ouptutString;

    }
}
