// example for setUndecorated()
 
import java.awt.*;
class WinDc extends Frame
{
   WinDc()
   {
       setSize(300,300);
       setLocation(550,250);
       setBackground(Color.blue);
       setUndecorated(true);     //by default it is false
       setVisible(true);
   }
  public static void main(String args[])
  {
    WinDc ob=new WinDc();
  }
}