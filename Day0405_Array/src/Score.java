
public class Score {
	public static void main(String[] args) {
		/*
		 * 학생들의 점수가 저장되는 2차원 배열 생성 2차원 배열은 각 반 별로 저장이 된다. 1반은 {100,90,88,90} 네명 2반은
		 * {90,77,60} 세명 3반은 {100,100,50,50,40} 다섯명 4반은 {100,9,80,90,100,0} 네명
		 * 
		 * 각 반의 총점과 평균을 구하라 단, 평균은 소수점 첫째자리 까지만 표시
		 * 
		 * 출력 예) 1반: 총점 366점, 평균 91.5점 2반: 총점 xxx점, 평균 xx.x점 3반: 총점 xxx점, 평균 xx.x점 4반:
		 * 총점 xxx점, 평균 xx.x점
		 */

		int[][] score = new int[4][]; // 정수형 배열을 4개 만든다.

		int[] ban1 = { 100, 90, 88, 90 };// [100][90][88][90]
		int[] ban2 = { 90, 77, 60 };
		int[] ban3 = { 100, 100, 50, 50, 40 };
		int[] ban4 = { 100, 9, 80, 90, 100, 0 };

		score[0] = ban1;
		score[1] = ban2;
		score[2] = ban3;
		score[3] = ban4;

		

		for (int i = 0; i < score.length; i++) {
			// 각 반별로 총합을 구하는 코드
			int sum = 0;

			for (int j = 0; j < score[i].length; j++) {

				sum = sum + score[i][j];
				
			}
			System.out.println((i+1)+"반: 총점"+sum+"점, 평균"+(double)sum/score[i].length+"점");
			
		}
		//score 이차원배열에 점수를 저장하고 있음
		//scors[0] 1반점수
		
		/*for(int i=0; i<4;i++) {
			int sum =0;
			for(int j=0;j<score[i].length;j++) {
				sum = sum +score[i][j];
			}
			sum = sum +score[i][0];
			sum = sum +score[i][1];
			sum = sum +score[i][2];
			sum = sum +score[i][3];
			//sum의 결과는 1반 score[0]의 총합
			System.out.printf((i+1)+" 반 총합: %d점, 평균%.1f\n",sum,sum/score[i].length);
		}
		*/
		/*int sum =0;
		sum = sum +score[0][0];
		sum = sum +score[0][1];
		sum = sum +score[0][2];
		sum = sum +score[0][3];
		//sum의 결과는 1반 score[0]의 총합
		System.out.printf("1 반 총합: %d점, 평균%.1f\n",sum,sum/score[0].length);
		sum = sum +score[1][0];
		sum = sum +score[1][1];
		sum = sum +score[1][2];
		System.out.printf("2 반 총합: %d점, 평균%.1f\n",sum,sum/score[1].length);
		sum = sum +score[2][0];
		sum = sum +score[2][1];
		sum = sum +score[2][2];
		sum = sum +score[2][3];
		sum = sum +score[2][4];
		System.out.printf("3 반 총합: %d점, 평균%.1f\n",sum,sum/score[1].length);
		*/
		
		
		

	}

}
