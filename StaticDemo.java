class Demo
  {
  void display()
  {
  System.out.println("A non-static method is called.");
  }
  static void show()
   { 
    System.out.println("the static method is called.");
    }
    }
 public class StaticDemo
 {
   public static void main(String args[])
   {
   Demo obj = new Demo();
   obj.display();
   Demo.show();
  }
}