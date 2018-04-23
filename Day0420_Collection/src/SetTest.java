import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {
	public static void main(String[] args) {

		// Set Collection 인터페이스 구현해놓은 구현 클래스중 하나가 Hashset

		Set<String> set1 = new HashSet<String>();
		Set<String> set2 = new HashSet<String>();

		set1.add("A");
		set1.add("B");
		set1.add("C");
		set1.add("B");

		set2.add("D");
		set2.add("F");
		set2.add("A");
		set2.add("G");

		// 이미 들어가 있으면 false, 없으면 넣고 나서 true 변환
		// 중복이면 내용을 넣지 않는다.

		System.out.println(set1.add("F"));

		// 순서가 없기 때문에 요소에 접근이 안됨!!

		System.out.println(set1.contains("A"));
		// 내용을 확인해야 할 일이 있다! >> Iterator를 이용
		// Iterator : 하나 씩, 모든 요소에 대해서 반복하면서 요소를 가져다 주는 역할
		// set이 가지고 있는 요소에 접근할 거기 때문에 set이 가지고 있는 iterator를 이용
		Iterator<String> it = set1.iterator();

		// hasNext(): 정렬 되어있는데로 찍어준다
		while (it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		}
		// 차집합A-B : {C,B},
		// 합집합A+B : {A,B,C,D,F,G}
		// 교집합 : {A,D}

		HashSet<String> union; // 합집합 저장할 변수
		HashSet<String> diffence; // 차집합 저장할 변수
		HashSet<String> intersection; // 교집합 저장할 변수

		union = new HashSet<String>(set1);
		diffence = new HashSet<String>(set1);
		intersection = new HashSet<String>(set1);
		// 합집합 만들기 위해서는 set2를 더하면됨
		union.addAll(set2);
		System.out.println(union);

		// 차집합 만들기 위해서는 set2를 빼면됨
		diffence.removeAll(set2);
		System.out.println(diffence);

		// 교집합을 만들기 위해서는 set2와 겹치는것만 남기면됨
		intersection.retainAll(set2);
		System.out.println(intersection);
	}

}
