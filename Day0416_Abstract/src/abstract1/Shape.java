package abstract1;

public abstract class Shape {

	protected String name;
	protected int numOfLines;
	protected double area;

	public Shape() {
		

	}

	public Shape(String name, int numOfLines, double area) {
		this.name = name;
		this.numOfLines = numOfLines;
		this.area = area;
	}

	public abstract void draw();

	public abstract void calArea();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumOfLines() {
		return numOfLines;
	}

	public void setNumOfLines(int numOfLines) {
		this.numOfLines = numOfLines;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	@Override
	public String toString() {
		return "Shape [name=" + name + ", numOfLines=" + numOfLines + ", area=" + area + "]";
	}
}
