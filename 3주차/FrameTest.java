`import javax.swing.*; // javax.swing�̶�� ��Ű�� ���� ��� Ŭ������ �о���δ�.

public class FrameTest {  // FrameTest Ŭ���� ����

	public static void main(String[] args) { // ���� �޼ҵ� ����

		JFrame f = new JFrame("Frame Test"); // JFrame Ŭ������ ��ü�� f��� ������ ��, ������ ȣ��

		f.setSize(300, 200); // JFrameŬ������ �޼ҵ� ȣ��
		f.setLocation(30, 20); // JFrameŬ������ �޼ҵ� ȣ��
		
		
		JFrame ff = new JFrame("Frame Test2"); // JFrame Ŭ������ ��ü�� ff��� ������ ��, ������ ȣ��

		ff.setSize(300, 200); // JFrameŬ������ �޼ҵ� ȣ��
		ff.setLocation(30, 300); // JFrameŬ������ �޼ҵ� ȣ��
		
		
		for(int a=1; a<=1500;a++) {  // ������ ���� a�� 1���ְ� a�� 1500���� �۰ų� ���� �� ���� a���� 1�� �����ϸ鼭 �ݺ��� ����

			f.setLocation(a*5, 20); // JFrameŬ������ �޼ҵ� ȣ���ؼ� �� ����
			f.setVisible(true); // JFrameŬ������ �޼ҵ� ȣ���ؼ� �� ����
			
			ff.setLocation(a*6,500); // JFrameŬ������ �޼ҵ� ȣ���ؼ� �� ����	
			ff.setVisible(true); // JFrameŬ������ �޼ҵ� ȣ���ؼ� �� ����
			
		
	}

}
	
}