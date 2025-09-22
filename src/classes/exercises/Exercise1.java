package classes.exercises;

/**
 * Exercise 1: Basic Class
 * ------------------------
 * TODO:
 * 1. Create a class `Book` with fields: title, author.
 * 2. Add a method `displayInfo()` to print book details.
 * 3. Create objects in main() and call the method.
 */
public class Exercise1
{
    public static void main(String[] args)
    {
        Book myBook = new Book();
        myBook.title = "Romeo & Juliette";
        myBook.author = "William Shakespeare";
        myBook.displayInfo();
    }
}

class Book {
    String title = "Sample Title";
    String author = "Sample Author";
    public void displayInfo() {
        System.out.println("Book information.");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}