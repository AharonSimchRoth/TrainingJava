package mego;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class listExample {
    public static void main(String[] args) {
        List<String> prices1 = Arrays.asList("23.3$", "12.7$", "876.45$");
        List<String> prices = new ArrayList<>();

        int len = prices.size();

        prices.add("24.5%");
        prices.add(0, "45.5");
         String priceNumberOne = prices.get(1);

        for (String price :  prices){
            System.out.println(price);
        }
        prices.forEach(price -> {
            System.out.println(price + "forEach");
        });
    }
}
