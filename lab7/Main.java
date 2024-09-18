package lab7;

import java.util.HashSet;
import java.util.Stack;


public class Main {

    public static void main(String[] args) {
        // Task 1: Append the specified element to the end of a HashSet
    	  HashSet<Integer> hashSet = new HashSet<>();
          
          // Add initial elements to the HashSet
          hashSet.add(1);
          hashSet.add(2);
          hashSet.add(3);
          
          // Display the HashSet before appending
          System.out.println("HashSet before appending:");
          for (Integer element : hashSet) {
              System.out.print(element + " ");
          }
          System.out.println();
          
          // Append the specified element  to the HashSet
          int elementToAdd = 4;
          hashSet.add(elementToAdd);
          
          // Display the HashSet after appending
          System.out.println("HashSet after appending " + elementToAdd + ":");
          for (Integer element : hashSet) {
              System.out.print(element + " ");
          }
          System.out.println();
        
        // Task 2: Declare a Stack store 10 elements
        Stack<Integer> stack = new Stack<>();
        
        // Pushing 10 elements onto the stack
        for (int i = 1; i <= 10; i++) {
            stack.push(i);
        }
        
        // Removing 4 elements from the stack
        for (int i = 0; i < 4; i++) {
            stack.pop();
        }
        
        // Display remaining elements in the stack
        System.out.println("Stack after removing 4 elements:");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop() + " ");
        }
    }
}