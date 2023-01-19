package GuiClass17;

import javax.swing.*;

import java.awt.*;

import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;


public class Drawing2 extends JFrame {

    private Container cp;
    private Picture picture;

    public Drawing2 () {

       super("Drawing2 Example");

       setSize(150, 200);

       cp = getContentPane();

       cp.setLayout(new BorderLayout());

       JButton button = new JButton("Set text");

       button.addActionListener(new InputDialog());

       cp.add(button, BorderLayout.NORTH);

       picture = new Picture ("");

       cp.add(picture, BorderLayout.CENTER);

    }

    private class InputDialog implements ActionListener {
        public void actionPerformed ( ActionEvent e ) {
  
           JButton b = (JButton) e.getSource ();
           String txt = JOptionPane.showInputDialog ( b.getParent (), "Insert text:", "");
           picture.setText(txt);
       }
    }

    public static void main ( String[] args ) {

        Drawing2 sw = new Drawing2 ();
    
        sw.setVisible ( true );
    
    }
}