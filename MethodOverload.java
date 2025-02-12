class MethodOverload
 {
  public int sum(int x,int y)
    {
 return (x + y);
 }
     public int sum(int x,int y ,int z)
   {
      return (x + y + z);
    }
     public double sum(double x, double y)
    {
       return (x + y);
     }
     public static void main(String args[])
     {
        MethodOverload m = new MethodOverload();
        System.out.println(m.sum(10,20));
        System.out.println(m.sum(10.5,20.5));
        System.out.println(m.sum(10,20,30));
      }
   }  