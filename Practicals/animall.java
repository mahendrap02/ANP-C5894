package OOPs;
//Example of Multilevel inheritance
//Super class or base class or parent class 
class Animal
{
	//field &method 
	String name;
	public void eat()
	{
		System.out.println("Animal Eat...");
		
	}
}
//inherit from Animal
class Dog extends Animal
{
	//field &method of Animal class
	//field &method of Dog class
	public void sound()
	{
		System.out.println("Dog Braks...");	
	}
	class AnimalMain
	{
		public static void main(String[] args)
		{
			//creating object of sub class
			Dog d=new Dog();
			//access fields and methods
			//access fields and methods
					d.name="Lucy";
					d.eat();
					d.sound();
					System.out.println("Dog name is " + d.name);
				}

	}
}
