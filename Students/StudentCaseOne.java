package Week5.Day17.Assignments.Students;

import java.util.Scanner;

public class StudentCaseOne {
    public static void main(String[] args) {
        String name ;
        int id;
        int marks;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name of Student : ");
        name = scanner.nextLine();

        System.out.println("Enter id of Student : ");
        id = Integer.parseInt(scanner.nextLine());

        System.out.println("Enter marks of Student : ");
        marks = Integer.parseInt(scanner.nextLine());

        System.out.println("Name : "+name+
                    "\nId : "+id+
                    "\nMarks : "+marks);
    }
}

/*

Enter name of Student :
Ashraf
Enter id of Student :
1
Enter marks of Student :
67

Name : Ashraf
Id : 1
Marks : 67



* */