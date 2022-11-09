package org.example;

import java.util.*;

public class p1 {
    public static void main(String[] args) {
        int arr[] = {9,1,5,6,4,3,21,5,6,7,8,5,1,3,4,2};
//        System.out.println(longestSeqInt(arr));
        TMap<Integer,String> map = new TMap<>();
        map.put(12,"Dan");
        map.put(23,"tshim");
        System.out.println(map.get(12));
        System.out.println(map.get(23));
        System.out.println(Singleton.getInstance());
        System.out.println(Singleton.getInstance());
        System.out.println(isValid("([{{])"));
    }
    public static int numberOfRepeatingCharacter(String s) {
        Set<Character> set = new HashSet<>(); int sLen = s.length();
        int count = 0;
        for(int i = 0; i < sLen; i++){
            if(!set.add(s.charAt(i))) count++;
        }
        return count;
    }
    public static boolean isValid(String s){
        Stack<Character> st = new Stack<>();
        char[] c = s.toCharArray();
        for(char e : c) {
            if(e == '(') st.push(')');
            else if(e == '[') st.push(']');
            else if(e == '{') st.push('}');
            else if(st.isEmpty() || st.pop() != e)
                return false;
        }
        return st.isEmpty();
    }
//    public static Map<Integer,List<Integer>> longestSeqInt(int arr[]){
//        int max  = Integer.MIN_VALUE;
//        List<Integer>  list = new ArrayList<>();
//        Map<Integer,List<Integer>> result = new HashMap<>();
//        Map<Integer,List<Integer>> map = new HashMap<>();
//        list.add(arr[0]);
//        map.put(1,list);
//        result = helper(arr,0,1,max, list,map);
//        return result;
//    }
//    public static Map<Integer,List<Integer>> helper(int arr[], int count, int index, int max, List<Integer> list, Map<Integer,List<Integer>> map) {
//        if(index == arr.length-1) return map;
//        if(list.get(list.size()-1) <= arr[index]) {
//            list.add(arr[index]);
//            max= Math.max(max,list.size());
//            map.put(list.size(),list);
//            return helper(arr, count + 1, index + 1,max,list,map);
//        }
//        else {
//            List<Integer> temp = new ArrayList<>();
//            temp.add(arr[index]);
//            map.put(1,temp);
//            return helper(arr, 0, index + 1, max, temp,map);
//        }
        //{9,1,5,6,4,3,21,5,6,7,8,5,1,3,4,2}
        //9
    //}

}
