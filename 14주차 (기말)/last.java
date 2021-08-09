import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.PaintEvent;

import javax.swing.*;

public class a extends JFrame {
	// �ʵ� ����
	private JButton up, left, right, down;
	private static int x = 230;
	private static int y = 80;

	/*JPanel�� ��� �޴�  ball Ŭ���� - ���� �׸� ���̾ƿ�*/
	class ball extends JPanel {
		public ball() { // ������
			setBackground(new Color(61, 174, 255)); //��� �� ����
		}
		
		//�� �׷��ֱ�
		@Override
		public void paint(Graphics g) {
			super.paint(g);
			g.setColor(Color.RED);
			g.fillOval(x, y, 30, 30);
		}
	}
	
	/*JPanel�� ��� �޴� button Ŭ���� - button ���̾ƿ�*/
	class button extends JPanel {
		private JPanel p1, p2, p3, p4;
	
		public button() { //������ 
			
			ball b = new ball();
			
			setLayout(new BorderLayout()); //��ġ ������ 
			p1 = new JPanel();
			up = new JButton("UP");

			/*�̺�Ʈ ó�� ���ٽ� ���*/
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

	// ������
	public a() {
		setSize(500, 300);
		setTitle("Move a Ball");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ������ â�� ������ ������ �� �����츦 ���� ������
		setLayout(new BorderLayout());
		
		
		add(new ball(), BorderLayout.CENTER);
		add(new button(), BorderLayout.SOUTH);
		setVisible(true);
	}

	public static void main(String[] args) {
		a tt = new a();
	}
}