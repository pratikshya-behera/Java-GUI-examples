import java.awt.*;
class DropY extends Frame
{
  DropY()
  {
    setSize(300,300);
    Label l = new Label("Choose Year");
    Choice c = new Choice();
    for(int i=1970; i<=2022; i++)
      c.add(""+i);
    setLayout(null);
    l.setBounds(40,35,200,20);
    c.setBounds(50,60,100,20);
    add(c);
    add(l);
    setVisible(true);
  }
  public static void main(String args[])
  {
    DropY ob = new DropY();
  }
}