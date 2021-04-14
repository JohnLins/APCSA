import java.util.ArrayList;
public class LinearSortArrList
{
	public static void main(String[] args) {
	ArrayList<Integer> arr = new ArrayList<Integer>();
	arr.add(6);
	arr.add(1);
	arr.add(2);
	arr.add(2);
	arr.add(8);
	
        for (int i = 1; i < arr.size(); i++) {
            int key = arr.get(i);
            int j = i - 1;
 
           
            while (j >= 0 && arr.get(j) > key) {
                arr.set(j + 1, arr.get(j));
                j = j - 1;
            }
            arr.set(j + 1, key);
        }
        
        
        
        
        
        for (int i = 0; i < arr.size(); i++){
            System.out.print(arr.get(i) + " ");
        }
 
        System.out.println();
    }
}
