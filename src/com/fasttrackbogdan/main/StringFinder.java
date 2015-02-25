package com.fasttrackbogdan.main;

/**
 * Created by Bogdan on 2/25/2015.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;


public class StringFinder {

    public static void main(String[] args) throws IOException {


        Path file = Paths.get("C://Users//Bogdan//Desktop//myfile.txt");

        if (Files.exists(file) && Files.isReadable(file)) {

            try {
                // File reader
                BufferedReader reader = Files.newBufferedReader(file, Charset.defaultCharset());

                String line;

                // read each line
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                    // tokenize each number
                    StringTokenizer tokenizer = new StringTokenizer(line, ",");

                    while (tokenizer.hasMoreTokens()) {
                        // parse each integer in file
                        String name = tokenizer.nextToken();
                        String password = tokenizer.nextToken();

                    }
                }
                reader.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }


    }
}