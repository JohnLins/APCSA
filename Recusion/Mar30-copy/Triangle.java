
public class Triangle
{
    private int width;
    public Triangle(int aWidth){
        width = aWidth;
    }
    
    public int getArea(){
     if(width <= 0){
         return 0;
        } else if (width == 1) {
            return 1;
        } else {
            Triangle smallerTriangle = new Triangle(width-1);
            int smallerArea = smallerTriangle.getArea();
            return smallerArea + width;
            
        }
    }
    
    public static void main(String[] args){
     Triangle mine = new Triangle(10);
     System.out.println(mine.getArea());
    }
}
