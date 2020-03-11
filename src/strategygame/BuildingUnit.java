/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategygame;

/**
 *
 * @author Youssef
 */
public abstract class BuildingUnit extends Unit{
    
    public GUI.BuildingUnit IB;
    
    public void create(Location loc){
        super.create();
        
        //Create location "L" of this unit and give it values of the given Location "loc" from the worker : 
        L = new Location();
        L.xPosition = loc.xPosition;
        L.yPosition = loc.yPosition;
        GUI.MyFrame2.MAP.ADD(this, L);
    }
    
    public void upgrade(){}
    
    public void repair(Worker w){
        setCurrentHealth(getCurrentHealth() + w.getBuildingPower());
    }
}
