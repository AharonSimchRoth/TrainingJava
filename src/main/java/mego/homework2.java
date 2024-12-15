package mego;

import java.util.Arrays;
import java.util.List;

public class homework2 {


    public static void main(String[] args) {
        int number = 345;
        utils utilsToTest = new utils();
        System.out.println(utilsToTest.sumDigits(number));
        List<Integer> Ages = Arrays.asList(1, 33, 77);
        String Type = "";
        for (int Age: Ages){
            System.out.println(checkAges(Age, Type));
        }
    }

    public static String checkAges(int Age, String Type) {
        if(Age > 0 && Age < 19 ){
            Type = "child";
            return  Type;
        }
        else if(Age > 18 && Age < 61){
            Type = "adult";
            return Type;
        }
        else{
            Type = "senior";
            return Type;
        }

    }
}
