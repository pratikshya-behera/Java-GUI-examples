import java.awt.*;
class FillO extends Frame
{
    FillO()
    {
       setSize(300,300);
       setVisible(true);
    }
   public void paint(Graphics g)
   {
       g.setColor(Color.red);
       g.fillOval(50,60,100,100);
       g.setColor(Color.green);
       g.fillOval(80,90,200,100);
   }
  public static void main(String args[])
  {
      FillO ob=new FillO();
   }
}