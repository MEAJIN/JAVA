class Date{ //Date클래스 생성
	
	String a="2012, 7, 12"; // 문자형 a라는 변수에 2012, 7, 12값 지정
	String b="July 12, 2012"; // 문자형 b라는 변수에  July 12, 2012값 지정
	
	void print1() { //print1메소드 생성
		System.out.println(a); //화면에 a값 출력
	}
	
	void print2() { //print2 메소드 생성
		System.out.println(b); // 화면에 b값 출력
	}

	public static void main(String[] args) { //메인 메소드 실행

		Date q=new Date(); // q 객체 생성

		q.print1(); // q 객체의 프린트1 메소드 호출
		q.print2(); // q 객체의 프린트2 메소드 호출
		
	}

}