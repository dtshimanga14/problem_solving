package org.example;

import java.time.LocalTime;
import java.util.*;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    Map<String,Integer> map = new HashMap<>();
    public static void main(String[] args) {
//        System.out.println("Hello world!");
//        int a[] = {1,2};
//        int b[] = {2,4,1,3};
//        int rr[][] = new int[][]{b,a};
//        String greeting1 = "ahello";
//        String greeting2 = "lheola";
//        System.out.println(isAnagramV2(greeting1,greeting2));
//        int [] w = { 2, 3, 1, 4 };
//        int [] p = { 4, 5, 3, 7 };
//        int k = 5;
////        List<List<Integer>> result =  new ArrayList<>();
////        List<Integer> list =  new ArrayList<>();
////
////        char[][] res = chessboard(5);
////        for(int i = 0; i < res.length; i++) {
////            for(int j = 0; j < res.length; j++) {
////                System.out.print(res[i][j]);
////            }
////            System.out.println();
////        }
//
//        int [] w2 = { 44,2,3,444,38,41 };
////        char arr[][] = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
//////        System.out.println(sumDividibleK(w2,3));
//////        System.out.print(mergeString("super","tower"));
////        int data[][] = {{23,4},{6,7}};
////        int res[][] = rotate90(data);
////        for(int i  = 0; i < res.length; i++) {
////            for(int j  = 0; j < res.length; j++) {
////                System.out.print(res[i][j] + " ");
////            }
////            System.out.println();
////        }
//        System.out.println(mostDigits(w2));
//        List<Person> pers = new ArrayList<>(){{
//            add(new Person("daniel","dtshimanga@gmail.com"));
//            add(new Person("chuck","dtshimanga@gmail.com"));
//            add(new Person("daniel1","dtshimanga@gmail.com"));
//            add(new Person("chuck1","dtshimanga@gmail.com"));
//        }};
//        System.out.println(
//           pers.stream().collect(Collectors.toMap(Person::getName,Person::getEmail))
//        );

//
//        List<Integer> list = Arrays.asList(10,2,34,5,7);
//        List<Integer> result = list.stream()
//                .sorted(Collections.reverseOrder())
//                .collect(Collectors.toList());
//        System.out.println(result);
//
//        Function func = (s)-> "hello function";
//        List<Integer> series = Stream.iterate(1,n-> n+1).limit(10)
//                .sorted(Collections.reverseOrder())
//                .collect(Collectors.toList());
//        System.out.println(series);
//
//        Map<String, String> books = new HashMap<>();
//        books.put("978-0201633610",
//                "Design patterns : elements of reusable object-oriented software");
//        books.put( "978-1617291999",
//                "Java 8 in Action: Lambdas, Streams, and functional-style programming");
//        books.put("978-0134685991", "Effective Java");
//
//        Optional<String> strList = books.entrySet()
//                .stream().filter(f-> f.getKey().equals("978-0134685991"))
//                .map(e -> e.getValue()).findFirst();
//        System.out.println(strList.get());

//        List<String> words = new ArrayList<>(){{
//            add("Brian");add("Nate");add("Raju");
//            add("Neal");add("Sara");add("Nora");
//        }};
//        List<String> words = Arrays.asList("Brian","Nate","Raju","Neal","Sara","Nora");
//        System.out.println(
//          (words.stream().sorted(Comparator.comparing(String::length).reversed())
//                  .collect(Collectors.toList()))
//        );
//
//        words.stream().filter(f -> f.startsWith("N"))
//                .collect(Collectors.toCollection(LinkedList::new))
//                .descendingIterator().forEachRemaining(System.out::println);

//        words.stream().filter(f -> f.length() <= 4)
//                .collect(Collectors.toCollection(LinkedList::new))
//                .descendingIterator().forEachRemaining(System.out::println);

//        words.stream()
//                .collect(Collectors.toCollection(()-> new LinkedList<>()))
//                        .descendingIterator().forEachRemaining(System.out::println);

//        Map<String,List<String>> res = words.stream()
//                .collect(Collectors.groupingBy(e -> e));
//        Optional<Integer> sum = Stream.iterate(0,n -> n+1)
//                .limit(10).max((a,b)-> a-b);
////                .reduce(0,(a,b)-> a-b);
//        System.out.println(sum.get());
//        Integer arr[][] = new Integer[][]{{1, 1, 1, 1}, {2, 3, 3}, {4, 4, 4, 5}};
//        Integer arr1[] = new Integer[]{1, 1, 1, 1, 2, 3, 3, 4, 4, 4, 5};
//        System.out.println((
//                Arrays.stream(arr).flatMap(e-> Arrays.stream(e)).reduce(0,(a,b)-> a+b)
//        ));
//
//        Optional<List<Integer>> res = findDuplicate(Arrays.asList(arr1));
//        res.ifPresent(data -> System.out.println(data));
//        int skills[] = {12,4,6,13,5,10};
//        System.out.println(sumGame(10));
//        System.out.println(buildTeam(skills,3,4,10));
        int arr1[] = {4,7,1,2,8};
        int arr2[] = {0,3,3,6,10,12};
        int r[]  = mergerSortedArrays(arr1,arr2);
//        quickSort(arr1,0,arr1.length);

        selectionSort(arr1);
        List<String> list = new ArrayList<>(){{
            add("hello");add("hello");add("world");
        }};
        //System.out.print(almostPalindrome("abcba"));
        int arr[][] = new int[][]{{1, 1, 1},
                                  {2, 5, 3},
                                  {6, 4, 7}};
        int coins[] = {1,2,3,4,5,7};

        int profits[] = {60, 100, 120};
        int profitsLength;
        int weights[] = {10, 20, 30};
        int capacity = 50;
//        int dp[] = new int[capacity+1];
//        System.out.println(knapSackFirstBottomUp(profits,weights,capacity));
        int[][] nQueens = Nqueens(5);
        printArray2D(nQueens);

//        List<String> prod1 = new ArrayList<>(){{ add("10");add("d0");add("d1"); }};
//        List<String> prod2 = Arrays.asList("15","EMPTY","EMPTY");
//        List<String> prod3 = Arrays.asList("20","d1","EMPTY");
//        List<List<String>> products = new ArrayList<>();
//        products.add(prod1);products.add(prod2);products.add(prod3);
//
//        List<String> disc1 = new ArrayList<>(){{ add("d0");add("1");add("27"); }};
//        List<String> disc2 = Arrays.asList("d1","2","5");
//        List<List<String>> discounts = new ArrayList<>();
//        discounts.add(disc1);discounts.add(disc2);
//        int [] n1 = new int[0];
//        boolean[] n2 = new boolean[-200];
//        double[] n3 = new double[2241423798];
//        findLowestPrice(products,discounts);
//        System.out.println(findLowestPrice(products,discounts));
        //Arrays integers
        System.out.println(longestSeqInt());
    }

    public static int longestSeqInt(int arr[]){
        int max  = Integer.MIN_VALUE;
        return helper(arr,0,0,max);
    }
    public static int helper(int arr[],   int count, int index,int max) {
        if(index == arr.length-2) return max;
        if(arr[index] <= arr[index+1]) {
            max= Math.max(max,count+1);
            return helper(arr, count + 1, index + 1,max);
        }
        else   return helper(arr,0,index+1,max);
        //{9,1,5,6,4,3,21,5,6,7,8,5,1,3,4,2}
    }
    public static int[][] Nqueens(int n){
        boolean status[][] = new boolean[n][n];
        int arr[][] = new int[n][n]; int row = 0;
        int arrLen = arr.length;
        while(row < arrLen){
            for(int j = 0; j < n; j++){
                 if(status[row][j] == false && isColNotBusy(status, arr,row,j)
                    && isRowNotBusy(status, arr,row,j)
                    && isPosDiagNotBusy(status, arr,row,j)
                    && isNegDiagNotBusy(status, arr,row,j)) {
                         status[row][j] = true;
                         arr[row][j] = 1;
                 } else arr[row][j] = 0;
            }
            row++;
        }
        return arr;
    }
    public static boolean isColNotBusy(boolean status[][],int arr[][], int row, int col) {
        int arrLen = arr.length;
        int bottom = col; int top = col;

        while(bottom < arrLen ) {
            if(status[bottom][col] == true)
                return false;
            bottom++;
        }
        while( top >= 0) {
            if(status[top][col] == true)
                return false;
            top--;
        }
        return true;
    }
    public static boolean isRowNotBusy(boolean status[][],int arr[][], int row, int col) {
        int arrLen = arr.length;
        int left = col; int right = col;

        while(right < arrLen ) {
            if(status[row][right] == true)
                return false;
            right++;
        }
        while( left >= 0) {
            if(status[row][left] == true)
                return false;
            left--;
        }
        return true;
    }
    public static boolean isPosDiagNotBusy(boolean status[][],int arr[][], int row, int col) {
        int arrLen = arr.length;
        int left = col; int right = col; int top = row; int bottom = row;

        while(right < arrLen && bottom < arrLen) {
            if(status[bottom][right] == true)
                return false;
            bottom++; right++;
        }
        while(top >= 0 && left >= 0) {
            if(status[top][left] == true)
                return false;
            left--; top--;
        }
        return true;
    }
    public static boolean isNegDiagNotBusy(boolean status[][],int arr[][], int row, int col) {
        int arrLen = arr.length;
        int left = col; int right = col; int top = row; int bottom = row;

        while(left >= 0 && bottom < arrLen) {
            if(status[bottom][left] == true)
                return false;
            bottom++; left--;
        }
        while(top >= 0 && right < arrLen) {
            if(status[top][right] == true)
                return false;
            right++; top--;
        }
        return true;
    }
    public static void printPosDiagnole(boolean status[][], int arr[][], int k) {
        int arrLen = arr.length;
        for(int i = 0; i < arrLen;i++) {
            for(int j = 0; j < arrLen; j++) {
                if(i+j == arrLen-1-k)
                    System.out.println(arr[i][j]);
            }
        }
    }
    public static void printNegDiagnole(boolean status[][],int arr[][], int k) {
        int arrLen = arr.length;
        for(int i = 0; i < arrLen;i++) {
            for(int j = 0; j < arrLen; j++) {
                if(i-k == j)
                    System.out.println(arr[i][j]);
            }
        }
    }
    public static void printPosDiagnole(int arr[][], int row, int col) {
        int arrLen = arr.length;
        int left = col-1; int right = col+1; int top = row-1; int bottom = row+1;

        while(right < arrLen && bottom < arrLen) {
            System.out.println(arr[bottom][right]);
            bottom++; right++;
        }
        System.out.println(arr[row][col]);
        while(top >= 0 && left >= 0) {
            System.out.println(arr[top][left]);
            left--; top--;
        }
    }
    public static void printCol(int arr[][], int row, int col) {
        int arrLen = arr.length;
        int bottom = col+1; int top = col-1;

        while(bottom < arrLen ) {
            System.out.println(arr[bottom][col]);
            bottom++;
        }
        System.out.println(arr[row][col]);
        while( top >= 0) {
            System.out.println(arr[top][col]);
            top--;
        }
    }
    public static boolean printRow(int arr[][], int row, int col) {
        int arrLen = arr.length;
        int left = col-1; int right = col+1;

        while(right < arrLen ) {
            System.out.println(arr[row][right]);
            right++;
        }
        System.out.println(arr[row][col]);
        while( left >= 0) {
            System.out.println(arr[row][left]);
            right++;
            left--;
        }
        return true;
    }
    public static void printNegDiagnole(int arr[][], int row, int col) {
        int arrLen = arr.length;
        int left = col-1; int right = col+1; int top = row-1; int bottom = row+1;

        while(left >= 0 && bottom < arrLen) {
            System.out.println(arr[bottom][left]);
            bottom++; left--;
        }
        System.out.println(arr[row][col]);
        while(top >= 0 && right < arrLen) {
            System.out.println(arr[top][right]);
            right++; top--;
        }
    }
    public static void printPosDiagnole(int arr[][], int k) {
        int arrLen = arr.length;
        for(int i = 0; i < arrLen;i++) {
            for(int j = 0; j < arrLen; j++) {
                if(i+j == arrLen-1-k)
                    System.out.println(arr[i][j]);
            }
        }
    }
    public static void printNegDiagnole(int arr[][], int k) {
        int arrLen = arr.length;
        for(int i = 0; i < arrLen;i++) {
            for(int j = 0; j < arrLen; j++) {
                if(i-k == j)
                    System.out.println(arr[i][j]);
            }
        }
    }

    public static boolean isPalindromeRec(String str){
        return isPalindromeRec(str,0,str.length()-1);
    }
    public static boolean isPalindromeRec(String str, int low,int high){
        if(str.length() == 0 || low > high) return true;
        if(str.charAt(low) == str.charAt(high)) {
            return isPalindromeRec(str,low+1,high-1);
        }
        return  false;
    }
    public static int knapSackFirstBottomUp(int weights[], int profits[], int capacity) {
        int dp[][] = new int[weights.length+1][capacity+1];

       for(int p = 0; p <= profits.length;p++) {
            for(int c = 0; c <= capacity; c++ ) {
                if(p == 0 || c == 0) dp[p][c] = 0;
                if(c-weights[p - 1] >= 0) {
                    dp[p][c] = Math.max(profits[p - 1] + dp[p - 1][c - weights[p - 1]], dp[p - 1][c]);
                }else dp[p][c] = dp[p - 1][c];
            }
        }
        return dp[weights.length][capacity];
    }
    public static int knapSackFirst(int weights[], int profits[], int capacity) {
        return knapSackFirstHelper(weights,profits,capacity,0,0);
    }
    public static int knapSackFirstHelper(int weights[], int profits[], int capacity,int index,int profit) {
        if(index == weights.length)  return profit;
        if(capacity-weights[index] >= 0) {
            int profit1 =
                    knapSackFirstHelper(weights,profits,capacity-weights[index],index+1,profit+profits[index]);
            int profit2 = knapSackFirstHelper(weights,profits,capacity,index+1,profit);
            return Math.max(profit1,profit2);
        }
        return profit;
    }
    public static int changeCoinsCountWays(int arr[], int target) {
        return dfsChangeCoinsCountWays(arr,0,target,0);
    }
    public static int dfsChangeCoinsCountWays(int arr[], int index,int target,int count){
        if(index == arr.length || target < 0)
            return count;
        if(target == 0)
            return count+1;
        return dfsChangeCoinsCountWays(arr,index+1,target-arr[index],count) +
        dfsChangeCoinsCountWays(arr,index+1,target,count);
    }
    public static int changeCoins(int coins[], int target) {
        Integer[][] dp = new Integer[target+1][target+1];
        return dfsChangeCoins(dp,coins,coins.length,target,0);
    }
    //Time complexity O(m^n)
    public static int dfsChangeCoins(Integer[][] dp,int coins[], int len, int target,int count) {
        int min = Integer.MAX_VALUE;
        if(target == 0) return count;
        if(target < 0) return Integer.MAX_VALUE;
        if(dp[target][count] != null)
            min = Math.min(min,dp[target][count]);
        else
            for(int i = 0; i < len; i++)
                min = Math.min(min,dfsChangeCoins(dp,coins,len,target-coins[i],count+1));

        return min;
    }
    public static int longSubStrRepeatingChar(String s) {
        int sLen = s.length();
        int count = 0; int max = Integer.MIN_VALUE;
        Set<Character> set = new HashSet<>();
        for(int i = 0; i < sLen; i++) {
            if(set.add(s.charAt(i))) {
                count++;
                max = Math.max(count,max);
            } else count = 1;
        }
        return max;
    }
    public static void printSpiral(int arr[][]) {
        int arrLen = arr.length;
        boolean isTrue = true;
        int top = 0; int bottom = arrLen-1;
        int left = 0; int right = arrLen-1;

        while(top <= bottom && right >= left) {
            for(int i = left; i <= right; i++){
                System.out.println(arr[top][i]);
            }
            top++;
            if(top > bottom) break;
            for(int i = top; i <= bottom; i++){
                System.out.println(arr[i][right]);
            }
            right--;
            if(right < left) break;
            for(int i = right; i >= left; i--){
                System.out.println(arr[bottom][i]);
            }
            bottom--;
            for(int i = bottom; i <= top; i++){
                System.out.println(arr[i][left]);
            }
            left++;
        }
    }
    public static void printArray2D(int arr[][]) {
        int row = arr.length; int col = arr[0].length;
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++){
                System.out.print(" " + arr[i][j]);
            }
            System.out.println();
        }
    }
    public static void printOppositeDiagnole(int arr[][]) {
        int arrLen = arr.length;
        for(int i = 0; i < arrLen; i++){
            for(int j = arr[i].length-1; j >= 0; j--){
                if((i+j) == arrLen-1)
                    System.out.println(arr[i][j]);
            }
        }
    }
    public static boolean almostPalindrome(String s) {
        int sLen = s.length();
        int low = 0; int high = sLen-1;
        while(low < high) {
            if(s.charAt(low) == s.charAt(high)) {
                low++; high--;
            }else return isPalindrome(s,low,high-1)
                    || isPalindrome(s,low+1,high);
        }
        return true;
    }
    public static boolean isPalindrome(String s, int low,int high){
        int sLen = s.length();
        while(low < high) {
            if(s.charAt(low) == s.charAt(high)) {
                low++; high--;
            } else return false;
        }
        return true;
    }
    public static int getLeastDistance(List<String> list) {
        int size = list.size(); int min = Integer.MAX_VALUE;
        for(int i = 0; i < size;i++) {
            min = Math.min(min,helper(list,0,0,list.get(i)));
        }
        return min;
    }
    public static int helper(List<String> list, int count,int index, String word) {
        if(index == list.size())
            return Integer.MAX_VALUE;
        if(list.get(index).equals(word))
            return count;
        return helper(list,count+1,index+1,word);
    }
    public static void selectionSort(int arr[]) {
        int arrLen = arr.length;
        for(int i = arrLen-1; i > 0; i--){
            int k = i;
            for(int j = 0; j < i; j++) {
                if(arr[j] > arr[k]) k = j;
            }
            swap(arr, k, i);
        }
    }
    public static void quickSort(int arr[],int start, int end) {
        int arrLen = end-start;
        if(start >= end) return;
        int p = start;  int q = 0;
        for(int i = 0; i < end && end > 0; i++) {
            if(arr[i] < arr[p]) q++;
        }
        swap(arr, q,p);
        int m = q-1; int n = q+1;
        while(m > 0 && n < end)  {
            while(m > 0 && arr[m] < arr[q]) m--;
            while(n < end-1 && arr[n] > arr[q]) n++;
            swap(arr, m,n);
            m--; n++;
        }
        quickSort(arr,q+1,end);
        quickSort(arr,start,q-1);
    }
    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void mergeSort(int arr[]) {

    }
    public static int[] mergerSortedArrays(int arr1[], int arr2[]) {
        int arrLen1 = arr1.length;  int arrLen2 = arr2.length;
        int result[] = new int[arr1.length+arr2.length];
        int i = 0; int j = 0; int k = 0;

        while(i < arrLen1 && j < arrLen2) {
            result[k++] = (arr1[i] <= arr2[j]) ? arr1[i++] : arr2[j++];
        }
        while(i < arrLen1 ) result[k++] = arr1[i++];
        while(j < arrLen2 ) result[k++] = arr2[j++];

        return result;
    }
    public static int solveMathProblems(int arr[], int thresold) {
        Integer dp[][] = new Integer[arr.length+2][arr.length+2];
        return helper(arr,dp, thresold,0,0);
    }
    public static int helper(int arr[], Integer dp[][], int thresold,int index, int count) {
        if(index >= arr.length) return count;
        if(arr[index]-arr[0] >= thresold) {
            //String temp =
            return arr.length;
        }
        dp[index+1][count+1] = (dp[index+1][count+1] == null) ? helper(arr,dp,thresold,index+1,count+1): dp[index+1][count+1];
        dp[index+2][count+1] = (dp[index+2][count+1] == null) ? helper(arr,dp,thresold,index+2,count+1): dp[index+2][count+1];

        return Math.min(dp[index+2][count+1],dp[index+1][count+1] );
    }

    public static int solveMathProblems_(int arr[], int thresold) {
        return helper_(arr,thresold,0,0);
    }
    public static int helper_(int arr[], int thresold,int index, int count) {
        if(index >= arr.length) return count;
        if(arr[index]-arr[0] >= thresold) {
            return arr.length;
        }
        int min1 = helper_(arr,thresold,index+1,count+1);
        int min2 = helper_(arr,thresold,index+2,count+1);
        return Math.min(min1,min2);
    }



    public static List<List<Integer>> closestNumber(int arr[]) {
        Arrays.sort(arr); int arrLen = arr.length;
        int min = Integer.MAX_VALUE;
        for(int i = 1; i < arrLen; i++) {
            min = Math.min(min,Math.abs(arr[i]-arr[i-1]));
        }
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < arrLen; i++) {
            int k = i;
            if(Math.abs(arr[i]-arr[i-1]) == min) {
                List<Integer> temp = new ArrayList<>(){{
                    add(arr[k-1]); add(arr[k]);
                }};
                result.add(temp);
            }
        }
        return result;
    }
    public static void printDiagnole(int n){
        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
              if(j == i)
                  System.out.print("*");
              else System.out.print(" ");
            }
            System.out.println("");
        }
    }
    public static void printPattern(int n) {
        for(int i = 0; i <= n/2; i++) {
            for(int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i = n/2; i >= 0; i--) {
            for(int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
    public static int buildTeam(int skills[], int minPlayers,int minLevel, int maxLevel){
        int count = 0; int skillsLen = skills.length;
        int result = 0;
        for(int i = 0; i < skillsLen; i++) {
            if(skills[i] >= minLevel && skills[i] <= maxLevel)
                count++;
        }
        for(int i = minPlayers; i <= count; i++) {
            result += combination(count,i);
        }
        return result;
    }
    public static int combination(int n, int p) {
        return factorial(n)/(factorial(p)*factorial(n-p));
    }
    public static int factorial(int n) {
        if(n == 0 || n == 1) return 1;
        return n*factorial(n-1);
    }
    public static int sumGame(int n) {
        int count = 0;
        List<Integer> list = new ArrayList<>(){{ add(1);}};
        return 1+helper(n,0,list,0,0);
    }
    public static int helper(int n, int count, List<Integer> list,int sum,int index) {
        if(sum >= n) return count;
        List<Integer> temp1 = new ArrayList<>(list);
        temp1.set(index,temp1.get(temp1.size()-1)+1);
        int min1 = helper(n,count+1,temp1,sum+1,index);

        List<Integer> temp2 = new ArrayList<>(list);
        int lastElt = temp1.get(temp1.size()-1);
        temp2.add(lastElt);
        int min2 = helper(n,count+1,temp2,sum+lastElt,index+1);

        return Math.min(min1,min2);
    }
    public static Optional<List<Integer>> findDuplicate(List<Integer> list) {
        Set<Integer> set = new HashSet<>();
        List<Integer>  result = list.stream().filter(n -> !set.add(n))
                .distinct().collect(Collectors.toList());
        return Optional.of(result);
    }
    public static List<Integer> findTopKFrequentElt(int arr[],int n) {
        int arrLen = arr.length;
        Map<Integer,Integer> map = new HashMap<>();
//        Map<Integer,List<Integer>> map2 =
//                Arrays.stream(arr).collect(Collectors.groupingBy(i->i));
        for(int i = 0; i < arrLen; i++){
            int value = map.getOrDefault(arr[i],0);
            map.put(arr[i],value+1);
        }
//
        List<Integer> result = map.entrySet().stream()
           .sorted( (e,k) -> k.getValue()-e.getValue()).limit(n)
                .map(t -> t.getKey()).collect(Collectors.toList());

        return result;
    }
    public static int[][] NQueens() {
        return new int[2][2];
    }
    public static boolean patternMatch(String str,String pattern){
        int pLen = pattern.length(); int pStr = str.length();
        for(int i = 0; i < pStr; i++) {
            if(str.substring(i,pLen).equals(pattern))
                return true;
        }
        return false;
    }
    public  static List<List<Integer>>  subSetSum(List<Integer> list, int target){
        List<List<Integer>> result = new ArrayList<>(); int sum = 0;
        List<Integer> temp = new ArrayList<>();
        helper(list,0,target,0,result, temp);
        return result;
    }
    public static  void helper(List<Integer> list, int sum, int target,int index, List<List<Integer>> result, List<Integer> temp) {
        if(index == list.size()) return;
        List<Integer> newList = new ArrayList<>(temp);
        if(sum == target) {
            result.add(newList);
        }else if(sum+list.get(index) <= target) {
            newList.add(list.get(index));
            helper(list,sum+list.get(index),target,index+1,result,newList);
        }
        helper(list,sum,target,index+1,result,newList);
    }
    public static int[][] rotate90(int [][] res) {
        int arrLen = res.length; int arr[][] = res;
        for(int i = 0; i < arrLen/2; i++) {
            for(int j = 0; j < arrLen; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[arrLen-i-1][j];
                arr[arrLen-i-1][j] = temp;
            }
        }

        // 23 4   => 6 7  ===> 4 7
        // 6 7    => 23 4 ===> 23 6
        for(int i = 0; i < arrLen; i++) {
            for(int j = arrLen-1; j > 0; j--) {
                int temp = arr[arrLen-i-1][j];
                arr[arrLen-i-1][j]= arr[j][i];
                arr[j][i] = temp;
            }
        }
        return arr;
    }
    public static int mostDigits(int [] arr) {
        int digits[] = new int[10]; int result = -1;
        int max = 0; int arrLen = arr.length;
        for(int i = 0; i < arrLen; i++) {
            int temp = arr[i];
            while(temp > 0) {
                digits[temp%10]++;
                temp /= 10;
            }
        }
        for(int i = 0; i < 10; i++) {
            if(digits[i] > max) {
                max = digits[i]; result = i;
            }
        }
        return result;
    }
    public static int sumDividibleKFaster(int [] arr, int k) {
        int count = 0; int arrLen = arr.length;
        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < arrLen;i++) {
            int value = map.getOrDefault(map.get((arr[i]+arr[i])),0);
//            for(int j = i+1; j < arrLen;j++) {
//                if((arr[i]+arr[j])%k == 0 )
//                    count++;
//            }
        }
        return count;
    }
    public static int sumDividibleK(int [] arr, int k) {
        int count = 0; int arrLen = arr.length;

        for(int i = 0; i < arrLen;i++) {
            for(int j = i+1; j < arrLen;j++) {
                if((arr[i]+arr[j])%k == 0 )
                    count++;
            }
        }
        return count;
    }
    public static String mergeString(String s1, String s2) {
        int i = 0; int j = 0;
        int s1Len = s1.length(); int s2Len = s2.length();
        StringBuilder str = new StringBuilder();

        while(i < s1Len && j < s2Len) {
            if(s1.charAt(i)-'a' <= s2.charAt(j)-'a') {
                str.append(s1.charAt(i++));
            }else str.append(s2.charAt(j++));
        }

        while(i < s1Len) {
            str.append(s1.charAt(i++));
        }
        while(j < s2Len) {
            str.append(s2.charAt(j++));
        }

        return str.toString();
    }
    public static String buildstr(String[] arr) {
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length; j++) {
                char c = arr[j].charAt(i);
                str.append(c );
            }
        }
        return str.toString();
    }
    public static boolean wordSearch(char[][] arr, String s) {
//        Given an m x n grid of characters board and a string word, return true if word exists in the grid.
//        The word can be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or vertically neighboring.
//        The same letter cell may not be used more than once.
        int arrLen = arr.length;
        for(int i = 0; i < arrLen; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                boolean visited[][] = new boolean[arrLen][arr[i].length];
                if(bfs(arr,s,i,j,visited,0)) return true;
            }
        }
        return false;
    }
    public static boolean bfs(char[][] arr, String s, int i, int j,boolean visited[][], int k) {
        int sLen = s.length();
        if( k == sLen)
            return true;
        if(arr.length == 0 || s.length() == 0) return false;
        if( j < 0 || j == arr[0].length || i < 0 || i == arr.length
                ||s.charAt(k) != arr[i][j] ||visited[i][j])
            return false;
        visited[i][j] = true;
        return bfs(arr,s,i,j+1,visited,k+1) || bfs(arr,s,i+1,j,visited,k+1)
                || bfs(arr,s,i-1,j,visited,k+1)|| bfs(arr,s,i,j-1,visited,k+1);
    }
    public static int countNicePair(int arr[]) {
//        You are given an array nums that consists of non-negative integers.
//        Let us define rev(x) as the reverse of the non-negative integer x. For example,
//        rev(123) = 321, and rev(120) = 21.
//        A pair of indices (i, j) is nice if it satisfies all of the following conditions:
//        0 <= i < j < nums.length
//        nums[i] + rev(nums[j]) == nums[j] + rev(nums[i])
//        Return the number of nice pairs of indices. Since that number can be too large,
//        return it modulo 109 + 7.
//
        int count = 0; int arrLen = arr.length;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < arrLen; i++ ) {
            int r = reverseInt(arr[i]);
            int n = map.getOrDefault(arr[i]-r,0);
            map.put(arr[i]-r,n+1);
            count += n;
        }
        return count;
    }
    public static int reverseInt(int n) {
        int res = 0; int k = n;
        while( k > 0) {
            res = 10*res + k%10;
            k /= 10;
        }
        return res;
    }
    public static boolean isInterleaved(String s1, String s2, String s3) {
        int s3Len = s3.length();
        int s2Len = s2.length();
        if((s1.length() + s2.length()) != s3Len)
            return false;
        return isCharEquals(s1,s2,s3,0,0,0);
    }
    public static int customSort(int arr[]) {
        int array[] = arr; int arrLen = arr.length;
        int count = 0;
        for(int i = 0; i < arrLen; i++) {
           if(arr[i] % 2 != 0) {
               int k = arrLen-1;
//               while(arr[k] % 2 != 0 && k >= arrLen)
               while(arr[k] % 2 != 0 && k >= i)
                   k--;
               int temp = arr[k];
               arr[k] = arr[i]; arr[i] = temp;
               count++;
           }
        }
        return count;
    }


    public static char[][] chessboard(int n) {
        char result[][] = new char[n][n];
        if(n <= 0) return result;
        int k = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(k%2 == 0) result[i][j] = 'W';
                else result[i][j] = 'B';
                k++;
            }
        }
        return result;
    }
    public static int[] mergeOverlapping(int[] list) {
        //Arrays.sort(list,((a,b)-> a-b));
        Stack<List<Integer>> stack = new Stack<>();
        return list;
    }
    public static int getMaxRating(int arr[]) {
        int i = 1; int j = 0; int arrLen = arr.length;

        return sumSubSet(arr,0,0,0);
    }
    public static String decodeStr(String s) {
        StringBuilder n = new StringBuilder();
        int sLen = s.length();
        for(int i = 0; i < sLen; i = i+2) {
            char curr = s.charAt(i);
            int k = s.charAt(i+1) -'0';
            while(k > 0) {
                n.append(curr); k--;
            }
        }
        return n.toString();
    }
    public static int sumSubSet(int arr[], int i,int j, int max) {
        return 0;
    }
    public static boolean isCharEquals(String s1, String s2, String s3, int i, int j, int p) {
        if(p == s3.length())
            return true;
        if (s1.charAt(i) != s3.charAt(i) && s2.charAt(i) != s3.charAt(i))
            return false;
        return isCharEquals(s1,s2,s3, i+1, j, p+1)||isCharEquals(s1,s2,s3, i, j+1, p+1);
    }
    public static Map<Integer,Integer> transact(int[][] arr) {

        Map<Integer,Integer> map = new HashMap<>();
        int arrLen = arr.length;

        for(int i = 0; i < arrLen; i++) {
            map.put(arr[i][0],map.getOrDefault(arr[i][0],0) - arr[i][2]);
            map.put(arr[i][1],map.getOrDefault(arr[i][1],0) + arr[i][2]);
        }
        return map;
    }
    public static int knapsack(int [] weights, int [] profits, int capacity) {
        if(capacity == 0 || weights.length == 0 || profits.length == 0) return 0;
        List<Integer> products = new ArrayList<>();
        int sum = 0;
        return 0;
    }
    public static int getMaxProfit(int [] w, int [] p, int c, int i, List<Integer> list,
                                   int maxProfit, int currentCapacity, List<List<Integer>> result)  {
        if(c <= 0) return 0;
        if(i == w.length || currentCapacity + w[i] > c) return maxProfit;

        if(currentCapacity == c) result.add(list);
        List<Integer> temp = new ArrayList<>(list);
        temp.add(w[i]);
        int p1 = getMaxProfit( w,p,c,i+1,temp,maxProfit +p[i],currentCapacity + w[i],result);
        temp.remove(temp.size()-1);
        int p2 = getMaxProfit( w,p,c,i+1,temp,maxProfit,currentCapacity,result);
        return Math.max(p1,p2);
    }
    public static String decodeString(String str) {
        Stack<StringBuilder> strStack = new Stack<>();
        return "";
    }
    public static boolean isAnagramV2 (String a, String b)  {
        int arr[] = new int[26];
        int aLen = a.length(); int bLen = b.length();

        if(aLen != bLen) return false;

        for(int i = 0; i < aLen; i++) {
            arr[a.charAt(i)-'a']++;
            arr[b.charAt(i)-'a']++;
        }
        for(int j = 0; j < 26; j++) {
            if(arr[j]%2 != 0) return false;
        }
        return true;
    }
    public static boolean isAnagram(String a, String b) {
        // Complete the function
        Map<Character,Integer> aMap = new HashMap<>();
        Map<Character,Integer> bMap = new HashMap<>();
        int aLen = a.length();
        if(aLen != b.length()) return false;

        for(int i = 0; i < aLen; i++) {
            aMap.put(a.charAt(i),aMap.getOrDefault(a.charAt(i), 0)+1);
            bMap.put(b.charAt(i),bMap.getOrDefault(b.charAt(i), 0)+1);
        }
        for(Map.Entry<Character,Integer> e : aMap.entrySet()) {
            if((int) e.getValue() != (int) bMap.get((char)e.getKey())) {
                System.out.println((int) e.getValue() + " "+ bMap.get((char)e.getKey()));
                return false;
            }
        }
        return true;
    }
    public static int lowestSprintPoint(int n, int [] arr) {
        int result[] = new int[n+1]; int rLen = result.length;
        int lowerBound = 0; int upperBound = 0;
        for(int i = 0; i < arr.length-1;i++) {
            lowerBound = Math.min(arr[i],arr[i+1]);
            upperBound = Math.max(arr[i],arr[i+1]);
            for(int k = lowerBound; k <= upperBound;k++ ) {
                result[k]++;
            }
        }
        int output = Integer.MAX_VALUE; int max = Integer.MIN_VALUE;
        for(int j = 0; j < rLen; j++) {
            if(max < result[j]) {
                max = result[j];
                output = j;
            }
        }
        return output;
    }
    public static boolean beautify(String s) {
        char arr[] = s.toCharArray();
        int arrLen = arr.length;
        int temp[] = new int[26];

        for(int i = 0; i < 26; i++) {
            temp[i] = -1;
        }
        for(int j = 0; j < arrLen; j++) {
            temp[arr[j]-'a'] = temp[arr[j]-'a'] == -1 ? 1 : temp[arr[j]-'a']++;
        }
        int prev = temp[0];
        for(int i = 0; i < 26; i++) {
            if(prev < temp[i]) return false;
        }
        return true;
    }
    public static int[][] mergeOverlappingIntervals(int [][] a) {
        Arrays.sort(a,(x,y)-> x[0]-y[0]);
        int [][] result = new int[][]{};
        int aLen = a.length;
        for(int i = 0; i < aLen-1; i++) {
            int temp[][] = mergeOverlappingIntervals(a[i],a[i]);
        }
        return result;
    }
    public static int[][] mergeOverlappingIntervals(int [] a, int [] b) {
        int aLen = a.length;
        int result[] = new int[2];
        if(a[1] > b[0] && a[1] < b[1]) {
            result[0] = a[0];  result[1] = b[1];
            return new int[][]{result};
        } else if (a[1] > b[0] && a[1] >= b[1]) {
            return new int[][]{a};
        }
        return new int[][]{a,b};
    }
    public static int[] moveZerosAtBeginning(int [] a) {
        int aLen = a.length; int k = 0;
        for(int i = 0; i < aLen; i++) {
            if(a[i] == 0) {
                swap(i, k, a);
                k++;
            };
        }
        return a;
    }
    public static void swap(int i, int j, int []a) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public static int reclcp(String s1,String s2) {
        int s1Len = s1.length(); int s2Len = s2.length();
        if(s1Len == 0 || s2Len == 0) return 0;
        if(s1.charAt(s1Len-1) == s2.charAt(s2Len-1))
            return 1 + reclcp(s1.substring(0,s1Len-1),s2.substring(0,s2Len-1));
        return reclcp(s1.substring(0,s1Len-1),s2.substring(0,s2Len-1));
    }
    public static int reclongestPalindrome(String s) {
        return 0;
    }
    public static String lcss(String s1,String s2) {
        int s1Len = s1.length(); int s2Len = s2.length();
        if(s1Len == 0 || s2Len == 0) return "";
        if(s1.charAt(s1Len-1) == s2.charAt(s2Len-1) )
            return s2.charAt(s2Len-1) +
                    lcss(s1.substring(0,s1Len-1),s2.substring(0,s2Len-1));
        if(lcss(s1.substring(0,s1Len-1),s2).length() >
                lcss(s1,s2.substring(0,s2Len-1)).length())
            return lcss(s1.substring(0,s1Len-1),s2);
        return lcss(s1,s2.substring(0,s2Len-1));
    }
    public static int longestCommonSubSequence(String s1,String s2) {
        int s1Len = s1.length(); int s2Len = s2.length();
        if(s1Len == 0 || s2Len == 0) return 0;
        if(s1.charAt(s1Len-1) == s2.charAt(s2Len-1) )
            return 1 + longestCommonSubSequence(s1.substring(0,s1Len-1),s2.substring(0,s2Len-1));
        return Math.max(
                longestCommonSubSequence(s1.substring(0,s1Len-1),s2),
                longestCommonSubSequence(s1,s2.substring(0,s2Len-1))
        );
    }
    public static int longestPalindrome(String s) {
        int sLen = s.length(); int max = 0;
        for(int k = 0; k < sLen; k++) {
            int i = k; int j = k;
            while( i >= 0 && j < sLen) {
                String sub = s.substring(i,j);
                if(isPalindrome(sub) && sub.length() > max)
                    max = sub.length();
                i--; j++;
            }
        }
//        outer : while(i < sLen && j < sLen) {
//            int subLen = s.substring(i,j).length();
//            if(isPalindrome(s.substring(i,j))) {
//                if(max < subLen) max = subLen;
//                System.out.println(max);
//            } else if (isPalindrome(s.substring(i,j+1))) {
//                j++;
//                if(max < subLen) max = subLen;
//            }
//            i++;
//        }

        return max;
    }
    public static boolean isPalindrome(String s) {
        int sLen = s.length();
        int i = 0, j = sLen-1;
        while( i < j) {
            if(s.charAt(i) != s.charAt(j))
                return false;
            i++; j--;
        }
        return true;
    }
    public static int lengthOfLongestSubstring(String s) {
        int count = 0; int sLen = s.length();
        int i = 0; int j = 0; int max = 0;
        Set<Character> set = new HashSet<>();
        while(i < sLen && j < sLen) {
            if(!set.contains(s.charAt(i))) {
                set.add(s.charAt(i++));
                count++;
            } else {
                set.remove(s.charAt(j++));
                count--;
            }
            if(count > max) max = count;
        }
        return max;
    }
    public static int minIncrementForUnique(int[] nums) {
        int count = 0; int arrLen = nums.length;
        Map<Integer,Integer> map = new HashMap<>();
        int i = 0;
        while( i < arrLen) {
            if(!map.containsKey(nums[i])) {
                map.put(nums[i],nums[i]);
            } else {
                nums[i] += 1;
                count++; i--;
            }
            i++;
        }
        return count;
    }
    public static int subSetSumEqualK(int arr[], int k) {
        int count = 0; int arrLen = arr.length;
         int i = 0; int j = 0; int sum = arr[i];
         outer : while(j < arrLen && i < arrLen) {
            if (sum == k) {
                count++;
                sum -= arr[i++];
                continue;
            }
            if(sum < k) {
                if(j+1 == arrLen) break outer;
                sum += arr[++j];
                continue;
            }else if(sum > k) sum -= arr[i++];
         }
        return count;
    }
    public static int recurSubArraySum(int[] nums, int k) {
        int count = 0;
        int i = 0; int sum = 0;
        return recurrSubArrayCount(nums,k,sum,count,i);
    }
    public static int recurrSubArrayCount(int[] nums, int k, int sum, int count, int idx) {
        if(idx == nums.length || nums.length == 0) return count;
        if(sum == k && idx < nums.length) {
            count++;
            sum -= nums[idx]; idx++;
            return recurrSubArrayCount(nums,k,sum,count,idx);
        }
        else if(sum < k && idx < nums.length) {
            sum += nums[idx]; idx++;
            return recurrSubArrayCount(nums,k,sum,count,idx);
        }
        else if(sum > k && idx < nums.length) {
            sum -= nums[idx]; idx++;
            return recurrSubArrayCount(nums,k,sum,count,idx);
        }
        return count;
    }
}