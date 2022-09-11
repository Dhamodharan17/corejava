package operators;

public class IncrementAndDecrement {

    public static void main(String[] args) {

        /*Increment and Decrement

        both increase or decrease the value by 1

        pre and post
         */
//        byte a = 1;
//        a =a + 1;


    int age = 20;
    int id = 3;
        System.out.println("post increment\n"+age++);// print and increment
        System.out.println(age);

        System.out.println("pre increment");
        System.out.println(++id);//  increment and print
        System.out.println(id);

        System.out.println("post decrement\n"+age--);// print and increment
        System.out.println(age);

        System.out.println("pre decrement");
        System.out.println(--id);//  increment and print
        System.out.println(id);

    }
}
