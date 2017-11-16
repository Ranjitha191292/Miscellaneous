import java.io.*;
public class Program {
    public static void main(String[] args) {
        String text = "Hello world";
        BufferedWriter output = null;
        try {
            File file = new File("example.txt");
            output = new BufferedWriter(new FileWriter(file));
            output.write(text);
            if ( output != null )
            {
            output.close();
            } }
        catch ( IOException e ) {
            e.printStackTrace();
        } 
        }
    }