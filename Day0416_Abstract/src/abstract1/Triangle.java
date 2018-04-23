
package abstract1;

public abstract class Triangle extends Shape {

	private int weight;
	private int height;

	public Triangle() {
		super("삼각형", 3, 0);
	}

	public Triangle(int weight, int height) {
		super("삼각형", 3, 0);
		this.weight = weight;
		this.height = height;

	}

	public void drew() {
		System.out.println("삼각형을 그립니다.");
	}

	public void calArea() {
		area = weight * height * 0.5;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Triangle [weight=" + weight + ", height=" + height + ", name=" + name + ", numOfLines=" + numOfLines
				+ ", area=" + area + "]";
	}

	
}
