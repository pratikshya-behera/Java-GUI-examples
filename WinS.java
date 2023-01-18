//example for setResizable()

import java.awt.*;
class WinS extends Frame
{
   WinS()
   {
       setSize(300,300);
       setResizable(false);  //by default it is true so we pass false
       setLocation(550,250);
       setVisible(true);
   }
  public static void main(String args[])
  {
    WinS ob=new WinS();
  }
}