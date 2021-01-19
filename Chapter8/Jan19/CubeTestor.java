
public class CubeTestor
{
    public static void main(String args[]){
        Geometry myShape = new Geometry();
        
        double h = 20;
        double r = 5;
        
        System.out.println("Cube Volume: "+ myShape.cubeVolume(h));
        System.out.println("Cube Surface: "+ myShape.cubeSurface(h));
        System.out.println("Sphere Volume: "+ myShape.sphereVolume(r));
        System.out.println("Sphere Surface: "+ myShape.sphereSurface(r));
        System.out.println("Cylinder Volume: "+ myShape.cylinderVolume(r, h));
        System.out.println("Cylinder Surface: "+ myShape.cylinderSurface(r, h));
        System.out.println("Cone Volume: "+ myShape.coneVolume(r, h));
        System.out.println("Cone Surface: "+ myShape.coneSurface(r, h));
    }
}
