package PrintStreamExample;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Test {
    public static void main(String[] args) {
        try {
            PrintStream output = new PrintStream("print.txt");
            output.print(12345);
        } catch (FileNotFoundException e) {
            System.out.println(e.getStackTrace());
        }
    }
}
