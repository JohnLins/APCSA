public class MagicSquareE715Tester
{
    public static void main(String args[])
    {
      
     
     int matrix[][] = {{16,3,2,13},{5,10,11,8}, {9,6,7,12}, {4,15,14,1}};
     
     MagicSquaresE715 thing = new MagicSquaresE715(matrix); 
     
     System.out.println(thing.isMagicSquare());
    }
}
