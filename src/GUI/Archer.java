/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.plaf.basic.BasicOptionPaneUI;

/**
 *
 * @author Lenovo
 */
public class Archer extends JPanel{
//    JPanel InfoBox=new JPanel();  
//    JPanel ActionBox=new JPanel();
    public JButton StopMove=new JButton("SM");
    public JButton StopAttack=new JButton("SA");
        
    public strategygame.Archer A;
    
    public Archer(strategygame.Archer archer){
        A = archer;
        setLayout(null);
        setBackground(Color.red);  
//        InfoBox.setBounds((1365/3), 527, 1365/3, 240);

        setBounds((1365/3)*2, 527, 1365/3, 240);
         
        StopAttack.setBounds(42,18,55,55);
        StopMove.setBounds(StopAttack.getX()+StopAttack.getWidth()+25, StopAttack.getY(), StopAttack.getWidth(), StopAttack.getHeight());
        
        StopAttack.addActionListener(new ButtonWatcher());
        StopMove.addActionListener(new ButtonWatcher());
        
        this.add(StopMove);
        this.add(StopAttack);
    }
    
    public class ButtonWatcher implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == StopMove)
            {
                A.stopMove();
            }
            if(e.getSource() == StopAttack)
            {
                A.stopAttack();
            }
        }
        
    }
    
}
