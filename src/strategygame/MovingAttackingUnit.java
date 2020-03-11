/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategygame;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Youssef
 */
public abstract class MovingAttackingUnit extends AttackingUnit{
    protected int xSpeed, ySpeed;
//    Weapon W;
//    public static int intialX, intialY;
    
    public void create(CreatingBuildingUnit cbu){
        super.create(cbu);
        
        L = new Location();
        
        //Create new Location "loc" : 
        Location loc = new Location();
        
        //Then we make loc = setMarker of the cbu 
        loc.xPosition = cbu.setMarker.xPosition;
        loc.yPosition = cbu.setMarker.yPosition;
        
        //Then we made a while loop to decide where to put this unit :
        while(GUI.MyFrame2.MAP.Map[loc.xPosition][loc.yPosition] != null)
        {
            loc.xPosition += this.width;
        }
        
        //Then we make the location "L" of this unit equals "loc" : 
        L.xPosition = loc.xPosition;
        L.yPosition = loc.yPosition;
        GUI.MyFrame2.MAP.ADD(this, L);
    }
    
    public void move(Location l){
        
        int xFactor =0;
        int yFactor =0;
        isMoving = true;
        int rounds;
       
        if(l.xPosition - L.xPosition < 0)
        {
            xFactor = l.xPosition - L.xPosition;
            xFactor *= -1;
        }
        else
            xFactor = l.xPosition - L.xPosition;
        ///////////////////////////////////////
        if(l.yPosition - L.yPosition < 0)
        {
            yFactor = l.yPosition - L.yPosition;
            yFactor *= -1;
        }
        else
            yFactor = l.yPosition - L.yPosition;
        ///////////////////////////////////////
        
        if(yFactor > xFactor)
            rounds = yFactor;
        else
            rounds = xFactor;
        
        for(int i=0;i<rounds;i++)
        {
            while(isMoving == true){
                if(L.yPosition != l.yPosition || L.xPosition != l.xPosition)
                {
                    if(L.xPosition < l.xPosition)
                    {
                        L.xPosition++;
                    }
                    if(L.yPosition < l.yPosition)
                    {
                        L.yPosition++;
                    }
                    if(L.yPosition > l.yPosition)
                    {
                        L.yPosition--;                    
                    }
                    if(L.xPosition > l.xPosition)
                    {
                        L.xPosition--;                    
                    }
                    
                    for(int j = shape.getBounds().x ; j < shape.getBounds().x + shape.getBounds().width ; j++)
                    {
                        for(int z = shape.getBounds().y ; z < shape.getBounds().y + shape.getBounds().height ; z++)
                        {
                            GUI.MyFrame2.MAP.Map[j][z] = null;
                        }
                    }
                    
                    Location a = new Location();
                    a.xPosition = L.xPosition;
                    a.yPosition = L.yPosition;
                    
                    GUI.MyFrame2.MAP.ADD(this, a);
                    try {
                        Thread.sleep(10);

                    } catch (InterruptedException ex) {
                        Logger.getLogger(MovingAttackingUnit.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
            
            //collide(L,l);
        }
}
    
    public void collide(Location a , Location l) throws InterruptedException
    {
        if(GUI.MyFrame2.MAP.Map[a.xPosition + shape.getBounds().width + 1][a.yPosition + shape.getBounds().height - 20] != null)
        {
            stopMove();
            while(GUI.MyFrame2.MAP.Map[a.xPosition + shape.getBounds().width + 1][a.yPosition + shape.getBounds().height - 20] != null)
            {
                a.yPosition--;

                for(int j = shape.getBounds().x ; j < shape.getBounds().x + shape.getBounds().width ; j++)
                {
                    for(int z = shape.getBounds().y ; z < shape.getBounds().y + shape.getBounds().height ; z++)
                    {
                        GUI.MyFrame2.MAP.Map[j][z] = null;
                    }
                }

                L.xPosition = a.xPosition;
                L.yPosition = a.yPosition;

                GUI.MyFrame2.MAP.ADD(this, a);
                try {
                    Thread.sleep(10);

                } catch (InterruptedException ex) {
                    Logger.getLogger(MovingAttackingUnit.class.getName()).log(Level.SEVERE, null, ex);
                }
                move(l);
            }
        }
        else if(GUI.MyFrame2.MAP.Map[a.xPosition - 1][a.yPosition + shape.getBounds().height - 20] != null)
        {
            stopMove();
            while(GUI.MyFrame2.MAP.Map[a.xPosition - 1][a.yPosition + shape.getBounds().height - 20] != null)
            {
                a.yPosition--;

                for(int j = shape.getBounds().x ; j < shape.getBounds().x + shape.getBounds().width ; j++)
                {
                    for(int z = shape.getBounds().y ; z < shape.getBounds().y + shape.getBounds().height ; z++)
                    {
                        GUI.MyFrame2.MAP.Map[j][z] = null;
                    }
                }

                L.xPosition = a.xPosition;
                L.yPosition = a.yPosition;

                GUI.MyFrame2.MAP.ADD(this, a);
                try {
                    Thread.sleep(10);

                } catch (InterruptedException ex) {
                    Logger.getLogger(MovingAttackingUnit.class.getName()).log(Level.SEVERE, null, ex);
                }
                move(l);
            }
        }
        else if(GUI.MyFrame2.MAP.Map[a.xPosition + shape.getBounds().width][a.yPosition - 1] != null)
        {
            stopMove();
            while(GUI.MyFrame2.MAP.Map[a.xPosition + shape.getBounds().width][a.yPosition - 1] != null)
            {
                a.xPosition--;

                for(int j = shape.getBounds().x ; j < shape.getBounds().x + shape.getBounds().width ; j++)
                {
                    for(int z = shape.getBounds().y ; z < shape.getBounds().y + shape.getBounds().height ; z++)
                    {
                        GUI.MyFrame2.MAP.Map[j][z] = null;
                    }
                }

                L.xPosition = a.xPosition;
                L.yPosition = a.yPosition;

                GUI.MyFrame2.MAP.ADD(this, a);
                try {
                    Thread.sleep(10);

                } catch (InterruptedException ex) {
                    Logger.getLogger(MovingAttackingUnit.class.getName()).log(Level.SEVERE, null, ex);
                }
                move(l);
            }
        }
        else if(GUI.MyFrame2.MAP.Map[a.xPosition + shape.getBounds().width][a.yPosition + shape.getBounds().height + 1] != null)
        {
            stopMove();
            while(GUI.MyFrame2.MAP.Map[a.xPosition + shape.getBounds().width][a.yPosition + shape.getBounds().height + 1] != null)
            {
                a.xPosition--;

                for(int j = shape.getBounds().x ; j < shape.getBounds().x + shape.getBounds().width ; j++)
                {
                    for(int z = shape.getBounds().y ; z < shape.getBounds().y + shape.getBounds().height ; z++)
                    {
                        GUI.MyFrame2.MAP.Map[j][z] = null;
                    }
                }

                L.xPosition = a.xPosition;
                L.yPosition = a.yPosition;

                GUI.MyFrame2.MAP.ADD(this, a);
                try {
                    Thread.sleep(10);

                } catch (InterruptedException ex) {
                    Logger.getLogger(MovingAttackingUnit.class.getName()).log(Level.SEVERE, null, ex);
                }
                move(l);
            }
        }
    }
    
    public void stopMove(){
    
        isMoving = false;
    }
}
    
