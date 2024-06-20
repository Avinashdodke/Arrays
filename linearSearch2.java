import java.util.*;

public class linearSearch2 {
    static int ls(int num[] , int key){
       
        for (int i = 0; i < num.length; i++) {
            if(num[i] == key){
                return i;
            }
            
        }
        return -1;
        
        
        

    }
    
    
    public static void main(String[] args) {
        System.out.println("Enter the size of array");
        Scanner sc  = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("Array of size " + size + " has been created");
        
        System.out.println("Enter the values you want in array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Here are the values that you entered");
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("Enter num which you want to find in array");
        int key = sc.nextInt();




        //////
        int index = ls(arr , key);
        if (index == -1) {
            System.out.println("invalid");
            
        } else {
            System.out.println("Your number is at index " + index);

            
        }
        
    }
    
}
