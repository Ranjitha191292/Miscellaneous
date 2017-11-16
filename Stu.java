import java.util.Scanner;
import java.io.*;


class Stu
{
String id;
String name;
int age;
String city;
String country;

void setDetails()
{
System.out.println("Enter the id,name,age,city,country of the student");
Scanner s=new Scanner(System.in);
id=s.next();
name=s.next();
age=s.nextInt();
city=s.next();
country=s.next();
}
}

class StuMain
{
public static void main(String as[])
{
try
{
int count=0;
Stud obj=new Stud();
 
            FileWriter fw= new FileWriter("C:\\java_programs\\h.txt");
            BufferedWriter wrt = new BufferedWriter(fw);

for(int i=0;i<3;i++)           
{
obj.setDetails();
wrt.write(obj.id);
wrt.write(" ");
wrt.write(obj.name);
wrt.write(" ");
wrt.write(obj.age);
wrt.write(" ");
wrt.write(obj.city);
wrt.write(" ");
wrt.write(obj.country);
wrt.newLine();
}
// Close connection
   wrt.close();
   //fw.close();

FileReader fr = new FileReader("C:\\java_programs\\h.txt"); 
BufferedReader rd = new BufferedReader(fr);
String line = null;
    while( (line = rd.readLine())!= null ){
        // \\s+ means any number of whitespaces between tokens
        String [] tokens = line.split(" ");
        String sid = tokens[0];
        String sname = tokens[1];
        String sage = tokens[2];
        String scity = tokens[3];
        String scountry = tokens[4];

        String ssage=Integer.parseInt(sage);
if(ssage>21);
{
count=count+1;
}
if(sname.substring(0,1).equals("A"))
{
System.out.println(sid+" "+sname+" "+sage+" "+scity+" "+scountry);
}
}
System.out.println(count);
     // byte [] a = new byte[50];
      //fr.read(a);   // reads the content to the array
//System.out.println(a[6]);

}

catch(Exception e)
{
System.out.println(e);
}
}
}

