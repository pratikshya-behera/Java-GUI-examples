import javax.swing.*;
import java.awt.*;
class ImageInButton extends JFrame
{
	ImageInButton()
	{
		setSize(500,500);
		ImageIcon i=new ImageIcon("image.png");
		Image newim=i.getImage().getScaledInstance(200,200, Image.SCALE_SMOOTH);
		i=new ImageIcon(newim);
		JButton b=new JButton(i);
		b.setBounds(100,100,200,170);
		setLayout(null);  
		add(b);
		setVisible(true);
	}
    public static void main(String[] args)
    {
         ImageInButton d=new ImageInButton();
    }
}