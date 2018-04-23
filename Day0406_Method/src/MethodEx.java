
public class MethodEx {
	public static void main(String[] args) {

		// A가 학교에 가는 프로그램을 작성
//		System.out.println("A가 일어난다");
//		System.out.println("A가 씻다");
//		System.out.println("A가 밥을먹는다");
//		System.out.println("A가 버스를탄다");
//		System.out.println("A가 공부를한다");
//		System.out.println("A가 귀가를한다");
//		System.out.println("A가 씻고 잠을 잔다");

//		goSchoolA(); //메서드 호출 
//		goSchoolB();
		int a = 3+5;
		int b = goSchool("A");//메서드의 반환값을 얻는다.b=0값 //파라미터를 정의하면, 인자를 넘겨줘야 한다.
		//인자(argument)를 넘겨줘야한다.
		goSchool("B");
		System.out.println("Do Something");
		System.out.println(b);
		goSchoolA();
	
	} 
	//main end
	/*
	 * 메서드 모양
	 * []:있어도 되고 없어도 된다.
	 * [수식자] 반환형 식별자([매개변수]){
	 * 		반환값;
	 * }
	 * 
	 */
	public static void goSchoolA() {
		System.out.println("A가 일어난다");
		System.out.println("A가 씻다");
		System.out.println("A가 밥을먹는다");
		System.out.println("A가 버스를탄다");
		System.out.println("A가 공부를한다");
		System.out.println("A가 귀가를한다");
		System.out.println("A가 씻고 잠을 잔다");
	}
	public static void goSchoolB() { //식별자 여서 이름이 같아서는 안된다.
		System.out.println("B가 일어난다");
		System.out.println("B가 씻다");
		System.out.println("B가 밥을먹는다");
		System.out.println("B가 버스를탄다");
		System.out.println("B가 공부를한다");
		System.out.println("B가 귀가를한다");
		System.out.println("B가 씻고 잠을 잔다");
		return;
	}
	public static int goSchool(String str) {
		//메서드의 외부로 부터 값을 받아오는 방법
		//>>>매개변수, 파라미터(parameter)
		
		String name =str; //외부로 부터 받아온 값을 사용
		
//		if(name.equals("B")) {
//			return 0;
//		}
		
		
		System.out.println(name+"가 일어난다");
		System.out.println(name+"가 씻다");
		System.out.println(name+"가 밥을먹는다");
		System.out.println(name+"가 버스를탄다");
		System.out.println(name+"가 공부를한다");
		System.out.println(name+"가 귀가를한다");
		System.out.println(name+"가 씻고 잠을 잔다");
		
		return 1; //결과값을 주기위해서 
	
	}
	
}
