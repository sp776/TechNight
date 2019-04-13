import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ex5 extends JFrame {
    private JPanel jp = new JPanel();
    private JButton ADDbutton = new JButton ("Add");
    private JButton MULTbutton = new JButton ("Multiply");
    private JTextField num1 = new JTextField();
    private JTextField num2 = new JTextField();
    private JLabel rtn = new JLabel ();
    
    public Ex5(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Button!");
        jp.setBackground( Color.WHITE );
        jp.setPreferredSize( new Dimension( 225, 195 ) );
        jp.setLayout( null );
        
        ButtonListener spy = new ButtonListener();
        ADDbutton.addActionListener(spy);
        MULTbutton.addActionListener(spy);
        
        ADDbutton.setBounds(15, 105, 90, 30);
        jp.add(ADDbutton);
        MULTbutton.setBounds(120, 105, 90, 30);
        jp.add(MULTbutton);
        
        num1.setBackground( Color.WHITE );
        num1.setBounds( 120, 15, 90, 30);
        jp.add(num1); 
        num2.setBackground( Color.WHITE );
        num2.setBounds( 120, 60, 90, 30);
        jp.add(num2);
        
        JLabel jl1 = new JLabel( "Enter an integer");
        jl1.setBounds(15, 15, 90, 30);
        jp.add(jl1);
        JLabel jl2 = new JLabel( "Enter an integer");
        jl2.setBounds(15, 60, 90, 30);
        jp.add(jl2);
        
        rtn.setBounds(15, 155, 90, 30);
        jp.add(rtn);
        
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
            String a = num1.getText();
            String b = num2.getText();
            int n1 = Integer.parseInt( a );
            int n2 = Integer.parseInt( b );
            if (e.getSource().equals(ADDbutton)){
                String sum = (n1+n2) + "";
                rtn.setText( a + " + " + b + " = " + sum);
            } else{
                String prod = (n1*n2) + "";
                rtn.setText( a + " * " + b + " = " + prod);
            }
    }
}
}