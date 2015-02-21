package com.fasttrackbogdan.main;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Bogdan on 2/21/2015.
 */
public class UsersPassword {
    public static void main(String[] args) throws IOException {
        String user = "bogdan";
        String parola ="parola";
        String num;
        String pass;
        Runtime rs = Runtime.getRuntime();
        ProcessBuilder pb = new ProcessBuilder("Notepad.exe ","C://Users//Bogdan//Desktop//myfile.txt");
        Scanner scanner =new Scanner(System.in);
        System.out.println("User: " );
        num = scanner.nextLine();
        System.out.println("Pas: " );
        pass = scanner.nextLine();

        if (user.equals(num) && parola.equals(pass))
            pb.start();

       /* try {
            rs.exec("notepad");
        } catch (IOException e) {
            System.out.println(e);
        }*/
    }
}
