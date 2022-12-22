package GuiClass4;

import javax.swing.JFrame;

import javax.swing.*;

import java.awt.*;

public class WindowLeftFL extends JFrame{
    public WindowLeftFL (String title) {
        super ( title );
        setSize(500, 75);
        setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE );
        Container cp = getContentPane();
        cp.setLayout ( new FlowLayout(FlowLayout.LEFT));
        JButton button = new JButton( "I am the first button" );
        cp.add( button );
        JButton button2 = new JButton( "I am the second button" );
        cp.add( button2 );
    }
}
