// package Assign4B;
import java.util.*;
public class Q1 {
    private String name;
    private String rollno;
    private double cgpa;
    private double percentage;
    //getters
    public double getCgpa() {
        return cgpa;
    }

    public String getName() {
        return name;
    }

    public String getRollno() {
        return rollno;
    }

    public double getPercentage(){
        this.setPercentage();
        return percentage;
    }
    //setters
    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollno(String rollno) {
        this.rollno = rollno;
    }
    private void setPercentage(){
        this.percentage = this.cgpa*9.5;
    }

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = scn.nextInt();
        Q1[] array = new Q1[n];
        System.out.println("Enter Student Details");
        String name, rollno;
        double cgpa;
        for(int i=0;i<n;i++){
            name = scn.next();
            rollno = scn.next();
            cgpa = scn.nextDouble();
            array[i] = new Q1();
            array[i].setName(name);
            array[i].setCgpa(cgpa);
            array[i].setRollno(rollno);
        }
        for(int i=0;i<n;i++){
            System.out.println(array[i].getName()+" "+array[i].getRollno()+" "+array[i].getCgpa()+" "+array[i].getPercentage()+"%");
        }
    }
}

