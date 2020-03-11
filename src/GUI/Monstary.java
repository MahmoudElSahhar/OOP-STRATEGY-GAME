/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author mahmo
 */
public class Monstary extends JPanel{
    
    private JButton createPriest = new JButton("CP");
    
    public strategygame.Monstary M;
    
    public Monstary(strategygame.Monstary Monstary)
    {
        M = Monstary;
        setLayout(null);
        
        setSize(1365, 767);
        setBounds((1365/3)*2, 527, 1365/3, 240);
        createPriest.setBounds(45, + 18, 55, 55);
        add(createPriest);
        setBackground(Color.yellow);
                
        createPriest.addActionListener(new ButtonWatcher());

    }
    
    private class ButtonWatcher implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent ae) {
            Object pressed = ae.getSource();
            try {
                if(pressed.equals(createPriest))
                {
                    M.createPriest();
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(Barrack.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }
}
