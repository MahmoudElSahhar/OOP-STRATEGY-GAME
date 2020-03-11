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
public class Resource extends JPanel{
    
    public JLabel UnitImage = new JLabel("IMAGE");
    public JLabel UnitName = new JLabel();
    public JLabel Unitamount = new JLabel();
    
    public strategygame.Resource R;
    
    public Resource(strategygame.Resource re)
    {
        R = re;
        setLayout(null);
        setBounds((1365/3), 527, 1365/3, 240);
        UnitName.setBounds(55, 28, 120, 30);
        UnitImage.setBounds(UnitName.getBounds().x, UnitName.getBounds().y + 50, 120, 120);
        Unitamount.setBounds(220, 43, 180, 30);

        UnitName.setText(""+R.name);
        Unitamount.setText("Amount:   "+R.getCurrentQuantity()+ "/" + R.getMainQuantity());
        
        add(UnitName);
        add(UnitImage);
        add(Unitamount);
        setBackground(Color.GREEN);
    }
    public void update(){
        Unitamount.setText("Amount:   "+R.getCurrentQuantity()+ "/" + R.getMainQuantity());
        repaint();
    }
}
