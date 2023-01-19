package GuiClass18;

import javax.swing.*;

import java.awt.*;

import java.awt.event.ActionListener;

import java.awt.event.ActionEvent;


public class Drawing3 extends JFrame {

    private Container cp;
    private Picture picture;

    public Drawing3 () {

       super("Drawing3 Example");
       setSize(280, 215);
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       cp = getContentPane();
       cp.setLayout(new BorderLayout());

       JButton setButton = new JButton("Set text");
       setButton.addActionListener(new InputDialog());
       cp.add(setButton, BorderLayout.NORTH);

       picture = new Picture ("");
       cp.add(picture, BorderLayout.CENTER);

       JButton clearButton = new JButton("Clear text");
       clearButton.addActionListener(new clearText());
       cp.add(clearButton, BorderLayout.SOUTH);

       GridLayout gl = new GridLayout(3, 1);
       JPanel colors = new JPanel();
       JPanel sizes = new JPanel();
       colors.setLayout(gl);
       sizes.setLayout(gl);
       JButton greenButton = new JButton("Green");
       JButton blackButton = new JButton("Black");
       JButton redButton = new JButton("Red");

       JButton tenButton = new JButton("10");
       JButton twentyButton = new JButton("20");
       JButton thirtyButton = new JButton("30");

       colors.add(greenButton);
       colors.add(blackButton);
       colors.add(redButton);

       sizes.add(tenButton);
       sizes.add(twentyButton);
       sizes.add(thirtyButton);

       greenButton.addActionListener(new changeAspect());
       blackButton.addActionListener(new changeAspect());
       redButton.addActionListener(new changeAspect());

       tenButton.addActionListener(new changeSize());
       twentyButton.addActionListener(new changeSize());
       thirtyButton.addActionListener(new changeSize());

       cp.add(colors, BorderLayout.WEST);
       cp.add(sizes, BorderLayout.EAST);
    }

    private class InputDialog implements ActionListener {
        public void actionPerformed ( ActionEvent e ) {
           JButton b = (JButton) e.getSource ();
           String txt = JOptionPane.showInputDialog ( b.getParent (), "Insert text:", "");
           picture.setText(txt);
       }
    }
    private class clearText implements ActionListener {
        public void actionPerformed ( ActionEvent e ) {
           picture.setText("");
       }
    }

    private class changeAspect implements ActionListener {
        public void actionPerformed ( ActionEvent e ) {
           JButton b = (JButton) e.getSource ();
           picture.changeColor(b.getText());
       }
    }
    private class changeSize implements ActionListener {
        public void actionPerformed ( ActionEvent e ) {
           JButton b = (JButton) e.getSource ();
           picture.changeFontSize(b.getText());
       }
    }

    public static void main ( String[] args ) {

        Drawing3 sw = new Drawing3 ();
    
        sw.setVisible ( true );
    
    }
}