package GuiLayout1;

// This an example taken from https://fun.codelearn.es/

import javax.swing.*;

import java.awt.*;

public class MyOwnWindow2 extends JFrame {

    public MyOwnWindow2 () {

       super ( "Window title" );

       setSize ( 400, 300 );

       setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE );

       Container cp = getContentPane ();

       GridLayout gl = new GridLayout (4,3);

       gl.setHgap ( 5 );

       gl.setVgap ( 5 );

       cp.setLayout ( gl );

       for ( int i = 1; i <= 9; i++ ) {

          cp.add ( new JButton ( String.valueOf ( i ) ) );

       }

       cp.add ( new JButton ( "*" ) );

       cp.add ( new JButton ( "0" ) );

       cp.add ( new JButton ( "#" ) );
    }

    public static void main ( String args[] ){

       MyOwnWindow2 obj = new MyOwnWindow2 ();

       obj.setVisible ( true );

    }

}
