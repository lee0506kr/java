package Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {
	public static void main(String[] args) {
		/*
		 * key - value로 이루어진 자료구조
		 * 
		 * Map: key-value 로 이루어진 자료구조 key: 중복안되는 유일한 값 value:중복가능, key와 쌍을 이루는 데이터
		 * 
		 */
		/*
		 * Map : 인터페이스 , 구현클래스 >>HashMap key : iny, value:String
		 */

		Map<Integer, String> map = new HashMap<>();

		// 데이터를 추가할때는 key와 value를 쌍으로 저장해야 한다.
		map.put(1, "APPLE");
		map.put(3, "Grape");
		map.put(5, "Tomato");
		map.put(7, "Pineapple");

		// 가져 올때는 key값으로 value를 가져 올 수 있음

		for (int i = 0; i < 9; i++) {
			System.out.println(map.get(i));
		}

		System.out.println("******************");
		map.put(5, "WaterMellon");

 		System.out.println(map.get(5));
		// 애도 set이랑 같이 순서가 없음
		// key를 모를때?
		// key가 있는지 없는지 검사
		System.out.println(map.containsKey(15));
		// 모든 요소를 다 보고싶다.
		// map자체는 for each에 사용할 수 없음
		// entrySet()을 이용 >> map의 요소를 set으로 만들어냄
		
		for (Map.Entry<Integer, String> e : map.entrySet()) {
			int num = e.getKey();
			String str = e.getValue();
		}
		// KeySet을 얻어올 수 있음
		Set<Integer> keySet = map.keySet();
		
		
		
		

		for (int num : keySet) {
			String str = map.get(num);
			System.out.println(num + " : " + str);

		}
		// KeySet에 있는 Iteger 이용하거나

		Iterator<Integer> it = keySet.iterator();

		while (it.hasNext()) {
			int key = it.next();
			String str = map.get(key);
			System.out.println(key + ":" + str + " ");
		}

	}

}
