package newstuff;

public class Person {
	
	//Constructor
	
	private String name;
	private int age;
	private double shoesize;
	private int height;
	private String hobby;
	
	public Person(String name, int age, double shoesize, int height, String hobby) {
		super();
		this.name = name;
		this.age = age;
		this.shoesize = shoesize;
		this.height = height;
		this.hobby = hobby;
	}
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
	public void introduction() {
		System.out.println("Hi my name is " + name + " and i am " + age + " years old. My shoe size is " + shoesize + " and i'm " + height + "cms tall! In my spare time i enjoy " + hobby + ".");
		
		
	}
	public void chatting() {
		System.out.println("I am " + age + " years old" + " i'm the oldest " + name + " i know.");
		
		
	}
	
	

	
}

