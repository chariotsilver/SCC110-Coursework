import javax.swing.*; 
import java.util.Scanner; 
import javax.swing.JFrame;
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
    public static int levelselect = 39;
    public static ImageIcon[][] levelArray = {card1,card2,card3,card4,card5,card6,card7,card8,card9,card10,card11,card12,card13,card14,card15,card16,card17,card18,card19,card20,card21,card22,card23,card24,card25,card26,card27,card28,card29,card30,card31,card32,card33,card34,card35,card36,card37,card38,card39,card40};
    public static ImageIcon[] level1=levelArray[levelselect];
    public static void main (String args[])  {
        System.out.println("Please enter the level you wish to play (0-39)");
        JFrame enterLevel = new JFrame();
        JOptionPane.showMessageDialog(enterLevel, "Please enter the level you wish to play (0-39)");
        Scanner reader = new Scanner(System.in);
        String levelinput=reader.next();
        int intlevel = Integer.parseInt(levelinput);
        levelselect = intlevel;
        Hoppers2.level1=Hoppers2.levelArray[Hoppers2.levelselect];
        Board2 hopperboard = new Board2();

// This file is  the main program, and loads Board, which in turn creates an instance of Square2 which loads the buttons to the screen.

    }
    
}

