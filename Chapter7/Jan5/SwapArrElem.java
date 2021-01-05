public class SwapArrElem
{
    public static void main(String[] args){
        int list[] = {1, 2, 3, 4};
        //Swap 2 and 3
        int temp = list[1];
        list[1] = list[2];
        list[2] = temp;
        
        for(int i = 0; i < list.length; i ++){
        System.out.print(list[i]);
        }
    }
}
