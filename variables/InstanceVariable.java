package variables;

public class InstanceVariable {

    // Declare outside all the methods
    int account_number;// we need object to access

    public static void main(String[] args) {
        InstanceVariable b = new InstanceVariable();
        System.out.println(b.account_number);
        b.account_number =1;// Changes will reflect only inside the block
        System.out.println(b.account_number);
        withdraw();
        deposit();
        checkbalance();
    }

    public static void withdraw(){
    int acc ;
        InstanceVariable b = new InstanceVariable();
        System.out.println(b.account_number);// 0
        b.account_number = 9;
        System.out.println(b.account_number);
    }
    public static void deposit(){
    int acc;
        InstanceVariable b = new InstanceVariable();
        System.out.println(b.account_number);//0
    }
    public static void checkbalance(){
    int acc;
        InstanceVariable b = new InstanceVariable();
        System.out.println(b.account_number);
    }
}
