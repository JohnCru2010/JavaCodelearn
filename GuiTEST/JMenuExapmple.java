package GuiTEST;

import javax.swing.*;


class JMenuExample extends JFrame {

    JMenuExample (String title, int width, int height) {

       super ( title );

       setSize ( width, height );

       setDefaultCloseOperation ( JFrame.EXIT_ON_CLOSE );

       JMenuBar menubar = new JMenuBar ();

       JMenu menu1 = new JMenu ( "File" );
       JMenu menu2 = new JMenu ( "Edit" );
       JMenu menu3 = new JMenu ( "About" );

       menubar.add ( menu1 );
       menubar.add ( menu2 );
       menubar.add ( menu3 );

       JMenuItem jmi1 = new JMenuItem ( "Open" );
       JMenuItem jmi2 = new JMenuItem ( "Close" );

       menu1.add ( jmi1 );
       menu1.add ( jmi2 );

       menu1.addSeparator ();

       JMenuItem jmi3 = new JMenuItem ( "Save as ..." );
       JMenuItem jmi4 = new JMenuItem ( "Save" );

       menu1.add ( jmi3 );
       menu1.add ( jmi4 );

       JMenuItem Cut = new JMenuItem ( "Cut" );
       JMenuItem Copy = new JMenuItem ( "Copy" );
       JMenuItem Paste = new JMenuItem ( "Paste" );

       menu2.add ( Cut );
       menu2.add ( Copy );
       menu2.add ( Paste );
       // Add the JMenuBar to the JFrame

       this.setJMenuBar(menubar);

    }
}


