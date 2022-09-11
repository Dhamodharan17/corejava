package operators;

public class OrOperator {

    public static void main(String[] args) {

        int a = 12; int b =90; int c =8;

        if(a>10 || b > 100 || c >90){

            System.out.println("Passed");
        }

        int age = 18;
        int id =12;
        int sal = 12000;
/*
age>18 && sal >10000 = false && true => false

false || id > 11

id > 11 = true

false || true

 */
        if((age>18 && sal >10000) || id >11){
            System.out.println("passed");
        }

    }
}
