import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ex7 extends JFrame {
    private JPanel jp = new JPanel();
    private JLabel rtn = new JLabel();
    private JButton clear = new JButton ("Clear the Message");
    
    public Ex7(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Button!");
        jp.setBackground( Color.WHITE );
        jp.setPreferredSize( new Dimension( 810, 285 ) );
        jp.setLayout( null );
        
        JButton [] abc = new JButton[26];
        
        ButtonListener spy = new ButtonListener();
        for( int k = 0; k < 26; k++ ){
            char ch = (char)(k + 65);
            String letter = ch + "";
            abc[k] = new JButton(letter);
            
            int x = 0;
            int y = 0;
            if (k < 13){
                x = 15 + (k*60);
                y = 15;
            }else{
                x = 15 + ((k-13)*60);
                y = 90;
            }
            abc[k].setBounds(x, y, 60, 60);
            abc[k].addActionListener(spy);
            jp.add(abc[k]);
        }
        
        rtn.setBounds( 15, 165, 780, 30);
        jp.add(rtn);
        
        clear.setBounds( 15, 210, 780, 60);
        clear.addActionListener(spy);
        jp.add(clear);
        
        getContentPane().add( jp );
        pack();
    }
    
    public void display(){
        EventQueue.invokeLater(new Runnable() {
            public void run(){
                setVisible(true);
            }
        });
    }

    private class ButtonListener implements ActionListener{
        public void actionPerformed( ActionEvent e){
            if (e.getSource().equals(clear))
                rtn.setText (" ");
            else{
                JButton b = (JButton)e.getSource();
                String text = b.getText();
                rtn.setText( rtn.getText() + text );
            }
        }
    }
}