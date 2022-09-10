package fundamentals;

public class escape_charcater {

    public static void main(String[] args) {
        /*output
         Hello
         Team
         */

        System.out.println("Hello\n Team ");

           /*output
         Hello    team
         */
        System.out.println("Hello\tTeam ");

        // without \t
        System.out.print("Hello");
        System.out.print("     ");
        System.out.print("Team");


        System.out.println("Hello\b\bTeam ");

    }
}
