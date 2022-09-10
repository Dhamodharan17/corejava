package fundamentals;

public class anonymsaraay {


    public static void main(String[] args) {

        //Anonnymes array - unknown array (new int[]{1,3,4,5})
        // it donot any name
        // Temporary purpose
        printarray(new int[]{1,3,4,5});
    }
    public static void printarray(int a[]){
        for (int a1:a){
            System.out.println(a1);
        }
    }
}
