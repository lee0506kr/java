package interface3;

public class DrawableTest {
	public static void main(String[] args) {
		//각종 도형들을 Drawable(interface) 참조변수에 참조 시켜서 사용해보자
		Drawable[] draw = new Drawable[3];

		draw[0] = new Circle();
		draw[1] = new Rectangle();
		draw[2] = new Triangle();
		
		
		for(int i = 0; i<draw.length; i++) {
			draw[i].draw();
		}

		for (Drawable m3 : draw) {
			m3.draw();
		}
	}
}
