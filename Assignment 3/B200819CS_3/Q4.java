import java.util.Scanner;

class Employee {
    protected int id;
    protected String name;
    protected String department;
    protected int salary;

    public Employee(int id, String name, String department, int salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public String toString() {
        return id + " " + name + " " + department + " " + salary;
    }
}

class Manager extends Employee {
    private int bonus;

    public Manager(int id, String name, String department, int salary, int bonus) {
        super(id, name, department, salary);
        this.bonus = bonus;
    }

    public int getEffectiveSalary() {
        return salary + bonus;
    }

    public String toString() {
        return super.toString() + " " + bonus;
    }
}

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of managers: ");
        int n = scanner.nextInt();
        Manager[] managers = new Manager[n];

        for (int i = 0; i < n; i++) {
            int id = scanner.nextInt();
            String name = scanner.next();
            String department = scanner.next();
            int salary = scanner.nextInt();
            int bonus = scanner.nextInt();
            managers[i] = new Manager(id, name, department, salary, bonus);
        }

        Manager maxSalaryManager = managers[0];
        for (int i = 1; i < n; i++) {
            if (managers[i].getEffectiveSalary() > maxSalaryManager.getEffectiveSalary()) {
                maxSalaryManager = managers[i];
            }
        }
        
        for (Manager manager : managers) {
            if (manager.getEffectiveSalary() == maxSalaryManager.getEffectiveSalary()) {
                System.out.println(manager);
            }
        }
    }
}
