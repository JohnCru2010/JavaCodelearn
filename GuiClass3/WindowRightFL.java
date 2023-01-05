package GuiClass3;

import javax.swing.JFrame;

import javax.swing.*;

import java.awt.*;

public class WindowRightFL extends JFrame{
    public WindowRightFL (String title) {
        super ( title );
        setSize(200, 200);
        setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE );
        Container cp = getContentPane();
        cp.setLayout ( new FlowLayout(FlowLayout.RIGHT));
        JButton button = new JButton( "Where am I?" );
        cp.add( button );
    }
}
