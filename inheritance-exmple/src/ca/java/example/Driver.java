package ca.java.example;

public class Driver {

	public static void main(String[] args) {
		//Animal animal = new Animal(); can not instantiate object of abstract class
		Dog d1 = new Dog();
		d1.bark();
		d1.talk();
		
		
		System.out.println();
		Duck q1 = new Duck();
		q1.talk();
	
		System.out.println();
		Cat c1 = new Cat();
		c1.talk();
	}

}

