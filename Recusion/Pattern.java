class Pattern {
    
static void printPattern(int n, int k)
{
    if (n < 0){
        return;
    }
 
    printPattern(n - 1, k + 1);
 
   
        
    for (int i = 0; i < n; i++) {
        System.out.printf("* ");
    }
        
    System.out.printf("\n");
}
 
    public static void main(String[]args)
    {
        printPattern(7, 0);
    }
}