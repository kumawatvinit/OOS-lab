// package Assign4A;

import java.util.Scanner;

class Person{
    String name;
    int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public int calculatePension(){
        if(age >= 65 && age <= 70) return 500;
        else if(age > 70) return 600;
        return 0;
    }
}
public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        Person obj = new Person(name, age);
        System.out.println(obj.calculatePension());
        sc.close();
    }
}
