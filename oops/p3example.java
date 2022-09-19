package oops;

public class p3example {

    public static void main(String[] args) {

        Mobile nokia = new Mobile();
        nokia.name = "N10";
        nokia.price = 12332;
        nokia.Cameramp = 12;
        nokia.Ram= 3;

        System.out.println(nokia.Cameramp);

        Mobile redmi = new Mobile();
        redmi.name = "Note9";
        redmi.price=9000;
        redmi.Cameramp = 32;
        nokia.Ram = 4;

        System.out.println(redmi.price);
        redmi.takephoto();;
        nokia.takephoto();
    }


}


class Mobile{


    // Properties
     String name;
     int price;
     int Ram;
     int Cameramp;



     public static void call(){
         System.out.println("Calling");
     }

    public void takephoto(){
        System.out.println("take photo "+this.name);
    }

    public static void watchvideo(){
        System.out.println("watchvideo");
    }
}