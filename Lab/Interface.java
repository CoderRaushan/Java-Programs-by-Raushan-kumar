// Define an interface
interface Animal {
    void makeSound(); // Method declaration (implicitly public and abstract)
}

// Implementing class Dog that implements Animal interface
class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!"); // Dog's sound
    }
}

// Implementing class Cat that implements Animal interface
class Cat implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!"); // Cat's sound
    }
}

// Main class to test the interface and implementing classes
public class Interface 
{
    public static void main(String[] args) {
        Animal dog = new Dog(); // Creating an object of Dog
        dog.makeSound(); // Calling makeSound method of Dog

        Animal cat = new Cat(); // Creating an object of Cat
        cat.makeSound(); // Calling makeSound method of Cat
    }
}