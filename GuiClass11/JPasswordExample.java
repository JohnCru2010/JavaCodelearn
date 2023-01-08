package GuiClass11;

import javax.swing.*;

import java.awt.*;

class JPasswordExample extends JFrame {

    JPasswordExample (String title, int width, int height) {
       super ( title );
       setSize ( width, height );
       setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE );

       JLabel lb = new JLabel( "Enter password" );

       JPasswordField pf = new JPasswordField ( 10 );

       Container cp = getContentPane ();
       cp.setLayout (new FlowLayout());
       cp.add(lb);
       cp.add(pf);
    }
}


