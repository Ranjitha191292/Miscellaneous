import java.util.*;
import java.io.*;



class AgeException extends Exception
{
public AgeException()
{
System.out.println("Age must be below 100");
}
}

class CountryException extends Exception
{
public CountryException()
{
System.out.println("Country must be India only");
}
}


class Stud
{
String id;
String name;
String age;
String city;
String country;

void setDetails() throws AgeException,CountryException
{
System.out.println("Enter the id,name,age,city,country of the student");
Scanner s=new Scanner(System.in);
id=s.next();
name=s.next();
age=s.next();
if(Integer.parseInt(age)>100)
{
throw new AgeException();
}
city=s.next();
country=s.next();
if(!(country.equals("India")))
{
throw new CountryException();
}
}
}



class StudMain
{
public static void main(String as[])
{
try
{
String sid;
String sname;
String sage;
String scity;
String scountry;
int count=0;
int ssage=0;
Stud obj=new Stud();
 
            FileWriter fw = new FileWriter("C:\\java_programs\\h.txt");
            BufferedWriter wrt = new BufferedWriter(fw);

for(int i=0;i<2;i++)           
{
obj.setDetails();
wrt.write("\n"+obj.id);
wrt.write(" ");
wrt.write(obj.name);
wrt.write(" ");
wrt.write(obj.age);
wrt.write(" ");
wrt.write(obj.city);
wrt.write(" ");
wrt.write(obj.country);
wrt.write(";");
wrt.newLine();
}
// Close connection
   wrt.close();
   fw.close();


File inputFile = new File("h.txt");
Scanner data = new Scanner(inputFile);
for(int j=0;j<2;j++)
{
sid=data.next();
sname=data.next();
sage=data.next();
ssage=Integer.parseInt(sage);
if(ssage>21)
{
count=count+1;
}
scity=data.next();
scountry=data.next();
if(sname.substring(0,1).equals("A"))
{
System.out.println(sid+" "+sname+" "+sage+" "+scity+" "+scountry);
}
}
System.out.println("No. of Students whose age is greater than 21:"+count);
}
catch(AgeException e)
{
System.out.println(e);
}
catch(CountryException e)
{
System.out.println(e);
}
catch(Exception e)
{
System.out.println(e);
}
}
}

