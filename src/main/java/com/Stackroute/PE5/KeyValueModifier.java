package com.Stackroute.PE5;

import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

public class KeyValueModifier {
    public Map<String,String> modifyingkeyValues(Map<String,String> inputMap){


//        Using AtomicReference variable for exchanging of Keyvalues which updates intial and current values and
//        returns current updated value( We can do it by Private variables also)
        AtomicReference<String> valueRef=new AtomicReference("");
        inputMap.computeIfPresent("val1",(k,v)->{
//            Setting value to Key1value
            valueRef.set(v);
            v=" ";
            return v;
        });
//        Getting current value from Atomic reference variable
        inputMap.computeIfPresent("val2",(k,v)->v=valueRef.get());
        return inputMap;
    }
}
