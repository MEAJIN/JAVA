public class fore{ //4¹ø ¹®Á¦

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num = 29;
		int i = 0;
		
		boolean flag = false;
		
		while(i<num) {
			
			
			i++;
			
			if(num %i ==0) {
				
				flag = true;
				
				break;
			}
		}
		
		if(!flag)
			System.out.println(num + " is a prime number.");
		else
			System.out.println(num + " is not a prime number.");
		
	}
}