package flowcontrol;

public class breakexample3 {
    public static void main(String[] args) {

        for(int i = 0;i<4;i++){

            for (int j = 0;j<4;j++){

                System.out.println("Hi "+i+" "+j);

            }
            if(i==0) break;
        }



    }
}
