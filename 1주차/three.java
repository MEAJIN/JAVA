
public class two {  //3�� ����

	public static  void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 29; //4����Ʈ ������ num������ 29�� ����
		
		boolean flag = false; // 8����Ʈ �Ǽ��� flag�� ���� ����
		
		for(int i=2; i<num;++i) { //�ݺ��� ���.  4����Ʈ ������ i������ 2����. i�� num���� ������ ���� 1�� �����ϸ鼭 �ݺ�
			
			if(num %i ==0) {  // ���� num�� i�� ������ �� �������� 0�̸�
				
				flag = true; // flag�� �� ���
				
				break;  //�׸��� �ݺ��� Ż��
			}
		}
		
		if(!flag) //���� flag�� �Ҽ��̸� �´� �߰� �ƴϸ� not���
			System.out.println(num + " is a prime number.");
		else
			System.out.println(num + " is not a prime number.");
		
	}

}