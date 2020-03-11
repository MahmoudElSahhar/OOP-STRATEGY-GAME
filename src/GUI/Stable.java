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
 * @author Lenovo
 */
public class Stable extends JPanel {

//        JPanel InfoBox=new JPanel();
//        JPanel ActionBox=new JPanel();
        JButton createHorseman=new JButton("CH");
        public strategygame.Stable S;
    
    public Stable(strategygame.Stable stable){
        S = stable;
        this.setLayout(null);
        setBackground(Color.red);
//        InfoBox.setBounds((1365/3), 527, 1365/3, 240);

        setBounds((1365/3)*2, 527, 1365/3, 240);
        createHorseman.setBounds(45, 18, 55, 55);
      
        createHorseman.addActionListener(new ButtonWatcher());
        
        add(createHorseman);
        
    }
    
    private class ButtonWatcher implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent ae) {
            Object pressed = ae.getSource();
            try {
                if(pressed.equals(createHorseman))
                {
                    S.createHorseman();
                    //For testing
                }
            } catch (InterruptedException ex) {
                Logger.getLogger(Barrack.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
    }

}
