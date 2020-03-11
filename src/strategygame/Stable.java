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
import javax.swing.JOptionPane;

/**
 *
 * @author Youssef
 */
public class Stable extends CreatingBuildingUnit{
    private static int stablesCreated, stablesDestroyed;
    public GUI.Stable AB;
    
    public Stable() {
//        stablesCreated = 0;
//        stablesDestroyed = 0;

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
        name = "Stable";
        canMove = false;
        AB = new GUI.Stable(this);
        IB = new GUI.BuildingUnit(this);
        width = 289;
        height = 236;
        costGold = 20;
        costFood = 10;
        costWood = 0;
        costStone = 0;
        shape = new JLabel();
        shape.setSize(width, height);
        shape.setIcon(new ImageIcon(new ImageIcon("Pics\\Civilizations\\1\\Stable.png").getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH)));
        Dot = new JLabel();
        Dot.setIcon(new ImageIcon(new ImageIcon("Pics\\Dot.png").getImage().getScaledInstance(10, 10, Image.SCALE_DEFAULT)));    
    }
    
    public void create(Location loc) {
        super.create(loc);
        Civilization.myStables.add(this);
        addToStablesCreated();
    }

    public static int getStablesCreated() {
        return stablesCreated;
    }

    public static void setStablesCreated(int stablesCreated) {
        Stable.stablesCreated = stablesCreated;
    }

    public static int getStablesDestroyed() {
        return stablesDestroyed;
    }

    public static void setStablesDestroyed(int stablesDestroyed) {
        Stable.stablesDestroyed = stablesDestroyed;
    }
    
    public void createHorseman() throws InterruptedException {
        if (Civilization.getMyGold() >= Horseman.getCostGold() && Civilization.getMyFood() >= Horseman.getCostFood())
        {
            Horseman H = new Horseman();
            Thread.sleep(1000);
            H.create(this);
            JOptionPane.showMessageDialog(null, "Horsman Created.");
        }
        else {
            JOptionPane.showMessageDialog(null, "Not Enough Resources.");
        }
        
    }
    
    private void addToStablesCreated() {
        stablesCreated++;
    }
    
    private void addToStablesDestroyed() {
        stablesDestroyed++;
    }
}
