
package com.card.card.yalo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Check {
    public static boolean checkYalo(String imagePath) {
        boolean idCardFound = false;
        try {
            // Build the command to execute the Python script with the image path as an argument
            ProcessBuilder pb = new ProcessBuilder("python3", "src/main/java/com/card/card/yalo/yalo.py", imagePath);
            Process process = pb.start();

            // Read the output from the Python script
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()))) {
                String line;
                while ((line = reader.readLine()) != null) {
                    // Assuming the output is "True" or "False"
                    idCardFound = Boolean.parseBoolean(line);
                }
            }

            // Read error messages from the Python script
            try (BufferedReader errorReader = new BufferedReader(new InputStreamReader(process.getErrorStream()))) {
                String line;
                while ((line = errorReader.readLine()) != null) {
                    System.err.println(line);
                }
            }
            // Wait for the process to finish
            process.waitFor();
        } catch (IOException | InterruptedException e) {
            // Handle exceptions
            e.printStackTrace();
            // Set idCardFound to false in case of error
            idCardFound = false;
        }
        return idCardFound;
    }
}











//
//package com.card.card.yalo;
//
//import java.io.BufferedReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//
//public class Check {
//    public static boolean checkYalo(String imagePath) {
//        boolean idCardFound = false;
//        try {
//            // Build the command to execute the Python script with the image path as an argument
//            ProcessBuilder pb = new ProcessBuilder("python", "src/main/java/com/card/card/yalo/yalo.py", imagePath);
//            Process process = pb.start();
//
//            // Read the output from the Python script
//            try (BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()))) {
//                String line;
//                while ((line = reader.readLine()) != null) {
//                    // Assuming the output is "True" or "False"
//                    idCardFound = Boolean.parseBoolean(line);
//                }
//            }
//
//            // Read error messages from the Python script
//            try (BufferedReader errorReader = new BufferedReader(new InputStreamReader(process.getErrorStream()))) {
//                String line;
//                while ((line = errorReader.readLine()) != null) {
//                    System.err.println(line);
//                }
//            }
//            // Wait for the process to finish
//            process.waitFor();
//        } catch (IOException | InterruptedException e) {
//            // Handle exceptions
//            e.printStackTrace();
//            // Set idCardFound to false in case of error
//            idCardFound = false;
//        }
//        return idCardFound;
//    }
//}
