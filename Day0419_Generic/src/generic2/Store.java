package generic2;

public class Store <T> {
	//T사 클래스 내부에서 하나의 탑입처럼 사용하시면 됩니다.
	
	private T date;
	
	public void setDate(T date) {
		this.date = date;
	}
	public T getDate() {
		return date;
	}
	public String toString() {
		return "data : " + date;
	}
	
	
}
