/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author foado
 */

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author foado
 */

   public class TownCenter extends JPanel{
       
    public strategygame.TownCenter TC;
    public JButton CreateWorker=new JButton("CW");
  
        public JLabel ActionBox = new JLabel("ActionBox");
//public JLabel testing = new JLabel("NULL");
    public TownCenter(strategygame.TownCenter townCenter){
       TC=townCenter;
        setLayout(null);
        setBackground(Color.ORANGE);
         setBounds(911, 528, 455, 240);
         
//        JPanel InfoBox=new JPanel();    
//
//        JPanel ActionBox=new JPanel();         
      
        CreateWorker.setBounds(42,18,55,55);
        
       
        this.add(CreateWorker);
         this.add(ActionBox);
          CreateWorker.addActionListener(new createWorker());
}
    public class createWorker implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
          
                if(e.getSource() == CreateWorker)
                {
                    try {
                        TC.createWorker();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(TownCenter.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }                
        }
   }
   
}
        