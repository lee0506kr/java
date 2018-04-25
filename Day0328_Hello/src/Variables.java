//식별자 3개 variables 와 method1,2

public class Variables {
	//필드(멤버변수,클래스 변수) 는 클래스 안에서 참조가능하다.
	//필드 : 클래스 영역에 선언된 변수
	int a=3; //식별자 a ,유일한값 클래스의 시작과 끝
	double b; 
	
	public void method1() {
		//메서드 영역안에서 선언된 변수 :지역변수
		//local variable
		//메서드 안에서만 사용가능하다.
		int c; //지역변수 method 안에 있다.
		//System.out.println(c); //초기화가 되지 않아서 c를 사용할 수 없음
		
		//변수를 사용한다>>>> 변수가 가지는 값을 가지고 온다.
		//선언과 초기화가 필요
		//선언 : 변수를 사용하기 위해서 메모리 공간을 할당 받음
		//초기화: 변수에 처음 값을 한 번 넣어주는 작업
	}
	
	public void method2() {
		int a=4;
		
		System.out.println(a);
	}
}
