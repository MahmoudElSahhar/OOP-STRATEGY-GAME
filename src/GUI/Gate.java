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
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import strategygame.Civilization;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;


/**
 *
 * @author foado
 */
public class Gate extends JPanel{
     public strategygame.Gate G;
    public JButton GateOpen=new JButton("OG");
   public JButton GateClose=new JButton("CG");
        public JLabel ActionBox = new JLabel("ActionBox");
        
    public JLabel testing = new JLabel("NULL");
    public Gate(strategygame.Gate gate){
       G=gate;
        setLayout(null);
        setBackground(Color.RED);
         setBounds(911, 528, 455, 240);
         
//        JPanel InfoBox=new JPanel();    
//
//        JPanel ActionBox=new JPanel();         
      
        GateOpen.setBounds(42,18,55,55);
          GateClose.setBounds(GateOpen.getBounds().x+GateOpen.getBounds().width+20,GateOpen.getBounds().y,55,55);
       
        this.add(GateOpen);
        this.add(GateClose);
         this.add(ActionBox);
         GateOpen.addActionListener(new Open());
           GateClose.addActionListener(new Close());
    }
    public class Open implements ActionListener{
        

        @Override
        public void actionPerformed(ActionEvent e) {
          
                if(e.getSource() == GateOpen)
                {  G.openGate();
                    testing.setText("Gold = " + strategygame.Civilization.getMyGold() + "    Houses Created = " + strategygame.House.getHousesCreated());
                }
                   
        }
    }

    public class Close implements ActionListener{
        

        @Override
        public void actionPerformed(ActionEvent e) {
          
                if(e.getSource() == GateClose)
                {  G.closeGate();
                
                }
                   
        }
    }
}
        
                
                


