package mego;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class homework1 {

    /*תרגול 2 שאלה 8
    public static double powerOfTowNmbers(double  frist, double second ) {
         return  Math.pow(frist, second);
    }

     */
    /* תרגול 2 שאלה 6
    public static void between(int number1, int number2) {
        for (int i = number1;  i < number2 + 1; i++){
            System.out.print(i + " ");
        }

    }

     */
    /* תרגול 2 שאלה 7
    public static void check(int number1, int number2) {
        if(number1 < number2){
            between(int number1, int number2)
        }


    }

     */



/*   תרגול 2 , 1
    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number != 0){
            sum += number % 10;
            number /=  10;
        }
        return sum;
    }

 */
    /* תרגול 2 שאלה 3
public static void PrintTextTimes(String test, int times) {
    for (int i = 0; i < times; i++ ){
        System.out.println(test);
    }
}

     */


/* תרגול 2 שאלה 4 ו5
    public static int printUnillSumNum(int Number) {
        int sum = 0;
        int Next = 1;
        for (int i = 0; i < Number; i++){
            sum += Next;
            Next += 1;
        }
        return  sum;
}

 */


    public static void main(String[] args) {



        /*המשך תרגול 2 שאלה 8
        double First = 2;
        double Second = 3;
        System.out.println(powerOfTowNmbers(First, Second));

         */
        /* המשך תרגול 2 שאלה 6
        int Number1 = 2;
        int Number2 = 9;
        between(Number1, Number2);

         */


        /* המשך תרגול 2 שאלה 3
        String Name = "Ari";
        int times = 4;

        PrintTextTimes(Name, times);

         */
        /* תרגול 2 שאלה 4
        int number = 2;
        System.out.println(printUnillSumNum(number));

         */
        List<Integer> Numbers = IntStream.rangeClosed(10, 99)
                .boxed()
                .collect(Collectors.toList());
        List<Integer> NewNumbers = new ArrayList<>();
        List<Integer> TheHighestNumber = Arrays.asList(3, 55, 2, 1);
        /* המשך תרגול 2 שאלה 1
        int number = 666;
        int result = sumOfDigits(number);
        System.out.println(result);

         */
        int HigestNumber = 0;

        List<Integer> FiveNumbers = Arrays.asList(3, 2, 1, 4, 5, 6);

        /*תרגול 2 שאלה 5
        for (int number : FiveNumbers){
            System.out.println(printUnillSumNum(number));
        };

         */


        /*  תרגול 2 שאלה 2
        int someNumber = 43;
        if (someNumber >= 100 && someNumber <= 999){
            System.out.println("The number is valid");
        }
        else{
            System.out.println("The number is not valid");
        }

         */
     /* 1   for (Integer Number: Numbers ){
            System.out.println(Number);
            if (Number % 2 == 0){
                System.out.println("It is a evev Number");
                }
                else{
                    System.out.println("It is a odd Number");
                }

        }

      */
 /* 2
        int sum = 0;
        for (Integer Number: Numbers){
            if (Number % 2 == 0){
                sum += Number;
            }
        }
        System.out.println(sum);
*/
  /*  3    int sumEven = 0;
        int sumOdd = 0;
        for (Integer Number: Numbers){
            if (Number % 2 == 0){
                sumEven += Number;
            }
            else{
                sumOdd += Number;
            }
        }
        System.out.println("The sum of the even numbers are:" + " " + sumEven);
        System.out.println("The sum of the odd numbers are:" + " " + sumOdd);
*/
/* 4
for (Integer Number: Numbers){
    Number *= 2;
    NewNumbers.add(Number);
}
for (Integer Number: NewNumbers){
    System.out.println(Number);
}
*/
        /* 5
        for (Integer Number: TheHighestNumber ){
            if (Number > HigestNumber){
                HigestNumber = Number;
            }

        }
        System.out.println(HigestNumber);

         */
        /* 6
    for (Integer Number: Numbers){
        if (Number % 7 == 0 || Number % 10 == 7 || Number / 10 == 7){
            NewNumbers.add(Number);
        }
    }
    for (Integer Number: NewNumbers){
        System.out.println(Number);
    }

         */
    }



}






