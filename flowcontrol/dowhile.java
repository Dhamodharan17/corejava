package flowcontrol;

public class dowhile {

    public static void main(String[] args) {


        int i = 1;
        while (i==2){
            System.out.println("ok");
            i++;
        }
// Same as while - but first case is always true
        do{
            System.out.println("ok");
        }while (i==2);

        do{
            System.out.println("ok");
            i++;
        }while (i==2);// check condition whether to go to "do or not"
    }
}
