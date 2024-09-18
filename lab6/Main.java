package lab6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
    	
        // Task 1: Associate the specified value with the specified key in a HashMap
    	
        HashMap<String, Integer> hashMap = new HashMap<>();
        
        // Add key-value pairs to the HashMap
        
        hashMap.put("Chetan", 85);
        hashMap.put("Lakshya", 92);
        hashMap.put("Jay", 96);
        
        // Display the HashMap 
        
        System.out.println("HashMap Details:");
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
        
        // Task 2: Check whether the HashMap contains key-value 
        System.out.println("Checking if the HashMap is empty:");
        
        if (hashMap.isEmpty()) {
        	
            System.out.println("The HashMap is empty.");
            
        } else {
        	
            System.out.println("The HashMap is not empty.");
        }
        
        // Task 3: Store cricketers' names and their scores, search for a batsman, and display his score
        
        // Create a Map to store cricketers' names and their scores
        
        Map<String, Integer> cricketers = new HashMap<>();
        
        // Adding cricketers and their scores
        
        cricketers.put("Virat Kohli", 120);
        cricketers.put("Rohit Sharma", 99);
        cricketers.put("Abhishek Sharma", 80);
        cricketers.put("Shubhman Gill", 85);
        
        // cricketer's name to search 
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("\nEnter the name of the cricketer to search for:");
        String searchName = scanner.nextLine();
        
        // Search for the cricketer and display the score
        
        if (cricketers.containsKey(searchName)) {
        	
            System.out.println(searchName + "'s score: " + cricketers.get(searchName));
            
        } else {
        	
            System.out.println("Cricketer not found.");
        }
        
        // Close the scanner
        scanner.close();
    }
}
