public class MagicSquaresE715
{
    
    private int matrix[][];
    public MagicSquaresE715(int[][] inputMatrix)
    {
        matrix = inputMatrix;
    }
    
    public void printArr(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]);
            System.out.print(", ");
        }
        System.out.println();
    }

    public boolean allSame(int[] arr){
        boolean returnB = true;
        for(int i = 0; i < arr.length; i++){
            if(arr[0] != arr[i]){
                returnB = false;
            }
        }
        return returnB;
    }
    
    public boolean isMagicSquare()
    {
        int rowSums[] = {0,0,0,0};
        int columnSums[] = {0,0,0,0};
        int diagnalSums[] = {0,0};
        for(int i = 0; i < matrix[0].length; i++){
         for(int j = 0; j < matrix[1].length; j++){
             rowSums[i] = rowSums[i] + matrix[j][i];
             
             columnSums[j] = columnSums[j] + matrix[i][j];
             
             if(i == j){
               diagnalSums[0] = diagnalSums[0] + matrix[i][j];   
             } 
             if ((matrix[0].length - i) == (matrix[1].length - j)){
               diagnalSums[1] = diagnalSums[1] + matrix[i][j];   
             }
             
            }
        }
        
        printArr(rowSums);
        printArr(columnSums);
        printArr(diagnalSums);
        
        
        
        if(allSame(rowSums) == true && allSame(columnSums) == true && allSame(diagnalSums) == true){
            return true;
        } else {
            return false;
        }
        
    }
}
