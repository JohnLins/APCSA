public class NoMinSumEfficient
{
    
    public static void main(String[] args){
     int list[] = {5, 2, 1, 7, 4, 3};
     int sum = 0;
     int smallest = list[0];
     for(int i = 0; i < list.length; i++) {
         sum += list[i];
         if(list[i] < smallest) {
             smallest = list[i];
            }
        }
        sum -= smallest;
        
     
        System.out.println("Sum: " + sum);
    }
}
