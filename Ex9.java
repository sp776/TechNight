import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ex9 extends JFrame {
  private JPanel jp = new JPanel();
  
  private JLabel slot1 = new JLabel( "?" );
  private JLabel slot2 = new JLabel( "?" );
  private JLabel slot3 = new JLabel( "?" );
  private JLabel tokens = new JLabel( "You start with 100 tokens" );
  
  int count1 = 0;
  int count2 = 0;
  int count3 = 0;
  int counttoks = 100;
  
  private JButton btnStart = new JButton( "Start" );
  private JButton btnStop = new JButton( "Stop" );
  private javax.swing.Timer timer;
  
  public Ex9(){
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setTitle( "Timer" );
    
    jp.setBackground( Color.WHITE );
    jp.setPreferredSize( new Dimension( 300, 210 ) );
    jp.setLayout( null );
    
    slot1.setBounds( 50, 60, 90, 30 );
    slot2.setBounds( 137, 60, 90, 30 );
    slot3.setBounds( 225, 60, 90, 30 );
    tokens.setBounds( 15, 120, 270, 30);
    Font font2 = new Font("SansSerif", Font.BOLD, 36);
    slot1.setFont(font2);
    slot2.setFont(font2);
    slot3.setFont(font2);
    
    btnStart.setBounds( 15, 15, 270, 30 );
    btnStop.setBounds( 15, 165, 270, 30 );
    btnStart.addActionListener( new Respond() );
    btnStop.addActionListener( new Respond() );
    
    timer = new javax.swing.Timer( 100, new TimerListener() );
    
    jp.add( btnStart );
    jp.add( slot1 );
    jp.add( slot2 );
    jp.add( slot3 );
    jp.add( btnStop );
    jp.add(tokens);
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
  
  private class TimerListener implements ActionListener {
    public void actionPerformed(ActionEvent e)  {
      count1 = (int)(10*Math.random());
      count2 = (int)(10*Math.random());
      count3 = (int)(10*Math.random());
      slot1.setText( count1 + "" );
      slot2.setText( count2 + "" );
      slot3.setText( count3 + "" );
    }
  }
  
  private class Respond implements ActionListener{
    public void actionPerformed(ActionEvent e) {
        if ( e.getSource().equals( btnStart ) )
            timer.start();
        else {
            timer.stop();
            String a = slot1.getText();
            String b = slot2.getText();
            String c = slot3.getText();
            if( a.equals(b) && b.equals(c) ){
                counttoks += 30;
                String k = counttoks + "";
                tokens.setText ( "Won 30. You now have " + k + " tokens.");
            }
            else if ( a.equals(b) || b.equals(c) || c.equals(a) ){
                counttoks += 10;
                String k = counttoks + "";
                tokens.setText ( "Won 10. You now have " + k + " tokens.");
            }
            else{
                counttoks -= 10;
                String k = counttoks + "";
                tokens.setText ( "Lost 10. You now have " + k + " tokens.");
            }
        }
    }
  }
}
