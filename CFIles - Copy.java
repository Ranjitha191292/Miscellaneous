import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class CFiles {

    public static void main(String[] args) {
        try{
            // Create new file
            String content = "This is the content to write into create file";
            String path="C:\\java_programs\\hi.txt";
            File file = new File(path);

            // If file doesn't exists, then create it
            if (!file.exists()) {
                file.createNewFile();
            }

            FileWriter fw = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fw);

            // Write in file
            bw.write(content);
            bw.write("Hello World");

            // Close connection
            bw.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}