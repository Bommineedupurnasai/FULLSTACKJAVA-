//function to add integer values
public class ArraySum {
    public static int sumArray(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int result = sumArray(numbers); 
        System.out.println("Sum of array elements: " + result); 
    }
}
//function to calculate average value
public class AverageCalculator {
    public static double calculateAverage(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            throw new IllegalArgumentException("Array must not be null or empty");
        }
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return (double) sum / numbers.length;
    }
    public static void main(String[] args) {
        int[] exampleArray = {10, 20, 30, 40, 50};
        double average = calculateAverage(exampleArray);
        System.out.println("Average value: " + average);
    }
}
//find the index of an array
public class FindIndex {
    public static int findIndex(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] numbers = {5, 10, 15, 20, 25};
        int target = 15;
        int index = findIndex(numbers, target);
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
//test to array contains a specific value
public class ArrayContains {
    public static boolean contains(int[] array, int value) {
        for (int num : array) {
            if (num == value) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10};
        int target = 6;
        if (contains(numbers, target)) {
            System.out.println("Array contains the value: " + target);
        } else {
            System.out.println("Array does NOT contain the value: " + target);
        }
    }
}
