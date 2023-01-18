import java.awt.*;
class WinM extends Frame
{
  WinM(int r, int g, int b)
  {
    setSize(300,300);
    Color c = new Color(r,g,b);
    setBackground(c);
    setVisible(true);
  }
  public static void main(String args[])
  {
    WinM w1 = new WinM(238,130,238);  //purple
    WinM w2 = new WinM(0,0,0);        //black
    WinM w3 = new WinM(255,255,255);  //white
  }
}