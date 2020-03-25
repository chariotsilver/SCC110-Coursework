import java.awt.*;
import javax.swing.*;  
public class Board2{
        public static ImageIcon w = new ImageIcon("Water.png");
        public static ImageIcon g = new ImageIcon("GreenFrog.png");
        public static ImageIcon r = new ImageIcon("RedFrog.png");
        public JFrame window = new JFrame("Hoppers");
        public static JPanel panel = new JPanel();
        public static ImageIcon[] level1={w,r,r,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w};
        
        public Board2(){
        GridLayout Board2layout = new GridLayout(5,5);    
        panel.setLayout(Board2layout);   

        window.setContentPane(panel);
        window.setVisible(true);
        window.setTitle("Hoppers");
        window.setSize(750,750);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }  
        Square2 loader = new Square2();
}
