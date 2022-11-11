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

    public static String numberToRoman(int number) {
        String I[] = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
        String X[] = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String C[] = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String M[] = {"","M","MM","MMM"};

        return M[number/1000] + C[(number%1000)/100] +
                X[(number%100)/10] + I[(number)%10];
    }
    public static int romanToNumber(String s) {
        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1); map.put('V',5); map.put('X',10);
        map.put('C',100); map.put('L',50); map.put('M',1000);
        int sum = 0; int sLen = s.length();

        for(int i = 0; i < sLen-1; i++){
            if(map.get(s.charAt(i)) > map.get(s.charAt(i+1))) {
                sum += map.get(s.charAt(i));
                System.out.println(sum);
            }else sum -= map.get(s.charAt(i));
        }

        return sum+map.get(s.charAt(sLen-1));
    }
    public static int stickBottomUp(int sticks[], int stickLength) {
        int coinsLen = sticks.length;
        int res = Integer.MAX_VALUE;
        Integer dp[] = new Integer[stickLength+1];
        Arrays.fill(dp,Integer.MAX_VALUE);

        dp[0] = 0; //dp[1] = 1;
        for(int i = 0; i <= stickLength; i++){
            for(int j = 0; j < coinsLen; j++){
                if(i-sticks[j] >= 0)
                    dp[i] = Math.min(1+dp[i-sticks[j]],dp[i]);
            }
        }
        return dp[stickLength] < 0 ? -1 : dp[stickLength];
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
