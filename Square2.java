import javax.swing.*;  
public class Square2{
        public Square2(){
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
}