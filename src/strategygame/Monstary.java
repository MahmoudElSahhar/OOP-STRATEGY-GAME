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
public class Monstary extends CreatingBuildingUnit{
    private int monstariesCreated, monstariesDestroyed;
    public GUI.Monstary AB;
    
    public Monstary(){
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
        name = "Monstary";
        canMove = false;
        AB = new GUI.Monstary(this);
        IB = new GUI.BuildingUnit(this);
        width = 280;
        height = 280;
        costGold = 20;
        costFood = 10;
        costWood = 0;
        costStone = 0;
        shape = new JLabel();
        shape.setSize(width, height);
        shape.setIcon(new ImageIcon(new ImageIcon("Pics\\Civilizations\\1\\Monstary.png").getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH)));
        Dot = new JLabel();
        Dot.setIcon(new ImageIcon(new ImageIcon("Pics\\Dot.png").getImage().getScaledInstance(10, 10, Image.SCALE_DEFAULT)));    
    }
    
    public void create(Location loc) {
        super.create(loc);
        Civilization.myMonstarys.add(this);
        addToMonstariesCreated();
    }
    
    public void createPriest() throws InterruptedException{
        if(Civilization.getMyGold()>= Priest.getCostGold() && Civilization.getMyFood() >= Priest.getCostFood()) // added by revisor.
        {
            Priest p = new Priest(); //new object from class Priest
            Thread.sleep(1000);
            p.create(this); // added by revisor
            JOptionPane.showMessageDialog(null, "Priest Created.");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Not Enough Resources."); 
        }
               
//      written by : Foad
//      date : 16/11/2017
//      supposed time to be taken : UNKNOWN
//      time taken : UNKNOWN
//      start/pause/finish : UNKNOWN
//      no. of errors faced : UNKNOWN
//      no of errors fixed : UNKNOWN

//      revised by : Youssef
//      date : 17/11/2017
//      supposed time to be taken : UNKNOWN
//      time taken : UNKNOWN
//      start/pause/finish : UNKNOWN
    }
    public void addToMonstariesCreated(){ // increment  monastries created variable 
        monstariesCreated++;
                       
//      written by : Foad
//      date : 16/11/2017
//      supposed time to be taken : UNKNOWN
//      time taken : UNKNOWN
//      start/pause/finish : UNKNOWN
//      no. of errors faced : UNKNOWN
//      no of errors fixed : UNKNOWN

//      revised by : Youssef
//      date : 17/11/2017
//      supposed time to be taken : UNKNOWN
//      time taken : UNKNOWN
//      start/pause/finish : UNKNOWN
    }
    public void addToMonstariesKilled(){ //increment monastries destroyed variable
        monstariesDestroyed++;
                       
//      written by : Foad
//      date : 16/11/2017
//      supposed time to be taken : UNKNOWN
//      time taken : UNKNOWN
//      start/pause/finish : UNKNOWN
//      no. of errors faced : UNKNOWN
//      no of errors fixed : UNKNOWN

//      revised by : Youssef
//      date : 17/11/2017
//      supposed time to be taken : UNKNOWN
//      time taken : UNKNOWN
//      start/pause/finish : UNKNOWN
    }
}
