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
public class Wall extends BuildingUnit{
    private static int wallsCreated, wallsDestroyed;
    
    public GUI.Wall AB;
    public void Wall()
    {
        
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
        name = "Wall";
        canMove = false;
        AB = new GUI.Wall(this);
        IB = new GUI.BuildingUnit(this);
        width = 100;
        height = 100;
        costGold = 20;
        costFood = 10;
        costWood = 0;
        costStone = 0;
        shape = new JLabel();
        shape.setSize(width, height);
        shape.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Youssef\\Desktop\\New folder (2)\\Barrack.jpg").getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH)));
    }
    
    public void create(Location loc) {
        super.create(loc);
        Civilization.myWalls.add(this);
        addToWallsCreated();
    }
    
    public static int getWallsCreated() {
        return wallsCreated;
    }

    public static void setWallsCreated(int wallsCreated) {
        Wall.wallsCreated = wallsCreated;
    }

    public static int getWallsDestroyed() {
        return wallsDestroyed;
    }

    public static void setWallsDestroyed(int wallsDestroyed) {
        Wall.wallsDestroyed = wallsDestroyed;
    }
    
    private void addToWallsCreated() {
        wallsCreated++;
    }
    
    private void addToWallsDestroyed() {
        wallsDestroyed++;
    }
}
