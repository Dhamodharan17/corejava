package flowcontrol;

public class switchexample {
    char Section = 'K';// Instance/Class Variable
    static  char Sec = 'K';


    public static void main(String[] args) {


        switchexample s = new switchexample();// to access Instance/Class Variable we need object

        if(s.Section == 'A'){// valiadations are happening
            System.out.println("Belongs to A section");
        }
       else if(s.Section == 'B'){
            System.out.println("Belongs to B section");
        }
        else   if(s.Section == 'C'){
            System.out.println("Belongs to C section");
        }
// multiple equlas case switch - more readability
        switch (Sec){
            case 'A':
                System.out.println("Belongs to A section");
                break;

            case 'B':
                System.out.println("Belongs to B section");
                break;
            case 'C':
                System.out.println("Belongs to c section");
                break;
            default:
                System.out.println("Belongs to no section");

        }
        int age = 2;

        switch(age){
            case 2 :
                System.out.println("2");
                break; //- Must otherwise
            case 5:
                System.out.println("5");
                break;
            default:
                System.out.println("No number");

        }


    }
}
