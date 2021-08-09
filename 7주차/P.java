class Person {
	private String name;
	private int id;
	
	public void printInto() {
		return;
	}
}

class student extends Person {
	private double gpa;
	private int credits;
	
	public String name;
	private int id;
	
	public student(String name, int id, double gpa, int credits) {
		this.name=name;
		this.id=id;
		this.gpa=gpa;
		this.credits=credits;
	}

	public void printInto() {
		return;
	}
}

class Employee extends Person {
	private int salary;
	private int years;
	
	public String name;
	private int id;
	
	public Employee(String name, int id, int salary, int years) {
		this.name=name;
		this.id=id;
		this.salary=salary;
		this.years=years;
		
	}

	public void printInto() {
		return;
	}
}

public class P { 

	public static void main(String[] args) {
		
		student lis1[] = new student[4];
		student p1 = new student("steve jobs", 1, 3.9, 30);
		
		Employee list2[] = new Employee[4];
		Employee p2 = new Employee("Jeff Bezos", 2, 10000, 10);
		
		Employee list3[] = new Employee[4];
		Employee p3 = new Employee("Bill Gates", 3, 20000, 15);
		
		Employee list4[] = new Employee[4];
		Employee p4 = new Employee("steve jobs", 4, 30000, 20);
		
		
		if(p1.equals(p1)==true) 			
		 if (p1.name == "steve jobs")
				System.out.println("p1 객체에서 steve jobs를 찾았습니다.");
			else 
				System.out.println("p1 객체에서 steve jobs를 찾지 못하였습니다.");
		
		if(p2.equals(p2)==true) 			
			 if (p2.name == "steve jobs")
					System.out.println("p2 객체에서  steve jobs를 찾았습니다.");
				else 
					System.out.println("p2 객체에서 steve jobs를 찾지 못하였습니다.");
		
		if(p3.equals(p3)==true) 			
			 if (p3.name == "steve jobs")
					System.out.println("p3 객체에서  steve jobs를 찾았습니다.");
				else 
					System.out.println("p3 객체에서 steve jobs를 찾지 못하였습니다.");
		
		if(p4.equals(p4)==true) 			
			 if (p4.name == "steve jobs")
					System.out.println("p4 객체에서  steve jobs를 찾았습니다.");
				else 
					System.out.println("p4 객체에서 steve jobs를 찾지 못하였습니다.");
		
		
		
		
		
	}

}
