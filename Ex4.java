import javax.swing.*;
import java.awt.*;

public class Ex4 extends JFrame {
    public Ex4(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Button!");
        JPanel jp = new JPanel();
        jp.setBackground( Color.WHITE );
        jp.setPreferredSize( new Dimension( 400, 400 ) );
        jp.setLayout( null );
        
        for (int x = 0; x < 10; x++){
            JPanel p = new JPanel();
            setRandomPosition(p);
            setRandomColor(p);
            jp.add(p);
        }
            getContentPane().add(jp);
            pack();
        }
    
    
    public void setRandomPosition(JPanel p){
        int width = (int) (100 * Math.random()) + 40;
        int height = (int) (100 * Math.random()) + 40;
        int x = (int) (250 * Math.random());
        int y = (int) (250 * Math.random());
        p.setBounds( x, y, width, height);
    }
    
    public void setRandomColor(JPanel p){
        int red = (int)(256*Math.random());
        int green = (int)(256*Math.random());
        int blue = (int)(256*Math.random());
        Color c = new Color( red, green, blue);
        p.setBackground (c);
    }
    
    public void display(){
        EventQueue.invokeLater(new Runnable() {
            public void run(){
                setVisible(true);
            }
        });
    }
}
