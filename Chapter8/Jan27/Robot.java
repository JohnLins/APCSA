public class Robot
{
    private int n;
    private int e;
    private int s;
    private int w;
    
    private int directionAngle;

    
    public Robot()
    {
        n = 0;
        e = 0;
        s = 0;
        w = 0;
        directionAngle = 90;
        
    }

    public void turnLeft(){
        directionAngle += 90;
        
    }
    
    public void turnRight(){
        directionAngle -= 90;
    }
    
    public void move(){
        if(directionAngle == 0){
            e += 1;
            
        } else if (directionAngle == 90){
            n += 1;
            
        } else if (directionAngle == 180){
            w += 1;
            
        } else {//270
            s += 0;
            
        }
        
    }
    
    public void getLocation(){
        System.out.println("North:" + n);
        System.out.println("South:" + s);
        System.out.println("East:" + e);
        System.out.println("West:" + w);
        
    }
    
    public void getDirection(){
        System.out.print("Direction angle: " + directionAngle); 
    }
    
    public static void main(String args[]){
        Robot thing = new Robot();
        thing.turnLeft();
        thing.turnLeft();
        thing.turnRight();
        thing.move();
        thing.move();
        
        thing.getLocation();
        thing.getDirection();
        
    }
}
