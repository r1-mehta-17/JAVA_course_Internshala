/*
Your computer teacher has given you the task of recording the marks of every student in your class. The name, roll number, and marks of every student should be present in your list. Use your Java skills to achieve the same and print the complete list.
*/

import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students in the class : ");
        int n = sc.nextInt();
        ArrayList<Student> studentList = new ArrayList<Student>();
        for(int i=0;i<n;i++) {
            System.out.println("Enter the name of the student " + (i+1) + " : ");
            String name = sc.next();
            System.out.println("Enter the roll number of the student " + (i+1) + " : ");
            int rn = sc.nextInt();
            System.out.println("Enter the marks of the student " + (i+1) + " : ");
            int marks = sc.nextInt();
            studentList.add(new Student(name,rn,marks));
        }
        int count = 1;
        for(Student i : studentList) {
            System.out.println("Name of student " + count + " : " + i.Name);
            System.out.println("Roll Number of student " + count + " : " + i.RollNo);
            System.out.println("Marks of student " + count + " : " + i.marks);
            count++;
        }
    }
}

class Student {
    String Name;
    int RollNo;
    int marks;
    Student(String a, int b, int c) {
        Name = a;
        RollNo = b;
        marks = c;
    }
}

/*
SAMPLE INPUT AND OUTPUT: 
Enter the number of students in the class : 
3
Enter the name of the student 1 : 
Aarekh
Enter the roll number of the student 1 : 
1
Enter the marks of the student 1 : 
95
Enter the name of the student 2 : 
Kanav
Enter the roll number of the student 2 : 
21
Enter the marks of the student 2 : 
75
Enter the name of the student 3 : 
Dishant
Enter the roll number of the student 3 : 
12
Enter the marks of the student 3 : 
92
Name of student 1 : Aarekh
Roll Number of student 1 : 1
Marks of student 1 : 95
Name of student 2 : Kanav
Roll Number of student 2 : 21
Marks of student 2 : 75
Name of student 3 : Dishant
Roll Number of student 3 : 12
Marks of student 3 : 92
*/
