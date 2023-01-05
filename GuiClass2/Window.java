package GuiClass2;

import javax.swing.*;

import java.awt.*;

public class Window extends JFrame{
    public Window (String title, int width, int height) {
        super ( title );
        setSize(width, height);
        setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE );
        Container cp = getContentPane();
        cp.setLayout ( new FlowLayout() );
        JToggleButton button = new JToggleButton( "Press me" );
        cp.add( button );
    }
}