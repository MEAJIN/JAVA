import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

	public class two extends JFrame {
		int x = 0, y = 0;
	
		public two() { 	// 생성자
			setTitle("사각형 이동 하기");
			setSize(400, 400);
			
			add(new MyPanel());
			
			setVisible(true);
			
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		
	class MyPanel extends JPanel { // 내부 클래스
		
		protected void paintComponent(Graphics g) { // 사각형 그리기
			super.paintComponent(g);
			g.setColor(new Color(17, 1, 22));
			g.fillRect(x, y, 150, 150);
		}

		public MyPanel() {
			addMouseMotionListener(new MouseMotionAdapter() { // 마우스 이벤트 처리
				
				public void mouseDragged(MouseEvent e) {
					
					if (e.getX() > 0 && e.getY() > 0 && e.getX() < x + 100 && e.getY() < y + 100) { // 도형 내 좌표 값 범위
						
						x = e.getX() - 50; // 사각형 중앙으로 커서 옮김
						y = e.getY() - 50;
						
						repaint();
					}
				}
			});
		}
	}

	public static void main(String[] args) {
		two a = new two();
	}

}