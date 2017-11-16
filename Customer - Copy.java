import java.util.*;
import java.io.*;


class Customer
{
String cusid;
String proid;
float proprice;
int quan;
float totprice;
String date;
String type;
int discount;


void setDetails()
{
System.out.println("Enter the transaction details");
Scanner s=new Scanner(System.in);
cusid=s.next();
proid=s.next();
proprice=s.nextFloat();
quan=s.nextInt();
totprice=s.nextFloat();
date=s.next();
discount=s.nextInt();
}
}

class CustMain
{
public static void main(String as[])
{
try
{
int count=0;
Customer obj=new Customer();
 
            FileWriter fw= new FileWriter("C:\\java_programs\\c.txt");
            BufferedWriter wrt = new BufferedWriter(fw);

for(int i=0;i<3;i++)           
{
obj.setDetails();
wrt.write(obj.cusid);
wrt.write(" ");
wrt.write(obj.proid);
wrt.write(" ");
wrt.write(obj.proprice);
wrt.write(" ");
wrt.write(obj.quan);
wrt.write(" ");
wrt.write(obj.totprice);
wrt.write(" ");
wrt.write(obj.date);
wrt.write(" ");
wrt.write(obj.type);
wrt.write(" ");
wrt.write(obj.discount);
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

}

catch(Exception e)
{
System.out.println(e);
}
}
}

