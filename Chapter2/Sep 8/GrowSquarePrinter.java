import javax.swing.JFrame;



public class GrowSquarePrinter

 {

public static void main(String[] args)

{

JFrame frame = new JFrame();



frame.setSize(400, 400);

frame.setTitle("Two rectangles");

frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


RectangleComponent component = new RectangleComponent();

frame.add(component);

frame.setVisible(true);

}

}