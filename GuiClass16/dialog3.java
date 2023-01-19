package GuiClass16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class dialog3 extends JFrame {
    public dialog3 () {
       super ( "Dialog3 Example" );
       setSize ( 300,75 );
       setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE );

       Container cp = getContentPane ();
       cp.setLayout ( new FlowLayout () );
       JButton button = new JButton("Close window");

       button.addActionListener ( new showDialog () );
       
       cp.add(button);
    }

    private class showDialog implements ActionListener {
      public void actionPerformed ( ActionEvent e ) {

         JButton b = (JButton) e.getSource ();
         int a = JOptionPane.showConfirmDialog ( b.getParent () , "Are you sure you want to quit?", "Exit confirmation", JOptionPane.YES_NO_OPTION );
         if ( a == JOptionPane.YES_OPTION ){
            System.exit (0);
         }
     }
    }
    public static void main ( String args[] ) {
        dialog3 obj = new dialog3 ();
        obj.setVisible ( true );
   }
}