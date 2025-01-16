import java.io.File;
import java.io.IOException;

class CreateFile {
    public static void main(String[] args) {
        try {
            // Use double backslashes to escape the backslash character
            File f0 = new File("C:\\Users\\ziakh\\Desktop\\fileExample.txt");

            // Check if the file is created or already exists
            if (f0.createNewFile()) {
                System.out.println("File " + f0.getName() + " is successfully created");
            } else {
                System.err.println("File already exists");
            }
        } catch (IOException exception) {
            System.out.println("An unexpected error occurred");
            exception.printStackTrace();
        }
    }
}
