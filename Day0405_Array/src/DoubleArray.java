
public class DoubleArray {
	public static void main(String[] args) {
		// 이차원배열 : 배열을 저장할 수 있는 배열
		// 정수형 데이터를 저장할 수 있는 배열 선언
		int[] intArr = new int[3];
		
		
		// 크기 5인 정수형 배열을 저장하는 크기3인 배열
		// arr 정수형배열의 주소값을 저장하는 배열의 주소값을 저장하는 참조변수

		int[][] Arr = new int[3][5];
		

		System.out.println(Arr.length); // 2차원 배열의 길이 : 3
		System.out.println(Arr[0].length);// 정수형 배열의 길이: 5

		// arr[0],arr[1],arr[2]
		// 는 정수형 배열의 주소값을 저장하는 참조변수

		// arr[0][0]...등등
		// 정수형 변수

		for (int i = 0; i < Arr.length; i++) {
			for (int j = 0; j < Arr.length; j++) {
				System.out.println(Arr[i][j]);
				// System.out.println(Arr[j][i]); //3번째에서 오류가 난다.
			}

		}

		// 정수 5개를 저장할 수 있는 배열 a 선언 및 생성

		int[] a = new int[5];
		System.out.println(a.length);

		// 정수형 배열 3개를 저장할 수 있는 배열b 선언 및 생성

		int[][] b = new int[3][];
		System.out.println(b.length);

		// b의2번째 배열의 크기6인
		b[1] = new int[6];

		// 크기 4인 정수형 배열 6개를 저장하는 배열 c선언 및 생성
		int[][] c = new int[6][4]; // [배열][크기]
		System.out.println(c.length);
		// c의3번째 배열의 있는 2번째 배열의 3

		// c[3][2]= new int[][3];

		double[] d = new double[3];
		b[0] = a;
		// b[1] = d;안된다. b는 정수형 배열의 주소값만 저장할 수 잇다.
		System.out.println("b[0][0] : " + b[0][0]);
		a[0] = 10;
		b[0][1] = 20;
		System.out.println("b[0][0] : " + b[0][0]);
		System.out.println("b[0][1] : " + b[0][1]);
		System.out.println(a[1]);

		// 크기 3인 정수형 배열
		int[] a2 = new int[3];
		b[1] = a2;
		// 크기 6인 정수형 배열
		int[] a3 = { 10, 15, 20, 43, 23, 67 };
		b[2] = a3;

		// 2차원 배열을 반복문에서 사용할때,
		// 각 원소 배열의 길이를 사용하면, 각 원소 배열의 길이가 다르도라도 모두 접근 가능
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				System.out.print(b[i][j] + " ");
			}
			System.out.print("\n");
		}

		System.out.println(" ");
		
		
		// 배열에서 값을 초기화 하면서 배열 생성하기
		int[] arr1 = { 10, 20, 30, 1, 2 };
				
		// 2차원 배열에서 값을 초기화 하면서 배열 생성하기
		int[][] arr = { { 1, 2, 3 }, { 2, 3, 4 }, { 1, 1, 1, 1, 1, 1 }, { 10, 20 } };
		
	
		
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.print("\n");
		}
		
		
	
		
	}

}
