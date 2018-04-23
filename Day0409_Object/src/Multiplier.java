
// Multiplier
// 상태값 : 결과를 저장하는 변수 : result(정수)
// 동작(메서드) : 출력 x , 매개변수로 전달받은
// 두 정수를 곱해서 결과를 result에 저장하고,

// 결과를 반환 (return)하는 메서드 mutiply()작성

// MultiplierTest main에서 해야할일
// Multiplier 객체 만들고 mutiply() 실행해보기

// 결과값을 저장할 수 있는 변수

// 두 정수를 입력받아서 곱을 구하는 기능, 결과 를 반환
class Multiplier {
	public Multiplier(int number) {
		System.out.println("Multiplier의 생성자 입니다.");
		result = number;
	}

	public Multiplier(/*기본생성0*/) {
		System.out.println("Multiplier의 기본생성자 입니다.");
	}

	// 결과값을 저장할 수 있는 변수
	int result;
	double resultDouble;

	// 두 정수를 입력받아서 곱을 구하는 기능,결과 를 반환
	public int multiply(int x, int y) {
		System.out.println("정수곱");
		result = x * y;
		return result;
	}

	// 두 실수를 입력받아서 곱을 구하는 기능,결과 를 반환
	public double multiply(double x, double y) {
		System.out.println("실수곱");
		resultDouble = x * y;
		return resultDouble;
	}
}
