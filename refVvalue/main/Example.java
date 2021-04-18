
public class Example
{
    public static void main(String[] args){
        Class a = new Class(1);
        Class b = new Class(2);
        a = b;
        b.changeX(7);
        System.out.println(a);
        //7
        
        
        Class c = new Class(6);
        Class d = new Class(7);
        
        d = c;
        
        c = new Class(4);
        System.out.println("c: " + c + ", d: " + d);
        //4, 6
    }
}
