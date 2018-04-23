
public class SelectionSort {
	public static void main(String[] args) {
		
		// 중첩 반복을 이용해야한다.

		/*// 변수간 값을 바꾸는 방법
				int a, b;
				a = 3;
				b = 10;
				// b의 값을 임시로 저장할 변수를 하나 선언
				int tmp; 
				tmp = b; 
				b = a;  
				a = tmp; 
				System.out.println(a);
				System.out.println(b);*/

		//1. 첫번째 칸부터 가장 작은 값을 찾아서 넣는다.
		//0번에 들어갈 가장작은 수를 찾는다. 0번부터 4번까지 반복
		//1번에 들어갈 가장작은 수를 찾는다. 1번부터 4번까지 반복
		//2번에 들어갈 가장작은 수를 찾는다. 2번부터 4번까지 반복
		//3번에 들어갈 가장작은 수를 찾는다. 3번부터 4번까지 반복
		//4번에 들어갈 가장작은 수를 찾는다. 4번부터 4번까지 반복
		
		//1.현재 인덱스의 값을 최소값변수의 값으로 지정
		//2.배열의 0번부터 4번까지 최소값과 비교한다.
		// 비교하다가 최소값이 더크다면, 최소값을 비교 대상으로 바꿔준다.
		//3.4번인덱스 까지 최소값 비교를 반복한다.
		int[] arr = { 3, 5, 4, 1, 2 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] > arr[j]) {

					int tmp; // 저장할 공간

					tmp = arr[i]; 
					arr[i] = arr[j];
					arr[j] = tmp;

				}

			}

		}
	
		
	/*	for(int i=0; i<arr.length; i++) {
			for(int j=i+1; j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int tmp;
					tmp = arr[i];
					arr[i]=arr[j];
					arr[j]=tmp;
				}			
			}
		}*/
		
		for (int e : arr) {
			System.out.print(e + " ");
		}

	}
}
