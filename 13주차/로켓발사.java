import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class one extends JFrame implements ActionListener {
	Image img;
	Timer timer;
	int pos_x = 0, pos_y = 537;
	private int xSpeed = 3, ySpeed = 3;
	private static final int PERIOD = 10; // 시간

	// 내부 클래스
	class MyPanel extends JPanel {

		// MyPanel 생성자
		public MyPanel() {
			setBackground(Color.black); // 배경을 검정색으로 설정
		}

		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.drawImage(img, pos_x, pos_y, this); // 화면에 이미지 그리기
		}
	}

	public void update() { // 좌표 이동
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

		timer = new Timer(PERIOD, this); // 10ms마다 타이머가 걸림
		timer.start();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) { // ActionListener인터페이스 구현
		update();
		repaint();
	}

	public static void main(String[] args) {
		one a = new one();
	}
}
