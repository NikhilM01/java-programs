
class Animal {
    public void move() {
        System.out.println("The animal moves.");
    }

    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

// Subclass Bird
class Bird extends Animal {
    @Override
    public void move() {
        System.out.println("The bird flies through the air.");
    }

    @Override
    public void makeSound() {
        System.out.println("The bird chirps melodiously.");
    }
}

class Panthera extends Animal {
    @Override
    public void move() {
        System.out.println("The panthera prowls silently.");
    }

    @Override
    public void makeSound() {
        System.out.println("The panthera roars fiercely.");
    }
}


public class AnimalDemo {
    public static void main(String[] args) {
        // Create instances of each subclass
        Animal bird = new Bird();
        Animal panthera = new Panthera();


        bird.move();
        bird.makeSound();

        panthera.move();
        panthera.makeSound();
    }
}

