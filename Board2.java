import java.awt.*;
import javax.swing.*;  
public class Board2{
        ImageIcon w = new ImageIcon("Water.png");
        ImageIcon g = new ImageIcon("GreenFrog.png");
        ImageIcon r = new ImageIcon("RedFrog.png");
        JFrame window = new JFrame("Hoppers");
        JPanel panel = new JPanel();
        ImageIcon[] level1={w,r,g,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w};
        
        public Board2(){
        GridLayout Board2layout = new GridLayout(5,5);    
        panel.setLayout(Board2layout);   
            Square2 loader = new Square2;
                }
        window.setContentPane(panel);
        window.setVisible(true);
        window.setTitle("Hoppers");
        window.setSize(750,750);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }                                                                                                 

}
