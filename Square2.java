import javax.swing.*;  
public class Square2{
        public Square2(){
            System.out.println("Hello");
            for (int counter = 0; counter < 25;counter++){
                if (Board2.level1[counter]==Board2.w){
                        JButton water = new JButton(Board2.w);
                        int tilePos= counter;
                                System.out.println(tilePos);
                                Board2.panel.add(water);
                                System.out.println("Hello");
                }
                if (Board2.level1[counter]==Board2.g){
                        JButton greenFrog = new JButton(Board2.g);
                        Board2.panel.add(greenFrog);
                        System.out.println("Hello");
                }
                if (Board2.level1[counter]==Board2.r){
                        JButton redFrog = new JButton(Board2.r);
                        Board2.panel.add(redFrog);
                        System.out.println("Hello");
                        
                }

        }
        }
}