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
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author foado
 */

   public class SiegeRam extends JPanel{
       
      public strategygame.SiegeRam SR;
    public JButton StopMove=new JButton("SM");
    public JButton StopAttack=new JButton("SA");
        public JLabel ActionBox = new JLabel("ActionBox");

    public SiegeRam(strategygame.SiegeRam siegeRam){
       SR=siegeRam;
        setLayout(null);
        setBackground(Color.MAGENTA);
         setBounds(911, 528, 455, 240);
         

        StopMove.setBounds(42,18,55,55);
        StopAttack.setBounds(StopMove.getX()+StopMove.getWidth()+25, StopMove.getY(), StopMove.getWidth(), StopMove.getHeight());
        
        StopMove.addActionListener(new ButtonWatcher());
        StopAttack.addActionListener(new ButtonWatcher());
        
        this.add(ActionBox);
        this.add(StopMove);
        this.add(StopAttack);
         

    }
    public class ButtonWatcher implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == StopMove)
            {
                SR.stopMove();
            }
            if(e.getSource() == StopAttack)
            {
                SR.stopAttack();
            }
        }
        
    }
    
}

