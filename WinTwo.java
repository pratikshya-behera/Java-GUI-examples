import java.awt.*;
class WinTwo extends Frame
{
  WinTwo()
  {
    setSize(300,200);
     Button b1=new Button("SignIn");
     Button b2=new Button("SignUP");
     setLayout(null);
     b1.setBounds(80,80,100,20);
     b2.setBounds(190,80,100,20);
     add(b1);  //add button to frame window
     add(b2);
    setVisible(true);
   }
   public static void main(String args[])
   {
     WinTwo ob=new WinTwo();
   }
}