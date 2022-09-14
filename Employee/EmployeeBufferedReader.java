package Week5.Day17.Assignments.Employee;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class EmployeeBufferedReader {
    int emp_id;
    String emp_name;
    float emp_salary;

    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    void acceptDetails() throws IOException {
        System.out.println("Enter id of Employee :: ");
        this.emp_id = Integer.parseInt(bufferedReader.readLine());

        System.out.println("Enter Name of Employee :: ");
        this.emp_name = bufferedReader.readLine();

        System.out.println("Enter Salary of Employee ");
        this.emp_salary = Float.parseFloat(bufferedReader.readLine());
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