import java.io.*;
class Ex {

public static void main(String[]args) 
{
try
{
FileOutputStream out=new FileOutputStream("test.txt");
out.write(65);
out.close();
}
catch(IOException e)
{
System.out.println(e.getMessage());
}
}
}