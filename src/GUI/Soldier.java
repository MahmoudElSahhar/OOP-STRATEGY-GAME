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
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;
import strategygame.Location;

/**
 *
 * @author mahmo
 */
public class Soldier extends JPanel implements MouseListener{
    
    public JButton stopAttack = new JButton("SA");
    public JButton stopMove = new JButton("SM");
    
    public strategygame.Soldier S;
    
    public Soldier(strategygame.Soldier Soldier)
    {
        S = Soldier;
        setLayout(null);
        setBounds((1365/3)*2, 527, 1365/3, 240);        
        stopAttack.setBounds(45, 18, 55, 55);
        stopMove.setBounds(stopAttack.getBounds().x + 80, stopAttack.getBounds().y, 55, 55);
        setBackground(Color.yellow);
        add(stopAttack);
        add(stopMove);
        stopAttack.addActionListener(new ButtonWatcher());
        stopMove.addActionListener(new ButtonWatcher());
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Location l = new Location();
        l.xPosition = e.getX();
        l.yPosition = e.getY();
        GUI.MyFrame2.MAP.ADD(S, l);
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
    private class ButtonWatcher implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent ae) {
            if(ae.getSource() == stopAttack)
            {
                S.stopAttack();
            }
            if(ae.getSource() == stopMove)
            {
                S.stopMove();
            }
        }
        
    }
}
