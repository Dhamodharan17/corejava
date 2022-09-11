package variables;

public class InstanceVariableGame {

    int duration = 0;
    static InstanceVariableGame c = new InstanceVariableGame();
    public static void main(String[] args) {
        play();
        duration_completed();
    }
    public static void play(){
    // Changes will reflect for each object
        c.duration =5;
        System.out.println(c.duration);
        System.out.println("Within Play");
    }

    public static void duration_completed(){
        System.out.println("Duration over");
        System.out.println(c.duration);
        InstanceVariableGame c2 = new InstanceVariableGame();
        System.out.println(c2.duration);
    }

}
