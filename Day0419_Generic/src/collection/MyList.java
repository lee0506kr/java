package collection;

/*
 * ArrayList의 동작과 매우 비슷한 List 만들기
 * add(E) : 파라미터로 전달받은 데이터를 array에 추가
 * remove(int) : 인덱스를 전달받아서 array에서 해당 인덱스의 데이터를 삭제
 * get(int) :인덱스를 전달받아서 해당 인덱스의 데이터를 반환
 * size() : array 길이 반화
 * set(int,date) : 특정 인덱스에 데이터 넣기
 * 
*/
public class MyList<E> {
	// 데이터를 저장하기 위해서는 배열이 필요
	E[] array;

	public MyList() {
		// 크기 0인 배열을 생성
		// 애는 안됨array = new E[0]; //애는 객체를 만들어 내는 코드이기 때문에 탑입이 정확하게 명시되어야함
		array = (E[]) new Object[0];
	}

	public void add(E e) {
		//array의 마지막에 data추가하기
		//원래 가지고 있던 array보다 크기가 1 큰 배열 만들어서
		//기존 데이터 복사하고, 마지막에 입력받은 data 추가
		//기존 배열보다 크기 1큰 배열 생성
		E[] tmp = (E[]) new Object[array.length + 1];

		for (int i = 0; i < array.length; i++) {
			tmp[i] = array[i];

		}
		// 마지막 인덱스

		// tmp[array.length] = e;
		tmp[tmp.length - 1] = e;
		
		
		array = tmp;
	}

	public E get(int index) {

		return array[index];
	}

	public void set(int index, E e) {
		//배열의 인덱스에 데이터 넣기
		array[index] = e;

	}

	public void remove(int index) {

		boolean isDeleted = false;
		E[] tmp = (E[]) new Object[array.length - 1];
		
		int j = 0;
		//아니면 복사할곳 j 를 만든다.
		for (int i = 0; i < array.length; i++) {

			if (i == index && !isDeleted) {

				isDeleted = true;
			} else {
				tmp[j] = array[i];
				j++;
			}

		}
		array = tmp;
	}

	public int size() {
		return array.length;
	}

}
