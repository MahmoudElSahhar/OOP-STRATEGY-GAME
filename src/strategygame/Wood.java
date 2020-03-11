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
public class Wood extends Resource{
    private int woodCollected, woodSpent;
    
    public GUI.Wood AB;
    
    public Wood(Location loc) {
        mainQuantity = 100;//VALUE TO BE SET
        currentQuantity = mainQuantity;
//        woodCollected = 0;
//        woodSpent = 0;
        setL(null);
        name = "Wood";
        AB = new GUI.Wood(this);
        IB = new GUI.Resource(this);
        shape = new JLabel();
        width = 30;
        height = 60;
        shape.setSize(width, height);
        shape.setIcon(new ImageIcon(new ImageIcon("Pics\\Tree.png").getImage().getScaledInstance(30, 60, Image.SCALE_SMOOTH)));
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
        Civilization.setMyWood(Civilization.getMyWood() + w.getCollectingPower());
        GUI.Map.statusBar.currentWood.setText("" + Civilization.getMyWood());
        ((GUI.Resource)IB).update();
    }

    public int getWoodsCollected() {
        return woodCollected;
    }

    public void setWoodsCollected(int woodCollected) {
        this.woodCollected = woodCollected;
    }

    public int getWoodsSpent() {
        return woodSpent;
    }

    public void setWoodsSpent(int woodSpent) {
        this.woodSpent = woodSpent;
    }
    
    public void addToWoodsCollected()
    {
        woodCollected++;
    }
    public void addToWoodsSpent()
    {
        woodSpent++;
    }

}
