import java.awt.*;
import java.awt.event.*;
public class MouseEventExample extends Frame implements MouseListener
{
Label 1;
MouseEventExample()
{
addMouseListener(this);
l=new Label();
l.setBounds(20,50,100,20);
add(1);
setSize(300,300);
setLayout(null);
setVisible(true);
}
public void mouseClicked(MouseEvent e)
{
l.setText("MouseClicked e");
}
public void mouseEntered(MouseEvent e)
{
l.setText("Mouse Entered");
}
public void mouseExited(MouseEvent e)
{
l.setText("Mouse Exited");
}
public void mousePressed(MouseEvent e)
{
l.setText("Mouse Pressed e");
}
public void mouse Released(MouseEvent e)
{
l.setText("Mouse Released");
}
public static void main(String[] args)
{
new MouseEventExample();
}
}
