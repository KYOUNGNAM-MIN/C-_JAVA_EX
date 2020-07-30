package WorkExample;

public class Circle {
	int radius;
	String name;
	final double PI = 3.14;
	
	public Circle() {}
	public Circle(int radius, String name) {
		this.radius = radius;
		this.name = name;
	}
	
	public double getArea() {
		return PI*radius*radius;
	}
	
	public static void main(String[] args) {
		Circle c = new Circle();
		c.radius = 10;
		c.name = "자바피자";
		double area = c.getArea();
		System.out.println(c.name + "의 면적은 " + area);
		
		Circle d = new Circle(1, "자바도넛");
		area = d.getArea();
		System.out.println(d.name + "의 면적은 " + area);
		
		Circle[] arrCircle = new Circle[5];
		for(int i=0; i<arrCircle.length; i++) {
			arrCircle[i] = new Circle(i, "i");
		}
		for(int i=0; i<arrCircle.length; i++) {
			System.out.println((int)arrCircle[i].getArea());
		}
	}

}
