import java.util.*;

class Person {
    protected String personName;

    public Person(String personName) {
        this.personName = personName;
    }

    public String getPersonName() {
        return personName;
    }
}

class Patient extends Person {
    private String patientID;

    public Patient(String personName, String patientID) {
        super(personName);
        this.patientID = patientID;
    }

    public String getPatientID() {
        return patientID;
    }

    public int getAge() {
        String ageString = patientID.substring(6); 
        return Integer.parseInt(ageString);
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of patients: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

        List<Patient> patients = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Enter the details of patient " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Patient ID: ");
            String patientID = scanner.nextLine();
            patients.add(new Patient(name, patientID));
        }

        patients.sort((p1, p2) -> Integer.compare(p2.getAge(), p1.getAge())); 

        System.out.println("List of Patients to be tested are:");
        for (Patient patient : patients) {
            System.out.println(patient.getPatientID() + " " + patient.getPersonName());
        }
    }
}

