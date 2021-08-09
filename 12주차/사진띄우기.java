import java.awt.*;
import javax.swing.*;



public class a1 extends JFrame { // JFrame을 상속받는 a1
	
	public a1() { // 생성자 a1생성
		
		setTitle("이미지 나열");
		setSize(595,220); // 윈도우창 사이즈
		setLayout(new GridLayout(0, 3)); // 3개의 열과 필요한 만큼의 행을 가지는 그리드레이아웃 생성
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 종료 버튼을 눌렀을 때 윈도우를 완전히 종료하기 위해 사용
		
		JLabel a1,b2,c3; // 변수 선언
		
		ImageIcon a=new ImageIcon("E:\\JAVA (삭제ㄴ)\\12주차\\1.jpg");
		ImageIcon b=new ImageIcon("E:\\JAVA (삭제ㄴ)\\12주차\\2.jpg");
		ImageIcon c=new ImageIcon("E:\\JAVA (삭제ㄴ)\\12주차\\3.jpg");
		// 각각의 이미지 아이콘을 가져온다 
		
		a1=new JLabel(a,JLabel.CENTER);
		a1.setVerticalTextPosition(JLabel.BOTTOM);
		a1.setHorizontalTextPosition(JLabel.CENTER);
		//  첫번째 라벨을 초기화하고 위치를 선정한다.
		  
		b2=new JLabel(b,JLabel.CENTER);
		b2.setVerticalTextPosition(JLabel.CENTER);
		b2.setHorizontalTextPosition(JLabel.RIGHT);
		//  두번째 라벨을 초기화하고 위치를 선정한다.
		  
		 c3=new JLabel(c,JLabel.CENTER);
		 c3.setVerticalTextPosition(JLabel.TOP);
		 c3.setHorizontalTextPosition(JLabel.LEFT);
		//  세번째 라벨을 초기화하고 위치를 선정한다.
		  
		  
		  getContentPane().add(a1);
		  getContentPane().add(b2);
		  getContentPane().add(c3);
		  //각각의 라벨을 배치한다.
	
		setVisible(true); // 윈도우 창이 뜨게 함
	}
	
	public static void main(String args[]) {
	
		new a1(); // 생성자 a1을 호출
	}
	
}
