 abstract class Animal
{
	abstract void sound();
		void eat()
		{
			System.out.println("Eating");
		}
}
class Dog extends Animal
{
	void sound()
	{
		System.out.println("Bark");
	}
}
public class abstraction
{
	public static void main(String args[])
	{
		Dog d=new Dog();
		d.sound();
		d.eat();
	}
}
