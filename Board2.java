import java.awt.*;
import javax.swing.*;  
public class Board2{
        public static ImageIcon w = new ImageIcon("Water.png");
        public static ImageIcon g = new ImageIcon("GreenFrog.png");
        public static ImageIcon r = new ImageIcon("RedFrog.png");
// The lines above define the Images that can be placed on the board and their corresponding letter, which will be held in the level array.
        public JFrame window = new JFrame("Hoppers");
        public static JPanel panel = new JPanel();
// The code above declares the window and panel to which the buttons will be added.
        public static ImageIcon[] level1={w,r,r,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w};
// The level array holds the layout of the different buttons within the grid.
        
        public Board2(){
        GridLayout Board2layout = new GridLayout(5,5);    
        panel.setLayout(Board2layout);   
//This code defines the Board layout and sets the panel to this layout.

        window.setContentPane(panel);
        window.setVisible(true);
        window.setTitle("Hoppers");
        window.setSize(750,750);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }  
        Square2 loader = new Square2();
// The Square2 class is instantiated, and loads the buttons to the panel.
}
