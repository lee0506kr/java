package report;

public class SportsPlayer {
	//서누
	// 이름 나이 직업 몸무게 키 
	private String name;
	private int age;
	private String job;
	private int tall;
	private int weight;

	public SportsPlayer() {
		
	}
	
	public SportsPlayer(String name, int age, String job, int tall,int weight) {
		
		this.name = name;
		this.age = age;
		this.job = job;
		this.tall = tall;
		this.weight = weight;

	}
	
	public void play() {
		System.out.println("시작합니다.");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public int getTall() {
		return tall;
	}

	public void setTall(int tall) {
		this.tall = tall;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public void showPlayerInfo() {
		
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("직업 : " + job);
		System.out.println("키 : " + tall);
		System.out.println("몸무게 : " + weight);
	}

}
