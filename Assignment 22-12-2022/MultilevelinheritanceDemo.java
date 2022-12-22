package oops;

class Animal //grandparent class
{
	public void display()
	{
	System.out.println("Animal Kindgom");
	}
}

class Mammal extends Animal // parent class
{
	public void birth()
	{
		System.out.println("Mammals give birth to offsprings");
	}
}

class Dog extends Mammal // child class
{
	public void puppy()
	{
		System.out.println("Dog's offsprings are callege Puppy");
	}
}

public class MultilevelinheritanceDemo {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.puppy();
		dog.birth();
		dog.display();

	}

}
