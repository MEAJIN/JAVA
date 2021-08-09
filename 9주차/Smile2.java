import  java.awt.*;
import javax.swing.*;

public class Smile extends JFrame{
	public Smile() {
		setTitle("YellowSmile");
		setSize(600,600);
		setLayout(new FlowLayout());
		setVisible(true);
	}
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D g2=(Graphics2D) g;
		g2.setColor(Color.YELLOW);
		g2.setStroke(new BasicStroke(10));
		g2.fillOval(25, 25, 200, 200);
		g2.setColor(Color.BLUE);
		g2.drawArc(60,80,50,50,180,-180);
		g2.drawArc(150,80,50,50,180,-180);
		g2.drawArc(70,130,100,70,180,180);
		g2.setColor(Color.BLACK);
		g2.fillArc(25, 25, 200, 110, 180, -180);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Smile f=new Smile();
	}

}
