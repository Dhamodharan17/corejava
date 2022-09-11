package variables;

public class Ins_Example {

    int id ;
    int age ;
    static Ins_Example container1 = new Ins_Example();
    public static void main(String[] args) {

      //  Ins_Example container1 = new Ins_Example(); // container is in local
        container1.id = 12;
        container1.age=90;

        Ins_Example container2 = new Ins_Example();
        container2.id = 13;
        container2.age = 18;

    }

    public static void m1(){

        System.out.println(container1.id);
    }
}
