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
public class House extends BuildingUnit{
    private static int housesCreated, housesDestroyed;
    
    public GUI.House AB;
    
    public House(){
//        housesCreated = 0;
//        housesDestroyed = 0;

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
        name = "House";
        canMove = false;
        AB = new GUI.House(this);
        IB = new GUI.BuildingUnit(this);
        width = 150;
        height = 150;
        costGold = 20;
        costFood = 10;
        costWood = 0;
        costStone = 0;
        shape = new JLabel();
        shape.setSize(width, height);
        shape.setIcon(new ImageIcon(new ImageIcon("Pics\\Civilizations\\1\\House.png").getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH)));
        Dot = new JLabel();
        Dot.setIcon(new ImageIcon(new ImageIcon("Pics\\Dot.png").getImage().getScaledInstance(10, 10, Image.SCALE_DEFAULT)));    
    }
    
    public void create(Location loc) {
        super.create(loc);
        Civilization.myHouses.add(this);
        addToHousesCreated();
        
        //Increase the population : 
        Civilization.setMaxPopulation(Civilization.getMaxPopulation() + 10);
        
        //Update the population in the status bar : 
        GUI.Map.statusBar.maxPopulation.setText("" + Civilization.getMaxPopulation());
    }
    
    public static int getHousesCreated() {
        return housesCreated;
    }

    public static void setHousesCreated(int housesCreated) {
        House.housesCreated = housesCreated;
    }

    public static int getHousesDestroyed() {
        return housesDestroyed;
    }

    public static void setHousesDestroyed(int housesDestroyed) {
        House.housesDestroyed = housesDestroyed;
    }
    
    public void addToPopulation(){
        
    }
    
    public void addToHousesCreated() {
        housesCreated++;
    }
    public void addToHousesDestroyed() {
        housesDestroyed++;
    }
}
