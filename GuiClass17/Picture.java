package GuiClass17;

import javax.swing.*;

import java.awt.*;

class Picture extends JPanel {

    private String text;

    public Picture (String text) {
      super ();
      this.text = text;
    }

    public void setText (String text) {
        this.text = text;
        this.repaint();
    }

    public void paintComponent ( Graphics g ) {
    
       g.setColor ( Color.WHITE );

       g.fillRect ( 10, 10, 130, 100 );

       g.setColor ( Color.GREEN );

       g.setFont (new Font ( "", Font.ITALIC, 20));

       g.drawString (this.text, 15, 50);
    }

}