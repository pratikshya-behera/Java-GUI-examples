//program to print current date and time in window title

import java.awt.*;
class WinD extends Frame
{
   WinD()
   {
       setSize(300,300);
       setTitle(""+new java.util.Date());
       setVisible(true);
   }
  public static void main(String args[])
  {
    WinD ob=new WinD();
  }
}