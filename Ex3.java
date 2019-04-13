import javax.swing.*;
import java.awt.*;

public class Ex3 extends JFrame {
    public Ex3(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Button!");
        JPanel jp = new JPanel();
        jp.setBackground( Color.YELLOW );
        jp.setPreferredSize( new Dimension( 200, 200 ) );
        jp.setLayout( null );
        
        JButton button = new JButton ("Do Something");
        button.setBounds(25, 145, 150, 30);
        jp.add(button);
        
        JTextField tf1 = new JTextField(10);
        tf1.setBackground( Color.WHITE );
        tf1.setBounds( 100, 25, 75, 30);
        jp.add(tf1);
        JTextField tf2 = new JTextField();
        tf2.setBounds( 100, 70, 75, 30);
        jp.add(tf2);
        
        JLabel name = new JLabel( "Name");
        name.setBounds(25, 25, 60, 30);
        jp.add(name);
        JLabel age = new JLabel( "Age");
        age.setBounds(25, 70, 60, 30);
        jp.add(age);
        
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
}