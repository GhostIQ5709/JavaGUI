// Java Files
// File handling is an important part of any application.
// Java has several methods for creating, reading, updating, and deleting files.

// Java File Handling
// The File class from the java.io package allows us to work with files.
// To use the File class, create an object of the class, and specify the filename or directory name:

import java.io.File; // Import the File class
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class JavaFiles {
    public static void main(String[] args) {
        System.out.println("--------------------------------START--------------------------------");
        // The File class has many useful methods for creating and getting information about files.
        // Store file extension into a variable
        String fileExtension = ".txt";
        Scanner scanner = new Scanner(System.in);

        // Create a File
        System.out.println("\t-----------------------Create-a-File-----------------------");
        try {
            String fileName;
            System.out.print("\tEnter name of file to be created: ");
            fileName = scanner.nextLine();
            String file = fileName + fileExtension;
            // Creating a file object
            File myObj = new File(file);
            if (myObj.createNewFile()) {
                System.out.println("\tFile created: " + myObj.getName());
            } else {
                System.out.println("\tFile already exists.");
            }
        } catch (IOException e) {
            System.out.println("\tAn error occurred.");
            e.printStackTrace();
        }

        // Write To a File
        System.out.println("\t-----------------------Write-To-a-File-----------------------");
        try {
            String fileName;
            System.out.print("\tEnter name of file to be written to: ");
            fileName = scanner.nextLine();
            String file = fileName + fileExtension;
            FileWriter myWriter = new FileWriter(file);
            myWriter.write("\tFiles in Java might be tricky, but it is fun enough!");
            myWriter.close();
            System.out.println("\tSuccessfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("\tAn error occurred.");
            e.printStackTrace();
        }

        // Read a File
        System.out.println("\t-----------------------Read-a-File-----------------------");
        try {
            String fileName;
            System.out.print("\tEnter name of file to be read: ");
            fileName = scanner.nextLine();
            String file = fileName + fileExtension;
            File myObj = new File(file);
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println("\tData from file: " +
                        "\n\t---------------------From-File--------------------\n\t"
                        + data + "\n\t-------------------Closing-File-------------------");
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("\tAn error occurred.");
            e.printStackTrace();
        }

        // Get File Information
        System.out.println("\t-----------------------Get-File-Info----------------------");
        String fileName;
        System.out.print("\tEnter name of file to be read from: ");
        fileName = scanner.nextLine();
        String fileString = fileName + fileExtension;
        File file = new File(fileString);
        if (file.exists()) {
            System.out.println("\tFile name: " + file.getName());
            System.out.println("\tAbsolute path: " + file.getAbsolutePath());
            System.out.println("\tWriteable: " + file.canWrite());
            System.out.println("\tReadable: " + file.canRead());
            System.out.println("\tFile size in bytes: " + file.length());
        } else {
            System.out.println("\tThe file does not exist.");
        }

        // Delete a File
        System.out.println("\t-----------------------Delete-a-File-----------------------");
        String fileName1;
        System.out.print("\tEnter name of file to be deleted: ");
        fileName1 = scanner.nextLine();
        String fileString1 = fileName1 + fileExtension;
        File myObj = new File(fileString1);
        if (myObj.delete()) {
            System.out.println("\tDeleted the file: " + myObj.getName());
        } else {
            System.out.println("\tFailed to delete the file.");
        }

        // Create a Folder
        System.out.println("\t-----------------------Create-a-Folder-----------------------");
        String folderName;
        System.out.print("\tEnter name of folder to be deleted: ");
        folderName = scanner.nextLine();
        String folderPath = "C:\\Users\\Software\\IdeaProjects\\FinalJava\\src\\";
        String folderString = folderPath + folderName;
        File myObj1 = new File(folderString);
        if (myObj1.mkdir()) {
            System.out.println("\tFolder created: " + myObj1.getAbsolutePath());
        } else {
            System.out.println("\tFailed to create the folder.");
        }

        // Delete a Folder
        System.out.println("\t-----------------------Delete-a-File-----------------------");
        System.out.print("\tEnter name of folder to be deleted: ");
        folderName = scanner.nextLine();
        folderString = folderPath + folderName;
        File myObj2 = new File(folderString);
        if (myObj2.delete()) {
            System.out.println("\tDeleted the folder: " + myObj2.getName());
        } else {
            System.out.println("\tFailed to delete the folder.");
        }
        scanner.close();
        System.out.println("---------------------------------END---------------------------------");
    }
}
