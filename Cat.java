package Animal;

public class Cat {
	String name;
	String color;
	int age;
	
public Cat(String name, String color, int age) {
	this.name = name; 
	this.color = color;
	this.age = age;
}


public void eat() {
	System.out.println("Yummy food meows " + name + " :P");
}

public void sleep() {
	System.out.println(name + " Sleep");
}

public void play() {
	System.out.println(name + " does the playyy, meow meow motherfucker");
}

public static void main(String[] args) {
	Cat bill = new Cat("Bill", "Orange", 45);
	Cat bull = new Cat("Bull", "Svart", 89);
	Kitten MCyoungPussy = new Kitten("Goofy", "Blue", 0);
	bill.eat();
	bull.sleep();
	MCyoungPussy.sleep();
	MCyoungPussy.eat();
	MCyoungPussy.play();
}

}



class Kitten extends Cat{

	public Kitten(String name, String color, int age) {
		super(name, color, age);
	}
	
	public void sleep() {
		System.out.println(name + " Unsleepy kitten");
	}
	
	public void eat() {
		System.out.println("Yummy Yummy Eat that food " + name + ", you little fucking kitty");
	}
	
}
