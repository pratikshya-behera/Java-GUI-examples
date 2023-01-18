//two windows side by side

import java.awt.*;
class TwoWin
{
  public static void main(String args[])
  {
    Frame f1 = new Frame("Window 1");
    f1.setSize(300,200);
    f1.setBackground(Color.green);
    f1.setLocation(100,200);
    f1.setVisible(true);
    Frame f2 = new Frame("Window 2");
    f2.setSize(300,200);
    f2.setBackground(Color.blue);
    f2.setLocation(410,200);
    f2.setVisible(true);
  }
}