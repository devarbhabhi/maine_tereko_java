import java.util.*;
class AgeNotMatchException extends Exception
{
AgeNotMatchException(String msg)
{
super(msg);
}
}
class Student extends RuntimeException
{
private String name;
private int age;
public Student(String name,int age)
{
this.name=name;
this.age=age;
try
{
if(age<15||age>20)
{
String msg="Age is not between 15 and 20";
AgeNotMatchException ae=new AgeNotMatchException(msg);
throw ae;
}
}
catch(AgeNotMatchException e)
{
e.printStackTrace();
}
}
public void display()
{
System.out.println("Name of the student:"+this.name);
System.out.println("Age of the student:"+this.age);
}
}
class MyExceptionDemo
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter the name of Student:");
String name=sc.next();
System.out.println("Enter the age of the Student should be 15 to 20(including 15 and 20):");
int age=sc.nextInt();
Student obj=new Student(name,age);
obj.display();
}
}


