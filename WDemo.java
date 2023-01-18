import java.awt.*;
class WDemo extends Frame
{
  WDemo()
  {
    setSize(400,300);
    Label l = new Label("Enter name");
    TextField t = new TextField();
    Button b = new Button("Login");
    setLayout(null);
    l.setBounds(30,100,100,20);
    t.setBounds(140,100,100,20);
    b.setBounds(140,130,80,20);
    add(l);
    add(t);
    add(b);
    setVisible(true);
  }
  public static void main(String args[])
  {
    WDemo ob = new WDemo();
  }
}