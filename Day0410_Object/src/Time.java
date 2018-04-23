
public class Time {
	// 시 , 분 , 초를 저장할 수 잇는변수,
	// 변수들은 외부에서 직접 수정하지 못하도록 private으로 설정

	// 생성자: 기본생성자/시,분,초 를 매개변수로 받는 생성자
	// 메서드: setTime() 시,분,초를 매개변수로 받아서 멤버변수에 설정
	// showTime() : 시간은 x시 x분 x초 입니다
	// 시는 0~23까지만 입력가능
	// 분은 0~59까지만 입력가능
	// 초는 0~59까지만 입력가능
	// 범위가 벗어났을 시에는 0으로 입력한다.

	// TimeTest 만드셔서 main에서 Time객체 만들고 시간 설정후 출력하기
	int hour;
	int minute;
	int second;

	public Time() {
		// 그냥 아무것도 작성하지 않으면 각 0으로 초기화
	}

	public Time(int h, int m, int s) {
		// hour = h;
		// minute = m;
		// second = s;
		// setTime이라는 메서드에서 조건 검사를 했기 때문에
		// setTime을 호출해서 조건검사를 실행
		setTime(h, m, s);
	}

	// setTime 메서드
	public void setTime(int hour, int minute, int second) {
		if (hour > 23 || hour < 0) {
			hour = 0;
		}
		if (minute > 59 || minute < 0) {
			minute = 0;
		}
		if (second > 59 || second < 0) {
			second = 0;
		}
		this.hour = hour; //멤버변수는 this.
		this.minute = minute;
		this.second = second;
	}

	public void showTime() {
		System.out.printf(" %02d 시 %02d 분 %02d 초입니다.", hour, minute, second);
	}

	// TimeTest 만드셔서 main에서 Time 객체 만들고 시간 설정후 출력하기

	public void setHour(int hour) {
		// 멤버변수에 hour
		// 매개변수(로컬변수) 에 hour
		// 메서드 안에서 'hour' 이라는 이름을 사용함녀
		// 지역변수가 사용됨
		// 그런데 멤버 변수에다가 값을 넣어야한다. 이때 사용하는 키워드가 this: 클래스 내부에서 객체를 지칭
		
		this.hour  = hour; //멤버변수 표현 this.
	}
	public int getHour() {
		return this.hour;
	}
	//getter,setter 자동생성
	//source > gener

	public int getMinute() {
		return minute;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public int getSecond() {
		return second;
	}

	public void setSecond(int second) {
		this.second = second;
	}
	//showTime에서 출력했던 문자열을 반환하는 메서드
	
	public String timeString() {
		//" %02d 시 %02d 분 %02d 초입니다."
		String str = hour+"시"+minute+"분"+second+"초";
		return str;
	}
	
	//객체의 변수(상태값) 내용을 쉽게 확인
	//toString() 원래있는 메서드 >>> 우리가 원하는 모양으로 바꿔준다.
	
	public String toString() {
		String str = hour+"시"+minute+"분"+second+"초";
		return str;
	}
	
}
