package com.venky;

public class Main1 {



    public static void main(String[] args) {

        System.out.println("number-" + odd(-230));
        System.out.println("sum of odd ="+sumOdd(1,100));
        System.out.println("sum of odd ="+sumOdd(1,-100));

    }

    private static boolean odd(int number) {
        if (number < 0) {

            System.out.println("number fffofo--"+number);
        }
        return false;
    }
    private static int sumOdd(int start, int end) {

        int sum = 0;

        for (start = 1; start <= end; start++) {


            if ((start%2)==0) {

                sum +=start;


            }



        }
        return sum;

    }
}





