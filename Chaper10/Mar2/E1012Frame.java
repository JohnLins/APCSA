import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.JFrame;

import javax.swing.Timer;

public class E1012Frame extends JFrame

{

 private static final int FRAME_WIDTH = 300;

 private static final int FRAME_HEIGHT = 400;

 private E1012Component scene;






public E1012Frame()

{

    scene = new E1012Component();
    
    add(scene);
    
    setSize(FRAME_WIDTH, FRAME_HEIGHT);
    
    
    
    
}

}


