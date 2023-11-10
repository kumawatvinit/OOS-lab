import java.util.*;

class Person{
    String personName;
    int age;

    Person(String personName, int age){
        this.personName = personName;
        this.age = age;
    }
}
class Student2 extends Person{
    double percentageOfMarks;

    Student2(String personName, int age, double percentageOfMarks){
        super(personName, age);
        this.percentageOfMarks = percentageOfMarks;
    }
}
class PGStudent extends Student2{
    String elective;

    PGStudent(String personName, int age, double percentageOfMarks, String elective){
        super(personName, age, percentageOfMarks);
        this.elective = elective;
    }
    double getPercentageOfMarks(){
        return percentageOfMarks;
    }
}
public class Q7 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.nextLine();
        List<PGStudent> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            String[] arr = scn.nextLine().split(":");
            String name = arr[0];
            int age = Integer.parseInt(arr[1]);
            String elective = arr[2];
            double percentageOfMarks = Double.parseDouble(arr[3]);
            list.add(new PGStudent(name, age, percentageOfMarks, elective));
        }
        list.sort(Comparator.comparingDouble(PGStudent::getPercentageOfMarks).reversed());
        for(PGStudent s : list)
            System.out.println(s.personName);
    }
}
