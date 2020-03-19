import java.awt.*;
import javax.swing.*;  
public class Board{
        ImageIcon w = new ImageIcon("Water.png");
        ImageIcon g = new ImageIcon("GreenFrog.png");
        ImageIcon r = new ImageIcon("RedFrog.png");
        JFrame window = new JFrame("Hoppers");
        JPanel panel = new JPanel();
        ImageIcon[] level1={w,r,g,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w,w};
        
        public Board(){
        GridLayout boardlayout = new GridLayout(5,5);    
        panel.setLayout(boardlayout);   
        for (int counter = 0; counter < 25;counter++){
                if (level1[counter]==w){
                        JButton water = new JButton(w);
                        int tilePos= counter;
                                System.out.println(tilePos);
                                panel.add(water);
                }
                if (level1[counter]==g){
                        JButton greenFrog = new JButton(g);
                        panel.add(greenFrog);
                        
                }
                if (level1[counter]==r){
                        JButton redFrog = new JButton(r);
                        panel.add(redFrog);
                        
                }
                }
        window.setContentPane(panel);
        window.setVisible(true);
        window.setTitle("Hoppers");
        window.setSize(750,750);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }                                                                                                 

}
