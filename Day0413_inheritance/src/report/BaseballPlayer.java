package report;

import java.util.Scanner;

public class BaseballPlayer extends SportsPlayer {

	private String hand;
	private int sack; // 몇루
	private String bat; // 나무 아니면
	

	// 이름,나이,직업,포지션,몸무게

	public BaseballPlayer() {
		super();
	}

	public BaseballPlayer(String name, int age, String job, int tall,int weight,String hand, int sack, String bat) {
		super(name,age,job,tall,weight);
		this.hand = hand;
		this.sack = sack;
		this.bat = bat;
	}

	public void play() {
		System.out.println("야구를 시작합니다.");
	}

	public String getHand() {
		return hand;
	}

	public void setHand(String hand) {
		this.hand = hand;
	}

	public int getSack() {
		return sack;
	}

	public void setSack(int sack) {
		this.sack = sack;
	}

	public String getBat() {
		return bat;
	}

	public void setBat(String bat) {
		this.bat = bat;
	}
	
	public void showPlayerInfo() {
		System.out.println("손잡이 : " + hand);
		System.out.println("포지션 : " + sack);
		System.out.println("배트 : " + bat);
	}
	
}
