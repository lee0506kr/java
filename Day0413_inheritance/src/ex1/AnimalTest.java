package ex1;

public class AnimalTest {
	public static void main(String[] args) {

		Animal dog = new Dog();
		Animal cat = new Cat();

		Animal[] animal = new Animal[5];

		for (int i = 0; i < animal.length; i++) {

			int wo = ((int) (Math.random() * 2) + 1);

			if (wo == 1) {
				animal[i] = dog;

			} else {
				animal[i] = cat;

			}

			
		}
		
		for (int i = 0; i< animal.length; i++) {
			/*if (animal[i] instanceof Dog) {
		
				((Dog)animal[i]).bark();
			
				
			} else {
				((Cat)animal[i]).meow();
			}*/

			animal[i].sound();
		}

	}

}
