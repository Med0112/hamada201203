
package com.card.card.write;

import java.io.File;
import java.io.PrintWriter;

public class Write {

    public static String runOCR(String imagePath) {
        String inputFilePath = imagePath;
        String outputFilePath = "src/main/java/com/card/card/write/txt";
        String tesseractInstallPath = "Tesseract-OCR/tesseract";
        String[] command = {"cmd"};

        String recognizedText = null;
        try {
            Process p = Runtime.getRuntime().exec(command);
            new Thread(new SyncPipe(p.getErrorStream(), System.err)).start();
            new Thread(new SyncPipe(p.getInputStream(), System.out)).start();

            // Use try-with-resources to auto-close resources
            try (PrintWriter stdin = new PrintWriter(p.getOutputStream())) {
                stdin.println("\"" + tesseractInstallPath + "\" \"" + inputFilePath + "\" \"" + outputFilePath + "\" -l ara+eng");
            }

            int exitCode = p.waitFor();
            if (exitCode == 0) {
                recognizedText = Read_File.read_a_file(outputFilePath + ".txt");
                System.out.println("OCR Output: " + recognizedText);

                // Delete the output file
                File fileToDelete = new File(outputFilePath + ".txt");
                if (fileToDelete.exists()) {
                    fileToDelete.delete();
                } else {
                    System.err.println("Output file not found.");
                }
            } else {
                System.err.println("OCR process exited with error code: " + exitCode);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return recognizedText;
    }
}
