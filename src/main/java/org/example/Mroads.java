package org.example;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Mroads {
    public static void main(String[] args) {
        //System.out.println(groupAnagramm(Arrays.asList("eat", "tea", "ate", "bat", "tab", "nab")));

//        String str = "geeksforgeeks";
//        int index = firstNonRepeatedChar(str);
//        System.out.println(str.charAt(index));
//        String s[][] = {{"Mark", "70"}, {"Alex", "60"}, {"Alex", "62"}, {"Stephen", "75"}};
//
//
//        //System.out.println(bestAverage(s)[0] + " : " + bestAverage(s)[1]);
//        System.out.println(findMissingLetters("daniel kassampu tshimanga"));
//        int arr1[] = {1,2}; int arr2[] = {3,4};
//        double res = medianOfTwoArray(arr2,arr1);
//        System.out.println(isPower(2,5));
//        System.out.println(factorPrimeNumber(9));
//
//        Map<Integer,String> map1 = new HashMap<>();
//        Map<Integer,String> map = Collections.synchronizedMap(map1);
//
//        map.put(12,null);
        int arr[] = {13,4,5,1,2,12};
        //int arr[] = {1,2,13,4,5,12};
        System.out.println(secondSmallest(arr,6));
    }
    public static int secondSmallest(int arr[], int k) {
        int arrLen = arr.length;
        loop : for(int i = 0; i < arrLen; i++){
            for(int j = arrLen-1; j >= i; j--){
                if(i == k) break loop;
                if(j-1 >= 0 && arr[j-1] > arr[j])
                    swap(arr,j-1,j);
            }
        }
        return arr[k-1];
    }
    public static List<Integer> factorPrimeNumber(int n) {
        int num = n;
        List<Integer> primes = new ArrayList<>(){{ add(1); }};
        while(num > 1){
            if(num % 2 == 0) {
                primes.add(2); num /= 2;
            } else {
               int least = leastOddPrime(num);
                num /= least; primes.add(least);
            }
        }
        return primes;
    }

    private static int leastOddPrime(int n) {
        int num = 3;
        while(num <= n){
            if(n% num == 0)
                return num;
            num = num+2;
        }
        return n;
    }

    public static String runLengthEncoding(String s){
        int sLen = s.length(); StringBuilder str = new StringBuilder();
        int i = 0;
        while(i < sLen){
            int j = i; int count = 0;
            while(j < sLen && s.charAt(i) == s.charAt(j)) {
                count++; j++;
            }
            str.append(s.charAt(i)).append(count);
            i = j;
        }
        return str.toString();
    }
    public static String runLengthDecoding(String s){
        StringBuilder str = new StringBuilder();
        int sLen = s.length();
        for(int i = 0; i < sLen; i = i+2){
            int count = 0;
            while(count < ((int)s.charAt(i+1) -'0')) {
                str.append(s.charAt(i));
                count++;
            }
        }
        return str.toString();
    }
    //Is n power of k
    public static boolean isPower(int n, int k){
        if(n == k) return true;
        //if(n == 0 && k != 0) return false;
        int prod = n; int exp =1;
        while(prod <= k){
            exp++; prod *= prod;
        }
        return Math.pow(n,exp-1)-k != 0 ? false : true;
    }
    //Square Root calculator
    public static int squareRoot(int n){
        if(n == 0 || n == 1) return n;
        int i = 1; int result = 1;
        while (result <= n){
            i++; result = i*i;
        }
        return i-1;
    }
    public static double medianOfTwoArray(int arr1[], int arr2[]) {
        Arrays.sort(arr1); Arrays.sort(arr2);
        int arrLen1 = arr1.length; int arrLen2 = arr2.length;
        int m = 0; int n = 0;

        int totalLen = arrLen1 + arrLen2;
        double arr[] = new double[totalLen]; int i = 0;

        while(m < arrLen1 && n < arrLen2) {
            if(arr1[m] < arr2[n])
                arr[i++] = arr1[m++];
            else arr[i++] = arr2[n++];
        }
        while(m < arrLen1)  arr[i++] = arr1[m++];
        while(n < arrLen2)  arr[i++] = arr2[n++];

        return arr.length % 2 == 0 ?
          (arr[(totalLen/2)-1] + arr[(totalLen/2)])/2 : arr[(totalLen/2)];
    }
    public static List<Character> findMissingLetters(String s){
         int sLen = s.length();
        String str[] = s.split(" ");
        StringBuilder nStr = new StringBuilder();

        for(int i = 0; i < str.length; i++)
            nStr.append(str[i]);

        String ns = nStr.toString(); int nsLen = ns.length();
        List<Character> list = new ArrayList<>();
        int alphabet[] = new int[26];

        for(int i = 0; i < nsLen; i++){
           alphabet[ns.charAt(i)-'a']++;
        }
        for(int i = 0; i < 26; i++){
            if(alphabet[i] == 0){
                list.add((char) (i+97));
            };
        }
        return list;
    }
    public static String [] bestAverage(String [][] students) {
        int len = students.length;
        int max = Integer.valueOf(students[0][1]);
        int best = 0;

        for(int i = 0; i < len; i++) {
            int cur = Integer.valueOf(students[i][1]);
            if(cur > max) best = i;
        }

        return students[best];
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
