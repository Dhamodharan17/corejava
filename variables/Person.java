package variables;

public class Person {

    // both we will decalare in class level

    int age = 10;
    String name = "name";

    static int sal = 9999;
    static boolean human =  true;// Single copy (single paper)

    static Person dhamodharan = new Person();// my paper (one instance)
    static Person pooja = new Person();

    static Person doshi =  new Person();// changes will be refleced only to the instance



    public static void main(String[] args) {
        doshi.age = 123;
        Person d = new Person();
        System.out.println("dhamo paper "+dhamodharan.age);
        dhamodharan.age = 24;

        m1();
        m2();
        m2();
    }

    public static void m1(){
        System.out.println("pooja paper"+pooja.age);
        System.out.println("dhamo paper " +dhamodharan.age);
        System.out.println(sal);
        sal = 10000;// here written something
    }

    public static void m2(){
        System.out.println(sal);
    }
    public static void m3(){
        System.out.println(sal);
    }


}
