/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Color;
import javax.swing.*;

/**
 *
 * @author mahmo
 */
public class AttackingUnit extends JPanel{
    
    private JLabel UnitImage = new JLabel("IMAGE");
    private JLabel UnitName = new JLabel();
    private JLabel UnitAttack = new JLabel();
    private JLabel UnitHealth = new JLabel();
    private JLabel UnitDefence = new JLabel();
    private JLabel UnitUpgradeLevel = new JLabel();
    
    public strategygame.AttackingUnit AU;
    
    public AttackingUnit(strategygame.AttackingUnit au)
    {
        AU = au;
        setLayout(null);
        setBounds((1365/3), 527, 1365/3, 240);
        UnitName.setBounds(55, 28, 120, 30);        
        UnitImage.setBounds(UnitName.getBounds().x, UnitName.getBounds().y + 50, 120, 120);
        UnitHealth.setBounds(220, 43, 180, 30);
        UnitAttack.setBounds(UnitHealth.getBounds().x, UnitHealth.getBounds().y + 50, 180, 30);
        UnitDefence.setBounds(UnitHealth.getBounds().x, UnitAttack.getBounds().y + 50, 180, 30);
        UnitUpgradeLevel.setBounds(UnitHealth.getBounds().x, UnitDefence.getBounds().y + 50, 180, 30);
        
        UnitName.setText(""+AU.name);
        UnitHealth.setText("Health:            "+AU.getCurrentHealth());
        UnitAttack.setText("Attack: :          "+AU.getAttackingPower());
        UnitDefence.setText("Defence:          "+AU.getDefense());
        UnitUpgradeLevel.setText("Upgrade Level:     "+strategygame.Civilization.getUpgradeLevel());
        
        
        add(UnitName);
        add(UnitImage);
        add(UnitHealth);
        add(UnitAttack);
        add(UnitDefence);
        add(UnitUpgradeLevel);
        setBackground(Color.GREEN);
    }
}
