package methods.exercises;

/**
 * Exercise 4: Special Methods
 * ----------------------------
 * TODO:
 * 1. Create a constructor that prints "Object created".
 * 2. Create a varargs method `printStrings(String... words)` that prints all words.
 * 3. Create an abstract class Shape with abstract method `draw()`.
 * 4. Create a subclass Rectangle that implements draw().
 */

public class Exercise4
{

    public Exercise4() {
        System.out.println("Object created");
    }

    public void printStrings(String... words) {
        for(String word : words) {
            System.out.print(word + " ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        Exercise4 obj = new Exercise4();

        obj.printStrings("The", "FitnessGram", "Pacer", "Test", "is", "a", "multistage", "aerobic", "capacity", "test");

        Shape rectangle = new Rectangle();
        rectangle.draw();
    }
}


abstract class Shape
{
    abstract void draw();
}

class Circle extends Shape
{
//    @Override
    public void draw()
    {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle extends Shape {
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

