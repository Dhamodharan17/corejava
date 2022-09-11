package variables;

public class StaticVariable {

      static int balance = 0;
      //StaticVariable c = new StaticVariable(); //outside all methods


    public static void main(String[] args) {

        deposit();
        check_balance();

    }

    public static void deposit(){
        //StaticVariable s = new StaticVariable();
        //s.balance = 1000;
        balance = 1000;
        System.out.println("deposited 1000 ruppes");
    }

    public static void check_balance(){
        StaticVariable s = new StaticVariable();

       // System.out.println("Balance is "+s.balance+"Ruppes");
        System.out.println("Balance is "+balance+"Ruppes");
    }
}
