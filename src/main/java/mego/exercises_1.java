package mego;

public class exercises_1 {
    public static void main(String[] args) {
        int StartNumber = 3;
        int StopNumber = 30;
        if(StartNumber >= StopNumber){

            System.out.println("StartNumber is invalid");
        }

        for (int i=StartNumber; i<StopNumber+1; i++){
            if (i % 3 == 0){
                System.out.println(i);
            }
        }
    }
}
