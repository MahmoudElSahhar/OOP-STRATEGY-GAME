/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategygame;

import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Youssef
 */
public class Market extends BuildingUnit{
    private int marketsCreated, marketsDestroyed;
    
    public GUI.Market AB;
    
    public Market(){
        switch (Civilization.getUpgradeLevel()) {
            case 0:
                mainHealth = 100;
                setCurrentHealth(mainHealth);
                defense = 0.15;
                break;
            case 1:
                mainHealth = 100;
                setCurrentHealth(mainHealth);
                defense = 0.15;
                break;
            case 2:
                mainHealth = 100;
                setCurrentHealth(mainHealth);
                defense = 0.15;
                break;
        }
        name = "Market";
        canMove = false;
        AB = new GUI.Market(this);
        IB = new GUI.BuildingUnit(this);
        width = 300;
        height = 300;
        costGold = 20;
        costFood = 10;
        costWood = 0;
        costStone = 0;
        shape = new JLabel();
        shape.setSize(width, height);
        shape.setIcon(new ImageIcon(new ImageIcon("Pics\\Civilizations\\1\\Market.png").getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH)));
        Dot = new JLabel();
        Dot.setIcon(new ImageIcon(new ImageIcon("Pics\\Dot.png").getImage().getScaledInstance(10, 10, Image.SCALE_DEFAULT)));    
    }
    
    public void create(Location loc) {
        super.create(loc);
        Civilization.myMarkets.add(this);
        addToMarketsCreated();
    }
    
    public int localTrade(){
        return 0;
    }
    public void globalTrade(){
        
    }
    public void addToMarketsCreated(){
        marketsCreated++;
    }
    public void addToMarketsDestroyed(){
        marketsDestroyed++;
    }
    
    public void sellFood(){}
    public void sellStone(){}
    public void sellWood(){}
    public void buyFood(){}
    public void buyStone(){}
    public void buyWood(){}
}
