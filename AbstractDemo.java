import java.util.*;
abstract class Shape 
  {
    abstract void area();
   }
class Rectangle extends Shape
  {
    void area()
      {
         double l,b;
          Scanner s=new Scanner(System.in);
          System.out.println("Enter length of rectangle:");
          l=s.nextDouble();
          System.out.println("Enter breadth of rectangle:");
          b=s.nextDouble(); 
          System.out.println("Area of rectangle:"(l*b));
        }
     }
class Circle extends Shape
{
void area()
{ 
double r;
Scanner s=new Scanner(System.in);
System.out.println("Enter radiusof circle:");
r=s.nextDouble();

