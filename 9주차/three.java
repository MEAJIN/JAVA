import  java.awt.*;
import javax.swing.*;


public class three extends JFrame {

	public three() {
		
		setTitle("Smile");
		setSize(400,400);
		setLocation(200, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}

	
	public void paint(Graphics g) {
	
		super.paint(g);
		
		
		g.fillRect(117,150,175,180); //缔 赣府墨遏
		
		g.setColor(Color.YELLOW);
		g.fillOval(105, 100, 200, 200); // 倔奔
		
		g.setColor(Color.BLACK);
		g.fillArc(105, 100, 200, 180, 90, 90);//哭率 菊 赣府墨遏
		g.fillArc(105, 100, 200, 180, 90, -90);//坷弗率 菊 赣府墨遏
		
		g.setColor(Color.BLACK);		
		g.drawArc(150, 200, 20, 20, 180, -180); // 哭率 传
		g.drawArc(250, 200, 20, 20, 180, -180); // 坷弗率 传
		
		g.drawLine(205, 200, 200, 220); //内
		g.drawLine(200, 220, 210, 220); //内
		
		g.setColor(Color.red);
		g.fillArc(140, 220, 20, 10, 360, 360);//哭率 全炼
		g.fillArc(260, 220, 20, 10, 360, 360);//坷弗率 全炼
		
		g.setColor(Color.BLACK);
		g.drawArc(160,  200,  100,  70,  180,  180); //涝
		
		g.setColor(Color.YELLOW);
		g.fillArc(95, 200, 30, 30, 90, 180); //哭率蓖
		g.fillArc(285, 200, 30, 30, 90, -180); //哭率蓖2

	}

	public static void main(String[] args) {
		three t = new three();

	}
}