package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class KeyValueSwapper {
    public Map<String, Integer> swap(Map<Integer, String> sourceMap) {
        Map<String, Integer> result = new HashMap<>();
        Iterator <Integer> iterator = sourceMap.keySet().iterator();
        while (iterator.hasNext()) {
            Integer key = iterator.next();
            String value = sourceMap.get(key);
            if (result.containsKey(value)) {
                if (key > result.get(value)) {

                } else {
                    result.put(value, key);
                }
            } else {
                result.put(value, key);
            }
        }
        return result;
    }
}
