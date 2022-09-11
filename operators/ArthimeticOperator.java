package operators;

public class ArthimeticOperator {

    public static void main(String[] args) {

        System.out.println("Remainder "+12%5);

        System.out.println(12+2);
        System.out.println(12-2);
        System.out.println(12*2);
        System.out.println(12/2);


        int num  = 1;
        int num2 = 2;
        System.out.println(num+num2);

        //concat
        String s1 = "mark";
        String s2 = "kin";
        System.out.println(s1+s2);


        //String concat rules
        int a =10;
        int b =20;
        int c=90;
        String name = "killy";
        //name = a+b+c;
        name = name+a+b+c;//atleast ons should be string

       // c = name+c; we cannot put string into integers

        // String + int = String
        System.out.println("name"+5);






    }
}
