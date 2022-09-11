package variables;

public class Main {

    // class scope
    int id =10 ;// class variable - need to create object to access
    static double age = 10;// static variable - no need to create object to access
/*

Static variable - only single copy will be created used

 */
    public static void main(String[] args) {

        Main a = new Main();
        a.id =9;
        age = 12;
        System.out.println("Class variable Line 13 "+a.id);
        System.out.println("Static variable Line 14 "+age);

        int mark = 90; // local variable - block scope
        m1();
    }

    public static void m1(){

        Main a = new Main();
        System.out.println("Line 27 "+a.id);
        System.out.println("Static variable Line 28 "+age);
        System.out.println();
    }
}
