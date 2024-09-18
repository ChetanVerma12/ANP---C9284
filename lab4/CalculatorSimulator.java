package lab4;

//  Exception for invalid country
class CountryNotValidException extends Exception {
    public CountryNotValidException(String message) {
        super(message);
    }
}

// Exception for invalid employee name
class EmployeeNameInvalidException extends Exception {
    public EmployeeNameInvalidException(String message) {
        super(message);
    }
}

//  Exception for tax not eligible
class TaxNotEligibleException extends Exception {
    public TaxNotEligibleException(String message) {
        super(message);
    }
}

// TaxCalculator 
class TaxCalculator {

    public double calculateTax(String empName, boolean isIndian, double empSal) throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException {
        if (!isIndian) {
            throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax.");
        }
        if (empName == null || empName.isEmpty()) {
            throw new EmployeeNameInvalidException("The employee name cannot be empty.");
        }
        if (empSal > 100000) {
            return empSal * 8 / 100;
        } else if (empSal >= 50000) {
            return empSal * 6 / 100;
        } else if (empSal >= 30000) {
            return empSal * 5 / 100;
        } else if (empSal >= 10000) {
            return empSal * 4 / 100;
        } else {
            throw new TaxNotEligibleException("The employee does not need to pay tax.");
        }
    }
}

public class CalculatorSimulator {
    public static void main(String[] args) {
        //  Problem Statement 1
        TaxCalculator calculator = new TaxCalculator();
        try {
            System.out.println("Test Case 1:");
            System.out.println("Tax amount is: " + calculator.calculateTax("Ron", false, 34000));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Test Case 2:");
            System.out.println("Tax amount is: " + calculator.calculateTax("Tim", true, 1000));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Test Case 3:");
            System.out.println("Tax amount is: " + calculator.calculateTax("Jack", true, 55000));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("Test Case 4:");
            System.out.println("Tax amount is: " + calculator.calculateTax("", true, 30000));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }

        // Problem Statement 2: Throwing ArrayIndexOutOfBoundsException
        try {
            System.out.println("ArrayIndexOutOfBoundsException Test:");
            int[] array = new int[5];
            for (int i = 0; i <= 5; i++) {  
                array[i] = i;
                System.out.println(array[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }

        // Problem Statement 3: Print array elements from 1 to 100
        System.out.println("Array elements from 1 to 100:");
        int[] numbers = new int[100];
        for (int i = 0; i < 100; i++) {
            numbers[i] = i + 1;
            System.out.println(numbers[i]);
        }
    }
}


