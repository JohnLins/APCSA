
public class E71
{
    public static void main(String args[]){
        
        
        int[] arr = {3, 5, 1, 2, 9, 4, 9, 1, 4, 1};
        
        System.out.println("Even Index: ");
        for(int i = 0; i < 10; i++) {
            
            if(i%2 == 0){
                System.out.println(arr[i]);
            }
            
            
        }
        
        System.out.println("Even Element: ");
        for(int i = 0; i < 10; i++) {
            if(arr[i]%2 == 0){
                System.out.println(arr[i]);
            }
        }
        
        System.out.println("Backwards: ");
        for(int i = 9; i !=0; i--) {
            System.out.println(arr[i]);
        }
        
        System.out.println("First element: " + arr[0]);
        System.out.println("Last element: " + arr[9]);
        
        
        
        
    }
}
