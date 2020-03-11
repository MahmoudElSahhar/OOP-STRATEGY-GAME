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
public class Tower extends AttackingUnit{
    private static int towersCreated, towersDestroyed;
    
    public GUI.Tower AB;
    public Tower(){
        
        switch (Civilization.getUpgradeLevel()) {
            case 0:
                mainHealth = 100;
                setCurrentHealth(mainHealth);
                defense = 0.15;
                attackingPower = 100;
                attackingRate = 20;
                break;
            case 1:
                break;
            case 2:
                break;
        }
        name = "Tower";
        canMove = false;
        AB = new GUI.Tower(this);
        IB = new GUI.AttackingUnit(this);
        width = 100;
        height = 100;
        costGold = 120;
        costFood = 0;
        costWood = 0;
        costStone = 50;
        attackingRange = 20.0;
        shape = new JLabel();
        shape.setSize(width, height);
        shape.setIcon(new ImageIcon(new ImageIcon("Pics\\Tower.png").getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH)));
        Dot = new JLabel();
        Dot.setIcon(new ImageIcon(new ImageIcon("Pics\\Dot.png").getImage().getScaledInstance(10, 10, Image.SCALE_DEFAULT)));    
    }
    
    public void create(Location loc){
        super.create(null);
        Civilization.myTowers.add(this);
        addToTowersCreated();
        L = new Location();
        L.xPosition = loc.xPosition;
        L.yPosition = loc.yPosition;
        GUI.MyFrame2.MAP.ADD(this, L);
    }
    
    public void checkRange(Unit u){
        
        double distance;
        distance = Math.sqrt(Math.pow((u.L.xPosition - L.xPosition), 2) + Math.pow((u.L.yPosition - L.yPosition), 2));
        while(distance < 50)
        {
            try {
                attack(u);
            } catch (InterruptedException ex) {
                Logger.getLogger(Tower.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public void attack(Unit u) throws InterruptedException{
        while(u.getCurrentHealth() > 0 && u.civilizationID != User.UnitsID)
        {
                Missile m = new Missile();
                Thread.sleep(500);      //wait half a second between missiles fired.
                fireMissile(m, u);
                u.damage(this);
                if(u.getCurrentHealth() == 0)
            {
                Thread.sleep(1500);
                u.remove(u);    //to remove the object from the map when killed or destroyed
            }
        }
    }
    
    public void fireMissile(Missile m, Unit u){
        m.move(u.L);
        u.damage(this);
    }
    
    private void addToTowersCreated(){
        towersCreated++;
    }
    
    private void addToTowersKilled(){
        towersDestroyed++;
    }
}
