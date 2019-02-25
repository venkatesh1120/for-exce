package com.pvenky;

public class Main {

    public static void main(String[] args) {
            int count =0;
            int sum =0;

        for(int i=1; i<1000; i++){

            int x= i%3;
            int z= i%5;


            if(x==0 && z==0){

                sum = sum +i;

                sum  +=i;
                System.out.println("numbers= "+i);
                count++;



                }
            if(count==5){
                System.out.println("exit");
                break;



            }



        }
        System.out.println("sum"+sum);

    }

}
