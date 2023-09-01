package com.epam.mjc.collections.map;

import java.util.HashMap;
import java.util.Map;

public class WordRepetitionMapCreator {
    public Map<String, Integer> createWordRepetitionMap(String sentence) {
        Map<String, Integer> map = new HashMap<>();
        if (!sentence.equals("")) {
            String[] words = sentence.replaceAll("[^a-zA-Z ]", "").toLowerCase().split(" ");
            for (String word : words) {
                int value = 1;
                if (map.containsKey(word)) {
                    map.replace(word, map.get(word) + 1);
                } else {
                    map.put(word, value);
                }
            }
        }
        return map;
    }
}
