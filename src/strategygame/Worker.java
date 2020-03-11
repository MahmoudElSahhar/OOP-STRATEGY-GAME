/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategygame;

import java.awt.Image;
import java.awt.event.MouseEvent;
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
public class Worker extends MovingAttackingUnit{
    private int collectingPower, buildingPower, repairingPower;
    private int collectingRate, buildingRate, repairingRate;
    private int workersCreated, workersKilled;
   
    public Worker(){
        switch (Civilization.getUpgradeLevel()) {
            case 0:
                xSpeed = 15;
                mainHealth = 100;
                setCurrentHealth(mainHealth);
                defense = 0.15;
                attackingPower = 30;
                attackingRate = 3000;
                collectingPower = 5;
                collectingRate = 4;
                buildingPower = 20;
                buildingRate = 5;
                repairingPower = 50;
                repairingRate = 10;
                break;
            case 1:
                xSpeed = 15;
                mainHealth = 100;
                setCurrentHealth(mainHealth);
                defense = 0.15;
                attackingPower = 30;
                attackingRate = 3000;
                collectingPower = 5;
                collectingRate = 4;
                buildingPower = 20;
                buildingRate = 5;
                repairingPower = 50;
                repairingRate = 10;
                break;
            case 2:
                xSpeed = 15;
                mainHealth = 100;
                setCurrentHealth(mainHealth);
                defense = 0.15;
                attackingPower = 30;
                attackingRate = 3000;
                collectingPower = 5;
                collectingRate = 4;
                buildingPower = 20;
                buildingRate = 5;
                repairingPower = 50;
                repairingRate = 10;
                break;
        }
        canMove = true;
        name = "Worker";
        AB = new GUI.Worker(this);
        IB = new GUI.AttackingUnit(this);
        width = 40;
        height = 50;
        attackingRange = 20.0;
        costGold = 20;
        costFood = 10;
        costWood = 0;
        costStone = 0;
        shape = new JLabel();
        shape.setSize(width, height);
        shape.setIcon(new ImageIcon(new ImageIcon("Pics\\Civilizations\\"+Civilization.Civilization_no+"\\Worker.png").getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH)));
        Dot = new JLabel();
        Dot.setIcon(new ImageIcon(new ImageIcon("Pics\\Dot.png").getImage().getScaledInstance(10, 10, Image.SCALE_DEFAULT)));    
    }
    
    public Worker(int C_no){
        switch (Civilization.getUpgradeLevel()) {
            case 0:
                xSpeed = 15;
                mainHealth = 100;
                setCurrentHealth(mainHealth);
                defense = 0.15;
                attackingPower = 30;
                attackingRate = 3000;
                collectingPower = 5;
                collectingRate = 4;
                buildingPower = 20;
                buildingRate = 5;
                repairingPower = 50;
                repairingRate = 10;
                break;
            case 1:
                xSpeed = 15;
                mainHealth = 100;
                setCurrentHealth(mainHealth);
                defense = 0.15;
                attackingPower = 30;
                attackingRate = 3000;
                collectingPower = 5;
                collectingRate = 4;
                buildingPower = 20;
                buildingRate = 5;
                repairingPower = 50;
                repairingRate = 10;
                break;
            case 2:
                xSpeed = 15;
                mainHealth = 100;
                setCurrentHealth(mainHealth);
                defense = 0.15;
                attackingPower = 30;
                attackingRate = 3000;
                collectingPower = 5;
                collectingRate = 4;
                buildingPower = 20;
                buildingRate = 5;
                repairingPower = 50;
                repairingRate = 10;
                break;
        }
        canMove = true;
        name = "Worker";
        AB = new GUI.Worker(this);
        IB = new GUI.AttackingUnit(this);
        width = 40;
        height = 50;
        attackingRange = 20.0;
        costGold = 20;
        costFood = 10;
        costWood = 0;
        costStone = 0;
        shape = new JLabel();
        shape.setSize(width, height);
        shape.setIcon(new ImageIcon(new ImageIcon("Pics\\Civilizations\\"+C_no+"\\Worker.png").getImage().getScaledInstance(width, height, Image.SCALE_SMOOTH)));
        Dot = new JLabel();
        Dot.setIcon(new ImageIcon(new ImageIcon("Pics\\Dot.png").getImage().getScaledInstance(10, 10, Image.SCALE_DEFAULT)));    
    }
    
    public void create(CreatingBuildingUnit cbu){
        super.create(cbu);
        Civilization.myWorkers.add(this);
        addToWorkersCreated();
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
//                        Logger.getLogger(Worker.class.getName()).log(Level.SEVERE, null, ex);
//                    }
//                }
//            }
//        }
//    }    
    
    public int getCollectingPower() {
        return collectingPower;
    }

    public int getBuildingPower() {
        return buildingPower;
    }

    public int getRepairingPower() {
        return repairingPower;
    }

    public int getCollectingRate() {
        return collectingRate;
    }

    public int getBuildingRate() {
        return buildingRate;
    }

    public int getRepairingRate() {
        return repairingRate;
    }
    
    public void collectResource(Resource r) throws InterruptedException{
        Thread c = new Thread(){
            public void run(){
                while(r.getCurrentQuantity() > 0)
                {
                    r.collect(Worker.this);
                    try {
                        sleep(2000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Worker.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        };
        c.start();
    }
    
    private void build(BuildingUnit bu) throws InterruptedException{
//        Thread.sleep((long)(bu.mainHealth / this.buildingPower) * buildingRate);
        Thread b = new Thread(){
            public void run(){
                try {
                    sleep((long)(bu.mainHealth / Worker.this.buildingPower) * buildingRate);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Worker.class.getName()).log(Level.SEVERE, null, ex);
                }
                //Create new Location "x" :
                Location x = new Location();

                //Make "x" equals worker's Location "L" :
                x.xPosition = L.xPosition;
                x.yPosition = L.yPosition;

                //Then Create the bu in the Location of the worker :
                bu.create(x);

                //Then we move the worker to left by his width : 
                L.xPosition -= width;

                //Then we add the worker on the map with his new Location :
                GUI.MyFrame2.MAP.ADD(Worker.this, Worker.this.L);
                JOptionPane.showMessageDialog(null, "" + bu.name + " Built.");
            }
        };
        b.start();
    }
   
    public void buildArcheryRange() throws InterruptedException{
        if(Civilization.getMyGold() >= ArcheryRange.getCostGold() && Civilization.getMyWood() >= ArcheryRange.getCostWood())
        {
            ArcheryRange ar = new ArcheryRange();
            build(ar);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Not Enough Resources.");
        }
    }
    
    public void buildBarrack() throws InterruptedException{
        if(Civilization.getMyGold() >= Barrack.getCostGold() && Civilization.getMyWood() >= Barrack.getCostWood())
        {
            Barrack b = new Barrack();
            build(b);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Not Enough Resources.");
        }
    }
    
    public void buildHouse() throws InterruptedException{
        if(Civilization.getMyGold() >= House.getCostGold() && Civilization.getMyWood() >= House.getCostWood())
        {
            House h = new House();
            build(h);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Not Enough Resources.");
        }
        
    }
    
    public void buildGate() throws InterruptedException{
        if(Civilization.getMyGold() >= Gate.getCostGold() && Civilization.getMyWood() >= Gate.getCostWood())
        {
            Gate g = new Gate();
            build(g);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Not Enough Resources.");
        }
    }
    
    public void buildMarket() throws InterruptedException{
        if(Civilization.getMyGold() >= Market.getCostGold() && Civilization.getMyWood() >= Market.getCostWood())
        {
            Market ma = new Market();
            build(ma);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Not Enough Resources.");
        }
    }
    
    public void buildMonstary() throws InterruptedException{
        if(Civilization.getMyGold() >= Monstary.getCostGold() && Civilization.getMyWood() >= Monstary.getCostWood())
        {
            Monstary mo = new Monstary();
            build(mo);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Not Enough Resources.");
        }
    }
    
    public void buildSiegeWorkshop() throws InterruptedException{
        if(Civilization.getMyGold() >= SiegeWorkshop.getCostGold() && Civilization.getMyWood() >= SiegeWorkshop.getCostWood())
        {
            SiegeWorkshop sw = new SiegeWorkshop();
            build(sw);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Not Enough Resources.");
        }
    }
    
    public void buildStable() throws InterruptedException{
        if(Civilization.getMyGold() >= Stable.getCostGold() && Civilization.getMyWood() >= Stable.getCostWood())
        {
            Stable s = new Stable();
            build(s);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Not Enough Resources.");
        }
    }
    
    public void buildTower() throws InterruptedException{
        if(Civilization.getMyGold() >= Tower.getCostGold() && Civilization.getMyWood() >= Tower.getCostWood())
        {
            Tower t = new Tower();
            Thread.sleep((long)(t.mainHealth / this.buildingPower) * buildingRate);
            Location x = new Location();
            x.xPosition = L.xPosition;
            x.yPosition = L.yPosition;
            t.create(x);
            L.xPosition -= width;
            GUI.MyFrame2.MAP.ADD(this, L);
            JOptionPane.showMessageDialog(null, "Tower Built.");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Not Enough Resources.");
        }
    }
    
    public void buildTownCenter() throws InterruptedException{
        if(Civilization.getMyGold() >= TownCenter.getCostGold() && Civilization.getMyWood() >= TownCenter.getCostWood())
        {
            TownCenter tc = new TownCenter();
            build(tc);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Not Enough Resources.");
        }
    }
    
    public void buildWall() throws InterruptedException{
        if(Civilization.getMyGold() >= Wall.getCostGold() && Civilization.getMyWood() >= Wall.getCostWood())
        {
            Wall w = new Wall();
            build(w);
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Not Enough Resources.");
        }
    }
      
    public void repair(BuildingUnit bu) throws InterruptedException{
        while(bu.getCurrentHealth() < bu.getMainHealth())
        {
            bu.repair(this);
            Thread.sleep(repairingRate);
        }
    }
    
    private void addToWorkersCreated(){
        workersCreated++;
    }
    
    private void addToWorkersKilled(){
        workersKilled++;
    }
}
