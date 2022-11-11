package org.example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Mroads {
    public static void main(String[] args) {
        System.out.println(groupAnagramm(Arrays.asList("eat", "tea", "ate", "bat", "tab", "nab")));
        System.out.println(getLongestUniformSubStr("aabbcccccccc"));

    }
    public static List<Integer> getLongestUniformSubStr(String s) {

        int sLen = s.length();
        int start = 0; int end = 0;
        int currStart = 0; int currEnd = 0;
        int max = Integer.MIN_VALUE;
        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < sLen; i++){
            if(s.charAt(currStart) != s.charAt(i))
                currStart = i;
            if(i - currStart > max) {
                max = i - currStart;
                start = currStart; end = i;
            };
        }
        list.add(start); list.add(max+1);

        return list;
    }
    public static String sortString(String s) {
        char c[] = s.toCharArray();
        Arrays.sort(c);
        return new String(c);
    }
    public static Map<String,List<String>> groupAnagramm(List<String> list) {
        Map<String,List<String>> map = new HashMap<>();
        int size = list.size();

        for(int i = 0; i < size; i++){
            String currStr = list.get(i); String key = sortString(currStr);
            if(map.containsKey(key)) {
                List<String> temp = map.get(key);
                temp.add(currStr);
                map.put(key,temp);
            }else {
                map.put(key,new ArrayList<>(){{
                    add(currStr);
                }});
            }
        }
        return map;
    }
    public static List<Character> pangram(String s) {
        int arr[] = new int[26];
        int sLen = s.length();
        for(int i = 0; i < sLen; i++) {
            arr[(s.charAt(i)-'a')]++;
        }
        List<Character> result = new ArrayList<>();
        for(int i = 0; i < 26; i++){
            if(arr[i] == 0)
                result.add((char)(i+97));
        }
        return result;
    }
    public static void longestSubstringPalindrome(String s, Map<Integer,String> map){
        if(s.length() == 0) return;
        if(s.length() == 1 ||isPalindrome(s)) {
            map.put(s.length(),s);
        }
        longestSubstringPalindrome(s.substring(0,s.length()-1),map);
        longestSubstringPalindrome(s.substring(1),map);

    }
    public static boolean isPalindrome(String s){
        int left = 0; int right = s.length()-1;
        while(left <= right) {
            if(s.charAt(left) != s.charAt(right))
                return false;
            left++; right--;
        }
        return true;
    }
}
