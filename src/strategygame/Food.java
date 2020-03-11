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
public class Food extends Resource{
    private int foodCollected, foodSpent;
    private int regenerationTime; 
    
    //Constructor : 
    public Food(Location loc) {
        name = "Food";
        AB = new GUI.Food(this);
        mainQuantity = 100;
        currentQuantity = mainQuantity;
        regenerationTime = 60000;
//        foodCollected = 0;
//        foodSpent = 0;
        
        shape = new JLabel();
        width = 20;
        height = 20;
        shape.setSize(width, height);
        shape.setIcon(new ImageIcon(new ImageIcon("Pics\\Food.png").getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH)));
//        Dot = new JLabel();
//        Dot.setIcon(new ImageIcon(new ImageIcon("Pics\\Dot.png").getImage().getScaledInstance(10, 10, Image.SCALE_DEFAULT)));
        IB = new GUI.Resource(this);
        AB.setVisible(false);
        IB.setVisible(false);
        L = new Location();
        L.xPosition = loc.xPosition;
        L.yPosition = loc.yPosition;
        GUI.MyFrame2.MAP.ADD(this, L);
        collectable = true;
        
        
//        StrategyGame.MAP.ADD(this, this.L);
    }

    //Setters :
    public void setRegenerationTime(int regenerationTime) {
        this.regenerationTime = regenerationTime;
    }
    
    public void setFoodCollected(int foodCollected) {
        this.foodCollected = foodCollected;
    }

    public void setFoodSpent(int foodSpent) {
        this.foodSpent = foodSpent;
    }

    //Getters :
    public int getFoodCollected() {
        return foodCollected;
    }

    public int getFoodSpent() {
        return foodSpent;
    }

    public int getRegenerationTime() {
        return regenerationTime;
    }
    
    //Functions :
    public void collect(Worker w){
        this.currentQuantity -= w.getCollectingPower();
        Civilization.setMyFood(Civilization.getMyFood() + w.getCollectingPower());
        GUI.Map.statusBar.currentFood.setText("" + Civilization.getMyFood());
        ((GUI.Resource)IB).update();
    }
    
    public void regenerate() throws InterruptedException {
        if(currentQuantity == 0)
        {
            Thread.sleep(regenerationTime);     //wait 60 seconds before food is generated again
            currentQuantity = mainQuantity;
        }
    }
    
    public void addToFoodCollected() {
        foodCollected++;
    }
    
    public void addToFoodSpent() {
        foodSpent++;
    }
}
