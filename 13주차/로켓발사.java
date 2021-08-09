import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class one extends JFrame implements ActionListener {
	Image img;
	Timer timer;
	int pos_x = 0, pos_y = 537;
	private int xSpeed = 3, ySpeed = 3;
	private static final int PERIOD = 10; // �ð�

	// ���� Ŭ����
	class MyPanel extends JPanel {

		// MyPanel ������
		public MyPanel() {
			setBackground(Color.black); // ����� ���������� ����
		}

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, pos_x, pos_y, this); // ȭ�鿡 �̹��� �׸���
		}
	}

	public void update() { // ��ǥ �̵�
		pos_x += xSpeed;
		pos_y -= ySpeed;

	}

	public one() {

		setTitle("Animation");
		setSize(700, 700);
		setVisible(true);
		add(new MyPanel());

		ImageIcon icon = new ImageIcon("r.png");
		img = icon.getImage();

		add(new MyPanel());
		setVisible(true);

		timer = new Timer(PERIOD, this); // 10ms���� Ÿ�̸Ӱ� �ɸ�
		timer.start();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) { // ActionListener�������̽� ����
		update();
		repaint();
	}

	public static void main(String[] args) {
		one a = new one();
	}
}
