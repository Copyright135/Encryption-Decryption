package encryptdecrypt;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //declare the variables that we expect to use during the course of this program
        String alg = "shift";
        String mode = "enc";
        String data = "";
        String inputPath = "";
        String outputPath = "";
        int key = 0;

        //check for arguments provided in the command line
        if(args.length > 0) {
            for(int i = 0; i < args.length; i += 2) {
                if ("-alg".equals(args[i])) {
                    alg = args[i + 1].toLowerCase();
                } else if ("-mode".equalsIgnoreCase(args[i])) {
                    mode = args[i + 1].toLowerCase();
                } else if ("-key".equalsIgnoreCase(args[i])) {
                    key = Integer.parseInt(args[i + 1]);
                } else if ("-data".equalsIgnoreCase(args[i])) {
                    data = args[i + 1];
                } else if ("-in".equalsIgnoreCase(args[i]) && "".equals(data)) {
                    //will be ignored if "-data" arg is present, or overwritten if it comes later
                    inputPath = args[i + 1];
                } else if ("-out".equalsIgnoreCase(args[i])) {
                    outputPath = args[i + 1];
                } else {
                    System.out.println("Error: Invalid argument");
                }
            }
        } else { //use System input if no arguments
            Scanner scan = new Scanner(System.in);
            System.out.println("Choose an algorithm: ");
            alg = scan.nextLine();
            System.out.println("Choose a mode: ");
            mode = scan.nextLine();
            System.out.println("Input data: ");
            data = scan.nextLine();
            System.out.println("Input key: ");
            key = scan.nextInt();
            scan.close();
        }

        //if a data file is provided, retrieve the data from the file
        if(!("".equals(inputPath))) {
            data = readDataFromFile(inputPath);
        }


        String configs[] = new String[] {alg, mode};

        //create Encryption tool using provided configs
        EncryptionTool encryptionTool = new EncryptionTool(configs, key);

        //pass the data to the encryption tool for processing
        String processedString = encryptionTool.process(data);


        //After processing, the data will either be written to a specified file, or written to console in case of no file specified
        if(!("".equals(outputPath))) {
            writeDataToFile(processedString, outputPath);
        } else {
            System.out.println(processedString);
        }

    }

    //method to read the data from a specified file
    private static String readDataFromFile(String inputPath) {
        File file = new File(inputPath);
        String data = "";
        try (Scanner scan = new Scanner(file)) {
            data = scan.nextLine();
        } catch (FileNotFoundException e) {
            System.out.println("File not found or inaccessible");
        }
        return data;
    }

    //method to write the encrypted or decrypted data to a file
    private static void writeDataToFile(String encryptedData, String outputPath) {
        File file = new File(outputPath);
        try (PrintWriter writer = new PrintWriter(file)) {
            writer.print(encryptedData);
        } catch (FileNotFoundException e) {
            System.out.println("File not found or inaccessible");
        }
    }
}
