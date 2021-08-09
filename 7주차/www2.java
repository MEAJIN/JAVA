class Circle {
	
	private double radius;
	private String color;
	
	public Circle() {
		
		radius = 1.0;
		color = "red";	
	}
	
	public Circle(double radius) {
		super();
		this.radius = radius;
		this.color = "red";
	}

	public Circle(double radius, String color) {
		super();
		this.radius = radius;
		this.color = "red";
	}

	public double getRadius() {
		return radius;
	}

	public String getColor() {
		return color;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public double getArea() {
		return radius*3.14;
	}
	
	public String toString() {
		return "Circle [radius=" + radius + ", color=" + color + "]";
	}
}
class Pizza {	
		private String type;
		private int price;
		public double radius;
	
		public Pizza(String s, int p, int r) {
			type=s;
			price=p;
			radius=r;
		}
		
		public void Pizza() {
			System.out.println("��������: "+type+" |"+" ���� ����:"+price+" |"+" ���� ����:"+radius);
		}
	}

public class www2 {
	
	public static void main(String[] args) {
		Circle p1 = new Circle (10,"black");
		System.out.println(p1.toString());
		
		System.out.println();
		
		Circle p2 = new Circle ();
		System.out.println("���� :"+p2.getRadius()+" |"+" ���� :"+p2.getColor());
		
		System.out.println();
		
		Circle p3 = new Circle ();
		System.out.println("���� :"+p3.getArea());
		
		System.out.println();
		
		Pizza p4 = new Pizza ("��������",5000,2);
		p4.Pizza();
		
		System.out.println();
		System.out.println("������ ���� ū ������ ������"+p4.radius+"�Դϴ�.");
		
	}
}
	