public class BinarySearcher
{
    public static int anotherSearch(int[] a, int low, int high, int value){
       boolean found = false;
       int foundValue = -1;
       while(found == false){
        int attempt = a[((high+1)+low)/2];
        
        if(attempt == value) {
         foundValue = attempt;
         found = true;  
         System.out.println("I: " + ((high+1)+low)/2);
         
        } else if(attempt > value) {
         high = high / 2;
        } else if (attempt < value) {
            low = ((high) - low)/2;
        }
        
        }
       return foundValue;
    }
    
    public static int search(int[] a, int low, int high, int value){
     if(low < high){
         int mid = (low+high)/2;
         
         if(a[mid] == value){
             return mid;
            } else if (a[mid] < value){
                return search(a, mid + 1, high, value);
            } else {
                return search(a, low, mid-1, value);
            } 
        } else {
           return -1;   
        }
    }
    
    public static void main(String[] args){
     BinarySearcher mine = new BinarySearcher();  
     int[] a = {1, 2, 3, 6, 9, 11};
         
     //System.out.println(mine.search(a, 0, a.length, 1));
     System.out.println(mine.anotherSearch(a, 0, a.length, 1));
    }
  
}

