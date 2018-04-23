package report;

public class BasketballPlayer extends SportsPlayer {

	private String size;
	private String band;
	private int score;

	public BasketballPlayer() {
		super();
	}

	public BasketballPlayer(String size, String band, int score) {
		super();
		this.size = size;
		this.band = band;
		this.score = score;
	}

	public void play() {
		System.out.println("농구를 시작합니다.");
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getBand() {
		return band;
	}

	public void setBand(String band) {
		this.band = band;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}
	
	public void showPlayerInfo() {
		System.out.println("크다 작다 : " + size);
		System.out.println("헤어밴드 : " + band);
		System.out.println("2점 3점 : " + score);
	}

}
