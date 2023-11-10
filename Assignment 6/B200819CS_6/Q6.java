import java.util.*;

class Employee{
    String employeeId;
    String employeeName;

    Employee(String employeeId, String employeeName){
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }

    double calculateSalary(){
        return 0;
    }
}

class PermanentEmployee extends Employee{
    double basicPay;
    double pf;

    PermanentEmployee(String employeeId, String employeeName, double basicPay){
        super(employeeId, employeeName);
        this.basicPay = basicPay;
        this.pf = 0.12 * basicPay;
    }

    double calculateSalary(){
        return basicPay - pf;
    }
}

class TemporaryEmployee extends Employee{
    int hoursWorked;
    int hourlyWages;
    TemporaryEmployee(String employeeId, String employeeName, int hoursWorked, int hourlyWages){
        super(employeeId, employeeName);
        this.hoursWorked = hoursWorked;
        this.hourlyWages = hourlyWages;
    }
    double calculateSalary(){
        return hoursWorked * hourlyWages;
    }
}
public class Q6 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.nextLine();
        Employee[] employees = new Employee[n];
        for(int i=0;i<n;i++){
            String[] arr = scn.nextLine().split(" ");
            String type = arr[0];
            if(type.equals("1")){
                employees[i] = new PermanentEmployee(arr[1], arr[2], Double.parseDouble(arr[3]));
            }
            else{
                employees[i] = new TemporaryEmployee(arr[1], arr[2], Integer.parseInt(arr[3]), Integer.parseInt(arr[4]));
            }
        }
        String find = scn.nextLine();
        for(Employee e : employees){
            if(e.employeeId.equals(find)){
                String s = String.format("%s %s %.0f", e.employeeId, e.employeeName, e.calculateSalary());
                System.out.println(s);
                break;
            }
        }
    }
}
