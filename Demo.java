import java.awt.*;
import javax.swing.*;
class Demo extends JFrame 
{
  Demo()
  {
    setSize(300,200);
    //JLabel l = new JLabel("Enter name: ");
    JLabel l = new JLabel();
    l.setIcon(C:\code\Java\Practice\JFC examples\image.png);
    JTextField t = new JTextField();
    t.setBounds(150,100,80,20);
    l.setBounds(50,100,80,20);
    add(l); //add(t);
    setVisible(true);
  }
  public static void main(String args[])
  {
    new Demo();
  }
}