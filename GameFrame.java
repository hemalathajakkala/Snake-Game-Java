package play; 

import java.awt.Dimension; 
import javax.swing.JFrame; 

public class GameFrame extends JFrame {
    public GameFrame() {
        this.setTitle("Snake Game");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);

        SnakePanel gp = new SnakePanel();
        gp.setPreferredSize(new Dimension(SnakePanel.panelwidth, SnakePanel.panelheight));
        this.add(gp);

        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}