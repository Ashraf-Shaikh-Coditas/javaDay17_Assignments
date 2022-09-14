package Week5.Day17.Assignments.Employee;

import Week5.Day18.Employee;

import java.util.Scanner;

public class EmployeeScanner {
    int emp_id;
    String emp_name;
    float emp_salary;

    Scanner scanner = new Scanner(System.in);

    void acceptDetails() {
        System.out.println("Enter id of Employee :: ");
        this.emp_id = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter Name of Employee :: ");
        this.emp_name = scanner.nextLine();

        System.out.println("Enter Salary of Employee ");
        this.emp_salary = scanner.nextFloat();
    }

    void displayDetails() {
        System.out.println("Employee Id :: "+this.emp_id);
        System.out.println("Employee Name :: "+this.emp_name);
        System.out.println("Employee Salary :: "+this.emp_salary);
    }

    public static void main(String[] args) {
        EmployeeScanner employeeScanner = new EmployeeScanner();
        employeeScanner.acceptDetails();
        employeeScanner.displayDetails();
    }
}

/*

Enter id of Employee ::
1
Enter Name of Employee ::
Ashraf
Enter Salary of Employee
50000


Employee Id :: 1
Employee Name :: Ashraf
Employee Salary :: 50000.0


* */