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

/**
 *
 * @author Youssef
 */
public class Archer extends MovingAttackingUnit{
    private static int archersCreated, archersKilled;
    public GUI.Archer AB;

    //Constructor : 
    public Archer(){
        switch (Civilization.getUpgradeLevel()) {
            case 0:
                xSpeed = 15;
                mainHealth = 100;
                setCurrentHealth(mainHealth);
                defense = 0.15;
                attackingPower = 60;
                attackingRate = 2;
                break;
            case 1:
                xSpeed = 15;
                mainHealth = 100;
                setCurrentHealth(mainHealth);
                defense = 0.15;
                attackingPower = 60;
                attackingRate = 2;
                break;
            case 2:
                xSpeed = 15;
                mainHealth = 100;
                setCurrentHealth(mainHealth);
                defense = 0.15;
                attackingPower = 60;
                attackingRate = 2;
                break;
        }
        name = "Archer";
        AB = new GUI.Archer(this);
        IB = new GUI.AttackingUnit(this);
        width = 100;
        height = 100;
        attackingRange = 20.0;
        costGold = 20;
        costFood = 10;
        costWood = 0;
        costStone = 0;
        shape = new JLabel();
        shape.setSize(width, height);
        shape.setIcon(new ImageIcon(new ImageIcon("Pics\\Civilizations\\1\\Archer.png").getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH)));
        Dot = new JLabel();
        Dot.setIcon(new ImageIcon(new ImageIcon("Pics\\Dot.png").getImage().getScaledInstance(10, 10, Image.SCALE_DEFAULT)));    
    }
    
    //Getters : 
    public static int getArchersCreated() {
        return archersCreated;
    }

    public static int getArchersKilled() {
        return archersKilled;
    }
    
    //Functions : 
    public void create(CreatingBuildingUnit cbu){
        super.create(cbu);
        Civilization.myArchers.add(this);
        addToArchersCreated();
    }
    
    public void attack(Unit u) throws InterruptedException{
        isAttacking = true;
        while(u.getCurrentHealth() > 0 && isAttacking == true && u.civilizationID != User.UnitsID)
        {
            checkRange(u);
            Arrow a = new Arrow();
            fireArrow(a, u);
            Thread.sleep(attackingRate);
            u.damage(this);
            if(u.getCurrentHealth() <= 0)
            {
                Thread.sleep(1500);
                u.remove(u);    //to remove the object from the map when killed or destroyed
            }
        }
    }
    
    public void checkRange(Unit u){
       int rounds;
        rounds = L.yPosition - u.L.yPosition;
        if(rounds < 0)
            rounds *= -1;
        isMoving = true;
        for(int i=0;i<rounds;i++)
        {
            while(isMoving == true)
            {
                if(L.yPosition < u.L.yPosition)
                {
                    L.yPosition++;
                }
                else if(L.yPosition > u.L.yPosition)
                {
                    L.yPosition--;
                }
            }
        }
        try {
            attack(u);
        } catch (InterruptedException ex) {
            Logger.getLogger(Archer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void fireArrow(Arrow a, Unit u){
        a.move(u.L);
        u.damage(this);
    }
    
//    public void move(Location l)
//    {
//        int xFactor =0;
//        int yFactor =0;
//        isMoving = true;
//        int rounds;
//        if(l.xPosition - L.xPosition < 0)
//        {
//            xFactor = l.xPosition - L.xPosition;
//            xFactor *= -1;
//        }
//        else
//            xFactor = l.xPosition - L.xPosition;
//        ///////////////////////////////////////
//        if(l.yPosition - L.yPosition < 0)
//        {
//            yFactor = l.yPosition - L.yPosition;
//            yFactor *= -1;
//        }
//        else
//            yFactor = l.yPosition - L.yPosition;
//        ///////////////////////////////////////
//        
//        if(yFactor > xFactor)
//            rounds = yFactor;
//        else
//            rounds = xFactor;
//            
//        for(int i=0;i<rounds;i++)
//        {
//            while(isMoving == true){
//                if(L.yPosition != l.yPosition || L.xPosition != l.xPosition)
//                {
//                    if(L.xPosition < l.xPosition)
//                    {
//                        L.xPosition++;
//                    }
//                    if(L.yPosition < l.yPosition)
//                    {
//                        L.yPosition++;
//                    }
//                    if(L.yPosition > l.yPosition)
//                    {
//                    L.yPosition--;                    
//                    }
//                    if(L.xPosition > l.xPosition)
//                    {
//                    L.xPosition--;                    
//                    }
//                    Location a = new Location();
//                    a.xPosition = L.xPosition;
//                    a.yPosition = L.yPosition;
//
//                    for(int j = shape.getBounds().x ; j < shape.getBounds().x + shape.getBounds().width ; j++)
//                    {
//                        for(int z = shape.getBounds().y ; z < shape.getBounds().y + shape.getBounds().height ; z++)
//                        {
//                            strategygame.StrategyGame.MAP.Map[j][z] = null;
//                        }
//                    }
//                    strategygame.StrategyGame.MAP.ADD(this, a);
//                    try {
//                        Thread.sleep(40-xSpeed);
//
//                    } catch (InterruptedException ex) {
//                        Logger.getLogger(Archer.class.getName()).log(Level.SEVERE, null, ex);
//                    }
//                }
//            }    
//        }
//    }
    
    private void addToArchersCreated(){
        archersCreated++;
    }
    private void addToArchersKilled(){
        archersKilled++;
    }
}
