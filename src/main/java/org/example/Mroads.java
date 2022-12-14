package org.example;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Mroads {
    public static void main(String[] args) {
        //System.out.println(groupAnagramm(Arrays.asList("eat", "tea", "ate", "bat", "tab", "nab")));

        System.out.println(EditDistance("wade","fade"));
    }
    public static int EditDistance(String s1, String s2){
        //Distance between two strings
//        Levenshtein distance, like Hamming distance, is the smallest number of edit operations required
//        to transform one string into the other.
//        Given two strings, the Levenshtein distance between them is the minimum
//        number of single-character edits (insertions, deletions, or substitutions) required to change
//        one string into the other.

        int comChar = commonChars(s1,s2);
        int s1Len = s1.length(); int s2Len = s2.length();
        int res = s1Len-comChar + s2Len-comChar;
        return res;
    }
    public static int commonChars(String s1, String s2){
        return commonCharsHelper(s1,s2,0,0,0);
    }
    public static int commonCharsHelper(String s1, String s2, int index1, int index2,int count){
        if(index1 >= s1.length() || index2 >= s2.length())
            return count;
        if(s1.charAt(index1) == s2.charAt(index2))
            return commonCharsHelper(s1,s2,index1+1,index2+1,count+1);
        int count1 = commonCharsHelper(s1,s2,index1,index2+1,count);
        int count2 = commonCharsHelper(s1,s2,index1+1,index2,count);

        return Math.max(count1,count2);

    }
    public static int[][] pascalTriangle(int n){
//        ii.  Pascals Triangle Implementation
        int arr[][] = new int[n+1][n+1];
        for(int i = 0; i <= n; i++){
            for(int j = 0; j <= i; j++){
                arr[i][j] = combination(i,j);
            }
        }
        return arr;
    }
    public static int combination(int n, int p){
        return factoriel(n)/(factoriel(n-p)*factoriel(p));
    }
    public static int factoriel(int n){
        int arr[] = new int[n+1];
        arr[0] = 1;

        for(int i = 1; i <= n; i++){
            arr[i] = i*arr[i-1];
        }
        return arr[n];
    }
    public static List<Integer> removeDuplicate(int arr[]){
        //Remove duplicate from an array
        Set<Integer> set = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        int arrLen = arr.length;
        for(int i = 0; i < arrLen; i++){
            if(set.add(arr[i]))
                result.add(arr[i]);
        }
        return result;
    }
    public static String shortestPalindrome(String s){
//        You to find the shortest palindrome string by adding 0 or more characters on
//        the right side of the string.
//        for example:
//        string is java then answer would be avajava
//        string is enm then mnemn
//        string is aavaa then aavaa
        if(isPalindrome(s)) return s;
        StringBuilder str = new StringBuilder(s);
        int end = s.length()-1; int start = 0;
        int offset = 0;
        while(start <= end){
            if(s.charAt(start) != s.charAt(end)) {
                str.insert(offset++,s.charAt(end));
            }else start++; end--;
        }
        return str.toString();
    }
    public static int leastRecentOccurence(int arr[]){
        int arrLen = arr.length;
        Map<Integer,Integer> map = new HashMap<>();
        int least = Integer.MAX_VALUE;

        for(int i = 0; i < arrLen; i++){
            if(map.containsKey(arr[i])){
                int value = map.get(arr[i])+1;
                map.put(arr[i],value);
            } else map.put(arr[i],1);
        }
        for(Map.Entry<Integer,Integer> e : map.entrySet())
            least = Math.min(e.getValue(),least);

        int res = Integer.MAX_VALUE;
        loop : for(int i = 0; i < arrLen; i++){
            if(map.get(arr[i]) == least) {
                res = arr[i];
                break loop;
            }
        }
        return res;
    }
    public static String commonWord(String s){
          String sArray[] = s.split(" ");
          Map<String,Integer> map = new HashMap<>();
          int size = sArray.length;

          for(int i = 0; i < size; i++){
              if(map.containsKey(sArray[i])) {
                  int value = map.get(sArray[i]);
                  map.put(sArray[i],value+1);
              }else map.put(sArray[i],1);
          }
          int max = Integer.MIN_VALUE; String word = "";
          for(Map.Entry<String,Integer> e : map.entrySet()){
              int value = e.getValue();
              if(value > max) {
                  word = e.getKey(); max = value;
              }
          }
          return word;
    }
    public static int changeCoin(int coins[], int amount){
        int dp[] = new int[amount+1]; int coinsLen = coins.length;
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[0] = 0;
        for(int i = 0; i <= amount; i++){
            for(int j = 0; j < coinsLen; j++)
                if(i-coins[j]>= 0)
                    dp[i] = Math.min(1+dp[i-coins[j]],dp[i]);
        }
        return dp[amount];
    }
    public static List<List<Integer>> cheapestPrice(List<List<Integer>> prices) {
//        Find the cheapest price. Prices are given as intervals: (start-time, end-time, price)
//        [(1,5,20), (3,8,15),(7,10,8)]
//        Result: [(1,3,20), (3,7,15),(7,10,8)]

        Collections.sort(prices,(a,b)-> a.get(0) - b.get(0));
        List<List<Integer>> result = new ArrayList<>(); int size = prices.size();
        Map<Integer,Integer> bestPrices = new HashMap<>();

        for(int i = 0; i < size; i++){
            int start = prices.get(i).get(0);
            int end =  prices.get(i).get(1);
            int price = prices.get(i).get(2);

            for(int j = start; j <= end; j++) {
                if(!bestPrices.containsKey(j) ||
                (bestPrices.containsKey(j) && bestPrices.get(j) > price) )
                    bestPrices.put(j,price);
            }
        }
        for(int i = 0; i < size-1; i++){
            List<Integer> temp = new ArrayList<>();
            int start = prices.get(i).get(0);
            temp.add(start);
            int end = Math.min(prices.get(i+1).get(0),prices.get(i).get(1));
            temp.add(end);
            temp.add(bestPrices.get(start));
            result.add(temp);
        }

        List<Integer> temp = new ArrayList<>();
        int start = Math.min(prices.get(size-1).get(0),prices.get(size-2).get(1));
        int end = prices.get(size-1).get(1);
        temp.add(end);  temp.add(bestPrices.get(start)); temp.add(start);
        result.add(temp);

        return result;
    }
    public static int secondSmallest(int arr[], int k) {
        //Find the second small element
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
        //xiii. Run Length Encoding
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
        //xiii. Run Length decoding
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
        //Is power of 10
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
        // xii. Square Root calculator
        if(n == 0 || n == 1) return n;
        int i = 1; int result = 1;
        while (result <= n){
            i++; result = i*i;
        }
        return i-1;
    }
    public static double medianOfTwoArray(int arr1[], int arr2[]) {
        //Median Two Sorted Arrays.
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
        //find Missing letters (from a given sentence we need to find missing characters)

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
//        8. From a two-dimensional array containing student names and their grades,
//        find the average grades ( Best Average Problem)
//        input: [["Mark", "70"], ["Alex", "60"], ["Alex", "62"], ["Stephen", "75"]
//        output: ["Stephen", "75"]
        int len = students.length;
        int max = Integer.valueOf(students[0][1]);
        int best = 0;

        for(int i = 0; i < len; i++) {
            int cur = Integer.valueOf(students[i][1]);
            if(cur > max) best = i;
        }

        return students[best];
    }
    public static char firstUniqueCharacter(String s){
//        4. For a given string, find the first unique character. I gave 2 solutions
//        a.with extra space, linear time
//        b.no extra space, but in quadratic time.

        int alphabet[] = new int[26];
        String str = s.toLowerCase();
        int sLen = s.length(); int index = -1;

        for(int i = 0; i < sLen; i++)
            alphabet[str.charAt(i)-'a']++;

        outer : for(int i = 0; i < sLen; i++){
            if(alphabet[str.charAt(i)-'a'] == 1) {
                index = i;
                break outer;
            }
        }
        return str.charAt(index);
    }
    public static int firstNonRepeatedChar(String s){
        //First Non-Repeated Character in the string
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
        //iv.  Longest uniform substrings
//        7. Find the starting position and the length of the longest uniform
//        substring from a string.
//                input: "abbbbccddd"
//        output : [1, 4]
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
//        6. From a list of strings, group the anagrams together
//        Input : [???eat???, ???tea???, ???ate???, ???bat???, ???tab???, ???nab???]
//        Output : [[???nab???], [???bat???,???tab???], [???eat???,???ate???,???tea???]]
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
       // a sentence or verse that contains all the letters of the alphabet
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
//        i.  Reversing  String
        StringBuilder str = new StringBuilder();
        int strLen = s.length();

        for(int i = strLen-1; i >= 0; i--)
            str.append(s.charAt(i));

        return str.toString();
    }
    public static String numberToRoman(int number) {
        //vi. Decimal Conversion problem
        String I[] = {"","I","II","III","IV","V","VI","VII","VIII","IX"};
        String X[] = {"","X","XX","XXX","XL","L","LX","LXX","LXXX","XC"};
        String C[] = {"","C","CC","CCC","CD","D","DC","DCC","DCCC","CM"};
        String M[] = {"","M","MM","MMM"};

        return M[number/1000] + C[(number%1000)/100] +
                X[(number%100)/10] + I[(number)%10];
    }

    public static int romanToNumber(String s) {
        //vi. Decimal Conversion problem
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
    public static Map<Integer,List<Integer>> longestSeqInt(int arr[]){
        int max  = Integer.MIN_VALUE;
        List<Integer>  list = new ArrayList<>();
        Map<Integer,List<Integer>> result = new HashMap<>();
        Map<Integer,List<Integer>> map = new HashMap<>();
        list.add(arr[0]);
        map.put(1,list);
        result = helper(arr,0,1,max, list,map);
        return result;
    }
    public static Map<Integer,List<Integer>> helper(int arr[], int count, int index, int max, List<Integer> list, Map<Integer,List<Integer>> map) {
        if(index == arr.length-1) return map;
        if(list.get(list.size()-1) <= arr[index]) {
            list.add(arr[index]);
            max= Math.max(max,list.size());
            map.put(list.size(),list);
            return helper(arr, count + 1, index + 1,max,list,map);
        }
        else {
            List<Integer> temp = new ArrayList<>();
            temp.add(arr[index]);
            map.put(1,temp);
            return helper(arr, 0, index + 1, max, temp,map);
        }
    }
    public static void printArray(int arr[][]){
        int arrLen = arr.length;
        for(int i = 0; i < arrLen; i++){
            for(int j = 0; j < arrLen; j++){
                System.out.print(" "+ arr[i][j]);
            }
            System.out.println();
        }
    }
//    Given a list of currency exchange rates like this:
//    EUR/USD => 1.2
//    USD/GBP => 0.75
//    GBP/AUD => 1.7
//    AUD/JPY => 90
//    GBP/JPY => 150
//    JPY/INR => 0.6
}
