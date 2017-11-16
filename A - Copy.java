class A
{
int a;
static int b;
A()
{
}
A(int x)
{
a=x;
b=x;
}
void change()
{
a++;
b++;
}
void show()
{
System.out.println("A:"+a+"B:"+b);
}
}
class Ma1
{
public static void main(String args[])
{
A obj=new A(10);
A obj1=new A(20);
A obj2=new A(30);
obj.change();
obj1.change();
obj2.change();
obj.show();
obj1.show();
obj2.show();
}
}

