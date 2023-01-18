import java.awt.*;
class Rectangle extends Frame
{
    Rectangle()
    {
       setSize(300,300);
       setVisible(true);
    }
   public void paint(Graphics g)
   {
       g.setColor(Color.red);
       g.fillRect(50,60,200,100);
       g.setColor(Color.green);
       g.fillRect(50,170,200,100);
   }
  public static void main(String args[])
  {
      Rectangle ob=new Rectangle();
   }
}