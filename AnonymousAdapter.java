import java.awt.*;
import java.awt.event.*;
public class AnonymousAdapter extends Frame
{
AnonymousAdapter()
{
addMouseListener(new MouseAdapter()
{
public void mouseClicked(MouseEvent e)
{
Graphics g=getGraphics();
g.setColor(Color.BLUE);
g.fillOval(e.getX(),e.getY(),30,30);
}
});
setSize(300,300);
setLayout(null);
setVisible(true);
}
public static void main(String[] args)
{
new AnonymousAdapter();
}
}
ss
