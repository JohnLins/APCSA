import java.lang.Math;
public class Geometry
{
    public static double cubeVolume(double h){
        return Math.pow(h,3);
        
    }
    
    public static double cubeSurface(double h){
        return Math.pow(h,2) * 6;
        
    }
    
    public static double sphereVolume(double r){
        return (4/3) * Math.PI * Math.pow(r, 3);
    }
    
    public static double sphereSurface(double r){
        return 4 * Math.PI * Math.pow(r, 2);
    }
    
    public static double cylinderVolume(double r, double h){
        return (Math.PI * Math.pow(r, 2)) * h;
    }
    
    public static double cylinderSurface(double r, double h){
        return (2 * Math.PI * r) * h;
        
    }
    
    public static double coneVolume(double r, double h){
        return ((Math.PI * Math.pow(r, 2)) * h)/3;
    }
    
    public static double coneSurface(double r, double h){
        return Math.PI * r *(Math.sqrt(Math.pow(r, 2) + Math.pow(h, 2)));
    }
}
