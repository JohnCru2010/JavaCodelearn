package GuiClass8;

import javax.swing.*;

import java.awt.*;

public class JRadioButtonExample extends JFrame{
    public JRadioButtonExample( String title, int w, int h) {

       super ( title );
       setSize ( w, h );
       setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE );

       JPanel dataPanel = new JPanel ();
       FlowLayout gl = new FlowLayout ();
       dataPanel.setLayout ( gl );

       dataPanel.add ( new JLabel ( "Username:" ) );
       dataPanel.add ( new JTextField ( 10 ) );

       JRadioButton rb1 = new JRadioButton("Python");
       JRadioButton rb2 = new JRadioButton("Java");
       JRadioButton rb3 = new JRadioButton("C++");
       JRadioButton rb4 = new JRadioButton("C#");

       JPanel buttonPanels = new JPanel ();
       buttonPanels.setLayout ( new GridLayout ( 4, 1) );

       ButtonGroup bg = new ButtonGroup ();
       bg.add(rb1);
       bg.add(rb2);
       bg.add(rb3);
       bg.add(rb4);

       buttonPanels.add ( rb1 );
       buttonPanels.add ( rb2 );
       buttonPanels.add ( rb3 );
       buttonPanels.add ( rb4 );
       
       JPanel buttonPanel = new JPanel ();
       buttonPanel.setLayout ( new FlowLayout () );
       buttonPanel.add ( new JButton ( "Accept" ) );
       buttonPanel.add ( new JButton ( "Cancel" ) );
       Container cp = getContentPane ();
       cp.add ( dataPanel, BorderLayout.NORTH );
       cp.add ( buttonPanel, BorderLayout.SOUTH );
       cp.add ( buttonPanels, BorderLayout.WEST );

    }
}
