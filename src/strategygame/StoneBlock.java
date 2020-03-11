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
public class StoneBlock extends Resource{
    private int stoneCollected, stoneSpent;
    
    public GUI.StoneBlock AB;
    public StoneBlock(Location loc) {
        mainQuantity = 100;//VALUE TOO BE SET
        currentQuantity = mainQuantity;
        stoneCollected = 0;
        stoneSpent = 0;
        name = "StoneBlock";
        AB = new GUI.StoneBlock(this);
        IB = new GUI.Resource(this);
        shape = new JLabel();
        width = 20;
        height = 20;
        shape.setSize(width, height);
        shape.setIcon(new ImageIcon(new ImageIcon("Pics\\Stone.png").getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
//        Dot = new JLabel();
//        Dot.setIcon(new ImageIcon(new ImageIcon("Pics\\Dot.png").getImage().getScaledInstance(10, 10, Image.SCALE_DEFAULT)));
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
        Civilization.setMyStone(Civilization.getMyStone() + w.getCollectingPower());
        GUI.Map.statusBar.currentStone.setText("" + Civilization.getMyStone());
        ((GUI.Resource)IB).update();
    }

    public int getStoneCollected() {
        return stoneCollected;
    }

    public void setStoneCollected(int stoneCollected) {
        this.stoneCollected = stoneCollected;
    }

    public int getStoneSpent() {
        return stoneSpent;
    }

    public void setStoneSpent(int stoneSpent) {
        this.stoneSpent = stoneSpent;
    }
    public void addToStoneCollected() {
        stoneCollected++;
    }
    public void addToStoneSpent() {
        stoneSpent++;
    }

}
