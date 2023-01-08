package GuiClass10;

import javax.swing.*;

import java.util.Hashtable;

class JSliderExample extends JFrame {

    JSliderExample (String title, int width, int height) {
       super ( title );
       setSize ( width, height );
       setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE );

       JSlider sl1 = new JSlider(JSlider.HORIZONTAL, 0, 100, 50);

       Hashtable labelTable = new Hashtable ();
       labelTable.put ( new Integer ( 0 ), new JLabel ( "Slow" ) );
       labelTable.put ( new Integer ( 50 ), new JLabel ( "Medium" ) );
       labelTable.put ( new Integer ( 100 ), new JLabel ( "Fast" ) );

       
       
       sl1.setLabelTable ( labelTable );
       sl1.setPaintLabels ( true );
    }
}


