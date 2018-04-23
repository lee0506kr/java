import java.util.Scanner;

public class StudentTest {
	public static void main(String[] args) {
		Student s1 = new Student();		
		System.out.println(s1);
		s1.setKor(100);
		s1.setName("홍길동");
		s1.setEng(0);
		s1.setMath(0);
		System.out.println(s1);
		
		Score score = new Score(100,50,50); 
		Student s2 = new Student("이순신",3,score);
		System.out.println(s2);
		System.out.println(s2.getAverage());
		
		
		Student s3 = new Student("신사임당",2,100,100,100);
		System.out.println(s3);
		System.out.println(s3.getAverage());
		
		
		/*Scanner input = new Scanner(System.in);
		
		String name = input.nextLine();
		int kor = input.nextInt();
		int math = input.nextInt();
		int eng = input.nextInt();
		
		
		Student student = new Student();
		
		student.setName(name);
		student.getScore().setKor(kor);
		student.getScore().setMath(math);
		student.getScore().setEng(eng);
		
	int score = (kor+math+eng)/3;
		
	//  student.getAverage((double)score);
//		student.printStudent();

		System.out.println("이름"+name+"국어"+kor+"수학"+math+"영어"+eng+"평균"+score);
	*/	
	}
}
