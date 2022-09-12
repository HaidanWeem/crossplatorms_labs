import java.io.*;
import java.util.*;

/**
 * Клас Lab2 реалізує програму до лабораторної роботи №2
 *
 * @author Khvan Danylo
 * @version 1.0
 * @since version 1.0
 *
 */
public class lab2 {
    /**
     * Статичний метод main є точкою входу в програму
     *
     * @param args
     * @throws FileNotFoundException
     *
     */
    public static void main(String[] args) throws FileNotFoundException {
        int nRows;
        char[][] arr;
        String filler;
        String empty = "  ";
        Scanner in = new Scanner(System.in);
        File dataFile = new File("MyFile.txt");
        PrintWriter fout = new PrintWriter(dataFile);

        System.out.print("Введіть розмір квадратної матриці: ");
        nRows = in.nextInt();
        in.nextLine();

        arr = new char[nRows][];
        int pointer = nRows;
        for (int i = 0; i < nRows; i++) {
            arr[i] = new char[pointer];
            pointer = pointer - 2;
            if (pointer < 0) {
                pointer = 0;
            }
        }

        System.out.print("\nВведіть символ-заповнювач: ");
        filler = in.nextLine();
        pointer = nRows;
        exit: for (int i = 0; i < nRows; i++) {
            for (int j = 0; j < pointer; j++) {
                if (filler.length() == 1) {
                    arr[i][j] = (char) filler.codePointAt(0);
                    fout.print(arr[i][j] + " ");
                    System.out.print(arr[i][j] + " ");
                } else if (filler.length() == 0) {
                    System.out.print("\nНе введено символ заповнювач");
                    break exit;
                } else {
                    System.out.print("\nЗабагато символів заповнювачів");
                    break exit;
                }
            }
            pointer = pointer - 2;
            if (pointer < 0) {
                pointer = 0;
            }

            System.out.print("\n" + empty);
            fout.print("\n" + empty);
            empty += "  ";
        }
        fout.flush();
        fout.close();

    }
}