package GuiJava;

import javax.swing.*;

public class Window extends JFrame{
    public Window (String title, int width, int height) {
        super ( title );
        setSize(width, height);
        setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE );
    }
}
