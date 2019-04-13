import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;

public class GreenFrame extends JFrame {
    public GreenFrame(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle( "HEY" );
        JPanel jp = new JPanel();
        jp.setBackground( Color.GREEN );
        jp.setPreferredSize( new Dimension( 100, 300 ) );
        jp.setLayout( null );
        getContentPane().add( jp );
        pack();
    }

    public void display() {
        EventQueue.invokeLater(new Runnable() {
                public void run() {
                    setVisible(true);
                }
            });
    }
}