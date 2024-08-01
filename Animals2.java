package Hellow;

class Animal {
	private String name;

	public Animal(String name) {
		this.name = name;
	}

	public void sound() {
		System.out.println("Animal makes a sound");
	}
}

class Dog extends Animal {
	public Dog(String name) {
		super(name);
	}

	public void sound(int volume) {
		System.out.println("Dog barks with volume: " + volume);
	}
}

class Cat extends Animal {
	public Cat(String name) {
		super(name);
	}

	@Override
	public void sound() {
		System.out.println("Cat meows");
	}
}

public class Animals2 {
	public static void main(String[] args) {
		Dog dog = new Dog("Buddy");
		dog.sound(5);

		Cat cat = new Cat("Whiskers");
		cat.sound();
	}
}
