package package2;

import package1.StudentData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentDataExtended {
    private List<StudentData> students = new ArrayList<>();

    public void addDetails(String id, String name, String location) {
        StudentData student = new StudentData(id, name, location);
        students.add(student);
    }

    public void printDetails() {
        Collections.sort(students, (s1, s2) -> s1.getId().compareTo(s2.getId()));
        for (StudentData student : students) {
            System.out.println(student.getId() + " " + student.getName() + " " + student.getLocation());
        }
    }
}
