package d01;

public class Transformer {
	String name;
	public Transformer() {
		this.name = "트랜스포머";
	}
	
	public void fight() {
		System.out.println(name+"전투시작");
		gunAttack();
		runMove();
		gunAttack();
		runMove();
		System.out.println(name+"전투를 종료합니다.");
	}
	
	public void gunAttack() {
		System.out.println("총으로 공격!!");
	}
	public void runMove() {
		System.out.println("뛰어서 이동");
	}
	

}
