package GuiClass6;

import javax.swing.*;
import java.awt.*;

public class GridTest extends JFrame{
    public GridTest (String title, int w, int h) {
        super ( title );
        setSize(w, h);
        setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE );
        Container cp = getContentPane ();
        BorderLayout gl = new BorderLayout ( );
        gl.setHgap ( 10 );
        gl.setVgap ( 10 );
        cp.add ( new JButton ( "1" ), BorderLayout.NORTH );
        cp.add ( new JButton ( "2" ), BorderLayout.SOUTH );
        cp.add ( new JButton ( "3" ), BorderLayout.EAST );
        cp.add ( new JButton ( "4" ), BorderLayout.WEST );
        cp.add ( new JButton ( "5" ), BorderLayout.CENTER );

    }
}