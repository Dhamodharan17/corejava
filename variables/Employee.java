package variables;

public class Employee {

    String emp_name;
    int emp_id;
    int emp_sal;

    public static void main(String[] args) {

        Employee mark = new Employee(); // mark is
        mark.emp_id =12;
        mark.emp_name ="mark";
        mark.emp_sal = 2323;

        Employee jhon = new Employee(); // mark is
        jhon.emp_id =12;
        jhon.emp_name ="mark";
        jhon.emp_sal = 2323;

    }
    public static void employee_data(){
        System.out.println("Employee");
    }
}
