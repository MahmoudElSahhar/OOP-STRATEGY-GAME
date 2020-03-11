/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
/**
 *
 * @author Youssef
 */
public class SiegeWorkshop extends JPanel{
    public JButton createSiegeRam = new JButton("SR");
    
    public strategygame.SiegeWorkshop SW;
    
    public SiegeWorkshop(strategygame.SiegeWorkshop siegeWorkshop){
        SW = siegeWorkshop;
        setLayout(null);
        setBackground(Color.YELLOW);
        
        setBounds(911, 528, 455, 240);
        
        createSiegeRam.setBounds(45,18,55,55);
        add(createSiegeRam);
        createSiegeRam.addActionListener(new Create());
        
    }
    
    public class Create implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                SW.createSiegeRam();
            } catch (InterruptedException ex) {
                Logger.getLogger(SiegeWorkshop.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
}
