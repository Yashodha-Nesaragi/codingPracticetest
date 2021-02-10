package question4;
class Animal
{
	public void shout()
	{
		System.out.println("These animals have abiliy to shout");
	}
}
class Dog extends Animal{

	@Override
	public void shout() {
		// TODO Auto-generated method stub
		super.shout();
		System.out.println("Dogs have ability to bark");
	}
	
}
class Cat extends Animal
{

	@Override
	public void shout() {
		// TODO Auto-generated method stub
		super.shout();
		System.out.println("Cat sounds meow");
	}
	
}

class Horse extends Animal{

	@Override
	public void shout() {
		// TODO Auto-generated method stub
		super.shout();
	
	
	System.out.println("Horses neigh");
	}
}




public class RuntimePolymorphismDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a= new Animal();
		Animal d=new Dog();
		Animal h=new Horse();
		Animal c= new Cat();
		d.shout();
		c.shout();
		h.shout();
		
		
		

	}

}
