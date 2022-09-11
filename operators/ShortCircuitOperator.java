package operators;

public class ShortCircuitOperator {

    public static void main(String[] args) {

        // && - all condition should become true

        int a =10; int b =12; int c=19;

        if(a>3 && b> 9 && c>10){

            System.out.println("All Passed ");
        }

        if(a>50 && b> 9 && c>10){//more clever

            System.out.println("All Passed 2 ");
        }

        if(a>50 & b> 9 & c>10){ // always all the arguments will be evaluted

            System.out.println("All Passed 2 ");
        }


    }
}
