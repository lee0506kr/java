package d03;

public class RobotTest2 {
	public static void main(String[] args) {
		Robot r = new MyRobot(new GunAttack(), new FlyMove());
		
		r.fight();
	}
}
