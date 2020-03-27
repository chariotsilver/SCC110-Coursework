import javax.swing.*; 
import java.util.Scanner; 
import javax.swing.JFrame;
/** 
* 
* @author Alexander Butler 
*/
public class Hoppers2{
    public static ImageIcon[] card1={Board2.r,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.g,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.l};
    public static ImageIcon[] card2={Board2.l,Board2.w,Board2.l,Board2.w,Board2.r,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.g,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.l};
    public static ImageIcon[] card3={Board2.l,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.g,Board2.w,Board2.l,Board2.w,Board2.r,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.l};
    public static ImageIcon[] card4={Board2.r,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.g,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.g,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.l};
    public static ImageIcon[] card5={Board2.l,Board2.w,Board2.g,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.g,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.r,Board2.w,Board2.l,Board2.w,Board2.l};
    public static ImageIcon[] card6={Board2.l,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.g,Board2.w,Board2.r,Board2.w,Board2.g,Board2.w,Board2.g,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.l};
    public static ImageIcon[] card7={Board2.l,Board2.w,Board2.g,Board2.w,Board2.r,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.g,Board2.w,Board2.l,Board2.w,Board2.g,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.g,Board2.w,Board2.l};
    public static ImageIcon[] card8={Board2.l,Board2.w,Board2.r,Board2.w,Board2.l,Board2.w,Board2.g,Board2.w,Board2.g,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.g,Board2.w,Board2.g,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.l};
    public static ImageIcon[] card9={Board2.l,Board2.w,Board2.g,Board2.w,Board2.l,Board2.w,Board2.g,Board2.w,Board2.g,Board2.w,Board2.l,Board2.w,Board2.r,Board2.w,Board2.g,Board2.w,Board2.l,Board2.w,Board2.g,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.l};
    public static ImageIcon[] card10={Board2.l,Board2.w,Board2.g,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.g,Board2.w,Board2.g,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.g,Board2.w,Board2.g,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.r};
    public static ImageIcon[] card11={Board2.r,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.g,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.g,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.l};
    public static ImageIcon[] card12={Board2.l,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.g,Board2.w,Board2.g,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.r,Board2.w,Board2.l,Board2.w,Board2.l};
    public static ImageIcon[] card13={Board2.l,Board2.w,Board2.l,Board2.w,Board2.r,Board2.w,Board2.g,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.g,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.g,Board2.w,Board2.l};
    public static ImageIcon[] card14={Board2.l,Board2.w,Board2.g,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.g,Board2.w,Board2.l,Board2.w,Board2.g,Board2.w,Board2.g,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.r,Board2.w,Board2.g};
    public static ImageIcon[] card15={Board2.g,Board2.w,Board2.g,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.g,Board2.w,Board2.r,Board2.w,Board2.g,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.l};
    public static ImageIcon[] card16={Board2.l,Board2.w,Board2.l,Board2.w,Board2.r,Board2.w,Board2.l,Board2.w,Board2.g,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.g,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.l};
    public static ImageIcon[] card17={Board2.l,Board2.w,Board2.r,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.g,Board2.w,Board2.l,Board2.w,Board2.g,Board2.w,Board2.g,Board2.w,Board2.l,Board2.w,Board2.g,Board2.w,Board2.l};
    public static ImageIcon[] card18={Board2.l,Board2.w,Board2.g,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.g,Board2.w,Board2.g,Board2.w,Board2.g,Board2.w,Board2.g,Board2.w,Board2.g,Board2.w,Board2.l,Board2.w,Board2.r,Board2.w,Board2.l};
    public static ImageIcon[] card19={Board2.g,Board2.w,Board2.g,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.g,Board2.w,Board2.r,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.g,Board2.w,Board2.g,Board2.w,Board2.l,Board2.w,Board2.g,Board2.w,Board2.l};
    public static ImageIcon[] card20={Board2.l,Board2.w,Board2.g,Board2.w,Board2.g,Board2.w,Board2.g,Board2.w,Board2.g,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.g,Board2.w,Board2.r,Board2.w,Board2.g,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.l};
    public static ImageIcon[] card21={Board2.g,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.g,Board2.w,Board2.r,Board2.w,Board2.l,Board2.w,Board2.g,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.g,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.g};
    public static ImageIcon[] card22={Board2.l,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.g,Board2.w,Board2.g,Board2.w,Board2.l,Board2.w,Board2.g,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.g,Board2.w,Board2.r,Board2.w,Board2.g};
    public static ImageIcon[] card23={Board2.l,Board2.w,Board2.l,Board2.w,Board2.g,Board2.w,Board2.g,Board2.w,Board2.g,Board2.w,Board2.l,Board2.w,Board2.g,Board2.w,Board2.l,Board2.w,Board2.g,Board2.w,Board2.l,Board2.w,Board2.g,Board2.w,Board2.l,Board2.w,Board2.r};
    public static ImageIcon[] card24={Board2.l,Board2.w,Board2.g,Board2.w,Board2.l,Board2.w,Board2.g,Board2.w,Board2.g,Board2.w,Board2.g,Board2.w,Board2.g,Board2.w,Board2.l,Board2.w,Board2.g,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.r};
    public static ImageIcon[] card25={Board2.l,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.g,Board2.w,Board2.g,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.g,Board2.w,Board2.g,Board2.w,Board2.l,Board2.w,Board2.g,Board2.w,Board2.l,Board2.w,Board2.r};
    public static ImageIcon[] card26={Board2.r,Board2.w,Board2.g,Board2.w,Board2.l,Board2.w,Board2.g,Board2.w,Board2.l,Board2.w,Board2.g,Board2.w,Board2.g,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.g,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.l};
    public static ImageIcon[] card27={Board2.l,Board2.w,Board2.l,Board2.w,Board2.r,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.g,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.g,Board2.w,Board2.l,Board2.w,Board2.g,Board2.w,Board2.g,Board2.w,Board2.l};
    public static ImageIcon[] card28={Board2.l,Board2.w,Board2.r,Board2.w,Board2.l,Board2.w,Board2.g,Board2.w,Board2.g,Board2.w,Board2.g,Board2.w,Board2.l,Board2.w,Board2.g,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.g,Board2.w,Board2.l,Board2.w,Board2.g};
    public static ImageIcon[] card29={Board2.l,Board2.w,Board2.r,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.g,Board2.w,Board2.l,Board2.w,Board2.g,Board2.w,Board2.g,Board2.w,Board2.g,Board2.w,Board2.l,Board2.w,Board2.g};
    public static ImageIcon[] card30={Board2.g,Board2.w,Board2.g,Board2.w,Board2.l,Board2.w,Board2.g,Board2.w,Board2.g,Board2.w,Board2.g,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.g,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.r};
    public static ImageIcon[] card31={Board2.l,Board2.w,Board2.g,Board2.w,Board2.r,Board2.w,Board2.g,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.g,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.g,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.l};
    public static ImageIcon[] card32={Board2.l,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.g,Board2.w,Board2.l,Board2.w,Board2.g,Board2.w,Board2.g,Board2.w,Board2.l,Board2.w,Board2.g,Board2.w,Board2.g,Board2.w,Board2.r,Board2.w,Board2.g,Board2.w,Board2.l};
    public static ImageIcon[] card33={Board2.l,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.g,Board2.w,Board2.r,Board2.w,Board2.g,Board2.w,Board2.g,Board2.w,Board2.g,Board2.w,Board2.l,Board2.w,Board2.g,Board2.w,Board2.l};
    public static ImageIcon[] card34={Board2.l,Board2.w,Board2.g,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.g,Board2.w,Board2.g,Board2.w,Board2.g,Board2.w,Board2.g,Board2.w,Board2.r};
    public static ImageIcon[] card35={Board2.g,Board2.w,Board2.l,Board2.w,Board2.g,Board2.w,Board2.g,Board2.w,Board2.g,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.g,Board2.w,Board2.g,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.r};
    public static ImageIcon[] card36={Board2.l,Board2.w,Board2.g,Board2.w,Board2.l,Board2.w,Board2.g,Board2.w,Board2.g,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.g,Board2.w,Board2.g,Board2.w,Board2.g,Board2.w,Board2.l,Board2.w,Board2.r};
    public static ImageIcon[] card37={Board2.l,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.g,Board2.w,Board2.l,Board2.w,Board2.g,Board2.w,Board2.g,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.g,Board2.w,Board2.r,Board2.w,Board2.g,Board2.w,Board2.l};
    public static ImageIcon[] card38={Board2.g,Board2.w,Board2.g,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.g,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.g,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.g,Board2.w,Board2.r};
    public static ImageIcon[] card39={Board2.r,Board2.w,Board2.l,Board2.w,Board2.g,Board2.w,Board2.l,Board2.w,Board2.g,Board2.w,Board2.g,Board2.w,Board2.g,Board2.w,Board2.l,Board2.w,Board2.g,Board2.w,Board2.l,Board2.w,Board2.g,Board2.w,Board2.g,Board2.w,Board2.l};
    public static ImageIcon[] card40={Board2.l,Board2.w,Board2.l,Board2.w,Board2.g,Board2.w,Board2.g,Board2.w,Board2.l,Board2.w,Board2.g,Board2.w,Board2.g,Board2.w,Board2.l,Board2.w,Board2.l,Board2.w,Board2.g,Board2.w,Board2.r,Board2.w,Board2.g,Board2.w,Board2.l};
// These arrays (card 1-40) define the layout of buttons on the panel in the game window.   
    public static int levelSelect;
// Initialises the levelSelect Integer
    public static ImageIcon[][] levelArray = {card1,card2,card3,card4,card5,card6,card7,card8,card9,card10,card11,card12,card13,card14,card15,card16,card17,card18,card19,card20,card21,card22,card23,card24,card25,card26,card27,card28,card29,card30,card31,card32,card33,card34,card35,card36,card37,card38,card39,card40};
// An array of the level arrays is created to facilitate level selection.
    public static ImageIcon[] level1=levelArray[levelSelect];
    public static void main (String args[])  {
         /** 
        * This is the main of the program 
        * it calls the Board2 class which in turn calls the Square 2 class
        *  which load objects to the GUI window.
        */
// This is the main of the program.
        System.out.println("Please enter the level you wish to play (0-39)");
        JFrame enterLevel = new JFrame();
        JOptionPane.showMessageDialog(enterLevel, "Please enter the level you wish to play (0-39)");
// Prompts the user to select the level they wish to play.
        Scanner reader = new Scanner(System.in);
        /** 
        *   Input is taken from the user
        *   using the scanner class
        *  'reader', which is converted to an integer.
        * 
        */
        String levelInput=reader.next();
        int intlevel = Integer.parseInt(levelInput);
// The scanner "reader" takes in the user's Input, which is converted to an Integer.
        levelSelect = intlevel;
        Hoppers2.level1=Hoppers2.levelArray[Hoppers2.levelSelect];
// The level is selected from the array of arrays (levelArray) using the user's input as an index of the array.
        Board2 hopperboard = new Board2();

// This file is  the main program, and loads Board, which in turn creates an instance of Square2 which loads the buttons to the screen.

    }
    
}

