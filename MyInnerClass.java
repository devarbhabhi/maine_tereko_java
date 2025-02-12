import java.awt.*;
import java.awt.event.*;
public class AdaptorExample extends Frame
{
 AdaptorExample()
  {
    addWindowListener(new MyInnerClass());
    setSize(300,300);
    setLayout(null);
   setVisible(true);
   setTitle("Adaptor Class example");
}
class MyInnerClass extends WindowAdaptor
{
  public void windowClosing(WindowEvent e)
  {
    dispose();
   }
} 
public static void main(String[] args)
 {
   new  AdaptorExample();
   }
}