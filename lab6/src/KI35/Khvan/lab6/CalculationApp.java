/**
 * package
 */

import java.util.Scanner;
import java.io.*;
/**
        * Class <code>CalculationApp</code> Implements driver for Calculation class
 * @author Khvan Danylo
        * @version 1.0
        */
public class CalculationApp {

    public static void main(String[] args) throws IOException, FileNotFoundException {
        boolean IsCatched = true;
        Calculation obj = new Calculation();
        Scanner s = new Scanner(System.in);
        System.out.print("Enter data: ");
        double data = s.nextDouble();
        for(var i = 0; i < 5; i++) {
        try
        {
            
                obj.calculate(data + i);
            
        }
        catch (CalcException ex)
        {
            IsCatched = false;
            System.out.println(ex.getMessage());
        }
        if (IsCatched) {
                System.out.println("Result is: " + obj.getResult());
                obj.writeResTxt("textRes.txt");
                obj.writeResBin("BinRes.bin");

                obj.readResBin("BinRes.bin");
                System.out.println("Result is(read from bin): " + obj.getResult());
                obj.readResTxt("text1Res.txt");
                System.out.println("Result is(read from txt): " + obj.getResult());
            }
            s.close();
    }
}
    
}
