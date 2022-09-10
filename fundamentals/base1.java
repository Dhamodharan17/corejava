package fundamentals;

public class base1 {

    public static void main(String[] args) {

        int karthik_marks = 90;
        int doshi_marks = 90;
        int pooja_marks = 90;


        // one way of creating array
        int marks[] = {67, 78, 89, 90, 12};// storing group of value under a single name

        System.out.println("mark of ppl " + marks[0]);

        //Another way

        // int age[] = new int[];// * Always we must have to give size
        int age[] = new int[10];
        age[0] = 12;//setting the value
        age[1] = 34;

        System.out.println("age of ppl " + age[0]);
        System.out.println("age of ppl " + age[5]);

        boolean[] flag = new boolean[4];
        flag[0] = true;
        flag[1] = true;

        System.out.println("output of boolean " + flag[2]);

        // two parts
        // 1.declaration
        //2.initialztion

        int[] percentage;

        // percentage[0] = 12; we must intialize the array before using it

        percentage = new int[3];

        percentage[0] = 12;

    }
}
