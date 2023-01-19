package GuiClass18;

import javax.swing.*;

import java.awt.*;

class Picture extends JPanel {

    private String text;
    private Color color;
    private int size;

    public Picture (String text) {
      super ();
      this.text = text;
      this.color = Color.GREEN;
      this.size = 20;
    }

    public void setText (String text) {
        this.text = text;
        this.repaint();
    }

    public void changeColor (String color) {
        switch (color) {
            case "Black":
              this.color = Color.BLACK;
              break;
            case "Red":
              this.color = Color.RED;
              break;
            default: 
              this.color = Color.GREEN;
              break;
        }
        repaint ();
    }

    public void changeFontSize (String fontSize) {
        switch (fontSize) {
          case "10":
              this.size = 10;
              break;
          case "20":
              this.size = 30;
              break;
          default: 
              this.size = 20;
              break;
        }
        repaint();
    }

    public void paintComponent ( Graphics g ) {
    
       g.setColor ( Color.WHITE );

       g.fillRect ( 10, 10, 130, 100 );

       g.setColor ( this.color );

       g.setFont (new Font ( "", Font.ITALIC, this.size));

       g.drawString (this.text, 15, 50);
    }

}