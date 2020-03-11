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
public class SiegeRam extends MovingAttackingUnit{
    private static int SiegeRamCreated, SiegeRamDestroyed;
    public GUI.SiegeRam AB;
    
    public SiegeRam(){
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
        name = "SiegeRam";
        AB = new GUI.SiegeRam(this);
        IB = new GUI.AttackingUnit(this);
        width = 106;
        height = 105;
        attackingRange = 20.0;
        costGold = 20;
        costFood = 10;
        costWood = 0;
        costStone = 0;
        shape = new JLabel();
        shape.setSize(width, height);
        shape.setIcon(new ImageIcon(new ImageIcon("Pics\\Civilizations\\1\\SiegeRam.png").getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH)));
        Dot = new JLabel();
        Dot.setIcon(new ImageIcon(new ImageIcon("Pics\\Dot.png").getImage().getScaledInstance(10, 10, Image.SCALE_DEFAULT)));    
    }
    
    public void create(CreatingBuildingUnit cbu){
        super.create(cbu);
        Civilization.mySiegeRams.add(this);
        addToSiegeRamsCreated();
    }
    
    public static int getSiegeRamCreated() {
        return SiegeRamCreated;
    }

    public static int getSiegeRamsDestroyed() {
        return SiegeRamDestroyed;
    }
    
    public void attack(Unit u) throws InterruptedException{
        while(u.getCurrentHealth() > 0)
        {
            //checkRange(u);
            Thread.sleep(attackingRate);
        }
    }
    
//    public void move(Location l){
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
//                        Logger.getLogger(SiegeRam.class.getName()).log(Level.SEVERE, null, ex);
//                    }
//                }
//            }    
//        }
//    }    
   
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
    
    private void addToSiegeRamsCreated(){SiegeRamCreated++;
    }
    private void addToSiegeRamsDestroyed(){SiegeRamDestroyed++;}
}
