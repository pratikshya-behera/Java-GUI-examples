//change cursor of window to hand-cursor

import java.awt.*;
class HandCur
{
  public static void main(String args[])
  {
    Frame f = new Frame();
    f.setSize(450,450);
    f.setBackground(Color.pink);
    f.setCursor(Frame.HAND_CURSOR);
    f.setVisible(true);
  }
}