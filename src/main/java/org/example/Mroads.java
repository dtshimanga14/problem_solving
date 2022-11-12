package org.example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Mroads {
    public static void main(String[] args) {
        System.out.println(groupAnagramm(Arrays.asList("eat", "tea", "ate", "bat", "tab", "nab")));
        int arr[] = {13,4,5,3,0,12};
        String str = "geeksforgeeks";
        int index = firstNonRepeatedChar(str);
        System.out.println(str.charAt(index));

    }
    //First Non-Repeated Character in the string
    public static int firstNonRepeatedChar(String s){
        int sLen = s.length();
        int arr[] = new int[26];

        for(int i = 0; i < sLen; i++)
            arr[s.charAt(i)-'a']++;

        for(int i = 0; i < sLen; i++) {
            if(arr[s.charAt(i)-'a'] == 1)
                return i;
        }
        return -1;
    }
    public static int secondSmallest(int arr[]) {
        int arrLen = arr.length;
        //[2,2,4,5,0,12]
        for(int i = 1; i < arrLen; i++){
            int j = i-1; int temp = arr[i];
            for(; j >= 0 && arr[j] > temp;j--)
                arr[j+1] = arr[j];
            arr[j] = temp;
        }
//        for(int i = 0; i < arrLen; i++){
//            for(int j = 0; j < arrLen-1-i;j++) {
//                if(arr[j] > arr[j+1])
//                    swap(arr,j,j+1);
//            }
//        }
        return arr[1];
    }
    public static void swap(int arr[], int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    // Longest uniform substrings
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
    //Reversing  String
    public static String reverse(String s){

        StringBuilder str = new StringBuilder();
        int strLen = s.length();

        for(int i = strLen-1; i >= 0; i--)
            str.append(s.charAt(i));

        return str.toString();
    }
}
