package classes.exercises;

/**
 * Exercise 4: Abstract, Final, Inner Classes
 * ------------------------------------------
 * TODO:
 * 1. Create an abstract class Animal with abstract method sound().
 * 2. Create a subclass Cat that implements sound().
 * 3. Create a final class MathUtil with method square(int).
 * 4. Create an inner class inside Exercise4_AbstractFinalInner that prints a message.
 */
public class Exercise4
{
    public static void main(String[] args)
    {
        // Inner class.
        Exercise4 outerClass = new Exercise4();
        Inner inner = outerClass.new Inner();
        inner.say();

        // Abstract Animal, Override Cat
        Animal cat = new Cat();
        cat.sound();

        // Final class
        MathUtil math = new MathUtil();
        System.out.println(math.square(4));
    }
    class Inner {
        public void say() {
            System.out.println("hi");
        }
    }
}

abstract class Animal {
    abstract void sound();
}

class Cat extends Animal {
    @Override
    public void sound() {
        System.out.println("MEOW");
    }
}

final class MathUtil {
    public int square(int n) {
        return n*n;
    }
}