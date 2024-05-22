package JavaBasics;
// we cannot make abstract method a static and private 
// we cannot create a object of abstract class
// Constructor and fields can not be declared as abstract



abstract class Animal {
	abstract void soundOfAnimal ();
	abstract void move() ;

}

class Cat extends Animal{  //child class / implemented class/ derived class
	 void soundOfAnimal () { //method overriding
		 System.out.println("Meow meow");
	 }
	 @Override
	 void move() {
		 System.out.println(" Cat Move with foue legs");
	 }
}

class Dog extends Animal{
	 void soundOfAnimal () { //method overriding
		 System.out.println("grrgfd");
	 }
	 @Override
	 void move() {
		 System.out.println(" Dog Move with foue legs");
	 }
}

public class AbstractDemo {

	public static void main(String[] args) {
		Animal cat = new Cat();
        Animal dog = new Dog();
        
        cat.soundOfAnimal();
        cat.move();
        
        dog.soundOfAnimal();
        dog.move();


        

	}

}
