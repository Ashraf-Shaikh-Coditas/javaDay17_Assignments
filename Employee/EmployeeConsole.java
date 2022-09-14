package Week5.Day17.Assignments.Employee;

import java.io.Console;

public class EmployeeConsole {
    int emp_id;
    String emp_name;
    float emp_salary;

    void acceptDetails(int emp_id,String emp_name,float emp_salary) {
        this.emp_id = emp_id;
        this.emp_name = emp_name;
        this.emp_salary = emp_salary;
    }

    void displayDetails() {
        System.out.println("Employee Id :: "+this.emp_id);
        System.out.println("Employee Name :: "+this.emp_name);
        System.out.println("Employee Salary :: "+this.emp_salary);
    }

    public static void main(String[] args) {
        Console console = System.console();

        System.out.println("Enter Id of Employee ");
        int id = Integer.parseInt(console.readLine());
        System.out.println("Enter name of Employee : ");
        String name = console.readLine();
        System.out.println("Enter Salary of Employee : ");
        float salary = Float.parseFloat(console.readLine());

        EmployeeConsole employeeConsole = new EmployeeConsole();
        employeeConsole.acceptDetails(id,name,salary);
        employeeConsole.displayDetails();

    }
}

/*

C:\Users\Coditas\Desktop>javac EmployeeConsole.java

C:\Users\Coditas\Desktop>java EmployeeConsole

Enter Id of Employee
1
Enter name of Employee :
Ashraf
Enter Salary of Employee :
50000

Employee Id :: 1
Employee Name :: Ashraf
Employee Salary :: 50000.0


* */