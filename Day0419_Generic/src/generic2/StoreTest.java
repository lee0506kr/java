package generic2;

public class StoreTest {
	public static void main(String[] args) {
		//Generic 객체는 다양한 종류의 데이터를 저장할 수 있지만,
		//객체를 만들때 어떤 종류의 데이터를 저장할 지 결정해주어야 함.
		Store<String> s1 = new Store<String>();
		
		//s1은 문자열을 저장할 수 있는 Store 객체
		s1.setDate("Hello");
		String str = s1.getDate();
		System.out.println(str);
		
		//제네릭에는 기초자료형을 사용할 수 없음, Wrapper 클래스 사용
		//Store<int> s2 = new Store<int>();
		Store<Integer> s2 = new Store<Integer>();
		s2.setDate(10);
		int a = s2.getDate();
//		Integer a = new Integer(100);
//		int b = a;
//		System.out.println(b);
		
		System.out.println(a);
		
		//참조 변수는 하나인데 여러 종류의 객체를 참조 시켜서 사용
		Object o = new String("Hello");
		o = new Integer(100);
		o = new Shape();
		
		//제네릭 참조 변수에 어떤 데이터 타입의 제네릭 객체가 참조 될지 모를때
		//와일드카드 를 사용할 수 있다.
		Store<?> g = new Store<String>();
		
		g= new Store<Integer>();
		
		//Shape shape = new Rectangle(); 애는 되지만 제네릭객체 참조는 안된다.
		Store<? extends Shape> s = new Store<Rectangle>();
		Store<? super Rectangle> s3 = new Store<Shape>();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
