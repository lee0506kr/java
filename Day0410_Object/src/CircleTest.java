
public class CircleTest {
	public static void main(String[] args) {
		//Circle 클래스 객체 만들어서 중심점  반지름 설정하고
				//메서드 호출해보기
				
				
				Circle circle1 = new Circle();
				//1. Circle 기본생성자 호출 하면  center Point도 기본생성자 호출
				Point center = circle1.getCenter();
				center.setX(3);
				center.setY(5); 
				circle1.printCenter();
				
				//2. 외부에서 center 를 만들어서 Circle 의 center 로 지정
				Point p = new Point();
				p.setX(5);
				p.setY(10);
				
				Circle c1 	= new Circle(p,5); 
				
				c1.printCenter();
				p.setX(3);
				p.setY(3);
				c1.printCenter();
				//System.out.println(c1.area());
				//System.out.println(c1.circumference());
				
				double area = c1.area();
				double circumference = c1.circumference();
				
				Circle c2 = new Circle(5,3,4);
				
				c2.printCenter();
				
				//System.out.println();
				//printf 사용하지 않고 문자열 포맷 만들기
				//문자열 만들때 포맷을 지정하고 문자열을 만들면 된다.>> String.format(); 
				
				String str 
				= String.format("둘레 : %.2f, 넓이 : %.2f "
						,circumference,area);
				
//				System.out.println("둘레 : " + circumference 
//						+ " 넓이 : " + area);
				
				System.out.println(str);
				
			
				
				

		/*Circle circle = new Circle();

		int radius = 5;

		Point point = new Point();

		point.setX(5);
		point.setY(8);

		circle.setCenter(point);
		circle.getCenter();

		circle.setRadius(radius);
		circle.getRadius();

		// 메서드는 넓이(3.14*radius*radius)를 반환하는 메서드,
		// 둘레를 반환하는 메서드(2*3.14*radius)

		System.out.println(circle.circleArea(radius));
		System.out.println(circle.circleRound(radius));
		System.out.println(circle);*/
	}

}
