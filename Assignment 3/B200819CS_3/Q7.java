import java.util.Scanner;

class Student1 {
    public String name;
    public String rollNumber;
    public int height;
    public int weight;

    Student1(String rollNumber, String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.rollNumber = rollNumber;
    }

    Student1 readStudent(String name, String rollNumber, int height, int weight) {
        Student1 k = new Student1(name, rollNumber, height, weight);
        return k;
    }

    void printStudentDetails() {
        System.out.println(rollNumber + ',' + name + ", " + height + "cm, " + weight + "Kg");
    }
}

public class Q7 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();

        Student1 arr[] = new Student1[n];
        for (int i = 0; i < n; i++) {
            String str = scan.nextLine();
            String[] temp = str.split(", ");

            int height = Integer.parseInt(temp[2].substring(0, temp[2].length() - 2));
            int weight = Integer.parseInt(temp[3].substring(0, temp[3].length() - 2));
            arr[i] = new Student1(temp[0], temp[1], height, weight);

        }

        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j].height > arr[j + 1].height) {
                    Student1 s = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = s;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            arr[i].printStudentDetails();
        }

        scan.close();
    }
}