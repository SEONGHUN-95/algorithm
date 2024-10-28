package org.solutions.leetcode;

// 1. 정렬 때려서 같은지 확인
// 2. 두번 훑어서 map의 key,value 같은지 확인

import java.util.HashMap;
import java.util.Map;

class Anagram {
    public boolean isAnagram(String s, String t) {
        Map<Character, Integer> sMap = new HashMap<>();
        Map<Character, Integer> tMap = new HashMap<>();
        if (s.length() != t.length()) return false;
        for (int i = 0; i < s.length(); i++) {
            sMap.put(s.charAt(i), sMap.getOrDefault(s.charAt(i), 0) + 1);
            tMap.put(t.charAt(i), tMap.getOrDefault(t.charAt(i), 0) + 1);
        }
        if (sMap.equals(tMap)) return true;
        else return false;
    }
}