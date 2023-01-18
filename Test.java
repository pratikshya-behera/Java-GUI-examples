import javax.swing.*;
import java.awt.*;
class Test extends JFrame
{
  Test()
  {
    setSize(300,300);
    JButton b = new JButton("No");
    JTextArea ta = new JTextArea();
    JLabel l = new JLabel("Enter data: ");
    JToggleButton tb = new JToggleButton("No");
    JPasswordField pf = new JPasswordField(); 
    
    add(b);
    setVisible(true);
  }
  public static void main(String args[])
  {
    JDialog d = new JDialog();
    d.setSize(300,300);
    d.setVisible(true);
    Test ob = new Test();
  }
}