public class Vector
{
    private int x;
    private int y;
    public Vector(int xI, int yI)
    {
        x = xI;
        y = yI;
    }

    public void multiply(int a)
    {
        x = x*a;
        y = y*a;
    }
    
    public int dot(Vector a)
    {
        return (x * a.x) + (y * a.y);
    }
    
    public void display()
    {
        System.out.println("X: " + x + "Y: " + y);
    }
        
    
    public static void main(String args[]){
        Vector mine = new Vector(5, 7);
        mine.display();
        mine.multiply(3);
        
        
        System.out.println(mine.dot(new Vector(6, 2)));
        
        mine.display();
    }
}
