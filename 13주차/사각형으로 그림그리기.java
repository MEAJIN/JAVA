import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

	public class two extends JFrame {
		int x = 0, y = 0;
	
		public two() { 	// ������
			setTitle("�簢�� �̵� �ϱ�");
			setSize(400, 400);
			
			add(new MyPanel());
			
			setVisible(true);
			
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		}
		
	class MyPanel extends JPanel { // ���� Ŭ����
		
		protected void paintComponent(Graphics g) { // �簢�� �׸���
			super.paintComponent(g);
			g.setColor(new Color(17, 1, 22));
			g.fillRect(x, y, 150, 150);
		}

		public MyPanel() {
			addMouseMotionListener(new MouseMotionAdapter() { // ���콺 �̺�Ʈ ó��
				
				public void mouseDragged(MouseEvent e) {
					
					if (e.getX() > 0 && e.getY() > 0 && e.getX() < x + 100 && e.getY() < y + 100) { // ���� �� ��ǥ �� ����
						
						x = e.getX() - 50; // �簢�� �߾����� Ŀ�� �ű�
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