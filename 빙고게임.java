import java.util.Scanner;

public class a1 {

	public static void main(String[] args) {
	
	char[][] board = new char[3][3]; // �������� ��Ÿ���� 2���� �迭�� ����
	int x, y;
	
	Scanner s = new Scanner(System.in);
	
	for(int i = 0; i < 3; i++)
		for(int j = 0; j < 3; j++)
			board[i][j] = ' '; // �������� ��Ÿ���� 2���� �迭�� �ʱ�ȭ�Ѵ�.
	
	
	
	do {
		
		for (int i = 0; i < 3; i++) {
			System.out.println("  " + board[i][0] + "|   " + board[i][1] + "|   " + board[i][2]);
			
			if (i != 3)
				System.out.println("---|----|---");
			
		}  // �������� �׸���  
	
		System.out.println("���� ���� ��ǥ�� �Է��Ͻÿ�. : ");
		x = s.nextInt();
		y = s.nextInt();
		
		if (board[x][y] != ' ') {
			System.out.println("�߸��� ��ġ�Դϴ�. ");
			continue;
		} else
			board[x][y] = 'x'; 
		
		//����ڰ� ���� ��ġ �˻�
		
		
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

