import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        // Input array
        int[] arr = {10, 20, 30, 40, 50};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the element to search: ");
        int key = sc.nextInt();

        boolean found = false;

        // Linear search logic
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                System.out.println("Element found at index: " + i);
                found = true;
                break; // Stop after finding the first match
            }
        }

        if (!found) {
            System.out.println("Element not found in the array.");
        }
    }
}
