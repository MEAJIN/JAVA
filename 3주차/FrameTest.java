`import javax.swing.*; // javax.swing이라는 패키지 안의 모든 클래스를 읽어들인다.

public class FrameTest {  // FrameTest 클래스 생성

	public static void main(String[] args) { // 메인 메소드 실행

		JFrame f = new JFrame("Frame Test"); // JFrame 클래스의 객체를 f라고 생성한 후, 생성자 호출

		f.setSize(300, 200); // JFrame클래스의 메소드 호출
		f.setLocation(30, 20); // JFrame클래스의 메소드 호출
		
		
		JFrame ff = new JFrame("Frame Test2"); // JFrame 클래스의 객체를 ff라고 생성한 후, 생성자 호출

		ff.setSize(300, 200); // JFrame클래스의 메소드 호출
		ff.setLocation(30, 300); // JFrame클래스의 메소드 호출
		
		
		for(int a=1; a<=1500;a++) {  // 정수형 변수 a에 1값주고 a가 1500보다 작거나 같을 때 까지 a값을 1씩 증가하면서 반복문 실행

			f.setLocation(a*5, 20); // JFrame클래스의 메소드 호출해서 값 대입
			f.setVisible(true); // JFrame클래스의 메소드 호출해서 값 대입
			
			ff.setLocation(a*6,500); // JFrame클래스의 메소드 호출해서 값 대입	
			ff.setVisible(true); // JFrame클래스의 메소드 호출해서 값 대입
			
		
	}

}
	
}