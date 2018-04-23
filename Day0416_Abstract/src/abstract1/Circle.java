package abstract1;

public abstract class Circle extends Shape{
	//원은 다른도형에 없는 반지름 요소를 가짐
	
	private int radius;
	public static final double PI = 3.14;

	public Circle() {
		super("원",1,0);
	}
	public Circle(int radius) {
		super("원",1,0);
		this.radius = radius;
		
	}
	public void drew() {
		System.out.println("원을 그립니다.");
	}
	public void calArea() {
		area = radius *radius *3.14;
	}
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", name=" + name + ", numOfLines=" + numOfLines + ", area=" + area + "]";
	}
	
	
	

}
