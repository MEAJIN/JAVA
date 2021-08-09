 class counter1 { //counter1 클래스 생성

	int counter; //정수형 counter 변수 선언

		void up() {   //up이라는 메소드 생성

			counter ++;  //카운터를 1씩 증가
	}
		void getCount() {  //getCount라는 메소드 생성
			
			System.out.println(counter); //카운터를 화면에 출력
		}
		
		
	public static void main(String[] args) {  // 메인 메소드 실행
		
		counter1 s = new counter1(); // s 객체 생성
		
		s.counter=100; // s 객체의 메소드에 100값을 넣어 준다.

		s.up(); // s 객체의 up메소드 호출
		s.up();
		
		
		s.getCount(); // s 객체의 getcount메소드 호출
		
	}

}