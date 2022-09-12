package flowcontrol;

public class ifelse_example {
    int age = 14;

    public static void main(String[] args) {
        ifelse_example obj = new ifelse_example();
        if(obj.age == 0){
            System.out.println("No school need");
        }else if(obj.age > 2){
            System.out.println("Kinder Garden");
        } else  if(obj.age > 5){
            System.out.println("Pre Kg");
        }else if (obj.age > 10){
            System.out.println("Primary school");
        }else if(obj.age>14){
            System.out.println("High school");
        }





    }





}
