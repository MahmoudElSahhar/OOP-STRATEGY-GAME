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
public class ArcheryRange extends CreatingBuildingUnit{
    private static int archeryRangesCreated, archeryRangesDestroyed;
    public GUI.ArcheryRange AB;
    
    //Constructor : 
    public ArcheryRange(){
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
        name = "Archery Range";
        canMove = false;
        AB = new GUI.ArcheryRange(this);
        IB = new GUI.BuildingUnit(this);
        width = 280;
        height = 280;
        costGold = 100;
        costFood = 100;
        costWood = 0;
        costStone = 0;
        shape = new JLabel();
        shape.setSize(width, height);
        shape.setIcon(new ImageIcon(new ImageIcon("Pics\\Civilizations\\1\\ArcheryRange.png").getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH)));
        Dot = new JLabel();
        Dot.setIcon(new ImageIcon(new ImageIcon("Pics\\Dot.png").getImage().getScaledInstance(10, 10, Image.SCALE_DEFAULT)));    
    }
    
    //Getters :
    public static int getArcheryRangesCreated() {
        return archeryRangesCreated;
    }

    public static int getArcheryRangesDestroyed() {
        return archeryRangesDestroyed;
    }
    
    //Functions : 
    public void create(Location loc) {
        super.create(loc);
        Civilization.myArcheryRanges.add(this);
        addToArcheryRangesCreated();
    }
    
    public void createArcher() throws InterruptedException{
        if(Civilization.getMyGold() >= Archer.getCostGold() && Civilization.getMyFood() >= Archer.getCostFood())
        {
            Archer a = new Archer();
            Thread.sleep(1000);
            a.create(this);
            JOptionPane.showMessageDialog(null, "Archer Created.");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Not Enough Resources.");
        }
    }
    
    private void addToArcheryRangesCreated() {
        archeryRangesCreated++;
    }
    
    private void addToArcheryRangesKilled() {
        archeryRangesDestroyed++;
    }
}
