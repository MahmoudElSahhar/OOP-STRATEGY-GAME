/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategygame;

import java.awt.Image;
import java.awt.event.MouseEvent;
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Youssef
 */
public class TownCenter extends CreatingBuildingUnit implements Serializable{
    private static int TownCentersCreated, TownCentersDestroyed;
//    public GUI.TownCenter AB;
    public boolean asd=true;

    public TownCenter(){
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
        name = "TownCenter";
        canMove = false;
        AB = new GUI.TownCenter(this);
        IB = new GUI.BuildingUnit(this);
        width = 349;
        height = 250;
        costGold = 20;
        costFood = 10;
        costWood = 0;
        costStone = 0;
        shape = new JLabel();
        shape.setSize(width, height);
        shape.setIcon(new ImageIcon(new ImageIcon("Pics\\Civilizations\\"+Civilization.Civilization_no+"\\TownCenter.png").getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH)));
        Dot = new JLabel();
        Dot.setIcon(new ImageIcon(new ImageIcon("Pics\\Dot.png").getImage().getScaledInstance(10, 10, Image.SCALE_DEFAULT)));    
    }
    
    public TownCenter(int C_no){
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
        name = "TownCenter";
        canMove = false;
        AB = new GUI.TownCenter(this);
        IB = new GUI.BuildingUnit(this);
        width = 349;
        height = 250;
        costGold = 20;
        costFood = 10;
        costWood = 0;
        costStone = 0;
        shape = new JLabel();
        shape.setSize(width, height);
        shape.setIcon(new ImageIcon(new ImageIcon("Pics\\Civilizations\\"+C_no+"\\TownCenter.png").getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH)));
        Dot = new JLabel();
        Dot.setIcon(new ImageIcon(new ImageIcon("Pics\\Dot.png").getImage().getScaledInstance(10, 10, Image.SCALE_DEFAULT)));    
    }
    
    public void create(Location loc) {
        super.create(loc);
        GUI.MyFrame2.U.C.myTownCenters.add(this);
        addToTownCentersCreated();
    }
    
    public void createWorker() 
       throws InterruptedException{
        if(Civilization.getMyGold() >= Worker.getCostGold() && Civilization.getMyFood() >= Worker.getCostFood()) // added by revisor.
        {
            Worker w = new Worker();
            Thread.sleep(1000);
            w.create(this); // added by revisor.
            
            JOptionPane.showMessageDialog(null, "Worker Created");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Not enough Resources.");
        }
    }
    private void addToTownCentersCreated(){ //increment the Town center created variable
        TownCentersCreated++;

    }
    private void addToTownCentersDestroyed(){ //increment the Town Centers destroyed variable
        TownCentersDestroyed++;
 
    }

     
    
}
