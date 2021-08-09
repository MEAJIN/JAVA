
public class two {  //3번 문제

	public static  void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 29; //4바이트 정수형 num변수에 29값 대입
		
		boolean flag = false; // 8바이트 실수형 flag에 거짓 대입
		
		for(int i=2; i<num;++i) { //반복문 사용.  4바이트 정수형 i변수에 2대입. i가 num보다 작을때 까지 1씩 증가하면서 반복
			
			if(num %i ==0) {  // 만약 num을 i랑 나눴을 때 나머지가 0이면
				
				flag = true; // flag는 참 출력
				
				break;  //그리고 반복문 탈출
			}
		}
		
		if(!flag) //만약 flag가 소수이면 맞다 뜨고 아니면 not출력
			System.out.println(num + " is a prime number.");
		else
			System.out.println(num + " is not a prime number.");
		
	}

}