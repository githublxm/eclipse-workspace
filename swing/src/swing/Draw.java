
//画直线和画
package swing;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;


public class Draw extends JFrame{
//	private JPanel pane = new JPanel();
	public Draw()
	{
		setSize(598,621);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);		
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.blue);
//		g.drawLine(50,30,450,260);//划直线
//		g.drawLine(80,80,80,80);//划点
//		g.drawRect(100,100,300,100);//划矩形
//		g.fillRect(150,100,300,100);//填充矩形
		Image img = Toolkit.getDefaultToolkit().getImage("D:\\eclipse-workspace\\picture\\waiwai.png");
		g.drawImage(img, 5, 27, 585, 592, Color.LIGHT_GRAY, this);
	}
		
		
	public static void main(String[] args)
	{
		new Draw().setVisible(true);
	}
}
