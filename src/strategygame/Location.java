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
public class Location {
    public int xPosition, yPosition;

    
    //Setters : 
    public void setxPosition(int xPosition , Unit u) {
        if(xPosition < 0){
            this.xPosition = 0;
        }
        else if(xPosition > (GUI.Map.mapWidth - u.width)){
            this.xPosition = GUI.Map.mapWidth - u.width;
        }
        else{
            this.xPosition = xPosition;
        }
    }

    public void setyPosition(int yPosition , Unit u) {
        if(yPosition < 0){
            this.yPosition = 0;
        }
        else if(yPosition > (GUI.Map.mapHeight - u.height)){
            this.yPosition = GUI.Map.mapHeight - u.height;
        }
        else{
            this.yPosition = yPosition;
        }
    }
    
    //Getters : 
    public int getxPosition() {
        return xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }
    
    //Functions : 
    public void setLocation(Location l){}
}