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
public abstract class CreatingBuildingUnit extends BuildingUnit{
    protected int creatingRate;
    public Location setMarker;

    public void create(Location loc){
        super.create(loc);
        
        //Create Location "setMarker" where this unit will create its warriors : 
        setMarker = new Location();
        setMarker.xPosition = L.xPosition + width + 50;
        setMarker.yPosition = L.yPosition + height + 50;
    }
    
    public void setMarker(Location l){}
    
    
}
