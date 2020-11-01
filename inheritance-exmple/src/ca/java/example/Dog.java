package ca.java.example;

public class Dog extends Animal{
	
	public void eat() {
		super.eat();
		System.out.println("I am a dog. I can eat");
	}

	public void bark() {
		System.out.println("I am a dog. I can bark");
	}

	@Override
	public void talk() {
		System.out.println("I am a dog. I can talk like Woof Woof");
		
	}
}
