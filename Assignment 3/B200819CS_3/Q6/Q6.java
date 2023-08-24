import package2.StudentDataExtended;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        scanner.nextLine();  

        StudentDataExtended studentDataExtended = new StudentDataExtended();

        for (int i = 1; i <= numStudents; i++) {
            System.out.print("Enter the details of Student " + i + " (id, name, location): ");
            String line = scanner.nextLine();
            String[] parts = line.split(" ");
            String id = parts[0];
            String name = parts[1];
            String location = parts[2];
            studentDataExtended.addDetails(id, name, location);
        }

        System.out.println("The Student Details are:");
        studentDataExtended.printDetails();
    }
}
