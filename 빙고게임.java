import java.util.Scanner;

public class a1 {

	public static void main(String[] args) {
	
	char[][] board = new char[3][3]; // 게임판을 나타내는 2차원 배열을 생성
	int x, y;
	
	Scanner s = new Scanner(System.in);
	
	for(int i = 0; i < 3; i++)
		for(int j = 0; j < 3; j++)
			board[i][j] = ' '; // 게임판을 나타내는 2차원 배열을 초기화한다.
	
	
	
	do {
		
		for (int i = 0; i < 3; i++) {
			System.out.println("  " + board[i][0] + "|   " + board[i][1] + "|   " + board[i][2]);
			
			if (i != 3)
				System.out.println("---|----|---");
			
		}  // 게임판을 그린다  
	
		System.out.println("다음 수의 좌표를 입력하시오. : ");
		x = s.nextInt();
		y = s.nextInt();
		
		if (board[x][y] != ' ') {
			System.out.println("잘못된 위치입니다. ");
			continue;
		} else
			board[x][y] = 'x'; 
		
		//사용자가 놓은 위치 검사
		
		
		int i = 0, j =0;
		for(i=0; i<3; i++) {
			for(j=0; j<3; j++)
				if (board[i][j] == ' ')
					break;
			
				if (board[i][j] == ' ')
					break;
		}
		
			if (i<3 && j <3)
				board[i][j] = '0';
			
	}    while (true);
	
		}
	}

