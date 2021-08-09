import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.PaintEvent;

import javax.swing.*;

public class a extends JFrame {
	// 필드 선언
	private JButton up, left, right, down;
	private static int x = 230;
	private static int y = 80;

	/*JPanel을 상속 받는  ball 클래스 - 위에 그림 레이아웃*/
	class ball extends JPanel {
		public ball() { // 생성자
			setBackground(new Color(61, 174, 255)); //배경 색 지정
		}
		
		//원 그려주기
		@Override
		public void paint(Graphics g) {
			super.paint(g);
			g.setColor(Color.RED);
			g.fillOval(x, y, 30, 30);
		}
	}
	
	/*JPanel을 상속 받는 button 클래스 - button 레이아웃*/
	class button extends JPanel {
		private JPanel p1, p2, p3, p4;
	
		public button() { //생성자 
			
			ball b = new ball();
			
			setLayout(new BorderLayout()); //배치 관리자 
			p1 = new JPanel();
			up = new JButton("UP");

			/*이벤트 처리 람다식 사용*/
			up.addActionListener(e -> {
				y = y - 10;
				b.setLocation(x, y);
				b.repaint();
			});
			p1.add(up);

			p2 = new JPanel();
			left = new JButton("Left");
			left.addActionListener(e -> {
				y = y - 10;
				b.setLocation(x, y);
				b.repaint();
			});

			p2.add(left);
			right = new JButton("Right");
			right.addActionListener(e -> {
				y = y - 10;
				b.setLocation(x, y);
				b.repaint();
			});
			p2.add(right);

			p3 = new JPanel();
			down = new JButton("Down");
			down.addActionListener(e -> {
				y = y - 10;
				b.setLocation(x, y);
				b.repaint();
			});
			p3.add(down);

			add(p1, BorderLayout.NORTH);
			add(p2, BorderLayout.CENTER);
			add(p3, BorderLayout.SOUTH);
		}
	}

	// 생성자
	public a() {
		setSize(500, 300);
		setTitle("Move a Ball");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 윈도우 창에 엑스를 눌렀을 때 윈도우를 종료 시켜줌
		setLayout(new BorderLayout());
		
		
		add(new ball(), BorderLayout.CENTER);
		add(new button(), BorderLayout.SOUTH);
		setVisible(true);
	}

	public static void main(String[] args) {
		a tt = new a();
	}
}