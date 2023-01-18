import java.awt.*;
class DropCol extends Frame
{
  DropCol()
  {
    setSize(300,300);
    Label l = new Label("Choose your favorite color");
    Choice c = new Choice();
    c.add("Choose");
    c.add("Red");
    c.add("Green");
    c.add("Blue");
    c.add("Pink");
    c.add("Yellow");
    c.add("Orange");
    setLayout(null);
    l.setBounds(40,40,200,20);
    c.setBounds(50,60,100,20);
    add(l);
    add(c);
    setVisible(true);
  }
  public static void main(String args[])
  {
    DropCol ob = new DropCol();
  }
}