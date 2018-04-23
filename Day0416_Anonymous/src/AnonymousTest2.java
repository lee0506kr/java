
public class AnonymousTest2 {
	public static void main(String[] args) {

		Animal animal = new Animal() {
			public void move() {
				System.out.println("저벅저벅");
			}

		};
		
		 

		animal.move();
		animal.name="검은짐승머리";
		animal.numOfLegs=2;
	
		System.out.println(animal.name);
		System.out.println(animal.numOfLegs);
	}

}
