import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ex10 extends JFrame {
  private JPanel jp = new JPanel();
  private JLabel message = new JLabel( "Your message here" );
  private javax.swing.Timer timer;
  private int x = 0;
  
  public Ex10(){
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle( "Timer" );
    
    jp.setBackground( Color.WHITE );
    jp.setPreferredSize( new Dimension( 300, 120 ) );
    jp.setLayout( null );
    
    message.setBounds( 0, 40, 172, 30 );
    Font font2 = new Font("SansSerif", Font.BOLD, 18);
    message.setFont(font2);
    timer = new javax.swing.Timer( 30, new TimerListener() );
   
    jp.add( message );
    getContentPane().add( jp );
    pack(); 
    
    timer.start();
  }
  
  public void display() {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        setVisible(true);
      }
    });
  }
  
  private class TimerListener implements ActionListener {
    public void actionPerformed(ActionEvent e)  {
      x++;
      if ( x >= jp.getWidth() )
        x = -172;
      message.setBounds( x, 40, 172, 30 );
    }
  }
}
