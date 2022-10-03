/*
QUESTION : 
Inside the IntelliJ IDEA modify the code within Main.java to implement Multi-level Inheritance.
Create a new class Puppy that contains instance variables of "size" and "age".
The Puppy should inherit from class Dog which in turn inherits from class Animal.
Finally, test your code by accessing properties and behavior of super class Dog and Animal using Puppy object.
*/

public class Main {
    public static void main(String[] args) {
        Puppy d1 = new Puppy();
        d1.setName("Bruno");
        d1.setBreed("Labra");
        d1.setAge(1);
        d1.setSize("Small");
        d1.run();
        d1.bark();
        d1.getDetails();
    }
}
class Animal {
    private String name;
    public void run() {
        System.out.println(name + " is running!!!");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

class Dog extends Animal{
    private String breed;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public void bark() {
        System.out.println(getName() + " is barking.");
    }
}

class Puppy extends Dog{
    private int age;
    private String size;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    public void getDetails() {
        System.out.println("-----------------------------");
        System.out.println("  Name : " + getName());
        System.out.println("  Breed : " + getBreed());
        System.out.println("  Age : " + getAge());
        System.out.println("  Size : " + getSize());
        System.out.println("-----------------------------");
    }
}

/*
SAMPLE OUTPUT :
Bruno is running!!!
Bruno is barking.
-----------------------------
  Name : Bruno
  Breed : Labra
  Age : 1
  Size : Small
-----------------------------
*/
