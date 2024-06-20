public class linearSearch{
    public static int ls(int num[] , int key){
        for (int i = 0; i < num.length; i++) {
            if (num[i] == key) {
                return i;
                
                
            }
            
        }
        
        return -1;
    }

    
    public static void main(String[] args){
        int number[] = {2,4,6,8,10,12,16};
        int key = 16;
        int index = ls(number,key);
        if (index == -1) {
            System.out.println("invalid");
        }else{
            System.out.println("key is at index " + index);

        }
        

    }
}