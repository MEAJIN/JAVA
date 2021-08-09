import javax.swing.JFrame; 
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class a3 extends JFrame implements ActionListener {

	private JTextArea input, output; //변수 선언
 
	private JButton translate, cancel; // 변수 선언
	
	public void init() {

		input = new JTextArea(); // 값을 입력 받을 텍스트 창 생성

		output = new JTextArea(); // 값을 입력 받을 텍스트 창 생성

		translate = new JButton("번역"); // 버튼 생성

		cancel = new JButton("취소"); // 버튼 생성

		translate.addActionListener(this); //액션리스너 넣기.

		translate.setBounds(140, 225, 100, 40); // 위치 설정.(x축, y축, 너비, 높이)

		cancel.addActionListener(this); //액션리스너 넣기.

		cancel.setBounds(255, 225, 100, 40); // 위치 설정.(x축, y축, 너비, 높이)

		input.setBounds(10, 10, 230, 210); // 위치 설정.(x축, y축, 너비, 높이)

		output.setBounds(255, 10, 230, 210); // 위치 설정.(x축, y축, 너비, 높이)

		}

		public a3() { // 생성자 aa생성

			super("변환기"); 

			setDefaultCloseOperation(3); //종료버튼 누를경우, 종료돼게 설정.

			setLayout(null); //레이아웃을 널로 설정.

			setSize(510, 320); //윈도우 사이즈 설정.

			init(); //화면을 띄우기 전 설정.

			
			add(input); //컴포넌트를 추가.

			add(output); //컴포넌트를 추가.

			add(translate); //컴포넌트를 추가.

			add(cancel); //컴포넌트를 추가.

			setVisible(true); //화면을 띄움.

}

	public void actionPerformed(ActionEvent e) {

		Object src = e.getSource(); // 어떤 컴포넌트의 액션을 받았는지 확인

		if(src == translate) { // 영문 뜻이 한글과 일치한 단어가 있을 경우 밑의 문장 실행

			String han_word = input.getText(); // 문자형태로 값을 입력 받음

			han_word = han_word.replaceAll("Student", "학생"); // 단어 추가

			han_word = han_word.replaceAll("Me", "나"); // 단어 추가
			
			han_word = han_word.replaceAll("free", "자유"); // 단어 추가

			output.setText(han_word);	// 영문의 뜻이 output창에 뜨도록 함

		} 

		else if(src == cancel) { // 취소 버튼을 누르면 윈도우 창이 꺼진다.
			
				setVisible(false);
				dispose();
		}
}

public static void main(String _args[]) {

	new a3(); //컨스트럭터 실행.

	}
}