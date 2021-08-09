class RectangleTest{ // RectangleTest클래스 생성
	
	int x=2;  // 4바이트 정수형 변수 x에 2값 대입
	int y=4; // 4바이트 정수형 변수 y에 4값 대입
	int w=8; // 4바이트 정수형 변수 w에 8값 대입
	int h=16; // 4바이트 정수형 변수 h에 16값 대입
	
	int getArea() { // 정수형  getArea메소드 생성
		return w*h; //리턴값 지정
		
	}
	
	void print() { // print메소드 생성
		System.out.println("사각형의 좌표는"+x+", "+y+"입니다. "
								+ "사각형의 면적은 "+getArea()+"입니다."); //프린터에 좌표와 면적 출력
	}

	public static void main(String[] args) { //메인 메소드 실행
		
		RectangleTest a =new RectangleTest(); // a 객체 생성
		
		a.getArea(); // a 객체의 getArea메소드 호출
		a.print(); // a 객체의 print 메소드 호출

	}

}