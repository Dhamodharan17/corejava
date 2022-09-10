package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P6_ArrayMethods {

    public static void main(String[] args) {

        int []marks = {67,78,23,89,54,90,23,89,90};
        String[] alpha = { "a", "b", "c", "d", "e" };

        // 1.Find Length
        int len = marks.length;
        System.out.println(len);

        // 2.Convert to String
        String str = Arrays.toString(alpha);
        System.out.println(str);//[a, b, c, d, e]

        // 3.Convert to List

        ArrayList<String> arrayList = new ArrayList<String>(Arrays.asList(alpha));
        System.out.println(arrayList);//[a, b, c, d, e]


    }
}
