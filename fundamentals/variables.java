package fundamentals;

public class variables {

    //Instance Variables or Class Variables
    static int a = 10;
    // Scope - All Over the class
    public static void main(String[] args) {
        int b = 9;// Scope is within the block
        System.out.println(b);
        System.out.println(a);
        method1();
        method2();
        System.out.println(b);
        System.out.println(b);
    }

    public static void method1() {
        //System.out.println(b);
        System.out.println(a);
    }


    public static void method2() {
        //System.out.println(b);
        System.out.println(a);
    }
}
