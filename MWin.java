//program to use argument constructors to create windows (using inheritance)

import java.awt.*;
class MWin extends Frame
{
  MWin(int x, int y, Color c)
  {
    setSize(300,300);
    setBackground(c);
    setLocation(x,y);
    setVisible(true);
  }
  public static void main(String args[])
  {
    MWin ob1 = new MWin(10,40,Color.red);
    MWin ob2 = new MWin(320,40,Color.blue);
  }
}