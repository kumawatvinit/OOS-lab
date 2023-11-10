import java.util.*;
class Student{
    String name;
    int roll;
    int height;

    Student(String name, int roll, int height){
        this.name = name;
        this.roll = roll;
        this.height = height;
    }
    public String getName(){
        return name;
    }
    public int getRoll(){
        return roll;
    }
    public int getHeight(){
        return height;
    }
}
public class Q3 {
    public static void main(String[] args){
        List<Student> list = new ArrayList<>();
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.nextLine();
        for(int i=0;i<n;i++){
            String s = scn.nextLine();
            String[] arr = s.split(",");
            String name = arr[0].substring(1);
            int roll = Integer.parseInt(arr[1]);
            int height = Integer.parseInt(arr[2].substring(0, arr[2].length()-1));
            list.add(new Student(name, roll, height));
        }
        list.sort(Comparator.comparingInt(Student::getHeight).thenComparing(Student::getName));
        int k = 0;
        int prevHeight = -1;
        List<String> names = new ArrayList<>();
        for(Student s : list){
            if(s.getHeight() != prevHeight){
                k++;
                prevHeight = s.getHeight();
                names.add(s.getName());
            }
        }
        System.out.println(k);
        System.out.println(String.join(",", names));
    }

}
