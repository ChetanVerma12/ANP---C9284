package lab2;

import java.util.Arrays;

public class ArraysofSubArrays {
    public static void main(String[] args) {
        
        int[] arr = {2, 4, 5, 3, 6, 7, 9, 4, 5, 6};

        
        int[] subArray = Arrays.copyOfRange(arr, 2, 7); 
        
        Arrays.sort(subArray);
        
       
        int highest = subArray[subArray.length - 1];
        int secondHighest = Integer.MIN_VALUE;

        
        for (int i = subArray.length - 2; i >= 0; i--) {
            if (subArray[i] < highest) {
                secondHighest = subArray[i];
                break;
            }
        }

        
        System.out.println("Second highest number in the subarray: " + secondHighest);
    }
}

