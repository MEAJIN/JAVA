import java.awt.*;
import javax.swing.*;



public class a1 extends JFrame { // JFrame�� ��ӹ޴� a1
	
	public a1() { // ������ a1����
		
		setTitle("�̹��� ����");
		setSize(595,220); // ������â ������
		setLayout(new GridLayout(0, 3)); // 3���� ���� �ʿ��� ��ŭ�� ���� ������ �׸��巹�̾ƿ� ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // ���� ��ư�� ������ �� �����츦 ������ �����ϱ� ���� ���
		
		JLabel a1,b2,c3; // ���� ����
		
		ImageIcon a=new ImageIcon("E:\\JAVA (������)\\12����\\1.jpg");
		ImageIcon b=new ImageIcon("E:\\JAVA (������)\\12����\\2.jpg");
		ImageIcon c=new ImageIcon("E:\\JAVA (������)\\12����\\3.jpg");
		// ������ �̹��� �������� �����´� 
		
		a1=new JLabel(a,JLabel.CENTER);
		a1.setVerticalTextPosition(JLabel.BOTTOM);
		a1.setHorizontalTextPosition(JLabel.CENTER);
		//  ù��° ���� �ʱ�ȭ�ϰ� ��ġ�� �����Ѵ�.
		  
		b2=new JLabel(b,JLabel.CENTER);
		b2.setVerticalTextPosition(JLabel.CENTER);
		b2.setHorizontalTextPosition(JLabel.RIGHT);
		//  �ι�° ���� �ʱ�ȭ�ϰ� ��ġ�� �����Ѵ�.
		  
		 c3=new JLabel(c,JLabel.CENTER);
		 c3.setVerticalTextPosition(JLabel.TOP);
		 c3.setHorizontalTextPosition(JLabel.LEFT);
		//  ����° ���� �ʱ�ȭ�ϰ� ��ġ�� �����Ѵ�.
		  
		  
		  getContentPane().add(a1);
		  getContentPane().add(b2);
		  getContentPane().add(c3);
		  //������ ���� ��ġ�Ѵ�.
	
		setVisible(true); // ������ â�� �߰� ��
	}
	
	public static void main(String args[]) {
	
		new a1(); // ������ a1�� ȣ��
	}
	
}
