package day1;

import java.util.Scanner;

public class p2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter number 1");
        int num1 = sc.nextInt();
        System.out.println("enter number 2");
        int num2 = sc.nextInt();

        //Addition
        //System.out.println(num1+num2);

        int sum = num1+num2;
        System.out.println(sum);

        int sub = num1-num2;
        System.out.println(sub);

        int mul = num1 * num2;
        System.out.println(mul);

        int div = num1/num2;
        System.out.println(div);

        int rem = num1%num2;
        System.out.println(rem);
    }


}
