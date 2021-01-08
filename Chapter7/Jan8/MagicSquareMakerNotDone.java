public class MagicSquareMakerNotDone
{
    public static void main(String args[]){
        
        int row[] = {11,18,25,2};
        
        int matrix[][] = new int[4][4];
        
        for(int i = 0; i < row.length; i++){
            matrix[0][i] = row[i];
        }
        
        
        for(int i = 1; i < matrix[0].length; i++){
            for(int j = 0; j < matrix[1].length; j++){
                if(j == 0) {
                    matrix[i][j] = row[3];
                } else {
                    matrix[i][j] = row[j - 1];
                }
            }
        }
        
        
        for(int i = 0; i < matrix[0].length; i++){
            for(int j = 0; j < matrix[1].length; j++){
                System.out.print(matrix[i][j] + ", ");
            }
            System.out.println();
        }
        
    }
}