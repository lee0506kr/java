package abstract1;

public class Rectangle extends Shape {
	// 가로 세로 길이가 필요

	private int width;
	private int height;

	public Rectangle() {
		// 사각형 변의개수가 1
		super("사각형", 4, 0);
	}

	public Rectangle(int width, int height) {
		super("사각형", 4, 0);
		this.width = width;
		this.height = height;
	}

	public void draw() {
		System.out.println("사각형을 그립니다.");
	}

	public void calArea() {
		area = width * height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", name=" + name + ", numOfLines=" + numOfLines
				+ ", area=" + area + "]";
	}

}
