/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.main;
// executable class
// use problem5.student.Student class to create object of student

import problem3.Student;
import problem3.myqueue.MyPriorityQueue;

import java.util.Scanner;

public class MyMain {
    public static void main(String[] args) {
        MyPriorityQueue queue = new MyPriorityQueue();
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE CHOICE. ENTER 1 TO INSERT AND VIEW");
        int ch = sc.nextInt();
        sc.nextLine();
        switch (ch) {
            case 1:
                for (int i = 0; i <= 5; i++) {
                    System.out.println("Enter the Student name");
                    String n = sc.nextLine();
                    System.out.println("Enter the roll number of the Student");
                    int r = sc.nextInt();
                    Student student = new Student(n, r);
                    queue.enqueue(student);
                    sc.nextLine();
                }
                queue.show();
                break;
            default:
                System.out.println("Wrong Choice");
        }
    }
}