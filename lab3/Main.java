package lab3;

import java.util.HashSet;
import java.util.Scanner;

// Main class containing all programs
public class Main {
    
    // Task 1: Check if a string is a palindrome
    public static void checkPalindrome(String str) {
        String original = str.toLowerCase();
        String reverse = new StringBuilder(original).reverse().toString();
        
        if(original.equals(reverse)) {
            System.out.println(str + " is a Palindrome");
        } else {
            System.out.println(str + " is not a Palindrome");
        }
    }

    // Task 2: Find and print all unique characters in a string
    public static void printUniqueCharacters(String str) {
        HashSet<Character> uniqueChars = new HashSet<>();
        for (char c : str.toCharArray()) {
            if (!uniqueChars.contains(c)) {
                uniqueChars.add(c);
            }
        }
        System.out.print("Unique characters: ");
        for (char c : uniqueChars) {
            System.out.print(c);
        }
        System.out.println();
    }
    
    // Task 3: HillStations with subclasses Manali, Mussoorie, Gulmarg
    static class HillStations {
        public void location() {
            System.out.println("Generic hill station");
        }
        
        public void famousFor() {
            System.out.println("Famous for beautiful views");
        }
    }

    static class Manali extends HillStations {
        @Override
        public void location() {
            System.out.println("Manali is in Himachal Pradesh");
        }

        @Override
        public void famousFor() {
            System.out.println("Manali is famous for adventure sports");
        }
    }

    static class Mussoorie extends HillStations {
        @Override
        public void location() {
            System.out.println("Mussoorie is in Uttarakhand");
        }

        @Override
        public void famousFor() {
            System.out.println("Mussoorie is famous for education and tourism");
        }
    }

    static class Gulmarg extends HillStations {
        @Override
        public void location() {
            System.out.println("Gulmarg is in Jammu and Kashmir");
        }

        @Override
        public void famousFor() {
            System.out.println("Gulmarg is famous for skiing and winter sports");
        }
    }

    // Task 4: Animal class and method overriding
    static class Animal {
        public void makeSound() {
            System.out.println("The animal makes a sound.");
        }
    }

    static class Dog extends Animal {
        @Override
        public void makeSound() {
            System.out.println("The dog barks.");
        }
    }

    static class Cat extends Animal {
        @Override
        public void makeSound() {
            System.out.println("The cat meows.");
        }
    }

    // Task 5: Vaccine abstract class with methods
    static abstract class Vaccine {
        int age;
        String nationality;
        boolean firstDoseTaken = false;

        public Vaccine(int age, String nationality) {
            this.age = age;
            this.nationality = nationality;
        }

        public void firstDose() {
            if (age >= 18 && nationality.equalsIgnoreCase("Indian")) {
                firstDoseTaken = true;
                System.out.println("First dose taken. Pay Rs 250.");
            } else {
                System.out.println("Not eligible for the first dose.");
            }
        }

        public void secondDose() {
            if (firstDoseTaken) {
                System.out.println("Second dose taken.");
            } else {
                System.out.println("Cannot take second dose without first dose.");
            }
        }

        public abstract void boosterDose();
    }

    static class VaccinationSuccessful extends Vaccine {
        public VaccinationSuccessful(int age, String nationality) {
            super(age, nationality);
        }

        @Override
        public void boosterDose() {
            if (firstDoseTaken) {
                System.out.println("Booster dose taken.");
            } else {
                System.out.println("Cannot take booster dose without previous doses.");
            }
        }
    }

    // Main method to run all tasks
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Task 1: Palindrome check
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        checkPalindrome(str);

        // Task 2: Unique characters
        System.out.print("Enter a string to find unique characters: ");
        String uniqueStr = sc.nextLine();
        printUniqueCharacters(uniqueStr);

        // Task 3: HillStations and subclasses
        HillStations hill = new HillStations();
        Manali manali = new Manali();
        Mussoorie mussoorie = new Mussoorie();
        Gulmarg gulmarg = new Gulmarg();
        
        System.out.println("\nParent class method call:");
        hill.location();
        hill.famousFor();
        
        System.out.println("\nSubclass methods call:");
        manali.location();
        manali.famousFor();
        mussoorie.location();
        mussoorie.famousFor();
        gulmarg.location();
        gulmarg.famousFor();

        // Task 4: Animal class and overriding
        Animal genericAnimal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        
        System.out.println("\nAnimal sound:");
        genericAnimal.makeSound();
        dog.makeSound();
        cat.makeSound();

        // Task 5: Vaccine abstract class
        System.out.print("\nEnter age: ");
        int age = sc.nextInt();
        sc.nextLine();  // Consume newline
        System.out.print("Enter nationality: ");
        String nationality = sc.nextLine();

        VaccinationSuccessful vaccination = new VaccinationSuccessful(age, nationality);
        vaccination.firstDose();
        vaccination.secondDose();
        vaccination.boosterDose();
        
        sc.close();
    }
}
