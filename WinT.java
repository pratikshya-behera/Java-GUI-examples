import java.awt.*;
class WinT extends Frame
{
  WinT()
  {
    setSize(300,200);
    Button b1 = new Button("OK");
    Button b2 = new Button("Cancel");
    add(b1);
    add(b2);
    setVisible(true);
  }
  public static void main(String args[])
  {
    WinT ob = new WinT();
  }
}