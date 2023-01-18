//program to create window by inheritance of Frame class

import java.awt.*;
class BlueWin extends Frame
{
  BlueWin()
  {
    setSize(300,200);
    setBackground(Color.BLUE);
    setCursor(MOVE_CURSOR);
    setVisible(true);
  }
  public static void main(String args[])
  {
    BlueWin ob1 = new BlueWin();
  }
}