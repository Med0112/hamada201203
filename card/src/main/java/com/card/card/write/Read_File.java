
package com.card.card.write;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Read_File {

    public static String read_a_file(String file_name) {
        StringBuilder read_string = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(file_name))) {
            String sCurrentLine;
            while ((sCurrentLine = br.readLine()) != null) {
                read_string.append(sCurrentLine).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return read_string.toString();
    }
}
