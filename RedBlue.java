import java.awt.*;
class RedBlue extends Frame
{
    RedBlue()
    {
       setSize(300,300);
       setVisible(true);
    }
   public void paint(Graphics g)
   {
       g.setColor(Color.red);  
       g.drawRect(50,60,200,100);
       g.setColor(Color.blue);
       g.drawRect(50,170,200,100);
   }
  public static void main(String args[])
  {
      RedBlue ob=new RedBlue();
   }
}