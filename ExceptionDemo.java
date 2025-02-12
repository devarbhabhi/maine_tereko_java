import java.io.*;
public class ExceptionDemo
{
public static void main(String args[])throws IOException
{
int n1=10,n2=0;
int a[]={1,2,3};
int d1,d2;
System.out.println("Handling Arithmetic Exception:");
try
{
d1=n1/n2;
}
catch(ArithmeticException e)
{
System.out.println("Division by zero exception:"+e);
}
System.out.println("Handling Array Index Out Of Bounds Exception:");
try
{
d2=a[0]/a[3];
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("Division by array index out of bound exception:"+e);
}
}
}