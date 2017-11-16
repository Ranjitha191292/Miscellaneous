abstract class Shape
{
protected int unit;
abstract protected float calcArea();
void display()
{
System.out.println("Inside display method in the abstract class");
}
}
class Circle extends Shape
{
public Circle()
{
unit=12;
}
public float calcArea()
{
return (float)(3.14*unit*unit);
}
}
class Square extends Shape
{
public Square()
{
unit=3;
}
public float calcArea()
{
return (float)(unit*unit);
}
}
public class AbsClassDemo
{
public static void main(String as[])
{
Shape s1=new Circle();
Circle c=new Circle();
c.display();
System.out.println("Area of circle:"+c.calcArea());
Square s=new Square();
System.out.println("Area of square:"+s.calcArea());
s.display();
}
}