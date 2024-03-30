package org.Gorbachev;

import java.util.Scanner;
public class MyTools {
    static Scanner iScanner = new Scanner(System.in);

    public static int inputPositiveNumber(String msg) {
        int num = -1;
        while (num < 0) {
            System.out.print(msg);
            while (!iScanner.hasNextInt()) {
                System.out.printf("\n%s is not valid.\n", iScanner.nextLine());
                System.out.print(msg);
            }
            num = iScanner.nextInt();
            if (num < 0) {
                System.out.printf("\n%d is not valid.\n", num);
            }
        }
        iScanner.nextLine();
        return num;
    }
}
