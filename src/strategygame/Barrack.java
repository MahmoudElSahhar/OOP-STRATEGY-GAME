/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategygame;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


/**
 *
 * @author Youssef
 */
public class Barrack extends CreatingBuildingUnit{
    private static int barracksCreated, barracksDestroyed;
    public GUI.Barrack AB;
    
    //Constructor : 
    public Barrack(){
        switch (Civilization.getUpgradeLevel()) {
            case 0:
                mainHealth = 100;
                setCurrentHealth(mainHealth);
                defense = 0.15;
                creatingRate = 10;
                setMarker = null;
                break;
            case 1:
                mainHealth = 100;
                setCurrentHealth(mainHealth);
                defense = 0.15;
                creatingRate = 10;
                setMarker = null;
                break;
            case 2:
                mainHealth = 100;
                setCurrentHealth(mainHealth);
                defense = 0.15;
                creatingRate = 10;
                setMarker = null;
                break;
        }
        canMove = false;
        name = "Barrack";
        AB = new GUI.Barrack(this);
        IB = new GUI.BuildingUnit(this);
        width = 250;
        height = 250;
        costGold = 20;
        costFood = 10;
        costWood = 0;
        costStone = 0;
        shape = new JLabel();
        shape.setSize(width, height);
        shape.setIcon(new ImageIcon(new ImageIcon("Pics\\Civilizations\\1\\Barrack.png").getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH)));
        Dot = new JLabel();
        Dot.setIcon(new ImageIcon(new ImageIcon("Pics\\Dot.png").getImage().getScaledInstance(10, 10, Image.SCALE_DEFAULT)));    
    }
    
    //Getters :
    public static int getBarracksCreated() {
        return barracksCreated;
    }

    public static int getBarracksDestroyed() {
        return barracksDestroyed;
    }
    
    
    //Functions : 
    public void create(Location loc) {
        super.create(loc);
        Civilization.myBarracks.add(this);
        addToBarracksCreated();
    }
    
    public void createSoldier() throws InterruptedException{
        if (Civilization.getMyGold() >= Soldier.getCostGold() && Civilization.getMyFood() >= Soldier.getCostFood()) // (was missing) to check whether ai have enough resources or not. 
        {
            Soldier S = new Soldier();
            Thread.sleep(1000);            
            S.create(this);
            JOptionPane.showMessageDialog(null, "Soldier Created.");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Not Enough Resources.");
        }
    }
    
    private void addToBarracksCreated(){
        barracksCreated++;
    }
    
    private void addToBarracksDestroyed(){
        barracksDestroyed++;
    }
}
