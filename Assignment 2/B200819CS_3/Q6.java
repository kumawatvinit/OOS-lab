import java.util.Scanner;

class Student {
    private String name;
    private String rollNumber;
    private double cgpa;

    Student(String name, String rollNumber, double cgpa) {
        this.name = name;
        this.cgpa = cgpa;
        this.rollNumber = rollNumber;
    }

    String getName() {
        return name;
    }

    String getRollNumber() {
        return rollNumber;
    }

    double getCgpa() {
        return cgpa;
    }
}

public class Q6 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Student arr[] = new Student[n];
        for (int i = 0; i < n; i++) {
            String name = scan.next();
            String roll = scan.next();
            double cgpa = scan.nextDouble();
            arr[i] = new Student(name, roll, cgpa);

        }
        for (int i = 0; i < n; i++) {
            Student s = arr[i];
            System.out.println(s.getName() + " " + s.getRollNumber() + " " + ((int) s.getCgpa()) + " "
                    + (9.5 * s.getCgpa()) + "%");
        }

        scan.close();
    }
}