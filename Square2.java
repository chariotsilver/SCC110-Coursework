import javax.swing.*;  
import java.awt.event.*;
public class Square2{
// Square is the class which adds the buttons to the panel.
        public Square2(){
            for (int counter = 0; counter < 25;counter++){
// This for loop checks each item in the level array in board, and adds the corresponding button to the panel on the frame.
                if (Board2.level1[counter]==Board2.w){
                        JButton water = new JButton(Board2.w);
                                int tilePos= counter;
// tilePos holds the position of the button in the array (0-24).
                                water.addActionListener(new ActionListener(){
                                        public void actionPerformed(ActionEvent e){
// This actionEvent runs the following code, which is necessary in the moving functionality.
                                                System.out.println("Water is working");
                                                System.out.println(tilePos);
                                        }
                                        });
                                

                                Board2.panel.add(water);
// The corresponding panel is added

                }
                if (Board2.level1[counter]==Board2.g){
// This code is thhe same as the first *if* statement, and adds a button to the pannel corresponding to the value in the current index of the array.
                        JButton greenFrog = new JButton(Board2.g);
                         int tilePos= counter;
                        greenFrog.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent e){
                        System.out.println("Greenfrog is working");
                        System.out.println(tilePos);
                        }
                        });
                        Board2.panel.add(greenFrog);
                }
                if (Board2.level1[counter]==Board2.l){
// This code is thhe same as the first *if* statement, and adds a button to the pannel corresponding to the value in the current index of the array.
                        JButton lilyPad = new JButton(Board2.l);
                         int tilePos= counter;
                        lilyPad.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent e){
                        System.out.println("Lilypad is working");
                        System.out.println(tilePos);
                        }
                        });
                        Board2.panel.add(lilyPad);
                }
                if (Board2.level1[counter]==Board2.r){
// This code is thhe same as the first *if* statement, and adds a button to the pannel corresponding to the value in the current index of the array.
                        JButton redFrog = new JButton(Board2.r);
                        int tilePos= counter;
                        redFrog.addActionListener(new ActionListener(){
                         public void actionPerformed(ActionEvent e){
                        System.out.println("Redfrog is working");
                        System.out.println(tilePos);
                        }
                        });
                        Board2.panel.add(redFrog);
                        
                }

        }
        }
// This ^ Closes Square2

        static void moveTo() {
        int selectPiece;
        }

}