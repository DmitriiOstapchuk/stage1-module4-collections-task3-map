package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class FunctionValueFinder {
    public boolean isFunctionValuePresent(List<Integer> sourceList, int requiredValue) {
        Map<Integer, Integer> functionMap = calculateFunctionMap(sourceList);
        boolean isPresent = false;
        Iterator<Integer> iterator = functionMap.values().iterator();
        while (iterator.hasNext()) {
            if(iterator.next() == requiredValue) {
                isPresent = true;
                break;
            }
        }
        return isPresent;
    }

    private Map<Integer, Integer> calculateFunctionMap(List<Integer> sourceList) {
        Map <Integer, Integer> result = new HashMap<>();
        for (Integer number : sourceList) {
            Integer value = 5 * number + 2;
            result.put(number, value);
        }
        return result;
    }
}
