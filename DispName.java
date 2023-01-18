import java.awt.*;
class DispName extends Frame
{
   DispName()
   {
       setSize(300,300);
      
       setVisible(true);
   }
   public void paint(Graphics g)
   {
      g.setColor(Color.red);
      g.drawString("Trident Academy", 50,100);
   }
   public static void main(String args[])
   {
       DispName ob=new DispName();
   }
}