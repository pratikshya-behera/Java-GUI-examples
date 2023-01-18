import java.awt.*;
import javax.swing.*;
class MyWindow extends JFrame 
{
  MyWindow()
  {
    setSize(300,200);
    Button b1 = new Button("OK");
    JButton b2 = new JButton();
    b2.setIcon(new ImageIcon(image));
    setLayout(null);
    b1.setBounds(50,40,80,20);
    b2.setBounds(150,40,80,20);
    add(b1);  add(b2);
    setVisible(true);
  }
  public static void main(String args[])
  {
    new MyWindow();
  }
}