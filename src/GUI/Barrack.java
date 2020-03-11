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
import strategygame.Civilization;

/**
 *
 * @author mahmo
 */
public class Barrack extends JPanel{
    
    private JButton createSoldier = new JButton("CS");
    
    public strategygame.Barrack B;
    
    public Barrack(strategygame.Barrack Barracks)
    {
        B = Barracks;
        setLayout(null);
        setBackground(Color.yellow);
        
        setBounds((1365/3)*2, 527, 1365/3, 240);
        createSoldier.setBounds(45, 18, 55, 55);
        add(createSoldier);
        
        createSoldier.addActionListener(new ButtonWatcher());

    }
    
    private class ButtonWatcher implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent ae) {
            Object pressed = ae.getSource();
            try {
                if(pressed.equals(createSoldier))
                {
                    B.createSoldier();
                    //For testing
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(Barrack.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
    
    
    
}
