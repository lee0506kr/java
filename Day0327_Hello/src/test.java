import java.util.Arrays;
import java.util.Scanner;

public class test {
	public static void main(String[] args) {
		
		int input = 0;
		Scanner scan = new Scanner(System.in);
		int[] Userdata =new int[5];
		int sum =0;
		double avg = 0;
		
		for(int i=0; i<Userdata.length; i++) {
			System.out.println("자료를 입력해 주세요[정수] "+i+"/"+Userdata.length);
			input = scan.nextInt();
			Userdata[i]=input;
		}
		for(int i=0; i<Userdata.length; i++) {
			sum = sum +Userdata[i];
		}
		avg = sum /Userdata.length;
		
		System.out.println("------------------");
		System.out.println(Arrays.toString(Userdata));
		System.out.println("합계 = "+ sum+" "+"평균="+avg);
		System.out.println("---------------------");
		
	}
}
