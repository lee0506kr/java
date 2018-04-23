
public class ArrayCopy {
	public static void main(String[] args) {
		// 배열복사(값 복사, 주소 복사)

		int num1 = 10;
		int num2 = num1;

		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		// num2를 증가 시킴
		num2++;
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);

		int[] arr1 = { 1, 3, 5 };
		int[] arr2 = arr1;
		System.out.println("arr1 : ");
		for (int num : arr1) {
			System.out.println(num + " ");
		}
		System.out.println("\narr2: ");
		for (int num : arr2) {
			System.out.println(num + " ");
		}

		arr2[0]++; // 얕은복사(shallow copy! 주소값만복사
		System.out.println("\narr1 : ");
		for (int num : arr1) {
			System.out.println(num + " ");
		}
		System.out.println("\narr2: ");
		for (int num : arr2) {
			System.out.println(num + " ");
		} // 주소값만 복사했기 때문에 복사본의 데이터를 바꾸게 되면, 원본이 바뀌는것과

		// 깊은 복사(Deep copy): 모든 원소를 하나하나 복사
		arr2 = new int[arr1.length];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = arr1[i];
		}

		// 깊은 복사후 증가
		arr2[0]++;

		System.out.println("\narr1 : ");
		for (int num : arr1) {
			System.out.println(num + " ");
		}
		System.out.println("\narr2: ");
		for (int num : arr2) {
			System.out.println(num + " ");
		}

	}
}
