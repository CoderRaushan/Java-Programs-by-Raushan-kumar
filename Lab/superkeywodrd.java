class Animal {
    String name;
    Animal(String name) {
        this.name = name;
    }
    void display() {
        System.out.println("This is an animal.");
    }
}
class Dog extends Animal {
    Dog(String name) {
        super(name); // Call the parent class constructor
    }
    void display() {
        super.display(); // Call the parent class method
        System.out.println("This is a dog named " + name);
    }
}
public class superkeywodrd {
    public static void main(String[] args) {
        Dog dog = new Dog("Buddy");
        dog.display();
    }
}
