package GuiClass13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Example3 extends JFrame {
    private JButton sum;
    private JButton sub;
    private JTextField txf1;
    private JTextField txf2;
    private JLabel lab;

    public Example3 () {
       super ( "Third Example" );
       setSize ( 350,125 );
       setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE );

       Container cp = getContentPane ();
       cp.setLayout ( new GridLayout (3, 1) );
       JPanel textPane = new JPanel();
       JPanel buttonPane = new JPanel();

       txf1 = new JTextField ( 10 );
       textPane.add(txf1);
       txf2 = new JTextField ( 10 );
       textPane.add(txf2);

       sum = new JButton("Sum");
       buttonPane.add(sum);
       sub = new JButton("Substract");
       buttonPane.add(sub);

       sum.addActionListener ( new SumButtonPressedEvent () );
       sub.addActionListener ( new SubButtonPressedEvent () );

       lab = new JLabel ( "" );

       cp.add(textPane, BorderLayout.NORTH );
       cp.add(buttonPane, BorderLayout.SOUTH );
       cp.add(lab);
    }

    private class SumButtonPressedEvent implements ActionListener {
      public void actionPerformed ( ActionEvent e ) {
         int a, b;
         a = Integer.parseInt(txf1.getText());
         b = Integer.parseInt(txf2.getText());
         lab.setText("The sum of " + txf1.getText() + " and " + txf2.getText() + " is " + String.valueOf(a+b));
     }
    }

    private class SubButtonPressedEvent implements ActionListener {
      public void actionPerformed ( ActionEvent e ) {
         int a, b;
         a = Integer.parseInt(txf1.getText());
         b = Integer.parseInt(txf2.getText());
         lab.setText("The substraction of " + txf1.getText() + " and " + txf2.getText() + " is " + String.valueOf(a-b));
     }
    }

    public static void main ( String args[] ) {
      Example3 obj = new Example3 ();
      obj.setVisible ( true );
   }
}