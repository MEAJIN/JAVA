class RectangleTest{ // RectangleTestŬ���� ����
	
	int x=2;  // 4����Ʈ ������ ���� x�� 2�� ����
	int y=4; // 4����Ʈ ������ ���� y�� 4�� ����
	int w=8; // 4����Ʈ ������ ���� w�� 8�� ����
	int h=16; // 4����Ʈ ������ ���� h�� 16�� ����
	
	int getArea() { // ������  getArea�޼ҵ� ����
		return w*h; //���ϰ� ����
		
	}
	
	void print() { // print�޼ҵ� ����
		System.out.println("�簢���� ��ǥ��"+x+", "+y+"�Դϴ�. "
								+ "�簢���� ������ "+getArea()+"�Դϴ�."); //�����Ϳ� ��ǥ�� ���� ���
	}

	public static void main(String[] args) { //���� �޼ҵ� ����
		
		RectangleTest a =new RectangleTest(); // a ��ü ����
		
		a.getArea(); // a ��ü�� getArea�޼ҵ� ȣ��
		a.print(); // a ��ü�� print �޼ҵ� ȣ��

	}

}