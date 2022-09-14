package Week5.Day17.Assignments.Students;

import java.util.Scanner;

public class StudentCaseTwo {
    public static void main(String[] args) {
        String name ;
        int id;
        int marks;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter id of Student : ");
        id = scanner.nextInt();

        System.out.println("Enter marks of Student : ");
        marks = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter name of Student : ");
        name = scanner.nextLine();

        System.out.println("Name : "+name+
                "\nId : "+id+
                "\nMarks : "+marks);

    }
}

/*

Enter id of Student :
1
Enter marks of Student :
67
Enter name of Student :
Ashraf

Name : Ashraf
Id : 1
Marks : 67


* */
