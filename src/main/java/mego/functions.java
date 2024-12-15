package mego;

import java.util.Arrays;
import java.util.List;

public class functions {
    public static void main(String[] args) {
        List<Integer> nums1 = Arrays.asList(1,2, 3);
        List<Integer> nums2 = Arrays.asList(4,5, 6);
        List<Integer> nums3 = Arrays.asList(7,8, 9);
        listAnalyze(nums1, "first list to test");
        listAnalyze(nums2, "second list to test");
        listAnalyze(nums3, "third list to test");


    }

    public static void listAnalyze(List<Integer> listToTest, String pattern) {
        System.out.println("start to analyze the list" + pattern);
        int length =  listToTest.size();
        int sum = 0;
        for (int num: listToTest){
            sum += (num);
        }
        System.out.println(sum);
    }


}
