import java.util.*;
interface A
{
void getA();
}
interface B
{
void getB();
}
class C implements A,B
{
public void getA()
{
System.out.println("getA() method is Invoked");
}
public void getB()
{
System.out.println("getB() method is Invoked");
}
}
class MultipleDemo{
public static void main(String args[])
{
C c1=new C();
c1.getA();
c1.getB();
}
}