package com.company;

public class Main {

    public static void main(String[] args) {
	//Animal a = new Animal("The overloaded constructor has run");
	//a.setName("Yogi Bear");
	//System.out.println("The animal is called "+a.getName());

	//	System.out.println(a.displayWhatAnAnimalDoes());


	Animal b = new Animal();
	b.setName("Smokey the Bear");
		System.out.println("The animal is called " +b.getName());
		System.out.println(b.displayWhatAnAnimalDoes());
System.out.println(b.speak());

		System.out.println("------------------------");
	Bird c = new Bird();
		System.out.println(c.displayWhatAnAnimalDoes());
		System.out.println(c.fly());
    System.out.println(c.speak());


		Dog d = new Dog();
		System.out.println(d.displayWhatAnAnimalDoes());
		System.out.println(d.speak());

	Cat e = new Cat();
		System.out.println(e.displayWhatAnAnimalDoes());
		System.out.println(e.bite());
		System.out.println(e.scratch());
		System.out.println(e.speak());

		Unicorn f= new Unicorn();
		System.out.println(f.displayWhatAnAnimalDoes());
		System.out.println(f.flies());
		System.out.println(f.performsMagic());

	}
}
