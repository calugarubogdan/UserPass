package com.fasttrackbogdan.main;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

/**
 * Created by Bogdan on 2/21/2015.
 */
public class UsersPassword {
    public static void main(String[] args) throws IOException {
        //String user = "bogdan";
        //String password ="parola";

        User u = new User();
        u.setName("vasile");
        u.setPassword("parola");
        String num;
        String pass;
        Runtime rs = Runtime.getRuntime();
        ProcessBuilder pb = new ProcessBuilder("Notepad.exe ","C://Users//Bogdan//Desktop//myfile.txt");
        Scanner scanner =new Scanner(System.in);
        System.out.println("User: " );
        num = scanner.nextLine();
        System.out.println("Pas: " );
        pass = scanner.nextLine();

        if (u.getName().equals(num) && u.getPassword().equals(pass))
            pb.start();
        else {
            System.out.println("Wrong user or password");
        }

       /* try {
            rs.exec("notepad");
        } catch (IOException e) {
            System.out.println(e);
        }*/
    }
}
