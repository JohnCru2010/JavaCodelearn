package GuiClass9;

import javax.swing.*;

import java.awt.*;

public class JComboBoxExample extends JFrame{
    public JComboBoxExample( String title, int w, int h) {

       super ( title );
       setSize ( w, h );
       setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE );
       JPanel comboPanel = new JPanel ();
       comboPanel.setLayout ( new FlowLayout () );

       String[] s = {"Python", "Java", "C++", "C#"};
       JComboBox cb1 = new JComboBox(s);
       cb1.setSelectedIndex (0);
       comboPanel.add ( cb1 );

       JPanel buttonPanel = new JPanel ();
       buttonPanel.setLayout ( new FlowLayout () );
       buttonPanel.add ( new JButton ( "Accept" ) );
       buttonPanel.add ( new JButton ( "Cancel" ) );
       Container cp = getContentPane ();
       cp.add ( buttonPanel, BorderLayout.SOUTH );
       cp.add ( comboPanel, BorderLayout.NORTH );

    }
}
