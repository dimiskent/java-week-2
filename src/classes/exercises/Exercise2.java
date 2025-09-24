package classes.exercises;

/**
 * Exercise 2: Constructors
 * -------------------------
 * TODO:
 * 1. Create a class `Person` with fields: name, age.
 * 2. Write a default constructor (assign default values).
 * 3. Write a parameterized constructor.
 * 4. Create objects using both constructors and display results.
 */
public class Exercise2
{
    public static void main(String[] args)
    {
        Person person1 = new Person();
        Person person2 = new Person("Jean-Pierre Dupont", 21);
        person1.showInfo();
        person2.showInfo();
    }
}

class Person {
    private String name;
    private int age;
    public Person() {
        this.name = "John Doe";
        this.age = 18;
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age > 0 ? age : 1;
    }
    public void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}