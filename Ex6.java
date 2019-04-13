import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ex6 extends JFrame {
    private JPanel jp = new JPanel();
    public Ex6(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Button!");
        jp.setBackground( Color.WHITE );
        jp.setPreferredSize( new Dimension( 300, 300 ) );
        jp.setLayout( null );
        
        JButton button = new JButton ("Change the Background Color");
        button.setBounds(25, 50, 250, 30);
        ButtonListener color = new ButtonListener();
        button.addActionListener(color);
        jp.add(button);
        
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
            setRandomColor(jp);
        }
        
        private void setRandomColor(JPanel p){
            int red = (int)(256*Math.random());
            int green = (int)(256*Math.random());
            int blue = (int)(256*Math.random());
            Color c = new Color( red, green, blue);
            p.setBackground (c);
        }
    }
}