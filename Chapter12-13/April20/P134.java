
public class P134
{
    private char[][] maze =    {{'*', '*', '*', '*', '*', '*', '*', '*', '*'}, 
                                {'*', ' ', ' ', ' ', ' ', ' ', ' ', '*', '*'}, 
                                {'*', ' ', '*', '*', '*', '*', '*', ' ', '*'},
                                {'*', ' ', '*', ' ', '*', ' ', ' ', ' ', '*'},
                                {'*', ' ', '*', '*', '*', '*', '*', '*', '*'},
                                {'*', ' ', '*', '*', '*', '*', '*', '*', '*'},
                                {'*', ' ', ' ', ' ', ' ', '*', ' ', ' ', '*'},
                                {'*', '*', '*', '*', ' ', ' ', ' ', ' ', '*'},
                                {'*', '*', '*', '*', '*', '*', '*', ' ', '*'}};

    private int[] start = new int[2];
    private int[] end   = new int[2];
    private int[] pos   = new int[2];
    
    public P134(int[] s, int[] e)
    {
        start[0] = s[0];
        start[1] = s[1];
        
        end[0] = e[0];
        end[1] = e[1];
        pos = s;
        
        
        for(int i = 0; i < maze.length; i ++){
         for(int j = 0; j < maze[0].length; j ++){
             System.out.print(maze[i][j]);
            }
            System.out.println();
        }
    }

    //1 right, 2 left, 3 up, 4 down
    public boolean move(int d)
    {
       // boolean out;
        if(pos[0] == end[0] && pos[1] == end[1]){
         return true; 
        }
        
        if(d == 1){
            if(maze[pos[0]][pos[1]+1] == ' '){
                pos[1]++;
            } else {
                return move(2);
            }
        } else if (d == 2){
            if(maze[pos[0]][pos[1]-1] == ' '){
                pos[1]++;
            } else {
                return move(3);
            }
        } else if (d == 3){
            if(maze[pos[0]+1][pos[1]] == ' '){
                pos[1]++;
            } else {
                return move(4);
            }
        } else if (d == 4){
            if(maze[pos[0]-1][pos[1]] == ' '){
                pos[1]++;
            } else {
                return move(1);
            }
        } else {
         System.out.println("Error");   
        }
        
        return true;
    }
    
    public static void main(String[] args){
        int[] start = {1, 1};
        int[] end = {8, 7};
        P134 thing = new P134(start, end);
        
        System.out.print(thing.move(4));
        
        
    }
}
