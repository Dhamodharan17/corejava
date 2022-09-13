package flowcontrol;

import java.util.Scanner;

public class whileloop {

    public static void main(String[] args) {

        int i =0;

        Scanner sc = new Scanner(System.in);
// When we want to run the loop until we need a condition
        while (i != 123){
            System.out.println("Enter Password");
           i= sc.nextInt();
        }

        System.out.println("Success Login");
    }
}
