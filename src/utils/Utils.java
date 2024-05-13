package utils;

import java.util.Scanner;

public interface Utils {
    Scanner scannerStr = new Scanner(System.in);
    Scanner scannerInt = new Scanner(System.in);

    static String scanStr(String hint){
        System.out.print(hint);
        return scannerStr.nextLine();
    }

    static int scanInt(String hint){
        System.out.print(hint);
        return scannerInt.nextInt();
    }






}
