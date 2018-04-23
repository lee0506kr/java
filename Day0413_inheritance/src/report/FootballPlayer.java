package report;

public class FootballPlayer extends SportsPlayer {

	private String foot;
	private int speed;
	private String heading;
	
	public FootballPlayer() {
		super();
	}
	public FootballPlayer(String foot, int speed, String heading) {
		super();
		this.foot = foot;
		this.speed =speed;
		this.heading = heading;
	}
	public void player() {
		System.out.println("축구를 시작합니다.");
	}
	public String getFoot() {
		return foot;
	}
	public void setFoot(String foot) {
		this.foot = foot;
	}
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getHeading() {
		return heading;
	}
	public void setHeading(String heading) {
		this.heading = heading;
	}
	
	
}
