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
public abstract class AttackingUnit extends Unit{
    protected double attackingPower, attackingRange;
    protected boolean isMoving = true, isAttacking = true;    
    protected int attackingRate;
    
    public GUI.AttackingUnit IB;

    public double getAttackingPower() {
        return attackingPower;
    }

    public int getAttackingRate() {
        return attackingRate;
    }

    public double getAttackingRange() {
        return attackingRange;
    }
    
    public void create(CreatingBuildingUnit cbu)
    {
        super.create();
    }
    
    public void upgrade(){}
    
    public void heal(Priest p){
        setCurrentHealth(getCurrentHealth() + p.getHealingPower());
    }
    
    public void attack(Unit u) throws InterruptedException{
        while(u.getCurrentHealth() > 0 && u.civilizationID != User.UnitsID) //to ensure that its attacking an enemy
        {
            u.damage(this);            
            Thread.sleep(attackingRate);
            if(u.getCurrentHealth() <= 0)
            {
                Thread.sleep(1500);
                u.remove(u);    //to remove the object from the map when killed or destroyed
            }
        }
    }
    
    public void stopAttack(){
        
        isAttacking = false;
    }
    
    public void checkRange(Unit u){
        
    }
}
