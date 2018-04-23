import java.util.Scanner;

public class LeafYear_te {
	public static void main(String[] args) {
		
		int year;
		String yearType;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("확인하실 연도를 입력하세요");
		year=input.nextInt();
		
		//1번 (year %4 ==0 && year %100 !=0)
		//2번 (year %400 ==0)
		
		yearType = (year %4 ==0 && year %100 !=0) || (year %400 ==0)? "윤년":"평년";
		System.out.println(year+"년은"+yearType+"입니다.");
		
		
	}

}
