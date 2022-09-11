package operators;

public class Typecast {

    public static void main(String[] args) {

        byte a = 10;
        int b = a;
        System.out.println("No type casting needed");

        // if you go in oppsite direction typecasting is needed
        int c = 12;
        byte d = (byte) c;
        System.out.println("Typecasting");



    }

}
