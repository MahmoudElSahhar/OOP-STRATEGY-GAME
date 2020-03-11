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
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author foado
 */

   public class Priest extends JPanel{
       
     public strategygame.Priest P;
    public JButton StopMove=new JButton("SM");
    public JButton StopHealing=new JButton("SH");
        public JLabel ActionBox = new JLabel("ActionBox");

    public Priest(strategygame.Priest priest){
       P=priest;
        setLayout(null);
        setBackground(Color.pink);
         setBounds(911, 528, 455, 240);
         
         
      
        StopMove.setBounds(42,18,55,55);
        StopHealing.setBounds(StopMove.getX()+StopMove.getWidth()+25, StopMove.getY(), StopMove.getWidth(), StopMove.getHeight());
        
        this.add(ActionBox);
        this.add(StopMove);
        this.add(StopHealing);
         

    }
    
    public class ButtonWatcher implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == StopMove)
            {
                P.stopMove();
            }
            if(e.getSource() == StopHealing)
            {
                P.stopAttack();
            }
        }
        
    }
    
}
