
public class Circle {

	// 반지름, 중심점
	/*
	 * private int radius;//반지름 //int x,y; private Point center;
	 * 
	 * 
	 * public Circle() { //개발자가 초기화를 하지 않으면, 참조 자료형의 경우 null 로 초기화 center = new
	 * Point(); } public Circle(int radius,Point center) { this.radius = radius;
	 * this.center = center; } public Circle(int radius,int x, int y) { this.radius
	 * = radius; center = new Point(); center.setX(x); center.setY(y); }
	 * 
	 * public void setRadius(int radius) { this.radius = radius; } public int
	 * getRadius() { return this.radius; } public void setCenter(Point center) {
	 * this.center= center; } public Point getCenter() { return this.center; }
	 * 
	 * public double circumference() { return 2*3.14*radius; }
	 * 
	 * public double area() { return 3.14*radius*radius; }
	 * 
	 * // public String area() { // return String.format("넓이 : %.2f",
	 * 3.14*radius*radius); // }
	 * 
	 * 
	 * public void printCenter() { System.out.println("x : "+ center.getX() +
	 * " y : "+ center.getY()); }
	 */
	// Circle
	// //중심점(point) center , 반지름 의 상태값을 가짐 radius

	// getter /setter 만들고
	// 생성자(기본생각자.반지름과, 중심점을 매개변수로 받는 생성자)

	// toSting()

	// 메서드는 넓이(3.14*radius*radius)를 반환하는 메서드,
	// 둘레를 반환하는 메서드(2*3.14*radius)

	private Point center; // point 상속
	private int radius;

	public Circle() { //포인트 객체를 생성
		center = new Point();
	}

	public Circle(Point center, int radius) { //외부에서 받아오기
		this.center = center;
		this.radius = radius;
	}

	public Circle(int radius, int x, int y) {
		this.radius = radius;
		center = new Point();
		center.setX(x);
		center.setY(y);
	}

	public double circleArea(int radius) {
		return 3.14 * radius * radius;

	}

	public double circleRound(int radius) {
		return 2 * 3.14 * radius;
	}

	public void printCenter() {

		System.out.println(" x : " + center.getX() + " y : " + center.getY());

	}

	public Point getCenter() {
		return center;
	}

	public void setCenter(Point center) {
		this.center = center;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public String toString() {
		return "Circle [center=" + center + ", radius=" + radius + "]";
	}
}
