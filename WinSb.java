import java.awt.*;
class WinSb extends Frame
{
  WinSb()
  {
    setSize(300,200);
     Button b1=new Button("OK");
     Button b2=new Button("Cancel");
     setLayout(new FlowLayout());
     add(b1);  //add button to frame window
     add(b2);
    setVisible(true);
   }
   public static void main(String args[])
   {
     WinSb ob=new WinSb();
   }
}
