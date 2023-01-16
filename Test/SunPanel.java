package Test;

import javax.swing.*;

import java.awt.*;


class SunPanel extends JPanel {

    public void paintComponent ( Graphics g ) {

       g.setColor ( Color.WHITE );

       g.drawRect ( 10, 10, 130, 100 );

       g.setColor ( Color.GREEN );

       g.setFont (new Font ( "", Font.ITALIC, 20));

       g.drawString ("Codelearn", 15, 50);
    }

}