//program to create Red window with size 300X300

import java.awt.*;
class RedWin
{
  public static void main(String args[])
  {
    Frame f = new Frame("Trident");
    f.setSize(300,300);
    f.setBackground(Color.red);
    f.setVisible(true);
  }
}