package GuiClass14;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Example4 extends JFrame {
    private JComboBox petList;
    private final String pets [] = {"Bird", "Cat", "Dog", "Rabbit", "Pig"};
    private JLabel petPreference;

    public Example4 () {
       super ( "Fourth Example" );
       setSize ( 350,125 );
       setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE );

       Container cp = getContentPane ();
       cp.setLayout ( new GridLayout (1, 2) );
       JPanel Panel = new JPanel();
       Panel.setLayout(new GridLayout (2, 1));

       petPreference = new JLabel("");
       JLabel label = new JLabel("Select your favorite pet:");
       petList = new JComboBox(pets);
       petList.addActionListener ( new ChosenAnimal() );
       
       Panel.add(label);
       Panel.add(petPreference);
       Panel.add(petList);

       cp.add(Panel, BorderLayout.WEST );
    }

    private class ChosenAnimal implements ActionListener {
      public void actionPerformed ( ActionEvent e ) {
         JComboBox cb = (JComboBox) e.getSource();
         String petname = (String) cb.getSelectedItem();
         petPreference.setText ( "Your favorite per is " + petname );
         petPreference.setHorizontalAlignment ( JLabel.RIGHT );
     }
    }
    public static void main ( String args[] ) {
      Example4 obj = new Example4 ();
      obj.setVisible ( true );
   }
}