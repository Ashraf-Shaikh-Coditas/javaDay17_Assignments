package Week5.Day17.Assignments.Employee;

public class EmployeeCommandLineArgument {

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
        EmployeeCommandLineArgument employeeCommandLineArgument = new EmployeeCommandLineArgument();
        int id = Integer.parseInt(args[0]);
        String name = args[1];
        float salary = Float.parseFloat(args[2]);

        employeeCommandLineArgument.acceptDetails(id,name,salary);
        employeeCommandLineArgument.displayDetails();
    }
}

/*

Employee Id :: 1
Employee Name :: Ashraf
Employee Salary :: 45190.0

* */