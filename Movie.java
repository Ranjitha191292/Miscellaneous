import java.util.*;
import java.io.*;


class Movie
{
String id;
String name;
String director;
String actor;
String rating;
String type;
String date;


void setDetails()
{
System.out.println("Enter the id,name,director,actor,rating,type,date");
Scanner s=new Scanner(System.in);
id=s.next();
name=s.next();
director=s.next();
actor=s.next();
rating=s.next();
type=s.next();
date=s.next();
}
}

class MovieMain
{
public static void main(String as[])
{
try
{
int count=0;
Movie obj=new Movie();
 
            FileWriter fw= new FileWriter("C:\\java_programs\\m.txt");
            BufferedWriter wrt = new BufferedWriter(fw);

for(int i=0;i<3;i++)           
{
obj.setDetails();
wrt.write(obj.id);
wrt.write(" ");
wrt.write(obj.name);
wrt.write(" ");
wrt.write(obj.director);
wrt.write(" ");
wrt.write(obj.actor);
wrt.write(" ");
wrt.write(obj.rating);
wrt.write(" ");
wrt.write(obj.type);
wrt.write(" ");
wrt.write(obj.date);
wrt.write(" ");
wrt.newLine();
}
// Close connection
   wrt.close();
   //fw.close();
String [] tokens=null;
FileReader fr = new FileReader("C:\\java_programs\\m.txt"); 
BufferedReader rd = new BufferedReader(fr);
String line = null;
int j=0;
String sid[]=new String [10];
String sname[]=new String [10];
String sactor[]=new String [10];
String sdirector[]=new String [10];
String srating[]=new String [10];
String stype[]=new String [10];
String sdate[]=new String [10];


    while( (line = rd.readLine())!= null ){
       
          tokens = line.split(" ");
 sid[j]=tokens[0];
 sname[j]=tokens[1];
 sdirector[j]=tokens[2];
 sactor[j]=tokens[3];
 srating[j]=tokens[4];
 stype[j]=tokens[5];
 sdate[j]=tokens[6];

j=j+1;

}
System.out.println("Movies having rating greater than 4 are:");
for(int k=0;k<3;k++)
{
int rate=Integer.parseInt(srating[k]);
if(rate>4)
{
System.out.println(sname[k]);
}
}

System.out.println("Movies having type as U:");
for(int l=0;l<3;l++)
{
if(stype[l].equals("U"))
{
System.out.println(sname[l]);
}
}

System.out.println("Movies having actor as Khans:");
for(int u=0;u<3;u++)
{
if(sactor[u].equals("Khans"))
{
System.out.println(sname[u]);
}
}

System.out.println("Movies released in the year 2015:");
for(int w=0;w<3;w++)
{
String str=sdate[w].substring(6);
if(str.equals("2015"))
{
System.out.println(sname[w]);
}
}


}

catch(Exception e)
{
System.out.println(e);
}
}
}

