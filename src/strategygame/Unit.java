/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategygame;

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Youssef
 */
public abstract class Unit extends OBJECT{
    protected static int costGold, costStone, costWood, costFood;
    private double currentHealth;
    protected double mainHealth, defense;
    public String civilizationID = User.UnitsID;
    public JLabel Dot;
    public boolean canMove;
    
    //Setters : 
    public void setCurrentHealth(double currentHealth) {
        if(currentHealth < 0)
        {
            this.currentHealth = 0;
        }
        else if(currentHealth > mainHealth)
        {
            this.currentHealth = mainHealth;
        }
        else
        {
            this.currentHealth = currentHealth;
        }
    }
    
    //Getters : 
    public double getCurrentHealth() {
        return currentHealth;
    }
    
    public void create(){
        //Reduce the cost of this unit from the resources in class Civilization : 
        Civilization.setMyFood(Civilization.getMyFood() - getCostFood());
        Civilization.setMyGold(Civilization.getMyGold() - getCostGold());
        Civilization.setMyStone(Civilization.getMyStone() - getCostStone());
        Civilization.setMyWood(Civilization.getMyWood() - getCostWood());
        
        //Update the Resources in the status bar : 
        GUI.Map.statusBar.currentFood.setText("" + Civilization.getMyFood());
        GUI.Map.statusBar.currentGold.setText("" + Civilization.getMyGold());
        GUI.Map.statusBar.currentStone.setText("" + Civilization.getMyStone());
        GUI.Map.statusBar.currentWood.setText("" + Civilization.getMyWood());
    }
    
    public static int getCostGold() {
        return costGold;
    }

    public static int getCostStone() {
        return costStone;
    }

    public static int getCostWood() {
        return costWood;
    }

    public static int getCostFood() {
        return costFood;
    }

    public double getMainHealth() {
        return mainHealth;
    }

    public double getDefense() {
        return defense;
    }

    public Location getL() {
        return L;
    }

    public void select(){}
    
    abstract public void upgrade();
    
    public void remove(Unit u)
    {
        u = null;
        u.shape.setVisible(false);
    }
    
    public void damage(AttackingUnit au) {
        currentHealth-=au.getAttackingPower(); // decrease the health of this unit with the attackingPower of au. 
               
        
    }
    
    public boolean isCollide(){
        return true;
    }

    public void setL(Location L) {
        this.L = L;
    }
}
