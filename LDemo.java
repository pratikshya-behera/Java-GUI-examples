import java.awt.*;
class LDemo extends Frame
{
  LDemo()
  {
    setSize(400,300);
    Label l1 = new Label("Welcome");
    Label l2 = new Label("Student");
    setLayout(null);
    l1.setBounds(150,100,90,20);
    l2.setBounds(150,130,90,20);
    l1.setBackground(Color.black);
    l2.setBackground(Color.white);
    l1.setForeground(Color.white);
    add(l1);
    add(l2);
    setVisible(true);
  }
  public static void main(String args[])
  {
    LDemo ob = new LDemo();
  }
}