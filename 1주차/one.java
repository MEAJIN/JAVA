public class one { //1번 문제
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 int i=1;   // 정수형 4바이트 i에 1값을 지정(개행)
		   int j=0;   //정수형 4바이트 j에 0값을 지정(blank를 위한 변수)
		   int k=0;   // 정수형 4바이트 k에 0값을 지정(별찍기 위한 변수)
		   

		  
		   for(i=1; i<=4;i++)   //개행을 하기 위해 for을 사용. i는 1부터 시작, 매 턴마다 1씩 증가, i가 4보다 작거나 같으면 반복문 탈출
		   {
		    for(j=3; j>=i; j--)   // *피라미드를 만들 때 공백을 위한 for문 . j는 3부터 시작, 매 턴마다 1씩 감소, j가 i보다 크거나 같으면 반복문 탈출
		     System.out.print(" ");  // 공백을 출력
		    for(k=1; k<=i*2-1;k++)  // 홀수 별을 위한 for문(i*2-1: 홀수 까지 for문을 돌려주기 위함.). k는 3부터 시작, 매 턴마다 1씩 증가, k가 i*2-1보다 작거나 같으면 반복문 탈출
		     System.out.print("*");  // * 출력
		    System.out.println();  // 개행
		   }
		      
		   

		   for(i=1; i<=3; i++)   //나머지 세줄을 개행 해주기 위한 for문. i는 1부터 시작, 매 턴마다 1씩 증가, i가 3보다 작거나 같으면 반복문 탈출
		   {
		    for(j=1; j<=i; j++)   //공백을 위한 for문. j는 3부터 시작, 매 턴마다 1씩 증가, j가 i보다 작거나 같으면 반복문 탈출
		     System.out.print(" ");  //공백 출력
		    for(k=5; k>=i*2-1;k--)  //홀수의 별을 위한 for문. k는 5부터 시작, 매 턴마다 1씩 감소, k가 i*2-1보다 크거나 같으면 반복문 탈출
		     System.out.print("*");  //별 출력
		    System.out.println();  //개행
		   }
		
	}
}