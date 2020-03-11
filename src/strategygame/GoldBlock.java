/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategygame;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Youssef
 */
public class GoldBlock extends Resource{
    private int goldCollected, goldSpent;
    public GUI.GoldBlock AB;
    
    public GoldBlock(Location loc) {
        mainQuantity = 100;//VALUE TO BE SET
        currentQuantity = mainQuantity;
        goldCollected = 0;
        goldSpent = 0;
        name = "GoldBlock";
        shape = new JLabel();
        width = 20;
        height = 20;
        shape.setSize(width, height);
        shape.setIcon(new ImageIcon(new ImageIcon("Pics\\Gold.png").getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
//        Dot = new JLabel();
//        Dot.setIcon(new ImageIcon(new ImageIcon("Pics\\Dot.png").getImage().getScaledInstance(10, 10, Image.SCALE_DEFAULT)));
        AB = new GUI.GoldBlock(this);
        IB = new GUI.Resource(this);
        AB.setVisible(false);
        IB.setVisible(false);
        L = new Location();
        L.xPosition = loc.xPosition;
        L.yPosition = loc.yPosition;
        GUI.MyFrame2.MAP.ADD(this, L);
        collectable = true;
    }
    
    public void collect(Worker w){
        this.currentQuantity -= w.getCollectingPower();
        Civilization.setMyGold(Civilization.getMyGold() + w.getCollectingPower());
        GUI.Map.statusBar.currentGold.setText("" + Civilization.getMyGold());
        ((GUI.Resource)IB).update();
    }

    public int getGoldCollected() {
        return goldCollected;
    }

    public void setGoldCollected(int GoldCollected) {
        this.goldCollected = GoldCollected;
    }

    public int getGoldSpent() {
        return goldSpent;
    }

    public void setGoldSpent(int GoldSpent) {
        this.goldSpent = GoldSpent;
    }
    public void addToGoldCollected()
    {
        goldCollected++;
    }
    public void addToGoldSpent()
    {
        goldSpent++;
    }
}
