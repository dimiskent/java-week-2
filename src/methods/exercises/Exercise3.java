package methods.exercises;

/**
 * Exercise 3: Overloading & Overriding
 * -------------------------------------
 * TODO:
 * 1. Create a class Calculator with overloaded methods `multiply()`:
 *    - multiply(int a, int b)
 *    - multiply(double a, double b)
 * 2. Create a class Animal with a method `sound()`.
 * 3. Create a class Cat that extends Animal and overrides `sound()`.
 * 4. Test everything in main().
 */

public class Exercise3
{
    public static void main(String[] args)
    {
        Calculator calc = new Calculator();

        System.out.println("Add = " + calc.add(3, 5));
        System.out.println("Multiply = " + calc.multiply(2.5, 3));
        System.out.println("Multiply = " + calc.multiply(3, 5));

        Animal a1 = new Animal();
        a1.sound();

        Animal a2 = new Dog();
        a2.sound();

        Animal a3 = new Cat();
        a3.sound();
    }
}

class Calculator
{
    // Example: add methods
    public int add(int a, int b)
    {
        return a + b;
    }

    public int multiply(int a, int b) { return a * b; }

    public double multiply(double a, double b) { return a * b; }
}

class Animal
{
    public void sound()
    {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal
{
    @Override
    public void sound()
    {
        System.out.println("Dog barks");
    }
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("Cat meows");
    }
}