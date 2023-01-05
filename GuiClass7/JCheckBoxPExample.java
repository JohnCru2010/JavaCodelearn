package GuiClass7;

import javax.swing.*;

import java.awt.*;


public class JCheckBoxPExample extends JFrame{
    public JCheckBoxPExample (String title, int w, int h) {
        super ( title );
        setSize(w, h);
        setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE );
        Container cp = getContentPane ();
        FlowLayout fl = new FlowLayout ();
        fl.setHgap ( 1 );
        fl.setVgap ( 7 );
        fl.setAlignment( LEFT_ALIGNMENT );
        JCheckBox cb1 = new JCheckBox("Monday");
        cb1.setSelected(false);
        JCheckBox cb2 = new JCheckBox("Tuesday");
        cb2.setSelected(false);
        JCheckBox cb3 = new JCheckBox("Wednesday");
        cb3.setSelected(false);
        JCheckBox cb4 = new JCheckBox("Thursday");
        cb4.setSelected(false);
        JCheckBox cb5 = new JCheckBox("Friday");
        cb5.setSelected(false);
        JCheckBox cb6 = new JCheckBox("Saturday");
        cb6.setSelected(false);
        JCheckBox cb7 = new JCheckBox("Sunday");
        cb7.setSelected(false);
        cp.add(cb1);
        cb2.setSelected(false);
        cp.add(cb2);
        cb3.setSelected(false);
        cp.add(cb3);
        cb4.setSelected(false);
        cp.add(cb4);
        cb5.setSelected(false);
        cp.add(cb5);
        cb6.setSelected(true);
        cp.add(cb6);
        cb7.setSelected(true);
        cp.add(cb7);

    }
}