import java.util.*;

public class getLargest {
    // Method to find the largest element in an array
    static int getlargest(int num[]) {
        int largest = Integer.MIN_VALUE; // Initialize largest with the smallest possible value

        for (int i = 0; i < num.length; i++) {
            if (num[i] > largest) {
                largest = num[i]; // Update largest if the current element is greater
            }
        }

        return largest;
    }

    public static void main(String[] args) {
        while (true) { //so that the code keeps running
            System.out.println("Enter the size of the array:");
            Scanner sc = new Scanner(System.in);
            int size = sc.nextInt();
            System.out.println("Enter the elements of the array:");

            int array[] = new int[size];
            for (int i = 0; i < size; i++) {
                array[i] = sc.nextInt();
            }

            System.out.println("The elements you used are:");
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }

            System.out.println("The largest element in the array is: " + getlargest(array));
        }
    }
}
