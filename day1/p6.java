package day1;

import java.util.Scanner;

public class p6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
    }

    public static String voter(int age){

        // Need to mention return for all possible cases
        if(age>18){
            return "Voter";
        }else if(age > 39) {
            return "Voter";
        }else {
            return "Non Voter";
        }

    }

}
