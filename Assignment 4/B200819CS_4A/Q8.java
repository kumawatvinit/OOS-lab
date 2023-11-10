// package Assign4A;
import java.util.*;

class Student{
    String studentName;
    int rollNo;
    int englishScore;
    int hindiScore;
    int mathsScore;
    int scienceScore;
    int ssScore;

    public Student(String studentName, int rollNo, int englishScore, int hindiScore, int mathsScore, int scienceScore, int ssScore){
        this.studentName = studentName;
        this.rollNo = rollNo;
        this.englishScore = englishScore;
        this.hindiScore = hindiScore;
        this.mathsScore = mathsScore;
        this.scienceScore = scienceScore;
        this.ssScore = ssScore;
    }
}
class Students{
    List<Student> students = new ArrayList<>();
    public void addStudent(Student student){
        students.add(student);
    }
    public List<Student> subjectToppers(int subjectCode) {
        int max = 0;
        List<Student> toppers = new ArrayList<>();
        switch(subjectCode){
            case 101:
                for (Student student : students) {
                    if(student.englishScore > max){
                        max = student.englishScore;
                        toppers.clear();
                        toppers.add(student);
                    }
                    else if(student.englishScore == max){
                        toppers.add(student);
                    }
                }
                break;
            case 102:
                for (Student student : students) {
                    if(student.hindiScore > max){
                        max = student.hindiScore;
                        toppers.clear();
                        toppers.add(student);
                    }
                    else if(student.hindiScore == max){
                        toppers.add(student);
                    }
                }
                break;
            case 103:
                for (Student student : students) {
                    if(student.mathsScore > max){
                        max = student.mathsScore;
                        toppers.clear();
                        toppers.add(student);
                    }
                    else if(student.mathsScore == max){
                        toppers.add(student);
                    }
                }
                break;
            case 104:
                for (Student student : students) {
                    if(student.scienceScore > max){
                        max = student.scienceScore;
                        toppers.clear();
                        toppers.add(student);
                    }
                    else if(student.scienceScore == max){
                        toppers.add(student);
                    }
                }
                break;
            case 105:
                for (Student student : students) {
                    if(student.ssScore > max){
                        max = student.ssScore;
                        toppers.clear();
                        toppers.add(student);
                    }
                    else if(student.ssScore == max){
                        toppers.add(student);
                    }
                }
                break;
        }
        return toppers;
    }
    public List<Student> classToppers(){
        int max = 0;
        List<Student> toppers = new ArrayList<>();
        for (Student student : students) {
            int total = student.englishScore + student.hindiScore + student.mathsScore + student.scienceScore + student.ssScore;
            if(total > max){
                max = total;
                toppers.clear();
                toppers.add(student);
            }
            else if(total == max){
                toppers.add(student);
            }
        }
        return toppers;
    }
}
public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Students students = new Students();
        char ch;
        do {
            ch = sc.next().charAt(0);
            switch (ch) {
                case 'a' -> {
                    String studentName = sc.next();
                    int rollNo = sc.nextInt();
                    int englishScore = sc.nextInt();
                    int hindiScore = sc.nextInt();
                    int mathsScore = sc.nextInt();
                    int scienceScore = sc.nextInt();
                    int ssScore = sc.nextInt();
                    sc.nextLine();
                    Student student = new Student(studentName, rollNo, englishScore, hindiScore, mathsScore, scienceScore, ssScore);
                    students.addStudent(student);
                }
                case 's' -> {
                    int subjectCode = sc.nextInt();
                    List<Student> toppers = students.subjectToppers(subjectCode);
                    for (Student student2 : toppers) {
                        System.out.println(student2.studentName+" "+student2.rollNo);
                    }
                }
                case 'c' -> {
                    List<Student> classToppers = students.classToppers();
                    for (Student student2 : classToppers) {
                        System.out.println(student2.studentName+" "+student2.rollNo);
                    }
                }
            }
        } while (ch != 't');
    }
}
