package methods.exercises;

/**
 * Exercise 2: Modifiers
 * ----------------------
 * TODO:
 * 1. Create one method with each access modifier:
 *    - public, protected, default, private
 * 2. Create one static method and one final method.
 * 3. Try calling them inside main().
 */

public class Exercise2
{
    public static void main(String[] args)
    {
        Exercise2 obj = new Exercise2();

        // Example usage
        obj.publicMethod();
        obj.privateMethod();
        obj.protectedMethod();
        obj.defaultMethod();
        obj.finalMethod();
        // this needs to be called normally, not from a new instance
        staticMethod();
    }
    // Example: public method
    public void publicMethod()
    {
        System.out.println("Public method called");
    }

    protected void protectedMethod() {
        System.out.println("Protected method called.");
    }

    void defaultMethod() {
        System.out.println("Default method called.");
    }

    private void privateMethod() {
        System.out.println("Private method called");
    }

    public static void staticMethod() {
        System.out.println("Static method called.");
    }

    public final void finalMethod() {
        System.out.println("Final method called.");
    }
}
