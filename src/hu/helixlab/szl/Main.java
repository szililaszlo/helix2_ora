package hu.helixlab.szl;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       /* int number =0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Next number:");
        number = scanner.nextInt();

        System.out.println("Number - "+ number);*/
        Random random1 =new Random();
        int randomNumber = random1.nextInt(11);
        System.out.println("random number: "+randomNumber);

        System.out.println(Math.sqrt(10.1));

        System.out.println(sum(10,3));
        System.out.println(getTheBigger(10,10));

    }
   /* static void print() {//static = példányosítás nélkül használható
        System.out.println(Math.sqrt(10.1));
    }*/

    private static int sum(int x,int y) {
    return x+y;
    };
    private static int getTheBigger(int a, int b) {
        if(a >b) {
            return a;
        }
        else if(a==b) {
            return a+b;
        }
        else {
            return b;
        }
    };
};
