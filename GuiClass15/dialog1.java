package GuiClass15;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class dialog1 extends JFrame {
    public dialog1 () {
       super ( "Dialog1 Example" );
       setSize ( 200,75 );
       setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE );

       Container cp = getContentPane ();
       cp.setLayout ( new FlowLayout () );
       JButton button = new JButton("Press me!");

       button.addActionListener ( new showDialog () );
       
       cp.add(button);
    }

    private class showDialog implements ActionListener {
      public void actionPerformed ( ActionEvent e ) {
        JButton b = (JButton) e.getSource ();
        JOptionPane.showMessageDialog ( b.getParent (), "My first dialog!" );
     }
    }
    public static void main ( String args[] ) {
        dialog1 obj = new dialog1 ();
        obj.setVisible ( true );
   }
}