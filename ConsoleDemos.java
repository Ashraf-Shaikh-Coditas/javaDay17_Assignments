package Week5.Day17.Assignments;

import java.io.Console;

public class ConsoleDemos {
    public static void main(String[] args) {
        Console c = System.console();
        System.out.println("Enter name : ");
        String name = c.readLine();

        System.out.println("Enter pwd : ");
        char pwd[] = c.readPassword();
        String upwd = new String(pwd);

        if(name.equals("Ashraf") && upwd.equals("Ashraf")) {
            System.out.println("Welcome :: "+name+" you are valid user !!!");
        } else {
            System.out.println("Sorry !!! password does not match");
        }
    }
}
