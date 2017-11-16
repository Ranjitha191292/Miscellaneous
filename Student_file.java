import java.util.*;
import java.io.*;
class Student_file implements Serializable
{
int id;
String name;
int age;
public static void main (String args[])
{

Student_file arr[]=new Student_file[5];
for(int j=0;j<5;j++)
{
arr[j]=new Student_file();
}
Scanner s=new Scanner(System.in);
System.out.println("Enter the id of the five students:");

for(int i=0;i<5;i++)
{
arr[i].id=s.nextInt();
}

System.out.println("Enter the name of the five students:");

for(int i=0;i<5;i++)
{
arr[i].name=s.next();
}

System.out.println("Enter the age of the five students:");
for(int k=0;k<5;k++)
{
arr[k].age=s.nextInt();
}

try
{
FileOutputStream out=new FileOutputStream("test.txt");
ObjectOutputStream oout=new ObjectOutputStream(out);



for(int u=0;u<5;u++)
{
oout.writeObject(arr[u].id);
oout.writeObject(arr[u].name);
oout.writeObject(arr[u].age);

}
//oout.close();

ObjectInputStream ois=new ObjectInputStream(new FileInputStream("test.txt"));

//Serializable ois=new Student_file();
Object c;
//List<Object> strings=new ArrayList<>();
while((c=ois.readObject())!=null)
{
System.out.println(c);
}

//System.out.println(strings);
}
catch(EOFException e)
{
e.printStackTrace();
}
catch(Exception ex)
{
ex.printStackTrace();
}
}
}

