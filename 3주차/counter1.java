 class counter1 { //counter1 Ŭ���� ����

	int counter; //������ counter ���� ����

		void up() {   //up�̶�� �޼ҵ� ����

			counter ++;  //ī���͸� 1�� ����
	}
		void getCount() {  //getCount��� �޼ҵ� ����
			
			System.out.println(counter); //ī���͸� ȭ�鿡 ���
		}
		
		
	public static void main(String[] args) {  // ���� �޼ҵ� ����
		
		counter1 s = new counter1(); // s ��ü ����
		
		s.counter=100; // s ��ü�� �޼ҵ忡 100���� �־� �ش�.

		s.up(); // s ��ü�� up�޼ҵ� ȣ��
		s.up();
		
		
		s.getCount(); // s ��ü�� getcount�޼ҵ� ȣ��
		
	}

}