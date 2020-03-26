import javax.swing.*;  
import java.awt.event.*;
public class Square2{
        int selectPiece;
        public static boolean piece1Clicked=false;
        public static boolean piece2Clicked=false;
        public static int piece1Position;
        public static int piece2Position;
// Square is the class which adds the buttons to the panel.
        public Square2(){
            for (int counter = 0; counter < 25;counter++){
// This for loop checks each item in the level array in board, and adds the corresponding button to the panel on the frame.
                if (Hoppers2.level1[counter]==Board2.w){
                        JButton water = new JButton(Board2.w);
                                int tilePos= counter;
// tilePos holds the position of the button in the array (0-24).
                                water.addActionListener(new ActionListener(){
                                        public void actionPerformed(ActionEvent e){
// This actionEvent runs the following code, which is necessary in the moving functionality.
                                                System.out.println(tilePos);
                                                selectPiece = tilePos;
                                                if (Square2.piece1Clicked == true & Square2.piece2Clicked == true){
                                                        piece2Clicked =false;
                                                        piece1Clicked =false;
                                                        System.out.println("deselection");
                                                        }
                                                 if (Square2.piece1Clicked == true & Square2.piece2Clicked == false){
                                                        piece2Clicked =true;
                                                        System.out.println("piece2Clicked true");
                                                        piece2Position = tilePos;
                                                        moveTo();
                                                        }
                                                 if (Square2.piece1Clicked == false){
                                                        piece1Clicked =true;
                                                        System.out.println("piece1Clicked true");
                                                        piece1Position = tilePos;
                                                        }
                                        }
                                        });
                                

                                Board2.panel.add(water);
// The corresponding panel is added

                }
                if (Hoppers2.level1[counter]==Board2.g){
// This code is thhe same as the first *if* statement, and adds a button to the pannel corresponding to the value in the current index of the array.
                        JButton greenFrog = new JButton(Board2.g);
                         int tilePos= counter;
                        greenFrog.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent e){
                        System.out.println(tilePos);
                                                selectPiece = tilePos;
                                                if (Square2.piece1Clicked == true & Square2.piece2Clicked == true){
                                                        piece2Clicked =false;
                                                        piece1Clicked =false;
                                                        System.out.println("deselection");
                                                        }
                                                 if (Square2.piece1Clicked == true & Square2.piece2Clicked == false){
                                                        piece2Clicked =true;
                                                        System.out.println("piece2Clicked true");
                                                        piece2Position = tilePos;
                                                        moveTo();
                                                        }
                                                 if (Square2.piece1Clicked == false){
                                                        piece1Clicked =true;
                                                        System.out.println("piece1Clicked true");
                                                        piece1Position = tilePos;
                                                        }
                                        }
                        });
                        Board2.panel.add(greenFrog);
                }
                if (Hoppers2.level1[counter]==Board2.l){
// This code is thhe same as the first *if* statement, and adds a button to the pannel corresponding to the value in the current index of the array.
                        JButton lilyPad = new JButton(Board2.l);
                         int tilePos= counter;
                        lilyPad.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent e){
                        System.out.println(tilePos);
                                                selectPiece = tilePos;
                                                if (Square2.piece1Clicked == true & Square2.piece2Clicked == true){
                                                        piece2Clicked =false;
                                                        piece1Clicked =false;
                                                        System.out.println("deselection");
                                                        }
                                                 if (Square2.piece1Clicked == true & Square2.piece2Clicked == false){
                                                        piece2Clicked =true;
                                                        System.out.println("piece2Clicked true");
                                                        piece2Position = tilePos;
                                                        moveTo();
                                                        }
                                                 if (Square2.piece1Clicked == false){
                                                        piece1Clicked =true;
                                                        System.out.println("piece1Clicked true");
                                                        piece1Position = tilePos;
                                                        }
                                        }
                        });
                        Board2.panel.add(lilyPad);
                }
                if (Hoppers2.level1[counter]==Board2.r){
// This code is thhe same as the first *if* statement, and adds a button to the pannel corresponding to the value in the current index of the array.
                        JButton redFrog = new JButton(Board2.r);
                        int tilePos= counter;
                        redFrog.addActionListener(new ActionListener(){
                         public void actionPerformed(ActionEvent e){
                        System.out.println(tilePos);
                                                selectPiece = tilePos;
                                                if (Square2.piece1Clicked == true & Square2.piece2Clicked == true){
                                                        piece2Clicked =false;
                                                        piece1Clicked =false;
                                                        System.out.println("deselection");
                                                        }
                                                 if (Square2.piece1Clicked == true & Square2.piece2Clicked == false){
                                                        piece2Clicked =true;
                                                        System.out.println("piece2Clicked true");
                                                        piece2Position = tilePos;
                                                        moveTo();
                                                        }
                                                 if (Square2.piece1Clicked == false){
                                                        piece1Clicked =true;
                                                        System.out.println("piece1Clicked true");
                                                        piece1Position = tilePos;
                                                        }
                                        }
                        });
                        Board2.panel.add(redFrog);
                        
                }

        }
        }
// This ^ Closes Square2

        static void moveTo() {
        System.out.println("moveto");
        if (Hoppers2.level1[Square2.piece1Position]==Board2.g ^ Hoppers2.level1[Square2.piece1Position]==Board2.r){
// Checks that the piece being moved is a frog, be it red or green.
                if (Hoppers2.level1[Square2.piece2Position]==Board2.l){
// Checks that the tile being moved to is an empty Lily Pad.
                System.out.println(Square2.piece1Position);
                System.out.println(Square2.piece2Position);
                System.out.println("moveto");
                Hoppers2.level1[Square2.piece2Position]=Hoppers2.level1[Square2.piece1Position];
// Sets the tile being moved to to the value of the moved frog (Red or Green).
                Hoppers2.level1[Square2.piece1Position]=Board2.l;
// Clears the tile that the Frog moved from to an empty Lily Pad.
                Board2.executor();
// Runs the executor method to reload the board. 
                        }
                }
        }
}