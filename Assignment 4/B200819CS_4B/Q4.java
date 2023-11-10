// package Assign4B;
import java.util.*;
public class Q4 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number of Employees: ");
        int n = scn.nextInt();
        scn.nextLine();
        System.out.println("Enter details");
        List<Employee2> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            String s = scn.nextLine();
            String[] str = s.split(" ");
            Employee2 e = new Employee2();
            e.setName(str[0]);
            e.setEmp_id(str[1]);
            list.add(e);
        }
        for(Employee2 e: list){
            e.display();
        }
    }
}

class Employee2{
    String name;
    private String emp_id;

    public void display(){
        System.out.println(name+" "+emp_id);
    }
    public void setEmp_id(String emp_id){
        this.emp_id = emp_id;
    }
    public void setName(String name){
        this.name = name;
    }

}
