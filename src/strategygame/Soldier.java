/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategygame;

import java.awt.Image;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Youssef
 */
public class Soldier extends MovingAttackingUnit{
    private static int soldiersCreated, soldiersKilled;
    
    public GUI.Soldier AB;
    public Soldier(){
        
        switch (Civilization.getUpgradeLevel()) {
            case 0:
                xSpeed = 15;
                mainHealth = 100;
                setCurrentHealth(mainHealth);
                defense = 0.15;
                attackingPower = 30;
                attackingRate = 3000;
                break;
            case 1:
                xSpeed = 15;
                mainHealth = 100;
                setCurrentHealth(mainHealth);
                defense = 0.15;
                attackingPower = 30;
                attackingRate = 3000;
                break;
            case 2:
                xSpeed = 15;
                mainHealth = 100;
                setCurrentHealth(mainHealth);
                defense = 0.15;
                attackingPower = 30;
                attackingRate = 3000;
                break;
        }
        canMove = true;
        name = "Soldier";
        AB = new GUI.Soldier(this);
        IB = new GUI.AttackingUnit(this);
        width = 70;
        height = 105;
        attackingRange = 20.0;
        costGold = 20;
        costFood = 10;
        costWood = 0;
        costStone = 0;
        shape = new JLabel();
        shape.setSize(width, height);
        shape.setIcon(new ImageIcon(new ImageIcon("Pics\\Civilizations\\1\\Soldier.png").getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH)));
        Dot = new JLabel();
        Dot.setIcon(new ImageIcon(new ImageIcon("Pics\\Dot.png").getImage().getScaledInstance(10, 10, Image.SCALE_DEFAULT)));    
    }
    
    public void create(CreatingBuildingUnit cbu){
        super.create(cbu);
        Civilization.mySoldiers.add(this);
        addToSoldiersCreated();
    }
    
    public void checkRange(Unit u){
        
        double distance;
        distance = Math.sqrt(Math.pow((u.L.xPosition - L.xPosition), 2) + Math.pow((u.L.yPosition - L.yPosition), 2));
        while(distance < 50)
        {
            move(u.L);
            try {
                attack(u);
            } catch (InterruptedException ex) {
                Logger.getLogger(Soldier.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    private void addToSoldiersCreated(){
        soldiersCreated++;
    }
    private void addToSoldiersKilled(){
        soldiersKilled++;
    }
}
