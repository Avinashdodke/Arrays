public class binarySearch {
    static int bs(int number[] , int key){
        int start = 0, end = number.length-1;

        while(start <= end) {
            int mid = (start + end) / 2;
            //comparisons
            if (number[mid] == key) {//found
                return mid;
                
            }
            if (number[mid] < key) {//right
                start = mid+1;
            } else{//left
                end = mid-1;

            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int numbers[] = {2 , 4,5,6,8,10,12,14};
        int key = 10;
        System.out.println("index of the key " + key + " is " + bs(numbers, key));
        
    }
    
}
