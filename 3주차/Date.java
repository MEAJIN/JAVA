class Date{ //DateŬ���� ����
	
	String a="2012, 7, 12"; // ������ a��� ������ 2012, 7, 12�� ����
	String b="July 12, 2012"; // ������ b��� ������  July 12, 2012�� ����
	
	void print1() { //print1�޼ҵ� ����
		System.out.println(a); //ȭ�鿡 a�� ���
	}
	
	void print2() { //print2 �޼ҵ� ����
		System.out.println(b); // ȭ�鿡 b�� ���
	}

	public static void main(String[] args) { //���� �޼ҵ� ����

		Date q=new Date(); // q ��ü ����

		q.print1(); // q ��ü�� ����Ʈ1 �޼ҵ� ȣ��
		q.print2(); // q ��ü�� ����Ʈ2 �޼ҵ� ȣ��
		
	}

}