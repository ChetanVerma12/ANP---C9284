package lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


// Main class containing all programs
public class Main2 {

    // Task 1: Book class and display book details
    static class Book {
        int bookId;
        String bookName;
        String authorName;

        // Parameterized constructor
        public Book(int bookId, String bookName, String authorName) {
            this.bookId = bookId;
            this.bookName = bookName;
            this.authorName = authorName;
        }

        // Display book details
        public void displayBookDetails() {
            System.out.println("Book ID: " + bookId + ", Book Name: " + bookName + ", Author Name: " + authorName);
        }
    }

    // Task 2: Reverse a given list of strings
    public static void reverseList(List<String> list) {
        Collections.reverse(list);
        System.out.println("Reversed list: " + list);
    }

    // Task 3: Calculate the sum of all even numbers in an ArrayList of integers
    public static int sumOfEvenNumbers(ArrayList<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
            if (number % 2 == 0) {
                sum += number;
            }
        }
        return sum;
    }

    // Main method to run all tasks
    public static void main(String[] args) {
        // Task 1: Create a list of books and display details
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book(1, "book1", "chetanverma"));
        books.add(new Book(2, "book2", "chetanverma"));
        books.add(new Book(3, "book3", "chetanverma"));

        System.out.println("Book details:");
        for (Book book : books) {
            book.displayBookDetails();
        }

        // Task 2: Reverse a list of strings
        List<String> stringList = new ArrayList<>();
        stringList.add("apple");
        stringList.add("banana");
        stringList.add("cherry");
        System.out.println("Original list: " + stringList);
        reverseList(stringList);

        // Task 3: Calculate the sum of all even numbers in a list
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(15);
        numbers.add(20);
        numbers.add(25);
        numbers.add(30);

        int sumOfEvens = sumOfEvenNumbers(numbers);
        System.out.println("Sum of even numbers: " + sumOfEvens);
    }
}


