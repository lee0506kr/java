package generic1;

public class StoreTest {

	public static void main(String[] args) {
		// store 클래스 객체 만들어서 다양한 종류의 데이터 넣어보기
		Store s1 = new Store();
		s1.setData(10); //Object를 인자로 받기 때문에 모든 데이터를 넣을수 있음
		System.out.println("s1 : " + s1.getData());
		
		Store s2 = new Store();
		s2.setData("데헷");
		System.out.println("s2 : " + s2.getData());
		
		
		//Store.getDate():는 Object를 반환한다.
		//자식클래스의 변수에 참조 될 수 없다. (자동 캐스팅이 안된다.)
		//int a = s1.getDate();
		String str = (String)s2.getData();
		System.out.println("str : "+ str);
		
		//부모클래스의 참조변수에 참조된 객체가 정확히 어떤 객체인지 모르기때문에
		//예외 발생가능성이 높다. 형변환 하는것도 불편하고...
		String str2 = (String)s1.getData();
		
		if(s1.getData() instanceof String) {
			String str3 = (String)s1.getData();
		}else {
			System.out.println("문자열아니에요 바꿀수 없어요.");
		}
	}

}
