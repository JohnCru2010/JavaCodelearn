package Test;

import javax.swing.*;

import java.awt.*;



public class SunWindow extends JFrame {

    public SunWindow () {

       Container cp = getContentPane ();

       setSize(150, 150);

       cp.add ( new SunPanel () );

    }

    public static void main ( String[] args ) {

        SunWindow sw = new SunWindow ();
    
        sw.setVisible ( true );
    
    }
}