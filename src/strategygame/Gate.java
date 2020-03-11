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
public class Gate extends BuildingUnit{
    private static int GatesCreated, GatesDestroyed;
    public GUI.Gate AB;
    private boolean gateOpened;
          

    public Gate(){
          gateOpened = false;
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
        name = "Gate";
        canMove = false;
        AB= new GUI.Gate(this);
        IB = new GUI.BuildingUnit(this);
        width = 50;
        height = 50;
        costGold = 20;
        costFood = 10;
        costWood = 0;
        costStone = 0;
        shape = new JLabel();
        shape.setSize(width, height);
        shape.setIcon(new ImageIcon(new ImageIcon("C:\\Users\\Lenovo\\Documents\\NetBeansProjects\\StrategyGame\\gate.png").getImage().getScaledInstance(50, 50, Image.SCALE_SMOOTH)));
        
    }
    
    public void create(Location loc) {
        super.create(loc);
        Civilization.myGates.add(this);
        addToGatesCreated();
    }
    
    public void createGate() throws InterruptedException{
        if(Civilization.getMyGold() >= Gate.getCostGold() && Civilization.getMyFood() >= Gate.getCostFood()) // added by revisor.
        {
            Gate g= new Gate();
            //g.create(this); // added by revisor.
            g.addToGatesCreated();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Not enough Resources."); // for testing , added by revisor.
        }
            gateOpened = false;
        switch (Civilization.getUpgradeLevel()) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
        }
    }
    
 
    
    public static int getGatesCreated() {
        return GatesCreated;
    }

    public static void setGatesCreated(int gatesCreated) {
        Gate.GatesCreated = gatesCreated;
    }

    public static int getGatesDestroyed() {
        return GatesDestroyed;
    }

    public static void setGatesDestroyed(int gatesDestroyed) {
        Gate.GatesDestroyed = gatesDestroyed;
    }

    public boolean isGateOpened() {
        return gateOpened;
    }

    public void setGateOpened(boolean gateOpened) {
        this.gateOpened = gateOpened;
    }
    
    public void openGate() {
        gateOpened=true;
          JOptionPane.showMessageDialog(null, "Gate Opened");
    }
    
    public void closeGate() {
        gateOpened=false;
          JOptionPane.showMessageDialog(null, "Gate Closed");
    }
    
    private void addToGatesCreated() {
        GatesCreated++;
    }
    
    private void addToGatesDestroyed() {
        GatesDestroyed++;
    }
////      written by : Foad
////      date : 16/11/2017
////      supposed time to be taken : UNKNOWN
////      time taken : UNKNOWN
////      start/pause/finish : UNKNOWN
////      no. of errors faced : UNKNOWN
////      no of errors fixed : UNKNOWN
//
////      revised by : Youssef
////      date : 17/11/2017
////      supposed time to be taken : UNKNOWN
////      time taken : UNKNOWN
////      start/pause/finish : UNKNOWN
//    }
//    public void addToGatesCreated(){ //increment the gates created variable
//        GatesCreated++;
//        
////      written by : Foad
////      date : 16/11/2017
////      supposed time to be taken : UNKNOWN
////      time taken : UNKNOWN
////      start/pause/finish : UNKNOWN
////      no. of errors faced : UNKNOWN
////      no of errors fixed : UNKNOWN
//
////      revised by : Youssef
////      date : 17/11/2017
////      supposed time to be taken : UNKNOWN
////      time taken : UNKNOWN
////      start/pause/finish : UNKNOWN
//    }
//    public void addToGatesDestroyed(){ //increment the Gates destroyed variable
//        GatesDestroyed++;
//        
////      written by : Foad
////      date : 16/11/2017
////      supposed time to be taken : UNKNOWN
////      time taken : UNKNOWN
////      start/pause/finish : UNKNOWN
////      no. of errors faced : UNKNOWN
////      no of errors fixed : UNKNOWN
//
////      revised by : Youssef
////      date : 17/11/2017
////      supposed time to be taken : UNKNOWN
////      time taken : UNKNOWN
////      start/pause/finish : UNKNOWN
//    }
}
