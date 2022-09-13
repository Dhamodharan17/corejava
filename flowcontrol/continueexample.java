package flowcontrol;

public class continueexample {

    public static void main(String[] args) {


        for(int i=0;i<10;i++){

            if(i%2==0){
                continue;//skip the code below
            }
            System.out.println("Hi "+i);
        }


    }
}
