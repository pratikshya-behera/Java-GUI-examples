//change cursor of window to wait-cursor

import java.awt.*;
class WinCur
{
  public static void main(String args[])
  {
    Frame f = new Frame();
    f.setSize(300,300);
    f.setBackground(Color.gray);
    f.setCursor(Frame.WAIT_CURSOR);
    f.setVisible(true);
  }
}