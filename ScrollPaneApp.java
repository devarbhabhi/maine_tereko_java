import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ScrollPaneApp extends JFrame implements ActionListener
{
JScrollPane sp;
JButton b;
JTextArea ta;
ScrollPaneApp()
{
setSize(500,500);
setVisible(true);
setTitle("Colour Change ScrollPane Application");
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setLayout(new FlowLayout());
ta=new JTextArea("This is Textarea in ScrollPane",2,20);
sp=new JScrollPane(ta);
sp.setPreferredSize(new Dimension(200,80));
sp.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
sp.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
add(sp);
b=new JButton("Change Color");
add(b);
sp.setBorder(BorderFactory.createLineBorder(Color.RED));
b.addActionListener(this);
}
public void actionPerformed(ActionEvent e)
{
Color initialColor=Color.BLUE;
Color selectedColor=JColorChooser.showDialog(this,"Select a BackgroundColor",initialColor);
sp.setBackground(selectedColor);
}
public static void main(String[] args)
{
new ScrollPaneApp();
}
}
