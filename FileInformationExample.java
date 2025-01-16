import java.io.File;

public class FileInformationExample {
    public static void main(String[] args) {
        // Create a File object with the desired file path
        File file = new File("example.txt");

        // Check if the file exists
        if (file.exists()) {
            // Get and print the file name
            System.out.println("File Name: " + file.getName());
            
            // Get and print the absolute path of the file
            System.out.println("Absolute Path: " + file.getAbsolutePath());
            
            // Get and print the file's parent directory
            System.out.println("Parent Directory: " + file.getParent());
            
            // Get and print the file size in bytes
            System.out.println("File Size: " + file.length() + " bytes");
            
            // Get and print the last modified time of the file (in milliseconds)
            System.out.println("Last Modified: " + file.lastModified());
            
            // Get and print whether the file is readable
            System.out.println("Is Readable: " + file.canRead());
            
            // Get and print whether the file is writable
            System.out.println("Is Writable: " + file.canWrite());
            
            // Get and print whether the file is executable
            System.out.println("Is Executable: " + file.canExecute());
            
            // Get and print whether it is a directory or a file
            System.out.println("Is Directory: " + file.isDirectory());
            System.out.println("Is File: " + file.isFile());
        } else {
            System.out.println("File does not exist.");
        }
    }
}
