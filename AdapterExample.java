import java.awt.*;
import java.awt.event.*;

public class AdapterExample extends Frame {
    AdapterExample() {
        addWindowListener(new MyInnerClass());
        setSize(300, 300);
        setLayout(null);
        setVisible(true);
        setTitle("Adapter Class example");
    }
    class MyInnerClass extends WindowAdapter {
        public void windowClosing(WindowEvent e) {
            dispose();
        }
    }
    public static void main(String[] args) {
        new AdapterExample(); 
    }
}
