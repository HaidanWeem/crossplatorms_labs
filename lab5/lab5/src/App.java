
/**
 * package
 */

import java.util.Scanner;
import java.io.*;
import static java.lang.System.out;

/**
 * Class <code>App</code> Implements driver for Equation class
 * 
 * @author Khvan Danylo
 * @version 1.0
 */

public class App {
    /**
     * @param args
     */
    public static void main(String[] args) {
        try{
        try
        {
            out.print("Enter file name: ");
            Scanner in = new Scanner(System.in);
            String fName = in.nextLine();
            PrintWriter fout = new PrintWriter(new File(fName));
            try
            {
                try
                {
                    Equation eq = new Equation();
                    out.print("Enter X: ");
                    fout.print(eq.calculator(in.nextDouble()));
                }
                finally
                {
                    fout.flush();
                    fout.close();
                }
            }
            catch (Exceptions e)
            {
                out.print(e.getMessage());
            }
        }
        catch (FileNotFoundException ex)
        {
            out.print("Exception reason: Perhaps wrong file path");
        }
    } finally {
        var exception = ExceptionVal.exceptionMeaning.get(ExceptionVal.divideByZero);
        throw new ExceptionR(exception);
    } 

    }
}
