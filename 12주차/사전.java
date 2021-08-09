import javax.swing.JFrame; 
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class a3 extends JFrame implements ActionListener {

	private JTextArea input, output; //���� ����
 
	private JButton translate, cancel; // ���� ����
	
	public void init() {

		input = new JTextArea(); // ���� �Է� ���� �ؽ�Ʈ â ����

		output = new JTextArea(); // ���� �Է� ���� �ؽ�Ʈ â ����

		translate = new JButton("����"); // ��ư ����

		cancel = new JButton("���"); // ��ư ����

		translate.addActionListener(this); //�׼Ǹ����� �ֱ�.

		translate.setBounds(140, 225, 100, 40); // ��ġ ����.(x��, y��, �ʺ�, ����)

		cancel.addActionListener(this); //�׼Ǹ����� �ֱ�.

		cancel.setBounds(255, 225, 100, 40); // ��ġ ����.(x��, y��, �ʺ�, ����)

		input.setBounds(10, 10, 230, 210); // ��ġ ����.(x��, y��, �ʺ�, ����)

		output.setBounds(255, 10, 230, 210); // ��ġ ����.(x��, y��, �ʺ�, ����)

		}

		public a3() { // ������ aa����

			super("��ȯ��"); 

			setDefaultCloseOperation(3); //�����ư �������, ����Ű� ����.

			setLayout(null); //���̾ƿ��� �η� ����.

			setSize(510, 320); //������ ������ ����.

			init(); //ȭ���� ���� �� ����.

			
			add(input); //������Ʈ�� �߰�.

			add(output); //������Ʈ�� �߰�.

			add(translate); //������Ʈ�� �߰�.

			add(cancel); //������Ʈ�� �߰�.

			setVisible(true); //ȭ���� ���.

}

	public void actionPerformed(ActionEvent e) {

		Object src = e.getSource(); // � ������Ʈ�� �׼��� �޾Ҵ��� Ȯ��

		if(src == translate) { // ���� ���� �ѱ۰� ��ġ�� �ܾ ���� ��� ���� ���� ����

			String han_word = input.getText(); // �������·� ���� �Է� ����

			han_word = han_word.replaceAll("Student", "�л�"); // �ܾ� �߰�

			han_word = han_word.replaceAll("Me", "��"); // �ܾ� �߰�
			
			han_word = han_word.replaceAll("free", "����"); // �ܾ� �߰�

			output.setText(han_word);	// ������ ���� outputâ�� �ߵ��� ��

		} 

		else if(src == cancel) { // ��� ��ư�� ������ ������ â�� ������.
			
				setVisible(false);
				dispose();
		}
}

public static void main(String _args[]) {

	new a3(); //����Ʈ���� ����.

	}
}