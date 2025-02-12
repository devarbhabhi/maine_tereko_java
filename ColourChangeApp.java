import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
public class ColourChangeApp extends JFrame implements ActionListener
{
JButton b1;
Container c;
public ColourChangeApp()
{
c=getContentPane();
c.setLayout(new FlowLayout());
b1=new JButton("Change Colour");
b1.setBounds(50,20,150,200);
b1.addActionListener(this);
c.add(b1);
setSize(400,400);
setVisible(true);
setTitle("Colour Channging Window");
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
int R=(int)(Math.random()*100)%255;
int G=(int)(Math.random()*100)%255;
int B=(int)(Math.random()*100)%255;
Color mycolor=new Color(R,G,B);
c.setBackground(mycolor);
}
}
public static void main(String args[])
{
new ColourChangeApp();
}
}
