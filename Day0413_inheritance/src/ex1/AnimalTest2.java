package ex1;

public class AnimalTest2 {
	public static void main(String[] args) {
		Animal c = new Cat();
		Animal d = new Dog();   //동적바인드
		
		c.sound();
		d.sound();
	}

}

