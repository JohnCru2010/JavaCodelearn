package GuiClass16;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class dialog2 extends JFrame {
   private JLabel question;
   private JButton bt;
    public dialog2 () {
       super ( "Dialog2 Example" );
       
       setSize ( 350,75 );
       setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE );

       Container cp = getContentPane ();
       cp.setLayout ( new FlowLayout () );
       question = new JLabel("Whats your name?");
       bt = new JButton("Answer");

      bt.addActionListener ( new showDialog () );
       
      cp.add(question);
      cp.add(bt);
    }

    private class showDialog implements ActionListener {
      public void actionPerformed ( ActionEvent e ) {

         JButton b = (JButton) e.getSource ();
         String name = JOptionPane.showInputDialog ( b.getParent (), "Enter your name:", "");
     
         if ( name.equals("") ) {
            question.setText ( "Are you sure you have written your name correctly?" );
         } else {
            question.setText ( "Nice to meet you " + name + "!" );
            bt.setVisible ( false );
         }

     }
    }
    public static void main ( String args[] ) {
        dialog2 obj = new dialog2 ();
        obj.setVisible ( true );
   }
}