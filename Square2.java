import javax.swing.*;  
import java.awt.event.*;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
public class Square2{
        int selectPiece;
        public static boolean piece1Clicked=false;
        public static boolean piece2Clicked=false;
        public static int piece1Position;
        public static int piece2Position;
// The lines above initialise the integer values of the clicked piece's locations as well as the boolean click states (clicked or not clicked).
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
                                                selectPiece = tilePos;
                                                if (Square2.piece1Clicked == true & Square2.piece2Clicked == true){
                                                        piece2Clicked =false;
                                                        piece1Clicked =false;
                                                        }
// The lines above ^ check if a)the initial piece and b) the piece to be moved to have been clicked. If both pieces have been clicked, then both pieces are deselected.  
                                                 if (Square2.piece1Clicked == true & Square2.piece2Clicked == false){
                                                        piece2Clicked =true;
                                                        piece2Position = tilePos;
                                                        moveTo();
                                                        }
// The lines above ^ check if a)the initial piece and b) the piece to be moved to have been clicked. If the first piece has been clicked but the second has not, the second piece's click state is set to "true"  
                                                 if (Square2.piece1Clicked == false){
                                                        piece1Clicked =true;
                                                        piece1Position = tilePos;
                                                        }
// The lines above ^ check if the first piece has been clicked. If it has not been clicked (if the value of piece1Clicked is false) then the click value is set to true.
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
                                                selectPiece = tilePos;
                                                if (Square2.piece1Clicked == true & Square2.piece2Clicked == true){
                                                        piece2Clicked =false;
                                                        piece1Clicked =false;
                                                        }
                                                 if (Square2.piece1Clicked == true & Square2.piece2Clicked == false){
                                                        piece2Clicked =true;
                                                        piece2Position = tilePos;
                                                        moveTo();
                                                        }
                                                 if (Square2.piece1Clicked == false){
                                                        piece1Clicked =true;
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
                                                selectPiece = tilePos;
                                                if (Square2.piece1Clicked == true & Square2.piece2Clicked == true){
                                                        piece2Clicked =false;
                                                        piece1Clicked =false;
                                                        }
                                                 if (Square2.piece1Clicked == true & Square2.piece2Clicked == false){
                                                        piece2Clicked =true;
                                                        piece2Position = tilePos;
                                                        moveTo();
                                                        }
                                                 if (Square2.piece1Clicked == false){
                                                        piece1Clicked =true;
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
                                                selectPiece = tilePos;
                                                if (Square2.piece1Clicked == true & Square2.piece2Clicked == true){
                                                        piece2Clicked =false;
                                                        piece1Clicked =false;
                                                        }
                                                 if (Square2.piece1Clicked == true & Square2.piece2Clicked == false){
                                                        piece2Clicked =true;
                                                        piece2Position = tilePos;
                                                        moveTo();
                                                        }
                                                 if (Square2.piece1Clicked == false){
                                                        piece1Clicked =true;
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
        if (Hoppers2.level1[Square2.piece1Position]==Board2.g ^ Hoppers2.level1[Square2.piece1Position]==Board2.r){
// Checks that the piece being moved is a frog, be it red or green.
                if (Hoppers2.level1[Square2.piece2Position]==Board2.l){
// Checks that the tile being moved to is an empty Lily Pad.
                int jumpDifference;
                jumpDifference = (Square2.piece2Position - Square2.piece1Position);
// jumpDistance is the distance between the tile clicked first, the starting tile, and the tile clicked second, the destination tile.
                int checkDistance=jumpDifference/2;
// As the pads are only on "even" numbered buttons in the array, we have to check halfway between the starting pad and the destination pad for a frog.
                int override = Square2.piece1Position+checkDistance;
// The value of "override" is the location which must be checked for a frog. This is obtained by adding half of jumpDifference to the location of the start of the move.
                if (Hoppers2.level1[override]==Board2.r ^ Hoppers2.level1[override]==Board2.g){
// The override location is checked to see if there is a frog at this location, thus determining if the move is legal or not.
                Hoppers2.level1[override]=Board2.l; 
// The override location is set to a lilypad to remove any frogs on this location.                    
                Hoppers2.level1[Square2.piece2Position]=Hoppers2.level1[Square2.piece1Position];
// Sets the tile being moved to to the value of the moved frog (Red or Green).
                Hoppers2.level1[Square2.piece1Position]=Board2.l;}
// Clears the tile that the Frog moved from to an empty Lily Pad.
                boolean winCheck=true;
// Initialises the win condition as true.
                for (int counter = 0; counter < 25;counter++){
// A for loop is used to iterate through all values in the level array checking for green frogs.
                        if (Hoppers2.level1[counter]==Board2.g){
                                winCheck=false;
// If a single green frog is found in the array, the win condition is set to false.
                        }
                }
                
                

                Board2.executor();
// The executor method is run to refresh the board at the end of the turn.
                if (winCheck== true){
// The win condition is checked. If it is still true, then no green frogs were found and must have been removed by the red frog.
                        System.out.println("You Win!");
                        JFrame Victory = new JFrame();
                            JOptionPane.showMessageDialog(Victory, "You Win!");
// A victory message is shown to the user when the win condition is met.
                                }
// Runs the executor method to reload the board. 
                        }
                }
        }
}