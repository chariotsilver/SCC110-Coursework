import java.awt.*;
import javax.swing.*;  
public class Board2{
        public static ImageIcon w = new ImageIcon("Water.png");
        public static ImageIcon g = new ImageIcon("GreenFrog.png");
        public static ImageIcon r = new ImageIcon("RedFrog.png");
        public static ImageIcon l = new ImageIcon("LilyPad.png");
// The lines above define the Images that can be placed on the board and their corresponding letter, which will be held in the level array.
        public static JFrame window = new JFrame("Hoppers");
        public static JPanel panel = new JPanel();
// The code above declares the window and panel to which the buttons will be added.
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
// These lines of code define the paramaters for the window (Height, visibility).
        }  
        Square2 loader = new Square2();
        /** 
        * Loader is an instance of Square2 
        * within the Board2 Class 
        * It iteratively checks each item in the level1 array
        * and creates new button classes accordingly.
        * 
        */
// The Square2 class is instantiated, and loads the buttons to the panel.
        static void executor() {
                Board2.panel.removeAll();
                Board2.window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
// Closes the old board before refreshing with the updated board.
                Board2 hopperboard2 = new Board2();
// The Executor method removes all buttons from the previous board and reloads the board.
                }
}
