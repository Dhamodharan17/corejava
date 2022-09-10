package fundamentals;

public class datatypes_example {

    public static void main(String[] args) {


        //Boolean - Used to make decision
        boolean isSelect ;

        // Login ID and Password
        // validate Password

        isSelect = false;

        if(isSelect){
            System.out.println("Login Success");
        }else{
            System.out.println("Login Fails");
        }


        // int - used to store non decimal integer values
      /*  byte number1 = 128;
        short number2 = 32768;
        int number3 = 2147483648;*/

        int a = 2;

        //float - used to store decimal values

       // int height = 6.2;
        float height1 = 6.2f;// bY default all decimal values are stored as double so we need to mention f
        double height2 = 7.3;


        // char - used to store single character
        // Ascii numbers - american standard comm.
        char initial = 'S';
        System.out.println(initial);

        int intial2 = 43;
        char intial1 = 43;

        System.out.println("inital 1 char datatype "+intial1);
        System.out.println("inital 2 int datatype "+intial2);

    }
}
