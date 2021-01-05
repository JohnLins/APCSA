public class Separator
{
    public static void main(String[] args){
        String names[] = {"John", "Jeff", "Joe", "Jim"};
        for(int i = 0; i < names.length; i++ ){
          System.out.print(names[i]);
         if(i != names.length - 1) {
         System.out.print("|");    
            }
        }
    }
}
