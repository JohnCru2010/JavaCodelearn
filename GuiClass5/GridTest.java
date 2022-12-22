package GuiClass5;

import javax.swing.*;
import java.awt.*;

public class GridTest extends JFrame{
    public GridTest (String title, int w, int h) {
        super ( title );
        setSize(w, h);
        setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE );
        Container cp = getContentPane();
        cp.setLayout ( new GridLayout(1, 3, 5, 5));
        JButton button = new JButton( "First button" );
        cp.add( button );
        JButton button2 = new JButton( "Second button" );
        cp.add( button2 );
        JButton button3 = new JButton( "Third button" );
        cp.add( button3 );
    }
}
