
// package Assign4B;
import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number of Managers: ");
        int n = scn.nextInt();
        scn.nextLine();
        System.out.println("Enter details");
        List<Manager> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String s = scn.nextLine();
            String[] str = s.split(" ");
            Manager m = new Manager();
            m.name = str[0];
            m.age = Integer.parseInt(str[1]);
            m.emp_id = str[2];
            m.salary = Integer.parseInt(str[3]);
            m.managing_dept = str[4];
            m.no_of_employees = Integer.parseInt(str[5]);
            list.add(m);
        }
        for (Manager m : list) {
            System.out.println(m.name + " " + m.age + " " + m.emp_id + " " + m.salary + " " + m.managing_dept + " "
                    + m.no_of_employees);
        }
    }
}

class Person {
    String name;
    int age;
}

class Employee extends Person {
    String emp_id;
    int salary;
}

class Manager extends Employee {
    String managing_dept;
    int no_of_employees;
}
