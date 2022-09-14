package Week5.Day17.Assignments;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;

public class PrintWriterDemo {
    public static void main(String[] args) throws FileNotFoundException {

        File f = new File("pw.txt");

        PrintWriter writer = new PrintWriter(new FileOutputStream(f));
        writer.write("Hello World :: ");

        writer.write("Hi , This is Ashraf ");
        writer.flush();
        writer.close();
    }
}